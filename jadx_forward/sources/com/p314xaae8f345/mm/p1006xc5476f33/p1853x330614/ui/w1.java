package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class w1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f230043d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e) {
        this.f230043d = activityC16480xce80140e;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f230043d;
            if (i17 >= activityC16480xce80140e.M.size()) {
                return;
            }
            at4.x0 x0Var = (at4.x0) activityC16480xce80140e.M.get(i17);
            g4Var.f(i17, x0Var.f95520a);
            int i18 = x0Var.f95521b;
            if (i18 == 9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23388, 1, 1);
            } else if (i18 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23388, 1, 2);
            }
            i17++;
        }
    }
}
