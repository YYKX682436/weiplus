package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class v8 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 f192177a;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237) {
        this.f192177a = activityC13996x5a58c237;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        fp0.u uVar = fp0.u.f346823f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237 = this.f192177a;
        if (status == uVar && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f413142h)) {
            activityC13996x5a58c237.f190887J = n0Var.f413142h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237.d7(activityC13996x5a58c237);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC13996x5a58c237.f190888v, "upload avatar fail,status:" + status);
        activityC13996x5a58c237.e7(true);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.u8(activityC13996x5a58c237));
    }
}
