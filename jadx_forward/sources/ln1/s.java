package ln1;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: r, reason: collision with root package name */
    public static final ln1.r f401330r = new ln1.r();

    /* renamed from: s, reason: collision with root package name */
    public static long f401331s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static long f401332t = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f401334b;

    /* renamed from: c, reason: collision with root package name */
    public final kn1.c f401335c;

    /* renamed from: d, reason: collision with root package name */
    public final kn1.f f401336d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f401337e;

    /* renamed from: f, reason: collision with root package name */
    public final int f401338f;

    /* renamed from: j, reason: collision with root package name */
    public ln1.f0 f401342j;

    /* renamed from: a, reason: collision with root package name */
    public final int f401333a = j62.e.g().i("clicfg_backup_db_cache_size", 20971520, false, true);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f401339g = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 f401340h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(true);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 f401341i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(true);

    /* renamed from: k, reason: collision with root package name */
    public wn1.a f401343k = new wn1.a();

    /* renamed from: l, reason: collision with root package name */
    public long f401344l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f401345m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec f401346n = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec f401347o = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();

    /* renamed from: p, reason: collision with root package name */
    public boolean f401348p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f401349q = new java.util.concurrent.LinkedBlockingQueue();

    public s(kn1.f fVar, int i17, kn1.c cVar) {
        this.f401334b = false;
        this.f401336d = fVar;
        this.f401338f = i17;
        this.f401335c = cVar;
        this.f401334b = false;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPackAndSend", "cancel, caller:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        this.f401334b = true;
        this.f401340h.c();
        this.f401339g.set(0L);
        ln1.r rVar = f401330r;
        rVar.f401325g = true;
        rVar.b();
        this.f401348p = false;
        this.f401349q.clear();
        ln1.f0 f0Var = this.f401342j;
        if (f0Var != null) {
            f0Var.f401286d.set(0);
        }
    }

    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
        int i17 = this.f401338f;
        if (i17 == 1) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, java.lang.Boolean.FALSE);
        } else if (i17 == 2) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_MOVE_BACKUPING_BOOLEAN, java.lang.Boolean.FALSE);
        }
        android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
        if (z17) {
            if (i17 == 1) {
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
            } else if (i17 == 2) {
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
            }
        }
        edit.commit();
    }

    public void c(java.lang.Runnable runnable) {
        try {
            this.f401349q.put(runnable);
            this.f401341i.c();
        } catch (java.lang.InterruptedException unused) {
        }
        if (this.f401348p) {
            return;
        }
        this.f401348p = true;
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: ln1.s$$c
            @Override // java.lang.Runnable
            public final void run() {
                ln1.s sVar = ln1.s.this;
                sVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackAndSend", "packScene thread running");
                while (true) {
                    boolean z17 = sVar.f401348p;
                    java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = sVar.f401349q;
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackAndSend", "packScene thread end: packTagQueue.size:%d", java.lang.Integer.valueOf(linkedBlockingQueue.size()));
                        return;
                    }
                    java.lang.Runnable runnable2 = (java.lang.Runnable) linkedBlockingQueue.poll();
                    if (runnable2 != null) {
                        runnable2.run();
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var = sVar.f401341i;
                        b3Var.b();
                        b3Var.a(500L);
                    }
                }
            }
        });
    }
}
