package al5;

/* loaded from: classes12.dex */
public class t4 {

    /* renamed from: c, reason: collision with root package name */
    public al5.u4 f6040c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f6041d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f6042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f6043f;

    /* renamed from: g, reason: collision with root package name */
    public int f6044g;

    /* renamed from: h, reason: collision with root package name */
    public int f6045h;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.snackbar.h f6047j;

    /* renamed from: a, reason: collision with root package name */
    public final al5.r4 f6038a = new al5.r4();

    /* renamed from: b, reason: collision with root package name */
    public int f6039b = 3;

    /* renamed from: i, reason: collision with root package name */
    public int f6046i = 2000;

    /* renamed from: k, reason: collision with root package name */
    public int f6048k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6049l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6050m = false;

    public t4(android.content.Context context) {
        this.f6041d = context;
    }

    public al5.t4 a(java.lang.CharSequence charSequence) {
        this.f6038a.f6013a = charSequence;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.f6048k |= 4;
        } else {
            this.f6048k &= -5;
        }
        return this;
    }

    public al5.t4 b(boolean z17) {
        if (z17) {
            this.f6048k |= 8;
        } else {
            this.f6048k &= -9;
        }
        return this;
    }

    public final void c() {
        if ((this.f6040c.f6067o & 16) != 0) {
            return;
        }
        new android.os.Handler().postDelayed(new al5.s4(this), this.f6046i);
    }

    public al5.u4 d() {
        al5.u4 u4Var = new al5.u4(this.f6041d, com.tencent.mm.R.style.f494676n3, this.f6048k);
        this.f6040c = u4Var;
        i();
        return u4Var;
    }

    public al5.t4 e(int i17) {
        this.f6044g = i17;
        if (i17 > 0) {
            this.f6048k |= 2;
        } else {
            this.f6048k &= -3;
        }
        return this;
    }

    public al5.t4 f(boolean z17) {
        if (z17) {
            this.f6048k |= 16;
        } else {
            this.f6048k &= -17;
        }
        return this;
    }

    public al5.u4 g() {
        if (this.f6050m) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_SNACK_BAR");
            intent.putExtra("INTENT_SNACK_BAR_TEXT", this.f6042e);
            intent.putExtra("INTENT_SNACK_BAR_ICON_ID", this.f6044g);
            intent.setPackage(this.f6041d.getApplicationContext().getPackageName());
            this.f6041d.getApplicationContext().sendBroadcast(intent);
            return null;
        }
        android.content.Context context = this.f6041d;
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) this.f6041d).isDestroyed()) {
            return null;
        }
        if (this.f6040c == null) {
            this.f6040c = d();
        }
        this.f6040c.show();
        c();
        return this.f6040c;
    }

    public al5.u4 h(java.lang.String str, java.lang.String str2) {
        if (this.f6050m) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_FORWARD_SNACK_BAR");
            intent.putExtra("INTENT_SNACK_BAR_TEXT", this.f6042e);
            intent.putExtra("INTENT_SNACK_BAR_ICON_ID", this.f6044g);
            if (!(str == null || r26.n0.N(str))) {
                intent.putExtra("INTENT_SNACK_BAR_FORWARD_USERNAME", str);
            }
            if (!(str2 == null || r26.n0.N(str2))) {
                intent.putExtra("INTENT_SNACK_BAR_FROM_USERNAME", str2);
            }
            intent.setPackage(this.f6041d.getApplicationContext().getPackageName());
            this.f6041d.getApplicationContext().sendBroadcast(intent);
            return null;
        }
        android.content.Context context = this.f6041d;
        if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f6041d).isDestroyed()) {
            if (this.f6040c == null) {
                this.f6040c = d();
            }
            this.f6040c.show();
            c();
            return this.f6040c;
        }
        if (this.f6041d == null) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "Context is null, cannot show WeToast", new java.lang.Object[0]);
            return null;
        }
        com.tencent.mm.ui.AlertActivity.f196561r = this;
        android.content.Intent intent2 = new android.content.Intent(this.f6041d, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
        intent2.setFlags(67108864);
        intent2.putExtra("dialog_scene", 6);
        if (str != null) {
            intent2.putExtra("INTENT_SNACK_BAR_FORWARD_USERNAME", str);
        }
        if (str2 != null) {
            intent2.putExtra("INTENT_SNACK_BAR_FROM_USERNAME", str2);
        }
        android.content.Context context2 = this.f6041d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/WeSnackBar$Builder", "showForwardSnackBar", "(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mm/ui/widget/WeSnackBar;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/WeSnackBar$Builder", "showForwardSnackBar", "(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mm/ui/widget/WeSnackBar;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }

    public al5.u4 i() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        al5.u4 u4Var = this.f6040c;
        if (u4Var != null) {
            u4Var.f6067o = this.f6048k;
            java.lang.CharSequence charSequence = this.f6042e;
            if (this.f6049l) {
                u4Var.c(u4Var.f6060e, charSequence, false);
            } else if (!android.text.TextUtils.isEmpty(charSequence) && (textView3 = u4Var.f6060e) != null) {
                textView3.setText(charSequence);
            }
            int i17 = this.f6039b;
            android.widget.TextView textView4 = u4Var.f6060e;
            if (textView4 != null && i17 > 0) {
                textView4.setMaxLines(i17);
            }
            java.lang.CharSequence charSequence2 = this.f6043f;
            if (charSequence2 != null && charSequence2.length() > 0) {
                java.lang.CharSequence charSequence3 = this.f6043f;
                if (this.f6049l) {
                    u4Var.c(u4Var.f6061f, charSequence3, true);
                } else if (!android.text.TextUtils.isEmpty(charSequence3) && (textView2 = u4Var.f6061f) != null) {
                    textView2.setVisibility(0);
                    u4Var.f6061f.setText(charSequence3);
                }
            }
            int i18 = this.f6044g;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = u4Var.f6063h;
            if (weImageView != null) {
                weImageView.setImageResource(i18);
            }
            u4Var.setCanceledOnTouchOutside(false);
            u4Var.f6059d = this;
            al5.r4 r4Var = this.f6038a;
            if (r4Var != null) {
                java.lang.CharSequence charSequence4 = r4Var.f6013a;
                if (!android.text.TextUtils.isEmpty(charSequence4)) {
                    if (((u4Var.f6067o & 4) != 0) && (textView = u4Var.f6062g) != null) {
                        textView.setText(charSequence4);
                    }
                }
                com.tencent.mm.ui.widget.snackbar.g gVar = r4Var.f6014b;
                android.view.ViewGroup viewGroup = u4Var.f6066n;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new al5.q4(u4Var, gVar));
                }
            }
            com.tencent.mm.ui.widget.snackbar.h hVar = this.f6047j;
            if (hVar != null) {
                u4Var.f6071s = hVar;
            }
            u4Var.f6069q = this.f6045h;
            u4Var.f();
            u4Var.e();
            if (!((u4Var.f6067o & 2) != 0)) {
                u4Var.b(u4Var.f6060e);
                u4Var.b(u4Var.f6061f);
            }
            c();
        }
        return u4Var;
    }
}
