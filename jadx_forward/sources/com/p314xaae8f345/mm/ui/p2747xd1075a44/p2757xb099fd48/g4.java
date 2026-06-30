package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes7.dex */
public class g4 extends android.app.ProgressDialog {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f293335d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f293336e;

    public g4(android.content.Context context, int i17) {
        super(context, i17);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dig, null);
        this.f293335d = inflate;
        this.f293336e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        setCanceledOnTouchOutside(true);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 g4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576209n3);
        g4Var.setMessage(charSequence);
        g4Var.setCancelable(z17);
        g4Var.setOnCancelListener(onCancelListener);
        g4Var.setCanceledOnTouchOutside(z17);
        return g4Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 b17 = b(context, charSequence, z17, onCancelListener);
        b17.show();
        return b17;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("WeUI.WeUIProgresssDialog", "dismiss exception, e = " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f293335d, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f293336e.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.d("WeUI.WeUIProgresssDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
