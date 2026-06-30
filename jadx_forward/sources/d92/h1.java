package d92;

/* loaded from: classes.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f309012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(d92.p1 p1Var) {
        super(1);
        this.f309012d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5j);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5h);
        d92.p1 p1Var = this.f309012d;
        if (c17 == 1) {
            java.lang.String string = android.text.TextUtils.isEmpty(d18) ? p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cly, d17) : p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clz, d17, d18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (c17 == 2) {
            java.lang.String string2 = p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clv, d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (c17 != 100) {
            return "";
        }
        java.lang.String string3 = p1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572814cm0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string3;
    }
}
