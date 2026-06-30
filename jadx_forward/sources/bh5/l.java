package bh5;

/* loaded from: classes4.dex */
public class l extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f102476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, int i17) {
        super(context, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        hashCode();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        yz5.a aVar = this.f102476d;
        boolean z17 = false;
        if (aVar != null && ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getContext(), "getContext(...)");
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.app.Dialog
    public void show() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.show();
    }
}
