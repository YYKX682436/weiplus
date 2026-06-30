package ow0;

/* loaded from: classes5.dex */
public final class o0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430875f;

    public o0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c, gx0.u2 u2Var, ex0.a0 a0Var) {
        this.f430873d = c10954x76f4876c;
        this.f430874e = u2Var;
        this.f430875f = a0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f430873d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ow0.q0.d(this.f430874e, this.f430873d, this.f430875f, null, 4, null);
    }
}
