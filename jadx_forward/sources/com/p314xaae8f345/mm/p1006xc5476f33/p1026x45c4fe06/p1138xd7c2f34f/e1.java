package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u8 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 f166116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 r1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1 n1Var) {
        super(c11510xdd90c2f2, n1Var);
        this.f166116g = r1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u8, im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dead() hash=");
        sb6.append(hashCode());
        sb6.append(", appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f166763d;
        sb6.append(c11510xdd90c2f2 != null ? c11510xdd90c2f2.f156336n : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchPrepareCallbackWrapper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f166763d;
        if (c11510xdd90c2f22 != null) {
            c11510xdd90c2f22.n2(this);
        }
        this.f166763d = null;
        this.f166764e = null;
        this.f166765f = true;
        if (this.f166116g.f166628d != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.c(this.f166116g.f166628d);
            this.f166116g.f166628d = null;
        }
    }
}
