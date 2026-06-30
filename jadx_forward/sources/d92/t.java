package d92;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(1);
        this.f309039d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e79);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5i);
        int c18 = aVar.c(it, com.p314xaae8f345.mm.R.id.e5t);
        android.content.Context context = this.f309039d;
        if (c17 == 1) {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clw);
        } else if (c17 != 2) {
            str = "";
        } else {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clt);
        }
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9n, d17, str, java.lang.Integer.valueOf(c18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
