package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class o5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405 f92210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f92211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405 c1066x9f035405, yz5.p pVar) {
        super(2);
        this.f92210d = c1066x9f035405;
        this.f92211e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405 c1066x9f035405 = this.f92210d;
        java.lang.Object tag = c1066x9f035405.f92029d.getTag(com.p314xaae8f345.mm.R.id.hdy);
        java.util.Set set = p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(tag) ? (java.util.Set) tag : null;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = c1066x9f035405.f92029d;
        if (set == null) {
            java.lang.Object parent = c1059xa8272988.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            java.lang.Object tag2 = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.hdy) : null;
            set = p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(tag2) ? (java.util.Set) tag2 : null;
        }
        if (set != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            set.add(y0Var2.f415296d);
            y0Var2.f415309q = true;
        }
        n0.d2.f(c1059xa8272988, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l5(c1066x9f035405, null), oVar, 8);
        n0.d2.f(c1059xa8272988, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m5(c1066x9f035405, null), oVar, 8);
        n0.n1.a(new n0.i3[]{y0.d.f540022a.b(set)}, u0.j.b(oVar, -1193460702, true, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n5(c1066x9f035405, this.f92211e)), oVar, 56);
        return jz5.f0.f384359a;
    }
}
