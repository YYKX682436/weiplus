package d92;

/* loaded from: classes.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f309020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(d92.p1 p1Var) {
        super(1);
        this.f309020d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565941e61);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5o);
        boolean a17 = aVar.a(it, com.p314xaae8f345.mm.R.id.f565940e60);
        boolean a18 = aVar.a(it, com.p314xaae8f345.mm.R.id.e5z);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.f565949e73);
        d92.p1 p1Var = this.f309020d;
        java.lang.String string = c17 != 2 ? c17 != 4 ? c17 != 9 ? "" : p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eld) : p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ele) : p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (a17) {
            string = p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8k) + string;
        }
        java.lang.String string2 = p1Var.m80379x76847179().getString(a18 ? com.p314xaae8f345.mm.R.C30867xcad56011.ci7 : com.p314xaae8f345.mm.R.C30867xcad56011.ci6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        java.lang.String string3 = p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ez8, string, string2, d17, d18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }
}
