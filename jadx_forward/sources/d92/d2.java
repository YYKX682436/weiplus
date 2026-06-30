package d92;

/* loaded from: classes.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.i2 f308997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(d92.i2 i2Var) {
        super(1);
        this.f308997d = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String string;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5k);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e77);
        java.lang.CharSequence d27 = aVar.d(it, com.p314xaae8f345.mm.R.id.e7f);
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d19);
        d92.i2 i2Var = this.f308997d;
        if (J0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d27)) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d18) ? i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epo, d17) : i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epn, d17, d18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d18) ? i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epk, d17, d19) : i2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epj, d17, d18, d27, d19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        return string;
    }
}
