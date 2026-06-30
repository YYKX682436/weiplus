package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class e implements pd1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i f168983a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar) {
        this.f168983a = iVar;
    }

    @Override // pd1.i
    public void a(int i17, int i18) {
        if (this.f168983a.f169012i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168983a.f169004a, "onConfigurationChanged, onVideoPositionGot, released");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar = this.f168983a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = iVar.f169006c;
        if (iVar.f169015l == null) {
            iVar.f169015l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h(iVar, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h hVar = iVar.f169015l;
        hVar.f168997a = i17;
        hVar.f168998b = i18;
        hVar.f168999c = null;
        c12753x672cc895.a(hVar);
    }
}
