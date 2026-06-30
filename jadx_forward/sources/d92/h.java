package d92;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.j f309010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d92.j jVar) {
        super(1);
        this.f309010d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565941e61);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5o);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        int c18 = aVar.c(it, com.p314xaae8f345.mm.R.id.f565949e73);
        boolean b17 = aVar.b(it, com.p314xaae8f345.mm.R.id.e5v, false);
        d92.f fVar = d92.f.f309003a;
        d92.j jVar = this.f309010d;
        java.lang.CharSequence c19 = fVar.c(jVar.m80379x76847179(), c17);
        java.lang.CharSequence f17 = fVar.f(jVar.m80379x76847179(), c18);
        if (((java.lang.String) f17).length() == 0) {
            return "";
        }
        if (b17) {
            str = "";
        } else {
            java.lang.String string = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            str = string;
        }
        java.lang.String string2 = jVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2e, d17, f17, c19, str, d18, d19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
