package rc3;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f475640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rc3.w0 w0Var, boolean z17) {
        super(0);
        this.f475639d = w0Var;
        this.f475640e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jc3.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475639d.f475624i;
        if (c16416x87606a7b != null && (f0Var = c16416x87606a7b.f229364u) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitch: ");
            boolean z17 = this.f475640e;
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBInspectorImpl", sb6.toString());
            ym5.a1.f(new bf3.v((bf3.z) f0Var, z17));
        }
        return jz5.f0.f384359a;
    }
}
