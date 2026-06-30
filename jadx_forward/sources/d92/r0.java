package d92;

/* loaded from: classes.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.content.Context context) {
        super(1);
        this.f309036d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        java.lang.String str = "";
        if (text == null) {
            text = "";
        }
        int c17 = e92.b.f331880d.c(it, com.p314xaae8f345.mm.R.id.f565942e62);
        android.content.Context context = this.f309036d;
        if (c17 == 1) {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clw);
        } else if (c17 == 2) {
            str = "," + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clt);
        }
        if (!(str.length() > 0)) {
            return text.toString();
        }
        return ((java.lang.Object) text) + str;
    }
}
