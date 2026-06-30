package d92;

/* loaded from: classes.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d92.z0 f309046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, d92.z0 z0Var) {
        super(1);
        this.f309045d = context;
        this.f309046e = z0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.e67);
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565943e63);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e66);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.e69);
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(d19);
        android.content.Context context = this.f309045d;
        if (!J0) {
            d19 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573345eb3, d19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getString(...)");
        }
        java.lang.CharSequence d27 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565945e65);
        java.lang.CharSequence d28 = aVar.d(it, com.p314xaae8f345.mm.R.id.e68);
        this.f309046e.getClass();
        switch (c17) {
            case 10001:
            case 10006:
            case 10007:
            case 10008:
            case 10018:
            case 10019:
            case 20013:
            case 20019:
            case 20020:
            case 100000:
            case 100001:
                z17 = true;
                break;
            default:
                z17 = false;
                break;
        }
        if (z17) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_x, d28, d27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_u, d17, d18, d19, d27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }
}
