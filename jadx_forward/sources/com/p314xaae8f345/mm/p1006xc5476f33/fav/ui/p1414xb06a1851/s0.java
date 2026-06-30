package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class s0 implements kd0.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182324d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c) {
        this.f182324d = activityC13591xdaafa82c;
    }

    @Override // kd0.o2
    public void K0(java.lang.String str, r45.aq3 aq3Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "onFetchedCodeInfo codeStr: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182324d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = null;
        for (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var2 : activityC13591xdaafa82c.f182161p.values()) {
            if (str.equals(a1Var2.f182220e)) {
                a1Var = a1Var2;
            }
        }
        if (a1Var == null || (k0Var = a1Var.f182218c) == null || !k0Var.i()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.Z6(activityC13591xdaafa82c, a1Var);
    }
}
