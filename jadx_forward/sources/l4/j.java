package l4;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f397251j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f397253b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.q f397254c;

    /* renamed from: f, reason: collision with root package name */
    public volatile p4.i f397257f;

    /* renamed from: g, reason: collision with root package name */
    public final l4.g f397258g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f397255d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f397256e = false;

    /* renamed from: h, reason: collision with root package name */
    public final q.h f397259h = new q.h();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f397260i = new l4.f(this);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f397252a = new java.util.HashMap();

    public j(l4.q qVar, java.util.Map map, java.util.Map map2, java.lang.String... strArr) {
        this.f397254c = qVar;
        this.f397258g = new l4.g(strArr.length);
        java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        int length = strArr.length;
        this.f397253b = new java.lang.String[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str = strArr[i17];
            java.util.Locale locale = java.util.Locale.US;
            java.lang.String lowerCase = str.toLowerCase(locale);
            this.f397252a.put(lowerCase, java.lang.Integer.valueOf(i17));
            java.lang.String str2 = (java.lang.String) map.get(strArr[i17]);
            if (str2 != null) {
                this.f397253b[i17] = str2.toLowerCase(locale);
            } else {
                this.f397253b[i17] = lowerCase;
            }
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getValue();
            java.util.Locale locale2 = java.util.Locale.US;
            java.lang.String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f397252a.containsKey(lowerCase2)) {
                java.lang.String lowerCase3 = ((java.lang.String) entry.getKey()).toLowerCase(locale2);
                java.util.HashMap hashMap = this.f397252a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public boolean a() {
        p4.b bVar = this.f397254c.f397279a;
        if (!(bVar != null && ((q4.c) bVar).f441540d.isOpen())) {
            return false;
        }
        if (!this.f397256e) {
            this.f397254c.f397281c.d0();
        }
        return this.f397256e;
    }

    public final void b(p4.b bVar, int i17) {
        q4.c cVar = (q4.c) bVar;
        cVar.c("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i17 + ", 0)");
        java.lang.String str = this.f397253b[i17];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr = f397251j;
        for (int i18 = 0; i18 < 3; i18++) {
            java.lang.String str2 = strArr[i18];
            sb6.setLength(0);
            sb6.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb6.append("`");
            sb6.append("room_table_modification_trigger_");
            sb6.append(str);
            sb6.append("_");
            sb6.append(str2);
            sb6.append("`");
            sb6.append(" AFTER ");
            sb6.append(str2);
            sb6.append(" ON `");
            sb6.append(str);
            sb6.append("` BEGIN UPDATE ");
            sb6.append("room_table_modification_log");
            sb6.append(" SET ");
            sb6.append("invalidated");
            sb6.append(" = 1");
            sb6.append(" WHERE ");
            sb6.append("table_id");
            sb6.append(" = ");
            sb6.append(i17);
            sb6.append(" AND ");
            sb6.append("invalidated");
            sb6.append(" = 0");
            sb6.append("; END");
            cVar.c(sb6.toString());
        }
    }

    public void c(p4.b bVar) {
        q4.c cVar = (q4.c) bVar;
        if (cVar.f441540d.inTransaction()) {
            return;
        }
        while (true) {
            try {
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f397254c.f397286h.readLock();
                readLock.lock();
                try {
                    int[] a17 = this.f397258g.a();
                    if (a17 == null) {
                        return;
                    }
                    int length = a17.length;
                    cVar.a();
                    for (int i17 = 0; i17 < length; i17++) {
                        try {
                            int i18 = a17[i17];
                            if (i18 == 1) {
                                b(cVar, i17);
                            } else if (i18 == 2) {
                                java.lang.String str = this.f397253b[i17];
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                java.lang.String[] strArr = f397251j;
                                for (int i19 = 0; i19 < 3; i19++) {
                                    java.lang.String str2 = strArr[i19];
                                    sb6.setLength(0);
                                    sb6.append("DROP TRIGGER IF EXISTS ");
                                    sb6.append("`");
                                    sb6.append("room_table_modification_trigger_");
                                    sb6.append(str);
                                    sb6.append("_");
                                    sb6.append(str2);
                                    sb6.append("`");
                                    cVar.c(sb6.toString());
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            cVar.b();
                            throw th6;
                        }
                    }
                    cVar.j();
                    cVar.b();
                    l4.g gVar = this.f397258g;
                    synchronized (gVar) {
                        gVar.f397250e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException unused) {
                return;
            }
        }
    }
}
