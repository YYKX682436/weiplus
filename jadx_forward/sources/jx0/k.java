package jx0;

/* loaded from: classes5.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f383911d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f383912e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f383913f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f383914g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f383915h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f383916i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f383917m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f383911d = jz5.h.b(new jx0.g(this));
        this.f383912e = jz5.h.b(new jx0.e(this));
        this.f383913f = jz5.h.b(new jx0.f(this));
        this.f383914g = jz5.h.b(new jx0.i(this));
        this.f383915h = jz5.h.b(new jx0.h(this));
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f383912e).mo141623x754a37bb();
    }

    public final void c(boolean z17) {
        android.content.Context context;
        int i17;
        if (this.f383916i == z17) {
            return;
        }
        this.f383916i = z17;
        ((android.view.View) ((jz5.n) this.f383913f).mo141623x754a37bb()).setEnabled(!this.f383916i);
        b().setEnabled(!this.f383916i);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f383915h).mo141623x754a37bb();
        if (b().isEnabled()) {
            context = getContext();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574027mu1;
        } else {
            context = getContext();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574026mu0;
        }
        textView.setText(i65.a.r(context, i17));
    }

    /* renamed from: getContentView */
    public final android.view.View m141472xc2a54588() {
        return (android.view.View) ((jz5.n) this.f383911d).mo141623x754a37bb();
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView(m141472xc2a54588(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ((android.widget.ProgressBar) ((jz5.n) this.f383914g).mo141623x754a37bb()).setMax(100);
        b().requestFocus();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f383917m = false;
        c(false);
    }
}
