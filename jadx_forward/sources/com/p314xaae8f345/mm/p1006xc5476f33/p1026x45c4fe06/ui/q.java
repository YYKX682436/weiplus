package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f171470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f171471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171473g;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, java.util.LinkedList linkedList, java.lang.String str) {
        this.f171473g = activityC12636x4eed9257;
        this.f171470d = c21541x1c1b08fe;
        this.f171471e = linkedList;
        this.f171472f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171473g;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.X6(activityC12636x4eed9257);
            db5.t7.m123883x26a183b(activityC12636x4eed9257, activityC12636x4eed9257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
            this.f171470d.O(!r5.N());
            return 0;
        }
        if (((r45.i36) oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeUI", "setReceiveOff failed, response is null!");
        }
        int i19 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f171471e;
            if (i19 >= linkedList.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.X6(activityC12636x4eed9257);
                return 0;
            }
            r45.le7 le7Var = (r45.le7) linkedList.get(i19);
            if (le7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b c6187xa3de110b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b();
                java.lang.String str2 = this.f171472f;
                am.rz rzVar = c6187xa3de110b.f136445g;
                rzVar.f89386a = str2;
                rzVar.f89387b = le7Var.f460932e == 0;
                c6187xa3de110b.e();
            }
            i19++;
        }
    }
}
