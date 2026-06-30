package d92;

/* loaded from: classes.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.a2 f309047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(d92.a2 a2Var) {
        super(1);
        this.f309047d = a2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String string;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5t);
        int c18 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        d92.a2 a2Var = this.f309047d;
        android.app.Activity context = a2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c18 == 1) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (c18 != 2) {
            string = "";
        } else {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        java.lang.String string2 = a2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ch9, d17, string, java.lang.Integer.valueOf(c17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
