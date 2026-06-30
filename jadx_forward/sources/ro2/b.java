package ro2;

/* loaded from: classes2.dex */
public final class b implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479563h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f479564i;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.view.View view, in5.s0 s0Var, int i17, int i18, boolean z17) {
        this.f479559d = qeVar;
        this.f479560e = view;
        this.f479561f = s0Var;
        this.f479562g = i17;
        this.f479563h = i18;
        this.f479564i = z17;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f479559d.K1(this.f479560e, 8);
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I0().r()).booleanValue()) {
            this.f479559d.K1(this.f479560e, 8);
        }
        ro2.r.g(this.f479561f);
        ro2.r.i(this.f479559d, this.f479561f, this.f479562g, this.f479563h, this.f479564i, false);
    }
}
