package xo2;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(1);
        this.f537297d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6t);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6s);
        android.content.Context context = this.f537297d;
        if (c17 == 1) {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clw);
        } else if (c17 != 2) {
            str = "";
        } else {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clt);
        }
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqx, d17, str, d18, d19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
