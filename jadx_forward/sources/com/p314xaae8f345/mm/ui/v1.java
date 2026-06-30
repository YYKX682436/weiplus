package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.w1 f292633d;

    public v1(com.p314xaae8f345.mm.ui.w1 w1Var) {
        this.f292633d = w1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "getContactCallBack fail run");
        com.p314xaae8f345.mm.ui.w1 w1Var = this.f292633d;
        com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5 = w1Var.f292720a;
        activityC21351xb4ef97a5.f278158t = true;
        if (activityC21351xb4ef97a5.f278154p || activityC21351xb4ef97a5.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5.T6(w1Var.f292720a);
    }
}
