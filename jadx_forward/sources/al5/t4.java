package al5;

/* loaded from: classes12.dex */
public class t4 {

    /* renamed from: c, reason: collision with root package name */
    public al5.u4 f87573c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f87574d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f87575e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f87576f;

    /* renamed from: g, reason: collision with root package name */
    public int f87577g;

    /* renamed from: h, reason: collision with root package name */
    public int f87578h;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h f87580j;

    /* renamed from: a, reason: collision with root package name */
    public final al5.r4 f87571a = new al5.r4();

    /* renamed from: b, reason: collision with root package name */
    public int f87572b = 3;

    /* renamed from: i, reason: collision with root package name */
    public int f87579i = 2000;

    /* renamed from: k, reason: collision with root package name */
    public int f87581k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f87582l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f87583m = false;

    public t4(android.content.Context context) {
        this.f87574d = context;
    }

    public al5.t4 a(java.lang.CharSequence charSequence) {
        this.f87571a.f87546a = charSequence;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.f87581k |= 4;
        } else {
            this.f87581k &= -5;
        }
        return this;
    }

    public al5.t4 b(boolean z17) {
        if (z17) {
            this.f87581k |= 8;
        } else {
            this.f87581k &= -9;
        }
        return this;
    }

    public final void c() {
        if ((this.f87573c.f87600o & 16) != 0) {
            return;
        }
        new android.os.Handler().postDelayed(new al5.s4(this), this.f87579i);
    }

    public al5.u4 d() {
        al5.u4 u4Var = new al5.u4(this.f87574d, com.p314xaae8f345.mm.R.C30868x68b1db1.f576209n3, this.f87581k);
        this.f87573c = u4Var;
        i();
        return u4Var;
    }

    public al5.t4 e(int i17) {
        this.f87577g = i17;
        if (i17 > 0) {
            this.f87581k |= 2;
        } else {
            this.f87581k &= -3;
        }
        return this;
    }

    public al5.t4 f(boolean z17) {
        if (z17) {
            this.f87581k |= 16;
        } else {
            this.f87581k &= -17;
        }
        return this;
    }

    public al5.u4 g() {
        if (this.f87583m) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_SNACK_BAR");
            intent.putExtra("INTENT_SNACK_BAR_TEXT", this.f87575e);
            intent.putExtra("INTENT_SNACK_BAR_ICON_ID", this.f87577g);
            intent.setPackage(this.f87574d.getApplicationContext().getPackageName());
            this.f87574d.getApplicationContext().sendBroadcast(intent);
            return null;
        }
        android.content.Context context = this.f87574d;
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) this.f87574d).isDestroyed()) {
            return null;
        }
        if (this.f87573c == null) {
            this.f87573c = d();
        }
        this.f87573c.show();
        c();
        return this.f87573c;
    }

    public al5.u4 h(java.lang.String str, java.lang.String str2) {
        if (this.f87583m) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_FORWARD_SNACK_BAR");
            intent.putExtra("INTENT_SNACK_BAR_TEXT", this.f87575e);
            intent.putExtra("INTENT_SNACK_BAR_ICON_ID", this.f87577g);
            if (!(str == null || r26.n0.N(str))) {
                intent.putExtra("INTENT_SNACK_BAR_FORWARD_USERNAME", str);
            }
            if (!(str2 == null || r26.n0.N(str2))) {
                intent.putExtra("INTENT_SNACK_BAR_FROM_USERNAME", str2);
            }
            intent.setPackage(this.f87574d.getApplicationContext().getPackageName());
            this.f87574d.getApplicationContext().sendBroadcast(intent);
            return null;
        }
        android.content.Context context = this.f87574d;
        if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) this.f87574d).isDestroyed()) {
            if (this.f87573c == null) {
                this.f87573c = d();
            }
            this.f87573c.show();
            c();
            return this.f87573c;
        }
        if (this.f87574d == null) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "Context is null, cannot show WeToast", new java.lang.Object[0]);
            return null;
        }
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278094r = this;
        android.content.Intent intent2 = new android.content.Intent(this.f87574d, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
        intent2.setFlags(67108864);
        intent2.putExtra("dialog_scene", 6);
        if (str != null) {
            intent2.putExtra("INTENT_SNACK_BAR_FORWARD_USERNAME", str);
        }
        if (str2 != null) {
            intent2.putExtra("INTENT_SNACK_BAR_FROM_USERNAME", str2);
        }
        android.content.Context context2 = this.f87574d;
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
        al5.u4 u4Var = this.f87573c;
        if (u4Var != null) {
            u4Var.f87600o = this.f87581k;
            java.lang.CharSequence charSequence = this.f87575e;
            if (this.f87582l) {
                u4Var.c(u4Var.f87593e, charSequence, false);
            } else if (!android.text.TextUtils.isEmpty(charSequence) && (textView3 = u4Var.f87593e) != null) {
                textView3.setText(charSequence);
            }
            int i17 = this.f87572b;
            android.widget.TextView textView4 = u4Var.f87593e;
            if (textView4 != null && i17 > 0) {
                textView4.setMaxLines(i17);
            }
            java.lang.CharSequence charSequence2 = this.f87576f;
            if (charSequence2 != null && charSequence2.length() > 0) {
                java.lang.CharSequence charSequence3 = this.f87576f;
                if (this.f87582l) {
                    u4Var.c(u4Var.f87594f, charSequence3, true);
                } else if (!android.text.TextUtils.isEmpty(charSequence3) && (textView2 = u4Var.f87594f) != null) {
                    textView2.setVisibility(0);
                    u4Var.f87594f.setText(charSequence3);
                }
            }
            int i18 = this.f87577g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = u4Var.f87596h;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(i18);
            }
            u4Var.setCanceledOnTouchOutside(false);
            u4Var.f87592d = this;
            al5.r4 r4Var = this.f87571a;
            if (r4Var != null) {
                java.lang.CharSequence charSequence4 = r4Var.f87546a;
                if (!android.text.TextUtils.isEmpty(charSequence4)) {
                    if (((u4Var.f87600o & 4) != 0) && (textView = u4Var.f87595g) != null) {
                        textView.setText(charSequence4);
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = r4Var.f87547b;
                android.view.ViewGroup viewGroup = u4Var.f87599n;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new al5.q4(u4Var, gVar));
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = this.f87580j;
            if (hVar != null) {
                u4Var.f87604s = hVar;
            }
            u4Var.f87602q = this.f87578h;
            u4Var.f();
            u4Var.e();
            if (!((u4Var.f87600o & 2) != 0)) {
                u4Var.b(u4Var.f87593e);
                u4Var.b(u4Var.f87594f);
            }
            c();
        }
        return u4Var;
    }
}
