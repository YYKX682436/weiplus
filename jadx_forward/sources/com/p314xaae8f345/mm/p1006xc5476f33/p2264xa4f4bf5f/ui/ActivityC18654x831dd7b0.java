package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusNewActivity;", "Lcom/tencent/mm/plugin/textstatus/ui/FlutterTextStatusTransparentActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity */
/* loaded from: classes11.dex */
public final class ActivityC18654x831dd7b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6 {

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ObjectAnimator f255187v;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusNewActivity", "finish: ");
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusNewActivity", "onBackPressed: ");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6, com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(getWindow().getDecorView(), "backgroundColor", 0, i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560921y4));
        ofInt.setDuration(100L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f255187v = ofInt;
    }
}
