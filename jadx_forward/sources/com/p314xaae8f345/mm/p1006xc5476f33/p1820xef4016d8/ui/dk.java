package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class dk implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228380d;

    public dk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9) {
        this.f228380d = activityC16387x8521db9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ye I;
        java.util.LinkedList linkedList;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((mo808xfb85f7b0 == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 != 0 || i18 != 0 || (I = ((z12.h) bVar).I()) == null || (linkedList = I.f472541g) == null || linkedList.size() <= 0) {
                return;
            }
            java.lang.String str2 = ((r45.ri0) linkedList.get(0)).f466419d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228380d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, activityC16387x8521db9.X.mo42933xb5885648())) {
                activityC16387x8521db9.e7(false);
            }
        }
    }
}
