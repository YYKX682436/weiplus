package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class x1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 f294071d;

    public x1(com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5) {
        this.f294071d = activityC21351xb4ef97a5;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.g00 g00Var = (r45.g00) oVar.f152244b.f152233a;
        java.lang.String str2 = g00Var.f456297d;
        com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5 = this.f294071d;
        activityC21351xb4ef97a5.f278155q = str2;
        if (i17 == 0 && i18 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g00Var.f456298e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback ok");
            activityC21351xb4ef97a5.f278146e = g00Var.f456298e;
            activityC21351xb4ef97a5.f278160v = g00Var.f456299f;
            com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5.T6(activityC21351xb4ef97a5);
            return 0;
        }
        if (com.p314xaae8f345.mm.ui.pc.a(activityC21351xb4ef97a5, i17, i18, str, 7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_NORMAL_ERROR");
            activityC21351xb4ef97a5.setResult(5);
            activityC21351xb4ef97a5.finish();
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_FORBID");
        activityC21351xb4ef97a5.U6(i17, i18, str);
        activityC21351xb4ef97a5.setResult(3);
        activityC21351xb4ef97a5.finish();
        return 0;
    }
}
