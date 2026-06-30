package ao2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public int f12533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12537f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12538g;

    /* renamed from: h, reason: collision with root package name */
    public long f12539h;

    /* renamed from: j, reason: collision with root package name */
    public long f12541j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12542k;

    /* renamed from: l, reason: collision with root package name */
    public qg3.w f12543l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12544m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12545n;

    /* renamed from: a, reason: collision with root package name */
    public final long f12532a = java.lang.System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public int f12540i = 2;

    public final void a(int i17) {
        qg3.w wVar = this.f12543l;
        if (wVar != null) {
            urgen.ur_54A4.UR_720C.UR_EE8C(((qg3.x) wVar).getCppPointer(), i17);
        }
    }

    public final void b(java.lang.String sessionKey, long j17, long j18, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(sessionKey, "sessionKey");
        if (this.f12542k) {
            if (this.f12544m) {
                return;
            }
            this.f12544m = true;
            a(1);
            return;
        }
        this.f12542k = true;
        int i19 = qg3.x.f362884d;
        com.tencent.unit_rc.BaseObjectDef UR_E170 = urgen.ur_54A4.UR_720C.UR_E170();
        kotlin.jvm.internal.o.e(UR_E170, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.MegaVideoPageMonitor");
        qg3.w wVar = (qg3.w) UR_E170;
        this.f12543l = wVar;
        urgen.ur_54A4.UR_720C.UR_48E9(((qg3.x) wVar).getCppPointer(), sessionKey, j17, j18, i17, i18);
        if (!this.f12544m) {
            this.f12544m = true;
            a(1);
        }
        if (z17) {
            iy1.c cVar = iy1.c.MainUI;
            if (j18 == 50030) {
                qg3.w wVar2 = this.f12543l;
                if (wVar2 != null) {
                    urgen.ur_54A4.UR_720C.UR_7471(((qg3.x) wVar2).getCppPointer(), "CgiMainFeedList");
                }
                e();
                f("ViewIdMainFeed", 0);
            }
        }
    }

    public final void c() {
        if (this.f12534c) {
            return;
        }
        this.f12534c = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f12541j;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MegaVideo-Trace onFeedShow, enterType:");
        sb6.append(this.f12540i);
        sb6.append(" hitCache:");
        sb6.append(this.f12533b);
        sb6.append(", cost:");
        sb6.append(currentTimeMillis);
        sb6.append(" sessionId:");
        long j17 = this.f12532a;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoPerformanceMonitor", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 2, java.lang.Integer.valueOf(this.f12533b), java.lang.Long.valueOf(currentTimeMillis), 1, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f12540i));
    }

    public final void d() {
        int i17 = 2;
        if (this.f12544m) {
            this.f12544m = false;
            a(2);
        }
        if (!this.f12536e && this.f12535d) {
            this.f12536e = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f12541j;
            boolean z17 = this.f12534c;
            if (!vn2.u0.f438387a.g()) {
                i17 = 1;
            } else if (!this.f12538g) {
                i17 = 3;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MegaVideo-Trace onPageLeave, enterType:");
            sb6.append(this.f12540i);
            sb6.append(" hitCache:");
            sb6.append(this.f12533b);
            sb6.append(", feedShowState:");
            sb6.append(z17 ? 1 : 0);
            sb6.append(", videoPlayState:");
            sb6.append(i17);
            sb6.append(", stayTime:");
            sb6.append(currentTimeMillis);
            sb6.append(" sessionId:");
            long j17 = this.f12532a;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoPerformanceMonitor", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 3, java.lang.Integer.valueOf(this.f12533b), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f12540i), "", java.lang.Integer.valueOf(i17));
        }
    }

    public final synchronized void e() {
        if (this.f12543l == null) {
            return;
        }
        if (this.f12545n) {
            this.f12545n = false;
            a(4);
        }
    }

    public final void f(java.lang.String viewId, int i17) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        qg3.w wVar = this.f12543l;
        if (wVar != null) {
            urgen.ur_54A4.UR_720C.UR_C310(((qg3.x) wVar).getCppPointer(), viewId, i17);
        }
    }
}
