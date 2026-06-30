package ht3;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f366478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ht3.g gVar) {
        super(1);
        this.f366478d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.e7e);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Object tag2 = it.getTag(com.p314xaae8f345.mm.R.id.e5x);
        java.lang.Boolean bool = tag2 instanceof java.lang.Boolean ? (java.lang.Boolean) tag2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ht3.g gVar = this.f366478d;
        if (booleanValue) {
            java.lang.String string = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1k, java.lang.Integer.valueOf(intValue));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }
}
