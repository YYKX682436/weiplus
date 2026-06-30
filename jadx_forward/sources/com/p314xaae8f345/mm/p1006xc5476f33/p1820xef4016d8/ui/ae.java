package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ae implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228241d;

    public ae(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        this.f228241d = activityC16377xf00b6def;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((mo808xfb85f7b0 == 697) && ((z17 = m1Var instanceof z12.b))) {
            z12.b bVar = z17 ? (z12.b) m1Var : null;
            if (i17 == 0 && i18 == 0) {
                r45.ye I = bVar != null ? ((z12.h) bVar).I() : null;
                if ((I != null ? I.f472541g : null) != null) {
                    java.util.LinkedList linkedList = I.f472541g;
                    if ((linkedList != null ? linkedList.size() : 0) <= 0) {
                        return;
                    }
                    java.lang.String str2 = ((r45.ri0) I.f472541g.get(0)).f466419d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228241d;
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = activityC16377xf00b6def.Z;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null)) {
                        activityC16377xf00b6def.g7(false);
                    }
                }
            }
        }
    }
}
