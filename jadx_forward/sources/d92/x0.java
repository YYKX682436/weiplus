package d92;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context) {
        super(1);
        this.f309052d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6l);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6k);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6j);
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e6m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d17);
        android.content.Context context = this.f309052d;
        if (!J0) {
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyp));
            sb6.append(d17);
            sb6.append(" ");
        }
        sb6.append(d18);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d19)) {
            sb6.append(" ");
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtr, d19));
        }
        if (c17 > 0) {
            sb6.append(" ");
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtt, java.lang.Integer.valueOf(c17)));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
