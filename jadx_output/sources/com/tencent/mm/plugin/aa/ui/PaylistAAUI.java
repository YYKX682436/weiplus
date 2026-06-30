package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class PaylistAAUI extends com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity {
    public static final /* synthetic */ int S = 0;
    public java.lang.String A;
    public com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.TextView F;
    public com.tencent.mm.wallet_core.ui.WcPayBannerView G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f72544J;
    public java.lang.String K;
    public java.lang.String L;
    public int M;
    public java.lang.String N;
    public java.lang.String P;
    public long Q;
    public int R;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f72547i;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f72550o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f72551p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f72552q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f72553r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f72554s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f72555t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f72556u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f72557v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f72558w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f72559x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f72560y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f72561z;

    /* renamed from: g, reason: collision with root package name */
    public final k61.w f72545g = (k61.w) this.f72474e.a(this, k61.w.class);

    /* renamed from: h, reason: collision with root package name */
    public final k61.p f72546h = (k61.p) this.f72474e.b(this, k61.p.class);

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f72548m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Dialog f72549n = null;

    public static void f7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        paylistAAUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click urgeAAPay");
        paylistAAUI.hideLoading();
        paylistAAUI.f72548m = com.tencent.mm.wallet_core.ui.b2.h(paylistAAUI, false, null);
        k61.v vVar = paylistAAUI.f72545g.f304525g;
        vVar.getClass();
        ((km5.q) ((km5.q) km5.u.d()).n(vVar).h(new com.tencent.mm.plugin.aa.ui.x6(paylistAAUI))).s(new com.tencent.mm.plugin.aa.ui.w6(paylistAAUI));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 8, java.lang.Integer.valueOf(paylistAAUI.R));
    }

    public static void h7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, r45.v vVar) {
        paylistAAUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click doPay");
        boolean z17 = paylistAAUI.getIntent().getIntExtra("enter_scene", 0) == 1;
        java.lang.String str = vVar.f387773f;
        paylistAAUI.H = vVar.f387774g;
        paylistAAUI.N = vVar.f387776i;
        paylistAAUI.P = vVar.f387778n;
        h61.o.q(paylistAAUI, str, z17, vVar.f387775h, paylistAAUI.f72544J, paylistAAUI.I, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
    }

    public static void i7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, java.lang.String str) {
        db5.e1.y(paylistAAUI.getContext(), str, "", paylistAAUI.getContext().getString(com.tencent.mm.R.string.ga_), new com.tencent.mm.plugin.aa.ui.j7(paylistAAUI));
    }

    public static void j7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, java.lang.String str) {
        paylistAAUI.hideLoading();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            dp.a.makeText(paylistAAUI, com.tencent.mm.R.string.f489731a4, 1).show();
        } else {
            dp.a.makeText(paylistAAUI, str, 1).show();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489355c92;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideLoading() {
        android.app.Dialog dialog = this.f72548m;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f72548m.dismiss();
        this.f72548m = null;
    }

    public final void k7() {
        this.f72548m = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
        android.view.View view = this.f72547i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "fetchAADetailAndInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "fetchAADetailAndInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k61.t tVar = this.f72545g.f304520b;
        tVar.getClass();
        ((km5.q) ((km5.q) km5.u.d()).n(tVar).h(new com.tencent.mm.plugin.aa.ui.n7(this))).s(new com.tencent.mm.plugin.aa.ui.m7(this));
    }

    public final boolean l7(int i17, int i18, int i19, int i27, java.util.List list) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.I) || com.tencent.mm.storage.z3.N4(this.I) || com.tencent.mm.storage.z3.n4(this.I) || i27 != 4 || list.size() != 1) && i17 == 2 && i18 != 6 && i19 == 1;
    }

    public void m7(int i17, android.content.Intent intent) {
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "pay success, payMsgId: %s", this.H);
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "do realname guide");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
                j45.l.j(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent2, null);
            }
            h61.o.b(this.I);
            finish();
            k61.w wVar = this.f72545g;
            k61.u uVar = wVar.f304522d;
            java.lang.String str = this.H;
            java.lang.String str2 = this.f72544J;
            java.lang.String str3 = this.N;
            uVar.getClass();
            ((km5.q) km5.u.g(str, str2, str3)).n(uVar).h(new com.tencent.mm.plugin.aa.ui.b7(this));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 12L, 1L, false);
            java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
            long j17 = this.Q;
            java.lang.String str4 = this.P;
            k61.s sVar = wVar.f304523e;
            sVar.getClass();
            ((km5.q) km5.u.g(java.lang.Long.valueOf(j17), str4, stringExtra)).n(sVar);
        }
    }

    public final void n7(java.util.List list, java.lang.String str, boolean z17) {
        java.lang.String f17;
        java.lang.String string;
        java.lang.String str2;
        boolean z18;
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ksk)).setText(str);
        boolean z19 = false;
        this.E.setVisibility(z17 ? 0 : 8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ksl);
        linearLayout.removeAllViews();
        int i17 = 0;
        while (i17 < list.size()) {
            r45.a0 a0Var = (r45.a0) list.get(i17);
            boolean z27 = i17 >= list.size() - 1 ? true : z19;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) getLayoutInflater().inflate(com.tencent.mm.R.layout.f489354c91, linearLayout, z19);
            android.widget.ImageView imageView = (android.widget.ImageView) linearLayout2.findViewById(com.tencent.mm.R.id.ks_);
            android.widget.TextView textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.ksc);
            android.widget.TextView textView2 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.ksd);
            android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.ksa);
            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) linearLayout2.findViewById(com.tencent.mm.R.id.ksb);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, a0Var.f369572d, null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String str3 = a0Var.f369572d;
            k61.p pVar = this.f72546h;
            pVar.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                f17 = "";
            } else {
                java.lang.String b17 = pVar.f255224n.b("chatroom");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                f17 = c01.a2.f(str3, b17);
            }
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, f17, textSize));
            int i18 = a0Var.f369575g;
            if (i18 == 7) {
                java.lang.String string2 = getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(a0Var.f369573e)));
                java.lang.String str4 = getString(com.tencent.mm.R.string.f492689hh0) + string2;
                android.text.SpannableString spannableString = new android.text.SpannableString(str4);
                com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) textView2.getTextSize(), android.content.res.ColorStateList.valueOf(getResources().getColor(com.tencent.mm.R.color.a0u)), null);
                wcPayTextApppearanceSpan.f180847d = com.tencent.mm.wallet_core.ui.r1.F(getContext(), 7);
                spannableString.setSpan(wcPayTextApppearanceSpan, str4.lastIndexOf(string2), str4.lastIndexOf(string2) + string2.length(), 17);
                textView2.setText(spannableString);
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0u));
                textView2.setVisibility(0);
                java.lang.String a17 = h61.o.a(a0Var.f369576h, a0Var.f369577i);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(a17);
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f369577i)) {
                    textView3.setText(h61.o.j(60, textView3.getText().toString()));
                }
                linearLayout2 = linearLayout2;
                linearLayout.addView(linearLayout2);
            } else if (i18 == 1) {
                long j17 = a0Var.f369573e;
                if (j17 > 0) {
                    str2 = getString(com.tencent.mm.R.string.f489771b8, java.lang.Double.valueOf(h61.o.r(j17)));
                    string = getString(com.tencent.mm.R.string.hgl) + str2;
                } else {
                    string = getString(com.tencent.mm.R.string.hgl);
                    str2 = "";
                }
                android.text.SpannableString spannableString2 = new android.text.SpannableString(string);
                com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan2 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, (int) textView2.getTextSize(), android.content.res.ColorStateList.valueOf(getResources().getColor(com.tencent.mm.R.color.a0w)), null);
                wcPayTextApppearanceSpan2.f180847d = com.tencent.mm.wallet_core.ui.r1.F(getContext(), 7);
                spannableString2.setSpan(wcPayTextApppearanceSpan2, string.lastIndexOf(str2), string.lastIndexOf(str2) + str2.length(), 17);
                textView2.setText(spannableString2);
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0w));
                textView2.setVisibility(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f369577i)) {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(h61.o.j(60, a0Var.f369577i));
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                }
                linearLayout.addView(linearLayout2);
            } else {
                textView2.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f369577i)) {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(h61.o.j(60, a0Var.f369577i));
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                }
                linearLayout.addView(linearLayout2);
            }
            android.view.View findViewById = linearLayout2.findViewById(com.tencent.mm.R.id.d0v);
            if (z27) {
                findViewById.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                z18 = false;
                layoutParams.height = 0;
                findViewById.setLayoutParams(layoutParams);
            } else {
                z18 = false;
                findViewById.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a4m));
            }
            textView3.setContentDescription(getString(com.tencent.mm.R.string.gah) + "，" + textView3.getText().toString());
            i17++;
            z19 = z18;
        }
    }

    public final void o7(android.widget.TextView textView, android.text.SpannableString spannableString, java.lang.String str, r45.d0 d0Var) {
        int i17;
        int i18;
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_album);
        drawable.setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478524a5), android.graphics.PorterDuff.Mode.SRC_ATOP);
        drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 20), com.tencent.mm.ui.zk.a(getContext(), 20));
        al5.w wVar = new al5.w(drawable, 1);
        com.tencent.mm.wallet_core.ui.a0 a0Var = new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.z7(this, d0Var, textView), true);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannableString);
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.E)) {
            spannableStringBuilder.setSpan(wVar, 0, 1, 17);
            spannableStringBuilder.setSpan(a0Var, 0, spannableStringBuilder2.length(), 18);
        }
        android.text.TextPaint paint = textView.getPaint();
        int measuredWidth = textView.getMeasuredWidth();
        float measureText = measuredWidth - (paint.measureText(" ...  ") + com.tencent.mm.ui.zk.a(getContext(), 19));
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableStringBuilder, paint, measuredWidth, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "lineCount <= 0");
            return;
        }
        if (lineCount <= 2) {
            textView.setText(spannableStringBuilder);
            return;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(spannableString.subSequence(0, lineEnd + new android.text.StaticLayout(spannableString.subSequence(lineEnd, spannableString.length()), paint, (int) measureText, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineEnd(0)));
        spannableStringBuilder3.append((java.lang.CharSequence) " ...  ");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.E)) {
            i17 = 17;
            i18 = 18;
        } else {
            i17 = 17;
            spannableStringBuilder3.setSpan(wVar, 0, 1, 17);
            i18 = 18;
            spannableStringBuilder3.setSpan(a0Var, 0, spannableStringBuilder2.length(), 18);
        }
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.aa_paylist_unfold);
        drawable2.setColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_2), android.graphics.PorterDuff.Mode.SRC_ATOP);
        drawable2.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 19), com.tencent.mm.ui.zk.a(getContext(), 19));
        spannableStringBuilder3.setSpan(new al5.w(drawable2, 1), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder(spannableString);
        spannableStringBuilder4.append((java.lang.CharSequence) " ");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.E)) {
            spannableStringBuilder4.setSpan(wVar, 0, 1, i17);
            spannableStringBuilder4.setSpan(a0Var, 0, spannableStringBuilder2.length(), i18);
        }
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.aa_paylist_collapse);
        drawable3.setColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_2), android.graphics.PorterDuff.Mode.SRC_ATOP);
        drawable3.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 19), com.tencent.mm.ui.zk.a(getContext(), 19));
        spannableStringBuilder4.setSpan(new al5.w(drawable3, 1), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
        if (staticLayout.getLineCount() <= 2) {
            textView.setText(spannableString);
            textView.setOnClickListener(null);
        } else {
            textView.setText(spannableStringBuilder3);
            textView.setOnClickListener(new com.tencent.mm.plugin.aa.ui.m6(this, textView, spannableStringBuilder3, spannableStringBuilder4));
            textView.setSelected(true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 233) {
            m7(i18, intent);
            return;
        }
        if (i17 != 222) {
            if (i17 == 234 && i18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "PAY_AA_TYPE_BY_PERSON_CUSTOMIZE_CODE resultCode == RESULT_OK");
                finish();
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "select chatroom：%s", stringExtra);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.LaunchAAUI.class);
            intent2.putExtra("enter_scene", 3);
            intent2.putExtra("chatroom_name", stringExtra);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.aa.ui.y6(this));
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.I = getIntent().getStringExtra("chatroom");
        this.f72550o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ksf);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486287ks5);
        this.f72551p = linearLayout;
        this.f72560y = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f486284ks2);
        this.f72552q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.krt);
        this.f72553r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ksh);
        this.f72555t = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.kry);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ksg);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.G = wcPayBannerView;
        wcPayBannerView.a();
        com.tencent.mm.ui.bk.r0(this.C.getPaint(), 0.8f);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.krx);
        this.f72547i = findViewById(com.tencent.mm.R.id.m7j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ksi);
        this.E = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.E.setClickable(true);
        this.E.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(getString(com.tencent.mm.R.string.hh6));
        spannableStringBuilder.setSpan(new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.k7(this), true), 0, spannableStringBuilder.length(), 18);
        this.E.setText(spannableStringBuilder);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.krw);
        this.F = textView2;
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        k7();
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.B != null) {
            this.B = null;
        }
    }

    public final void p7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f72561z)) {
            getString(com.tencent.mm.R.string.hgr);
            java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(this.A) ? getString(com.tencent.mm.R.string.hgs) : getString(com.tencent.mm.R.string.hgr);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f72558w, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.e7(this), true), getContext());
            this.f72558w.setVisibility(0);
            com.tencent.mm.ui.bk.t0(this.f72558w.getPaint());
            this.f72559x.setVisibility(8);
        } else {
            java.lang.String string2 = getString(com.tencent.mm.R.string.hgt);
            java.lang.String string3 = getString(com.tencent.mm.R.string.b9z, this.f72561z, string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f72559x, string3, i17.length() - string2.length(), i17.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.f7(this), true), getContext());
            this.f72558w.setVisibility(8);
            this.f72559x.setVisibility(0);
            com.tencent.mm.ui.bk.t0(this.f72559x.getPaint());
        }
        int b17 = i65.a.b(getContext(), 6);
        int b18 = i65.a.b(getContext(), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            this.f72558w.setPadding(b17, b17, b17, b17);
            this.f72559x.setPadding(b17, b17, b17, b17);
        } else {
            this.f72558w.setPadding(b17, b18, b17, b17);
            this.f72559x.setPadding(b17, b18, b17, b17);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
        hashSet.add(com.tencent.mm.plugin.aa.ui.y5.class);
    }
}
