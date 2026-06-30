package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class x1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152370d;

    public x1(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var) {
        this.f152370d = r1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f152370d;
        boolean z17 = false;
        if (r1Var.f152310t == null) {
            return false;
        }
        r1Var.f152300g.size();
        r1Var.f152301h.size();
        boolean z18 = r1Var.f152304n;
        com.p314xaae8f345.mm.p944x882e457a.h2 h2Var = r1Var.f152310t;
        if (r1Var.f152312v && r1Var.f152300g.isEmpty() && r1Var.f152301h.isEmpty()) {
            z17 = true;
        }
        h2Var.o(r1Var, z17);
        return true;
    }
}
