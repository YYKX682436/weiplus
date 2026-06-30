package d92;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context) {
        super(1);
        this.f309048d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View v17 = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        e92.a aVar = e92.b.f331880d;
        int c17 = aVar.c(v17, com.p314xaae8f345.mm.R.id.tb9);
        int c18 = aVar.c(v17, com.p314xaae8f345.mm.R.id.tb7);
        boolean b17 = aVar.b(v17, com.p314xaae8f345.mm.R.id.tb8, true);
        android.content.Context context = this.f309048d;
        java.lang.String string = b17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f29) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.etf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (c17 <= 0) {
            return string;
        }
        java.lang.String valueOf = java.lang.String.valueOf(e06.p.f((int) ((c18 * 100.0f) / c17), 0, 100));
        zl2.q4 q4Var = zl2.q4.f555466a;
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8w, valueOf, q4Var.l(c18), q4Var.l(c17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string + ", " + string2;
    }
}
