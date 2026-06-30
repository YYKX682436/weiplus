package ay2;

/* loaded from: classes3.dex */
public final class q extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f96793d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f96794e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f96795f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f96796g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f96797h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f96798i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.app.Activity activity) {
        super(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576326wf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96793d = activity;
        this.f96794e = jz5.h.b(new ay2.m(this));
        this.f96795f = jz5.h.b(new ay2.p(this));
        this.f96796g = jz5.h.b(new ay2.l(this));
        this.f96797h = jz5.h.b(new ay2.o(this));
        this.f96798i = jz5.h.b(new ay2.n(this));
    }

    public final android.view.View b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f96794e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575731gv);
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
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f96795f).mo141623x754a37bb();
        android.app.Activity activity = this.f96793d;
        if (textView != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ola, java.lang.String.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G6).mo141623x754a37bb()).r()).intValue() / 3600)));
        }
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) this.f96796g).mo141623x754a37bb();
        if (textView2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            textView2.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ol_, java.lang.String.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.H6).mo141623x754a37bb()).r()).intValue() / 3600)));
        }
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.f96797h).mo141623x754a37bb();
        if (button != null) {
            button.setOnClickListener(new ay2.j(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f96798i).mo141623x754a37bb();
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new ay2.k(this));
        }
    }
}
