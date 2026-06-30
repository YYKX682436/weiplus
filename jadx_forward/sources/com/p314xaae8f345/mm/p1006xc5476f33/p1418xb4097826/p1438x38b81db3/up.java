package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class up extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.pd f186262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp f186263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(dm.pd pdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp xpVar) {
        super(1);
        this.f186262d = pdVar;
        this.f186263e = xpVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.t31 resp = (r45.t31) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        dm.pd pdVar = this.f186262d;
        pdVar.f66082x26b1b2e8 |= 4;
        cu2.a0 a0Var = cu2.b0.f303904a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp xpVar = this.f186263e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xpVar.f186501i, "requestFinderFollowVerify succ, id:" + pdVar.f66095xc8a07680 + ", modify extFlag:" + pdVar.f66082x26b1b2e8 + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f186500h.f185384a));
        return jz5.f0.f384359a;
    }
}
