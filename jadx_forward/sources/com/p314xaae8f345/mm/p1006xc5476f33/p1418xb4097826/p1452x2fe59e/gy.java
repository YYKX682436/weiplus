package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class gy implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188403d;

    public gy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        this.f188403d = pzVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188403d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar.f190289h;
        if (abstractC15124x7bae6180 != null && z9Var.f186860a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
            r45.bz2 bz2Var = (jbVar == null || (xs2Var = jbVar.N) == null) ? null : (r45.bz2) xs2Var.m75936x14adae67(23);
            java.lang.String str = pzVar.U;
            if (bz2Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderTlPersonalCenter callback, result?.ctrInfo?.finderRedDotExtInfo?.show_info is null, ctrlInfo:");
                sb6.append(jbVar);
                sb6.append(", finderRedDotExtInfo:");
                sb6.append(jbVar != null ? jbVar.N : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "finderTlPersonalCenter callback, result?.ctrInfo?.finderRedDotExtInfo?.show_info:" + bz2Var.mo12245xcc313de3());
            if (r45.ox2.a(bz2Var.f452700d) != r45.ox2.FinderStreamShowReddotType_PersonalCenter) {
                return;
            }
            so2.a2 a2Var = pzVar.f190307x1;
            so2.f5 f5Var = a2Var.f491783g;
            r45.px2 px2Var = new r45.px2();
            px2Var.set(0, java.lang.Integer.valueOf(bz2Var.f452700d));
            px2Var.set(2, java.lang.Integer.valueOf(bz2Var.f452702f));
            px2Var.set(1, bz2Var.f452701e);
            px2Var.set(3, java.lang.Long.valueOf(bz2Var.f452703g));
            px2Var.set(4, bz2Var.f452704h);
            f5Var.f491880c = px2Var;
            a2Var.f491783g.f491878a = 1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).Q6();
        }
    }
}
