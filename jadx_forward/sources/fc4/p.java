package fc4;

/* loaded from: classes4.dex */
public final class p extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f342725d;

    /* renamed from: e, reason: collision with root package name */
    public int f342726e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f342727f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f342728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f342729h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f342730i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f342731m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342727f = "";
        this.f342728g = "";
        this.f342729h = "";
        this.f342730i = "";
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSameCutVisible", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        if (z17 && this.f342731m) {
            android.widget.LinearLayout linearLayout = this.f342725d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            android.widget.LinearLayout linearLayout2 = this.f342725d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSameCutVisible", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    public final void P6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        android.widget.LinearLayout linearLayout = this.f342725d;
        if (linearLayout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.onp);
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            return;
        }
        linearLayout.setVisibility(0);
        this.f342731m = true;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.e(this.f342727f, 1);
            java.lang.String a17 = dw3.j0.f325751a.a();
            if (android.text.TextUtils.isEmpty(a17)) {
                a17 = i65.a.r(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.je7);
            }
            java.lang.String str2 = a17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (r26.n0.B(str2, "X", false)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str2);
                android.graphics.drawable.Drawable i17 = i65.a.i(m80379x76847179(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563614cf0);
                int h17 = i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                i17.setBounds(0, 0, (i17.getIntrinsicWidth() * h17) / i17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(i17, 2);
                int L = r26.n0.L(str2, "X", 0, false, 6, null);
                spannableString.setSpan(imageSpan, L, L + 1, 33);
                textView.setText(spannableString);
            } else {
                textView.setText(str2);
            }
        } else {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleSameStyleUIC", "on activity result reqCode:" + i17 + " resultCode:" + i18);
        if (4098 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleSameStyleUIC", "REQUEST_CODE_CUT_SAME callback ");
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_export_video_path");
                java.lang.String stringExtra2 = intent.getStringExtra("key_export_video_cover_path");
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlexibleSameStyleUIC", "template video path is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
                    return;
                }
                try {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("KSightPath", stringExtra);
                    boolean Di = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Di();
                    dw3.c0 c0Var = dw3.c0.f325715a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                    intent2.putExtra("KSightThumbPath", c0Var.e(stringExtra2, stringExtra, Di ? 288 : -1));
                    intent2.putExtra("Ksnsupload_type", 14);
                    intent2.putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
                    intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                    intent2.putExtra("KSnsFrom", 20);
                    j45.l.j(m80379x76847179(), "sns", ".ui.SnsUploadUI", intent2, null);
                    m158354x19263085().finish();
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleSameStyleUIC", "REQUEST_CODE_TEMPLATE_VIDEO path:%s, mjCoverPath:%s", stringExtra, stringExtra2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0195  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.p.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
