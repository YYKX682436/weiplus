package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI */
/* loaded from: classes9.dex */
public class ActivityC17367xb00b0b11 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241646d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: autoRefresh */
    public boolean mo48678xedc85a2c() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570995cn5;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576490cn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iic);
        this.f241646d = m79336x8b97809d();
        mo54448x9c8c0d33(new p14.d0(this));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241646d).h("share_micromsg_to_sina")).U = i65.a.i(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bmz);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null)) != 0;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241646d).h("share_micromsg_qzone");
        if (z17) {
            c21549x15041e54.U = i65.a.i(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bmp);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241646d).v(c21549x15041e54);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e542 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241646d).h("fenxiang_weixin_to_fb");
        if (c01.z1.C()) {
            c21549x15041e542.U = i65.a.i(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bmy);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241646d).v(c21549x15041e542);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("share_micromsg_qzone")) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null)) != 0) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae.class);
                intent.putExtra("show_to", 2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.ihd, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            }
        } else if (str.equals("share_micromsg_to_sina")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae.class);
            intent2.putExtra("show_to", 3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("fenxiang_weixin_to_fb")) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae.class);
            intent3.putExtra("show_to", 4);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
