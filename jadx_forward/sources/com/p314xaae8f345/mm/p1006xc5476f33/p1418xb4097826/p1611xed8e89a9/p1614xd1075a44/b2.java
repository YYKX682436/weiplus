package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class b2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 f206020d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 d2Var) {
        this.f206020d = d2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.b2 b2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("member reddot [SHOW NEW] red=");
        boolean z17 = true;
        sb6.append(z9Var != null && z9Var.f186860a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeaderMemberWidget", sb6.toString());
        if (z9Var == null || !z9Var.f186860a) {
            b2Var = this;
            z17 = false;
        } else {
            b2Var = this;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 d2Var = b2Var.f206020d;
        if (!z17 || !d2Var.f206047b) {
            d2Var.a().O.f516147e.setVisibility(8);
            d2Var.a().P.f516147e.setVisibility(8);
            return;
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
        if (I0 != null && L0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("3", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
        }
        d2Var.a().O.f516147e.setVisibility(0);
        d2Var.a().P.f516147e.setVisibility(0);
    }
}
