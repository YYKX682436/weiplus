package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public class el implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f242535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17456x15980719 f242536e;

    public el(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17456x15980719 activityC17456x15980719, android.widget.LinearLayout linearLayout) {
        this.f242536e = activityC17456x15980719;
        this.f242535d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f242535d;
            if (i17 >= linearLayout.getChildCount()) {
                break;
            }
            android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
            if (com.p314xaae8f345.mm.R.id.f568867ob5 != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b, 0, 0, 0);
            }
            i17++;
        }
        ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17456x15980719 activityC17456x15980719 = this.f242536e;
        if (c17 != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(activityC17456x15980719.f242149o);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPrivacy", "settings_silence_update_mode choice: %d", java.lang.Integer.valueOf(intValue));
        if (intValue == 0) {
            if (activityC17456x15980719.f242158x == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 4);
            }
            activityC17456x15980719.f242151q = false;
            activityC17456x15980719.f242152r = true;
            activityC17456x15980719.f242154t = false;
            activityC17456x15980719.f242153s = true;
        } else if (intValue == 1) {
            if (activityC17456x15980719.f242158x == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 5);
            }
            activityC17456x15980719.f242151q = true;
            activityC17456x15980719.f242152r = false;
            activityC17456x15980719.f242154t = false;
            activityC17456x15980719.f242153s = true;
        } else if (intValue == 3) {
            activityC17456x15980719.f242151q = false;
            activityC17456x15980719.f242152r = false;
            activityC17456x15980719.f242154t = true;
            activityC17456x15980719.f242153s = true;
        } else {
            if (activityC17456x15980719.f242158x == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 6);
            }
            activityC17456x15980719.f242151q = false;
            activityC17456x15980719.f242152r = false;
            activityC17456x15980719.f242154t = false;
            activityC17456x15980719.f242153s = true;
        }
        if (p94.w0.c() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).K1(activityC17456x15980719.f242149o, activityC17456x15980719.f242151q, activityC17456x15980719.f242152r, activityC17456x15980719.f242153s, activityC17456x15980719.f242154t);
        }
        if (p94.w0.c() != null) {
            r45.cb6 W0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).W0(activityC17456x15980719.f242149o, activityC17456x15980719.f242151q, activityC17456x15980719.f242152r, activityC17456x15980719.f242153s, activityC17456x15980719.f242154t);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingPrivacy", "userinfo in null !");
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
            }
        }
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dl(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
