package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class r implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171502d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257) {
        this.f171502d = activityC12636x4eed9257;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257;
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList linkedList = ((r45.zs3) oVar.f152244b.f152233a).f473881e;
            if (linkedList == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeUI", "wxa_msg_config_list not exist");
                return 0;
            }
            java.util.Iterator it = linkedList.iterator();
            r45.le7 le7Var = null;
            while (true) {
                boolean hasNext = it.hasNext();
                activityC12636x4eed9257 = this.f171502d;
                if (!hasNext) {
                    break;
                }
                r45.le7 le7Var2 = (r45.le7) it.next();
                if (le7Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
                } else {
                    if (activityC12636x4eed9257.f170836f.equals(le7Var2.f460931d)) {
                        le7Var = le7Var2;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b c6187xa3de110b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b();
                    java.lang.String str2 = le7Var2.f460931d;
                    am.rz rzVar = c6187xa3de110b.f136445g;
                    rzVar.f89386a = str2;
                    rzVar.f89387b = le7Var2.f460932e == 0;
                    c6187xa3de110b.e();
                }
            }
            if (le7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeUI", "currentConfigItem not found, appId: %s", activityC12636x4eed9257.f170836f);
                return 0;
            }
            activityC12636x4eed9257.U = true;
            activityC12636x4eed9257.T = le7Var.f460932e == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.V6(activityC12636x4eed9257, activityC12636x4eed9257.f170834d, activityC12636x4eed9257.N, activityC12636x4eed9257.f170835e);
        }
        return 0;
    }
}
