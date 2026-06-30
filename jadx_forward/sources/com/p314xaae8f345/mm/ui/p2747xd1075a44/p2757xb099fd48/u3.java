package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class u3 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f293537d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f293538e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f293539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293540g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 f293541h;

    public u3(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.f293540g = i18;
        android.view.View inflate = android.view.View.inflate(getContext(), (i18 == 0 || i18 != 1) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.c1_ : com.p314xaae8f345.mm.R.C30864xbddafb2a.c1b, null);
        this.f293539f = inflate;
        this.f293537d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jma);
        this.f293538e = (android.widget.ProgressBar) this.f293539f.findViewById(com.p314xaae8f345.mm.R.id.jm_);
        setCanceledOnTouchOutside(true);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i18 <= 0) {
            i18 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd;
            if (i17 != 0 && i17 != 1 && i17 != 2) {
                i18 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576329wi;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3(context);
        t3Var.f293515c = charSequence;
        t3Var.f293517e = i17;
        t3Var.f293518f = i18;
        t3Var.f293516d = z17;
        t3Var.f293522j = onCancelListener;
        return t3Var.a();
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return b(context, charSequence, z17, i17, -1, onCancelListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 b17 = b(context, charSequence, z17, i17, i18, onCancelListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = b17.f293541h;
        if (t3Var.b(t3Var.f293514b)) {
            if (t3Var.f293513a == null) {
                t3Var.f293513a = t3Var.a();
            }
            t3Var.f293513a.show();
        } else {
            com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278092p = t3Var;
            android.content.Intent intent = new android.content.Intent(t3Var.f293514b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 4);
            android.content.Context context2 = t3Var.f293514b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return b17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return e(context, charSequence, z17, i17, -1, onCancelListener);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var;
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
            if (t3Var != null && (s3Var = t3Var.f293519g) != null && t3Var.f293513a != this) {
                com.p314xaae8f345.mm.ui.c0 c0Var = (com.p314xaae8f345.mm.ui.c0) s3Var;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c0Var.f279600a;
                if (u3Var.isShowing()) {
                    u3Var.dismiss();
                }
                c0Var.f279601b.finish();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var2 = this.f293541h;
            if (t3Var2 != null) {
                t3Var2.f293520h = true;
            }
            super.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f293539f, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        if (this.f293540g == 2) {
            getWindow().addFlags(2);
            attributes.dimAmount = 0.65f;
        }
        onWindowAttributesChanged(attributes);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f293537d.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
        if (t3Var == null || t3Var.f293513a == this) {
            return;
        }
        t3Var.f293522j = onCancelListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var = t3Var.f293519g;
        if (s3Var != null) {
            ((com.p314xaae8f345.mm.ui.c0) s3Var).f279600a.setOnCancelListener(onCancelListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
        if (t3Var == null || t3Var.f293513a == this) {
            return;
        }
        t3Var.f293521i = onDismissListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var = t3Var.f293519g;
        if (s3Var != null) {
            ((com.p314xaae8f345.mm.ui.c0) s3Var).f279600a.setOnDismissListener(onDismissListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
        if (t3Var == null || t3Var.f293513a == this) {
            return;
        }
        t3Var.f293524l = onKeyListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var = t3Var.f293519g;
        if (s3Var != null) {
            ((com.p314xaae8f345.mm.ui.c0) s3Var).f279600a.setOnKeyListener(onKeyListener);
        }
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
        if (t3Var == null || t3Var.f293513a == this) {
            return;
        }
        t3Var.f293523k = onShowListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var = t3Var.f293519g;
        if (s3Var != null) {
            ((com.p314xaae8f345.mm.ui.c0) s3Var).f279600a.setOnShowListener(onShowListener);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 s3Var;
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = this.f293541h;
            if (t3Var != null && (s3Var = t3Var.f293519g) != null && t3Var.f293513a != this) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ((com.p314xaae8f345.mm.ui.c0) s3Var).f279600a;
                if (!u3Var.isShowing()) {
                    u3Var.show();
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var2 = this.f293541h;
            if (t3Var2 != null) {
                t3Var2.f293520h = false;
            }
            super.show();
        } catch (java.lang.Exception unused) {
        }
    }
}
