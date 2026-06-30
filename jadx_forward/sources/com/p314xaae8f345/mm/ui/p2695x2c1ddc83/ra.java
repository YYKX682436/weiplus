package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class ra implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 f289584d;

    public ra(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835) {
        this.f289584d = activityC22383x63d1b835;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya yaVar;
        if (m0Var == null || (arrayList = l0Var.f535945c) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var != null && "notifymessage".equals(l0Var.f535943a)) {
                java.lang.String P0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z9) c01.d9.b().v()).P0(f9Var);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0) && (yaVar = this.f289584d.f288950f) != null) {
                    yaVar.mo735xb0dfc7d8(P0, null);
                }
            }
        }
    }
}
