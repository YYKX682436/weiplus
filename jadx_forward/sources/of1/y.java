package of1;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, java.lang.String str2, of1.v0 v0Var) {
        super(0);
        this.f426588d = str;
        this.f426589e = str2;
        this.f426590f = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (r26.n0.L(this.f426588d, "#", 0, false, 6, null) >= 0) {
            java.lang.String str = this.f426589e;
            if (!(str == null || str.length() == 0) && !r26.i0.o(str, "#wechat_redirect", false, 2, null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426590f.W1;
                if (oVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 mo51534x86b9ebe3 = ((of1.w1) oVar).mo51534x86b9ebe3();
                java.lang.String format = java.lang.String.format("window.location=\"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(this.f426588d)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                mo51534x86b9ebe3.mo14660x738236e6(format, null);
                return jz5.f0.f384359a;
            }
        }
        zg0.q2.b(this.f426590f, this.f426588d, null, false, 6, null);
        return jz5.f0.f384359a;
    }
}
