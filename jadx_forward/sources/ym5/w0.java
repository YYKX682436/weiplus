package ym5;

/* loaded from: classes15.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.m0 f545093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f545094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ym5.m0 m0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super(0);
        this.f545093d = m0Var;
        this.f545094e = c1163xf1deaba4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f545094e;
        ym5.m0 m0Var = this.f545093d;
        if (m0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
            ym5.a1.f(new ym5.y0(null, c1163xf1deaba4));
            java.lang.Object tag = c1163xf1deaba4.getTag(com.p314xaae8f345.mm.R.id.dkl);
            if (tag != null && (tag instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.w2)) {
                c1163xf1deaba4.V0((p012xc85e97e9.p103xe821e364.p104xd1075a44.w2) tag);
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            boolean d17 = m0Var.d();
            java.lang.Object tag2 = c1163xf1deaba4.getTag(com.p314xaae8f345.mm.R.id.dkl);
            if (tag2 != null && (tag2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.w2)) {
                c1163xf1deaba4.V0((p012xc85e97e9.p103xe821e364.p104xd1075a44.w2) tag2);
            }
            ym5.v0 v0Var = new ym5.v0(f0Var);
            c1163xf1deaba4.i(v0Var);
            c1163xf1deaba4.setTag(com.p314xaae8f345.mm.R.id.dkl, v0Var);
            ym5.a1.f(new ym5.y0(new ym5.u0(m0Var, c1163xf1deaba4, d17, f0Var), c1163xf1deaba4));
        }
        return jz5.f0.f384359a;
    }
}
