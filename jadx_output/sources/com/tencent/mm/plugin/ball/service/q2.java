package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class q2 implements com.tencent.mm.ipcinvoker.j {
    private q2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.List list = com.tencent.mm.plugin.ball.service.s.H0().f93215a;
        if (qp1.w.a(list)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel(arrayList));
                return;
            }
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel(arrayList2));
        }
    }
}
