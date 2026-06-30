package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/report/MMReportPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI */
/* loaded from: classes4.dex */
public final class ActivityC17450x1e5c1014 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242128g = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f242129h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dk.f242485d);

    public static final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17450x1e5c1014 activityC17450x1e5c1014, java.lang.String str) {
        activityC17450x1e5c1014.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(activityC17450x1e5c1014.mo55332x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    public final void Y6(android.widget.TextView textView, yz5.l lVar) {
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ck(lVar), 0, spannableString.length(), 17);
        textView.setText(spannableString);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.g(textView, spannableString);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.clw, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        h0Var.f391656d = obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x0((java.lang.String) h0Var.f391656d)) {
            h0Var.f391656d = "";
        }
        if (r26.i0.p((java.lang.String) h0Var.f391656d, "cn", true)) {
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f568408mq5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            Y6(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zj(this, h0Var));
            textView.setVisibility(0);
        }
        android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f568407mq4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        Y6((android.widget.TextView) findViewById, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ak(this, h0Var));
        return linearLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576464bz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r26.n0.B(r7, r0, false) != false) goto L9;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17450x1e5c1014.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str != null) {
            switch (str.hashCode()) {
                case -2127957195:
                    if (str.equals("setting_privacy_personal_ad_mgr")) {
                        java.lang.String str2 = this.f242128g;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            str2 = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(str2, "lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "safelyUrlConcatParam(...)");
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("showShare", false);
                        intent.putExtra("rawUrl", str2);
                        intent.putExtra("show_feedback", false);
                        intent.putExtra("show_bottom", false);
                        intent.putExtra("needRedirect", false);
                        intent.putExtra("neverGetA8Key", false);
                        j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b759967 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
                        c6991x7b759967.f143055d = 54L;
                        c6991x7b759967.k();
                        return true;
                    }
                    break;
                case -1179310352:
                    if (str.equals("setting_wechat_personal_info_export")) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("showShare", false);
                        intent2.putExtra("rawUrl", (java.lang.String) ((jz5.n) this.f242129h).mo141623x754a37bb());
                        intent2.putExtra("show_feedback", false);
                        intent2.putExtra("show_bottom", false);
                        intent2.putExtra("needRedirect", false);
                        intent2.putExtra("neverGetA8Key", false);
                        j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b7599672 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
                        c6991x7b7599672.f143055d = 51L;
                        c6991x7b7599672.k();
                        return true;
                    }
                    break;
                case 264218592:
                    if (str.equals("settings_privacy_app_permission")) {
                        android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b7599673 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
                        c6991x7b7599673.f143055d = 53L;
                        c6991x7b7599673.k();
                        return true;
                    }
                    break;
                case 765127884:
                    if (str.equals("setting_privacy_personal_info_export")) {
                        android.content.Intent intent4 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b7599674 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
                        c6991x7b7599674.f143055d = 51L;
                        c6991x7b7599674.k();
                        return true;
                    }
                    break;
                case 1795686324:
                    if (str.equals("settings_privacy_sys_permission")) {
                        android.content.Intent intent5 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215.class);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent5);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b7599675 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
                        c6991x7b7599675.f143055d = 52L;
                        c6991x7b7599675.k();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
