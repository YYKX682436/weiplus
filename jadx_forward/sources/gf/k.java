package gf;

/* loaded from: classes7.dex */
public final class k implements com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352633a;

    public k(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe) {
        this.f352633a = c3955x2d990bfe;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec
    /* renamed from: onBack */
    public void mo95652xc3977f66(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "skyline side onBack " + i17 + "- " + i18, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec
    /* renamed from: onBackDone */
    public void mo95653x237df408(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gf.j(this, i17, i18));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "skyline side onBackDone " + i17 + "- " + i18, new java.lang.Object[0]);
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352633a;
        ze.n t37 = c3955x2d990bfe.f129238a.t3();
        we.a x07 = t37 != null ? t37.x0() : null;
        if (x07 != null) {
            java.util.Iterator it = x07.f168243p.iterator();
            while (it.hasNext()) {
                w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) it.next();
                if (w2Var != null && w2Var.o(i18)) {
                    break;
                }
            }
        }
        w2Var = null;
        if (w2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("AppServiceSkylineExtensionImpl", "onBackDone error ,can't find page[" + i18 + ']', new java.lang.Object[0]);
            return;
        }
        ze.n t38 = c3955x2d990bfe.f129238a.t3();
        we.a x08 = t38 != null ? t38.x0() : null;
        if (x08 != null) {
            x08.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l3(x08, w2Var, "scene_skyline_back", null));
        }
    }
}
