package hu3;

/* loaded from: classes4.dex */
public final class q0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366721d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f366722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f366721d = jz5.h.b(new hu3.o0(this));
        this.f366722e = jz5.h.b(new hu3.p0(this));
    }

    public final void b(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        jz5.g gVar = this.f366722e;
        if (z17) {
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        } else {
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(str);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView((android.view.View) ((jz5.n) this.f366721d).mo141623x754a37bb(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
