package k35;

/* loaded from: classes11.dex */
public class c implements l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final bm5.p1 f385431e = new k35.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f385432f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f385433g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f385434h = false;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f385435i;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f385436d = false;

    public c(k35.a aVar) {
        c();
    }

    public static java.util.List a() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "getBlackListContacts");
        ((k35.c) f385431e.b()).c();
        java.util.Set set = f385432f;
        synchronized (set) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "getBlackListContacts cacheReady = %b", java.lang.Boolean.valueOf(f385434h));
            if (((java.util.HashSet) set).isEmpty() && !f385434h) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.database.Cursor cursor = null;
                try {
                    gm0.j1.i();
                    com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    cursor = Bi.f276604d.B("select username from rcontact " + Bi.I("@black.android", "", null), null);
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        ((java.util.HashSet) f385432f).add(cursor.getString(0));
                        cursor.moveToNext();
                    }
                    f385434h = true;
                    cursor.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th6) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "[select black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    throw th6;
                }
            }
            java.util.Set set2 = f385432f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "[get black list] %s", set2);
            arrayList = new java.util.ArrayList(set2);
        }
        return arrayList;
    }

    public static java.util.List b() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts");
        ((k35.c) f385431e.b()).c();
        java.util.Set set = f385433g;
        synchronized (set) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts snsCacheReady = %b", java.lang.Boolean.FALSE);
            if (((java.util.HashSet) set).isEmpty()) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    set.addAll(c01.e2.z());
                    f385434h = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "[select sns black list] cost:%d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactBlackListHelper", "getSnsBlackListContacts failed, message = %s", th6.getMessage());
                }
            }
            java.util.Set set2 = f385433g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "[get black list] %s", set2);
            arrayList = new java.util.ArrayList(set2);
        }
        return arrayList;
    }

    public final void c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.b().m() && !this.f385436d) {
            synchronized (this) {
                if (this.f385436d) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
                this.f385436d = true;
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "onNotifyChange %s", str);
            if (!(a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) || f385435i || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new k35.b(this, str), "Thread-ContactBlackListHelper-onNotifyChange");
        }
    }
}
