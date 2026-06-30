package hu4;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu4.e f366759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hu4.e eVar) {
        super(1);
        this.f366759d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        hu4.e eVar = this.f366759d;
        java.lang.String str = eVar.f366760d;
        boolean z18 = it instanceof android.widget.TextView;
        android.widget.TextView textView = z18 ? (android.widget.TextView) it : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(textView != null ? textView.getText() : null))) {
            z17 = false;
        } else {
            android.widget.TextView textView2 = z18 ? (android.widget.TextView) it : null;
            eVar.f366760d = java.lang.String.valueOf(textView2 != null ? textView2.getText() : null);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
