package d92;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(1);
        this.f309043d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        boolean a17 = aVar.a(it, com.p314xaae8f345.mm.R.id.e6n);
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e6o);
        it.setClickable(a17);
        if (!a17) {
            return d17.toString();
        }
        java.lang.String string = this.f309043d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfp, d17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }
}
