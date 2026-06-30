package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class u7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229021d;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f229021d = activityC16371xf216ae6d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((mo808xfb85f7b0 == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.ye I = ((z12.h) bVar).I();
                if ((I != null ? I.f472541g : null) == null || I.f472541g.size() <= 0) {
                    return;
                }
                java.lang.String str2 = ((r45.ri0) I.f472541g.get(0)).f466419d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229021d;
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = activityC16371xf216ae6d.Z1;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null)) {
                    activityC16371xf216ae6d.p7(false);
                }
            }
        }
    }
}
