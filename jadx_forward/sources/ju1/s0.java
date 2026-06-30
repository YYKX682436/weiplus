package ju1;

/* loaded from: classes.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f383326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.StringBuilder sb6) {
        super(1);
        this.f383326d = sb6;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View labelView = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelView, "labelView");
        if (labelView instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) labelView;
            if (textView.isShown()) {
                this.f383326d.append(textView.getText());
            }
        }
        return jz5.f0.f384359a;
    }
}
