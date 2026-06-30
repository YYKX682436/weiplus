package d92;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(1);
        this.f309044d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        e92.a aVar = e92.b.f331880d;
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.rl_);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        android.content.Context context = this.f309044d;
        if (num == null) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqa);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        long intValue = num.intValue() / 60;
        long intValue2 = num.intValue() % 60;
        if (intValue == 0) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqc, java.lang.Long.valueOf(intValue2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqb, java.lang.Long.valueOf(intValue), java.lang.Long.valueOf(intValue2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string3;
    }
}
