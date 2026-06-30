package ya2;

/* loaded from: classes.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context) {
        super(1);
        this.f542031d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.f565941e61);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.lang.Object tag2 = it.getTag(com.p314xaae8f345.mm.R.id.e5o);
        java.lang.String str3 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object tag3 = it.getTag(com.p314xaae8f345.mm.R.id.f565940e60);
        java.lang.Boolean bool = tag3 instanceof java.lang.Boolean ? (java.lang.Boolean) tag3 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.Object tag4 = it.getTag(com.p314xaae8f345.mm.R.id.e5z);
        java.lang.Boolean bool2 = tag4 instanceof java.lang.Boolean ? (java.lang.Boolean) tag4 : null;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        java.lang.Object tag5 = it.getTag(com.p314xaae8f345.mm.R.id.f565949e73);
        java.lang.Integer num = tag5 instanceof java.lang.Integer ? (java.lang.Integer) tag5 : null;
        int intValue = num != null ? num.intValue() : 0;
        android.content.Context context = this.f542031d;
        if (intValue == 2) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.elb);
        } else if (intValue == 4) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ele);
        } else if (intValue == 9) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eld);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        if (booleanValue) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8k) + str2;
        }
        java.lang.String string = context.getString(booleanValue2 ? com.p314xaae8f345.mm.R.C30867xcad56011.ci7 : com.p314xaae8f345.mm.R.C30867xcad56011.ci6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ez8, str2, string, str, str3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
