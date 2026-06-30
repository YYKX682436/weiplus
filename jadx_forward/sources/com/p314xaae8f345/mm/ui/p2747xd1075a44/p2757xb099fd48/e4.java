package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f293307a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f293308b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f293309c;

    /* renamed from: d, reason: collision with root package name */
    public int f293310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f293312f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f293313g = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f293314h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f293315i = null;

    public e4(android.content.Context context) {
        this.f293308b = context;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4(this.f293308b, com.p314xaae8f345.mm.R.C30868x68b1db1.f576209n3, this.f293313g, this.f293312f);
        java.lang.CharSequence charSequence = this.f293309c;
        android.widget.TextView textView = f4Var.f293325e;
        if (textView != null) {
            textView.setText(charSequence);
        }
        int i17 = this.f293310d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = f4Var.f293326f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(i17);
        }
        f4Var.setCancelable(this.f293311e);
        f4Var.setCanceledOnTouchOutside(false);
        f4Var.setOnCancelListener(this.f293314h);
        f4Var.setOnDismissListener(this.f293315i);
        f4Var.f293324d = this;
        this.f293307a = f4Var;
        return f4Var;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 b(int i17) {
        this.f293310d = i17;
        if (i17 > 0) {
            this.f293313g = 1;
        }
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 c() {
        android.content.Context context = this.f293308b;
        if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f293308b).isDestroyed()) {
            if (this.f293307a == null) {
                this.f293307a = a();
            }
            this.f293307a.show();
            int i17 = this.f293313g;
            if (i17 == 0 || i17 == 1) {
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d4(this), 2000);
            }
            return this.f293307a;
        }
        if (this.f293308b == null) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeToast", "Context is null, cannot show WeToast", new java.lang.Object[0]);
            return null;
        }
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278093q = this;
        android.content.Intent intent = new android.content.Intent(this.f293308b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
        intent.setFlags(335544320);
        intent.putExtra("dialog_scene", 5);
        android.content.Context context2 = this.f293308b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/WeToast$Builder", "show", "()Lcom/tencent/mm/ui/widget/dialog/WeToast;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/WeToast$Builder", "show", "()Lcom/tencent/mm/ui/widget/dialog/WeToast;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 d(int i17) {
        this.f293309c = this.f293308b.getText(i17);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 e() {
        int i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f293307a;
        if (f4Var != null) {
            java.lang.CharSequence charSequence = this.f293309c;
            android.widget.TextView textView = f4Var.f293325e;
            if (textView != null) {
                textView.setText(charSequence);
            }
            int i18 = this.f293310d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = f4Var.f293326f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(i18);
            }
            f4Var.setCancelable(this.f293311e);
            f4Var.setCanceledOnTouchOutside(false);
            f4Var.setOnCancelListener(this.f293314h);
            f4Var.setOnDismissListener(this.f293315i);
            f4Var.f293324d = this;
            int i19 = this.f293313g;
            f4Var.f293329i = i19;
            if (i19 == 1) {
                f4Var.f293326f.setVisibility(0);
                f4Var.f293327g.setVisibility(8);
            } else if (i19 == 2) {
                f4Var.f293326f.setVisibility(8);
                f4Var.f293327g.setVisibility(0);
            }
            this.f293307a = f4Var;
            android.content.Context context = this.f293308b;
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f293308b).isDestroyed() && ((i17 = this.f293313g) == 0 || i17 == 1)) {
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b4(this), 2000);
            }
        }
        return f4Var;
    }
}
