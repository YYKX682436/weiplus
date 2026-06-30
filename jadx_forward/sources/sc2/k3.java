package sc2;

/* loaded from: classes2.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f487546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 f487548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(in5.s0 s0Var, sc2.m3 m3Var, xc2.p0 p0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2) {
        super(1);
        this.f487545d = s0Var;
        this.f487546e = m3Var;
        this.f487547f = p0Var;
        this.f487548g = c22644xc8fbf3b2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        float dimensionPixelSize = this.f487545d.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f487546e.getClass();
        xc2.p0 p0Var = this.f487547f;
        boolean z17 = p0Var != null && p0Var.f534789r == 2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = this.f487548g;
        if (z17) {
            c22644xc8fbf3b2.c(dimensionPixelSize, 0.0f, dimensionPixelSize, 0.0f);
        } else {
            c22644xc8fbf3b2.m81435x205ac394(dimensionPixelSize);
        }
        c22644xc8fbf3b2.setBackgroundColor(intValue);
        return jz5.f0.f384359a;
    }
}
