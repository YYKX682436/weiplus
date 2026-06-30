package fi1;

/* loaded from: classes8.dex */
public final class g extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 f344316f;

    /* renamed from: g, reason: collision with root package name */
    public ei1.a f344317g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575454n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f344316f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12(context, null);
        C(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f344316f.m52081x30dd42();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344316f;
        if (c12478x3e6e5e12.f167811i) {
            android.graphics.Rect rect = new android.graphics.Rect();
            c12478x3e6e5e12.getWindowVisibleDisplayFrame(rect);
            rect.toString();
            layoutParams = new android.view.ViewGroup.LayoutParams((int) ((rect.right * 1.0f) / 2.0f), -1);
        } else {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(layoutParams.width, layoutParams.height);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575455o);
        }
        c12478x3e6e5e12.m52084xc6cf6336(new fi1.e(this));
        setContentView(c12478x3e6e5e12, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new fi1.f(this));
        setCancelable(true);
    }
}
