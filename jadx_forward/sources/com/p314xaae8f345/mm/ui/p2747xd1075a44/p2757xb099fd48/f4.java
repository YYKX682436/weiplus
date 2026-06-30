package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class f4 extends android.app.Dialog {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f293323n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 f293324d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f293325e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f293326f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f293327g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f293328h;

    /* renamed from: i, reason: collision with root package name */
    public int f293329i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f293330m;

    public f4(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i17);
        this.f293329i = i18;
        this.f293330m = z17;
        android.view.View inflate = android.view.View.inflate(getContext(), (i18 == 1 || i18 == 2) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dig : com.p314xaae8f345.mm.R.C30864xbddafb2a.dih, null);
        this.f293328h = inflate;
        this.f293325e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        this.f293326f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f293328h.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2);
        this.f293327g = (android.widget.ProgressBar) this.f293328h.findViewById(com.p314xaae8f345.mm.R.id.qgu);
        int i19 = this.f293329i;
        if (i19 == 1) {
            this.f293326f.setVisibility(0);
            this.f293327g.setVisibility(8);
        } else if (i19 == 2) {
            this.f293326f.setVisibility(8);
            this.f293327g.setVisibility(0);
        }
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f293328h, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        if (this.f293329i != 2 && !this.f293330m) {
            attributes.flags = attributes.flags | 8 | 16;
        }
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
