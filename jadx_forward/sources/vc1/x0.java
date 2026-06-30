package vc1;

/* loaded from: classes13.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f516736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516738f;

    public x0(vc1.p1 p1Var, int i17, int i18) {
        this.f516738f = p1Var;
        this.f516736d = i17;
        this.f516737e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f516738f.f516629s == null) {
            vc1.p1 p1Var = this.f516738f;
            p1Var.f516629s = new vc1.j1(p1Var, p1Var.f516593a, p1Var.f516601e.mo98897xb5885626());
        }
        vc1.p1 p1Var2 = this.f516738f;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c c26118xa74407c = p1Var2.f516631t;
        if (c26118xa74407c == null) {
            vc1.p1 p1Var3 = this.f516738f;
            p1Var2.f516631t = new vc1.l1(p1Var3, p1Var3.f516593a, p1Var3.f516601e.mo98897xb5885626(), this.f516738f.f516629s);
            this.f516738f.f516631t.m100193x236e486b(this.f516736d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7 c26114xe1bbf3c7 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7(this.f516738f.f516593a);
            c26114xe1bbf3c7.m100161xa2f0053d(this.f516737e);
            this.f516738f.f516629s.m100134x6931e62d(c26114xe1bbf3c7);
        } else {
            c26118xa74407c.m100193x236e486b(this.f516736d);
            if (this.f516738f.f516629s.m100127xcde25b9() != null && (this.f516738f.f516629s.m100127xcde25b9() instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7)) {
                ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7) this.f516738f.f516629s.m100127xcde25b9()).m100161xa2f0053d(this.f516737e);
            }
        }
        this.f516738f.f516629s.m100138x908e3a03(new vc1.v0(this));
        this.f516738f.f516629s.m100140x48419a30(new vc1.w0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "init map marker cluster finish");
        this.f516738f.f516629s.m100142x5913df45(this.f516738f.f516631t);
        this.f516738f.f516629s.m100135x8b5bf8e9(true);
        this.f516738f.f516601e.mo98897xb5885626().mo99007x16135f64(this.f516738f.f516629s);
        this.f516738f.f516633u = false;
    }
}
