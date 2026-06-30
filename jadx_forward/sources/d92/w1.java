package d92;

/* loaded from: classes.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.a2 f309050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(d92.a2 a2Var) {
        super(1);
        this.f309050d = a2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int c17 = e92.b.f331880d.c(it, com.p314xaae8f345.mm.R.id.e76);
        d92.a2 a2Var = this.f309050d;
        if (c17 > 0) {
            java.lang.String string = a2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573483er2, java.lang.Integer.valueOf(c17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = a2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ep_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }
}
