package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.d0 f93213d;

    public r0(com.tencent.mm.plugin.ball.service.o4 o4Var, gp1.d0 d0Var) {
        this.f93213d = d0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.List list;
        com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel floatBallServiceProxy$BallInfoListParcel = (com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel) obj;
        gp1.d0 d0Var = this.f93213d;
        if (floatBallServiceProxy$BallInfoListParcel == null || (list = floatBallServiceProxy$BallInfoListParcel.f93102d) == null || list.isEmpty()) {
            if (d0Var != null) {
                d0Var.a(new java.util.ArrayList());
            }
        } else if (d0Var != null) {
            d0Var.a(list);
        }
    }
}
