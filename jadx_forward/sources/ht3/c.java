package ht3;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f366479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ht3.g gVar) {
        super(1);
        this.f366479d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.f568662nm1);
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        if (text == null) {
            text = "";
        }
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.e7_);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ht3.g gVar = this.f366479d;
        if (booleanValue) {
            java.lang.String string = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3i, text);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9a, text);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }
}
