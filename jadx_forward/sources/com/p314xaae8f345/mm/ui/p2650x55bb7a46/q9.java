package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes3.dex */
public class q9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f284153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f284154b;

    public q9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var, q80.d0 d0Var, android.app.Activity activity) {
        this.f284153a = d0Var;
        this.f284154b = activity;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "openLiteApp fail %s.", this.f284153a.f442182a);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.app.Activity activity = this.f284154b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
        e4Var.f293309c = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggb);
        e4Var.c();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "openLiteApp success %s.", this.f284153a.f442182a);
    }
}
