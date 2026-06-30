package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaWrapProfessionActivity */
/* loaded from: classes8.dex */
public class ActivityC3325xf8bbeda2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19121x3bd613a5 {

    /* renamed from: ACTIVITY_CLOSE_FLAG */
    public static final java.lang.String f12959xe11ef4a3 = "flag_activity_close_WalletSelectProfessionUI";

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903 c5854x93319903 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903();
            c5854x93319903.f136161g.f89740a = f12959xe11ef4a3;
            c5854x93319903.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19121x3bd613a5, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.startsWith("index_")) {
            java.lang.String[] split = c21560x1fce98fb.f279313q.split("_");
            if (split.length == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = this.f38703xedcc504a[com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0)];
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903 c5854x93319903 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903();
                java.lang.String str = c19086x2eaebd1c.f260954d;
                am.vo voVar = c5854x93319903.f136161g;
                voVar.f89740a = str;
                voVar.f89741b = c19086x2eaebd1c.f260955e;
                c5854x93319903.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("", "KindaWrapProfessionActivity.onPreferenceTreeClick，发送事件，当前线程：" + java.lang.Thread.currentThread().getId());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("", "KindaWrapProfessionActivity error key: %s, %s", c21560x1fce98fb.f279313q, c21560x1fce98fb.o());
            }
            finish();
        }
        return true;
    }
}
