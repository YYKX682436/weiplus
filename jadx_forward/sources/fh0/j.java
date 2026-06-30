package fh0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str) {
        super(0);
        this.f344062d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh0.a aVar = fh0.k.f344064b;
        if (aVar != null) {
            java.lang.String text = this.f344062d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            android.widget.TextView textView = aVar.f344043f;
            if (text.length() == 0) {
                text = "waiting...";
            }
            textView.setText(text);
        }
        return jz5.f0.f384359a;
    }
}
