package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI */
/* loaded from: classes15.dex */
public class ActivityC18849x3feb382a extends com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 implements fq4.f0 {

    /* renamed from: x, reason: collision with root package name */
    public fq4.g0 f257762x;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void V6() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6();
        this.f257701h.m72729xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.k9m);
        this.f257701h.f257759f.setVisibility(8);
        this.f257698e.setEnabled(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void W6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257704n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257762x.f347130f)) {
            return;
        }
        fq4.q qVar = new fq4.q(this.f257704n, this.f257762x.f347129e, 0);
        qVar.f347171h = true;
        c01.d9.e().g(qVar);
        this.f257698e.setEnabled(false);
        X6();
    }

    public void Z6(boolean z17) {
        T6();
        this.f257698e.setEnabled(true);
        if (z17) {
            a7();
        } else {
            this.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9l);
            this.f257701h.c();
        }
    }

    public void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kscene_type", 73);
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f257762x = new fq4.g0(this);
        c01.d9.e().g(new fq4.e(73, ""));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.g0 g0Var = this.f257762x;
        g0Var.getClass();
        c01.d9.e().q(611, g0Var);
        c01.d9.e().q(613, g0Var);
        g0Var.f347128d = null;
    }
}
