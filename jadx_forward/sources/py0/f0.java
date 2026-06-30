package py0;

/* loaded from: classes5.dex */
public final class f0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440514d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440515e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f440516f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f440517g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f440518h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f440519i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f440514d = "MicroMsg.MaasProgressDialog";
        this.f440515e = jz5.h.b(new py0.b0(this));
        this.f440516f = jz5.h.b(new py0.c0(this));
        this.f440517g = jz5.h.b(new py0.d0(this));
        this.f440518h = jz5.h.b(new py0.e0(this));
    }

    public final android.view.View b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f440516f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void c(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ((android.widget.TextView) ((jz5.n) this.f440518h).mo141623x754a37bb()).setText(msg);
    }

    public final void e(boolean z17) {
        if (this.f440519i != z17) {
            this.f440519i = z17;
            int h17 = z17 ? (getContext().getResources().getDisplayMetrics().heightPixels / 2) - com.p314xaae8f345.mm.ui.bl.h(getContext()) : ((java.lang.Number) ((jz5.n) this.f440517g).mo141623x754a37bb()).intValue();
            b().setPadding(b().getPaddingLeft(), b().getPaddingTop(), b().getPaddingRight(), h17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f440514d, "updateLoadingContainerPaddingBottom: " + this.f440519i + ',' + h17);
        }
        super.show();
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView((android.view.View) ((jz5.n) this.f440515e).mo141623x754a37bb(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f440514d, "onCreate: " + ((java.lang.Number) ((jz5.n) this.f440517g).mo141623x754a37bb()).intValue());
    }

    @Override // android.app.Dialog
    public void show() {
        e(false);
    }
}
