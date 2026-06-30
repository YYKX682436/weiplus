package in5;

/* loaded from: classes10.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374596e;

    public h1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f374595d = c22848x6ddd90cf;
        this.f374596e = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.b1 b1Var = this.f374595d.G;
        if (b1Var != null) {
            b1Var.mo481x4d79408f(this.f374596e, 8);
        }
    }
}
