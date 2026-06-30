package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0 f256285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0 j0Var) {
        super(1);
        this.f256285d = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l lVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMembershipStatus success: ");
        sb6.append(booleanValue);
        sb6.append(", isDestroyed: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0 j0Var = this.f256285d;
        sb6.append(j0Var.f256302n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipUIC", sb6.toString());
        if (!j0Var.f256302n) {
            com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a c25193xb056b73a = j0Var.f256300i;
            if (c25193xb056b73a != null) {
                j0Var.f256300i = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a.m93231x75149012(c25193xb056b73a, (booleanValue ? com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45192xbb80ca22 : com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45190x20cf1e).ordinal(), null, null, 6, null);
                com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9 = j0Var.f256297f;
                if (c4990x83627a9 != null && j0Var.f256298g != null) {
                    qk.ea eaVar = j0Var.f256298g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eaVar);
                    j0Var.P6(c4990x83627a9, eaVar);
                }
            }
            com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a c25193xb056b73a2 = j0Var.f256300i;
            if (c25193xb056b73a2 != null && (lVar = j0Var.f256299h) != null) {
                lVar.mo146xb9724478(c25193xb056b73a2);
            }
        }
        return jz5.f0.f384359a;
    }
}
