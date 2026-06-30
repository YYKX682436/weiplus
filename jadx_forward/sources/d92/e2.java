package d92;

/* loaded from: classes.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.i2 f309002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d92.i2 i2Var) {
        super(1);
        this.f309002d = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e7f);
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d18);
        d92.i2 i2Var = this.f309002d;
        if (J0) {
            java.lang.String string = i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epo, d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epn, d17, d18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
