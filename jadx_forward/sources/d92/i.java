package d92;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.j f309014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d92.j jVar) {
        super(1);
        this.f309014d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5o);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5n);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e76);
        d92.j jVar = this.f309014d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqn))) {
            if (c17 > 0) {
                java.lang.String string = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqu, d18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                return string;
            }
            java.lang.String string2 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqt, d18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqo))) {
            if (c17 > 0) {
                java.lang.String string3 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqs, d18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                return string3;
            }
            java.lang.String string4 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqr, d18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
            return string4;
        }
        if (c17 > 0) {
            java.lang.String string5 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqq, java.lang.Integer.valueOf(c17), d17, d18, d19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
            return string5;
        }
        java.lang.String string6 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqp, d17, d18, d19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string6);
        return string6;
    }
}
