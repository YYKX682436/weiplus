package d92;

/* loaded from: classes.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.u1 f309041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(d92.u1 u1Var) {
        super(1);
        this.f309041d = u1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565941e61);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5o);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        int c18 = aVar.c(it, com.p314xaae8f345.mm.R.id.f565949e73);
        d92.f fVar = d92.f.f309003a;
        d92.u1 u1Var = this.f309041d;
        java.lang.CharSequence c19 = fVar.c(u1Var.m80379x76847179(), c17);
        java.lang.CharSequence f17 = fVar.f(u1Var.m80379x76847179(), c18);
        if (((java.lang.String) f17).length() == 0) {
            return "";
        }
        java.lang.String string = u1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = u1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2e, d17, f17, c19, string, d18, d19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
