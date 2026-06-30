package com.tencent.mm.plugin.fav;

/* loaded from: classes12.dex */
public class n extends com.tencent.mm.app.s2 {
    public n(com.tencent.mm.plugin.fav.o oVar) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            new com.tencent.mm.autogen.events.StartFavServiceEvent().e();
        }
    }
}
