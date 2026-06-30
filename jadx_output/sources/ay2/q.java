package ay2;

/* loaded from: classes3.dex */
public final class q extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f15260d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f15261e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f15262f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f15263g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f15264h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f15265i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.app.Activity activity) {
        super(activity, com.tencent.mm.R.style.f494793wf);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f15260d = activity;
        this.f15261e = jz5.h.b(new ay2.m(this));
        this.f15262f = jz5.h.b(new ay2.p(this));
        this.f15263g = jz5.h.b(new ay2.l(this));
        this.f15264h = jz5.h.b(new ay2.o(this));
        this.f15265i = jz5.h.b(new ay2.n(this));
    }

    public final android.view.View b() {
        java.lang.Object value = ((jz5.n) this.f15261e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494198gv);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        setContentView(b());
        setCanceledOnTouchOutside(true);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f15262f).getValue();
        android.app.Activity activity = this.f15260d;
        if (textView != null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            textView.setText(activity.getString(com.tencent.mm.R.string.ola, java.lang.String.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G6).getValue()).r()).intValue() / 3600)));
        }
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) this.f15263g).getValue();
        if (textView2 != null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            textView2.setText(activity.getString(com.tencent.mm.R.string.ol_, java.lang.String.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H6).getValue()).r()).intValue() / 3600)));
        }
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.f15264h).getValue();
        if (button != null) {
            button.setOnClickListener(new ay2.j(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f15265i).getValue();
        if (weImageView != null) {
            weImageView.setOnClickListener(new ay2.k(this));
        }
    }
}
