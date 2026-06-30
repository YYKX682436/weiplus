package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/mmaoa/UsbAttachIntentUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI */
/* loaded from: classes11.dex */
public final class ActivityC12842xb0ce2219 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174083d = "MicroMsg.UsbAttachIntentUI";

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853.ActivityC12842xb0ce2219 activityC12842xb0ce2219, boolean z17) {
        activityC12842xb0ce2219.getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        java.lang.String string = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.n7p : com.p314xaae8f345.mm.R.C30867xcad56011.n7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        u1Var.g(string);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
        u1Var.q(false);
    }

    public final void P6(android.content.Intent intent) {
        if (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
            ((ku5.t0) ku5.t0.f394148d).q(new zn1.t(intent, this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f174083d, "Aoa is not enabled, skip processing");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7n));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
            u1Var.q(false);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.f4296x366c91de);
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        P6(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            P6(intent);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }
}
