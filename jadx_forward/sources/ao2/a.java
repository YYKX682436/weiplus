package ao2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public int f94066b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94067c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f94068d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94070f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f94071g;

    /* renamed from: h, reason: collision with root package name */
    public long f94072h;

    /* renamed from: j, reason: collision with root package name */
    public long f94074j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f94075k;

    /* renamed from: l, reason: collision with root package name */
    public qg3.w f94076l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94077m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94078n;

    /* renamed from: a, reason: collision with root package name */
    public final long f94065a = java.lang.System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public int f94073i = 2;

    public final void a(int i17) {
        qg3.w wVar = this.f94076l;
        if (wVar != null) {
            p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169900x21ba300d(((qg3.x) wVar).m105978x2737f10(), i17);
        }
    }

    public final void b(java.lang.String sessionKey, long j17, long j18, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionKey, "sessionKey");
        if (this.f94075k) {
            if (this.f94077m) {
                return;
            }
            this.f94077m = true;
            a(1);
            return;
        }
        this.f94075k = true;
        int i19 = qg3.x.f444417d;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m169897x21b9e4c7 = p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169897x21b9e4c7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m169897x21b9e4c7, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.MegaVideoPageMonitor");
        qg3.w wVar = (qg3.w) m169897x21b9e4c7;
        this.f94076l = wVar;
        p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169888x21b2467a(((qg3.x) wVar).m105978x2737f10(), sessionKey, j17, j18, i17, i18);
        if (!this.f94077m) {
            this.f94077m = true;
            a(1);
        }
        if (z17) {
            iy1.c cVar = iy1.c.MainUI;
            if (j18 == 50030) {
                qg3.w wVar2 = this.f94076l;
                if (wVar2 != null) {
                    p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169891x21b392d9(((qg3.x) wVar2).m105978x2737f10(), "CgiMainFeedList");
                }
                e();
                f("ViewIdMainFeed", 0);
            }
        }
    }

    public final void c() {
        if (this.f94067c) {
            return;
        }
        this.f94067c = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f94074j;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MegaVideo-Trace onFeedShow, enterType:");
        sb6.append(this.f94073i);
        sb6.append(" hitCache:");
        sb6.append(this.f94066b);
        sb6.append(", cost:");
        sb6.append(currentTimeMillis);
        sb6.append(" sessionId:");
        long j17 = this.f94065a;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoPerformanceMonitor", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 2, java.lang.Integer.valueOf(this.f94066b), java.lang.Long.valueOf(currentTimeMillis), 1, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f94073i));
    }

    public final void d() {
        int i17 = 2;
        if (this.f94077m) {
            this.f94077m = false;
            a(2);
        }
        if (!this.f94069e && this.f94068d) {
            this.f94069e = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f94074j;
            boolean z17 = this.f94067c;
            if (!vn2.u0.f519920a.g()) {
                i17 = 1;
            } else if (!this.f94071g) {
                i17 = 3;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MegaVideo-Trace onPageLeave, enterType:");
            sb6.append(this.f94073i);
            sb6.append(" hitCache:");
            sb6.append(this.f94066b);
            sb6.append(", feedShowState:");
            sb6.append(z17 ? 1 : 0);
            sb6.append(", videoPlayState:");
            sb6.append(i17);
            sb6.append(", stayTime:");
            sb6.append(currentTimeMillis);
            sb6.append(" sessionId:");
            long j17 = this.f94065a;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoPerformanceMonitor", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 3, java.lang.Integer.valueOf(this.f94066b), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f94073i), "", java.lang.Integer.valueOf(i17));
        }
    }

    public final synchronized void e() {
        if (this.f94076l == null) {
            return;
        }
        if (this.f94078n) {
            this.f94078n = false;
            a(4);
        }
    }

    public final void f(java.lang.String viewId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        qg3.w wVar = this.f94076l;
        if (wVar != null) {
            p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169896x21b902d1(((qg3.x) wVar).m105978x2737f10(), viewId, i17);
        }
    }
}
