package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public class em implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f242537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 f242538e;

    public em(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d67, android.widget.LinearLayout linearLayout) {
        this.f242538e = activityC17461x51cb9d67;
        this.f242537d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (int i17 = 0; i17 < this.f242537d.getChildCount(); i17++) {
            android.widget.TextView textView = (android.widget.TextView) this.f242537d.getChildAt(i17);
            if (com.p314xaae8f345.mm.R.id.f568867ob5 != textView.getId()) {
                textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b, 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view;
        textView2.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        textView2.setContentDescription(((java.lang.Object) textView2.getText()) + textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_));
        r45.cb6 cb6Var = new r45.cb6();
        if (p94.w0.c() != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f242538e.f242205i);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSnsPrivacyUI", "settings_silence_update_mode choice: %d", java.lang.Integer.valueOf(intValue));
        int i18 = 4;
        if (intValue == 0) {
            if (this.f242538e.f242214u == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d67 = this.f242538e;
            activityC17461x51cb9d67.f242207n = false;
            activityC17461x51cb9d67.f242208o = true;
            activityC17461x51cb9d67.f242210q = false;
            activityC17461x51cb9d67.f242209p = true;
            i18 = 3;
        } else if (intValue == 1) {
            if (this.f242538e.f242214u == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d672 = this.f242538e;
            activityC17461x51cb9d672.f242207n = true;
            activityC17461x51cb9d672.f242208o = false;
            activityC17461x51cb9d672.f242210q = false;
            activityC17461x51cb9d672.f242209p = true;
            i18 = 1;
        } else if (intValue == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d673 = this.f242538e;
            activityC17461x51cb9d673.f242207n = false;
            activityC17461x51cb9d673.f242208o = false;
            activityC17461x51cb9d673.f242210q = true;
            activityC17461x51cb9d673.f242209p = true;
            i18 = 2;
        } else {
            if (this.f242538e.f242214u == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d674 = this.f242538e;
            activityC17461x51cb9d674.f242207n = false;
            activityC17461x51cb9d674.f242208o = false;
            activityC17461x51cb9d674.f242210q = false;
            activityC17461x51cb9d674.f242209p = true;
        }
        if (p94.w0.c() != null) {
            p94.j0 c17 = p94.w0.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d675 = this.f242538e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) c17).K1(activityC17461x51cb9d675.f242205i, activityC17461x51cb9d675.f242207n, activityC17461x51cb9d675.f242208o, activityC17461x51cb9d675.f242209p, activityC17461x51cb9d675.f242210q);
            p94.o0 o0Var = (p94.o0) i95.n0.c(p94.o0.class);
            int i19 = this.f242538e.f242211r;
            ((n34.p4) o0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPrivacyRangeModified", "com.tencent.mm.plugin.sns.SnsStatService");
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0.f246363k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstanceRef", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getInstanceRef$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0.f246363k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getInstanceRef$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstanceRef", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0) weakReference2.get();
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                str3 = "android/view/View$OnClickListener";
                java.util.HashMap i27 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(b0Var.f246364a)), new jz5.l("befor_time_range", java.lang.Integer.valueOf(i19)), new jz5.l("snsalbumsid", b0Var.f246365b), new jz5.l("after_time_range", java.lang.Integer.valueOf(i18)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(b0Var.f246366c)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                java.util.Objects.toString(ri.l0.a(i27));
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.t("sns_modify_visibility", i27));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            } else {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                str3 = "android/view/View$OnClickListener";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPrivacyRangeModified", "com.tencent.mm.plugin.sns.SnsStatService");
            this.f242538e.f242211r = i18;
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "android/view/View$OnClickListener";
        }
        if (p94.w0.c() != null) {
            p94.j0 c18 = p94.w0.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17461x51cb9d67 activityC17461x51cb9d676 = this.f242538e;
            r45.cb6 W0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) c18).W0(activityC17461x51cb9d676.f242205i, activityC17461x51cb9d676.f242207n, activityC17461x51cb9d676.f242208o, activityC17461x51cb9d676.f242209p, activityC17461x51cb9d676.f242210q);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo in null !");
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", str3, str2, str);
                return;
            }
            str4 = str;
            str5 = str2;
            str6 = str3;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
        } else {
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dm(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", str6, str5, str4);
    }
}
