package ez;

/* loaded from: classes12.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez.k1 f339274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f339275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339276g;

    public i1(java.lang.String str, ez.k1 k1Var, long j17, java.lang.String str2) {
        this.f339273d = str;
        this.f339274e = k1Var;
        this.f339275f = j17;
        this.f339276g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f339273d;
        if (this.f339274e.f339284d.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("msg_empty_table");
            c6754x4f2fd58c.u(str);
            c6754x4f2fd58c.f140813i = this.f339275f;
            java.lang.String str2 = this.f339276g;
            if (str2 == null) {
                str2 = "";
            }
            c6754x4f2fd58c.r(str2);
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.k();
        }
    }
}
