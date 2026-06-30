package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class vp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.pd f186337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp f186338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(dm.pd pdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp xpVar) {
        super(1);
        this.f186337d = pdVar;
        this.f186338e = xpVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            int i17 = fVar.f152149b;
            cu2.a0 a0Var = cu2.b0.f303904a;
            dm.pd pdVar = this.f186337d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp xpVar = this.f186338e;
            if (i17 == -4043) {
                pdVar.f66082x26b1b2e8 |= 8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xpVar.f186501i, "requestFinderFollowVerify failed revoke, id:" + pdVar.f66095xc8a07680 + ", modify extFlag:" + pdVar.f66082x26b1b2e8 + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f186500h.f185384a));
            } else if (i17 == -4042) {
                pdVar.f66088x33459fc2 = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xpVar.f186501i, "requestFinderFollowVerify failed expire, id:" + pdVar.f66095xc8a07680 + ", modify extFlag:" + pdVar.f66082x26b1b2e8 + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f186500h.f185384a));
            }
            java.util.Vector vector = cu2.c0.f303911a;
            cu2.c0.f303911a.remove(java.lang.Long.valueOf(pdVar.f66095xc8a07680));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded();
            long j17 = pdVar.f66095xc8a07680;
            am.lc lcVar = c5508x3c9dcded.f135839g;
            lcVar.f88769a = j17;
            lcVar.f88772d = 0;
            c5508x3c9dcded.e();
        }
        return jz5.f0.f384359a;
    }
}
