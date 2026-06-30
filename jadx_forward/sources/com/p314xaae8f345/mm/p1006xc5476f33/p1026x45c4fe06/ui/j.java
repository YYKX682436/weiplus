package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes15.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12632x9feb2048 f171329d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12632x9feb2048 activityC12632x9feb2048) {
        this.f171329d = activityC12632x9feb2048;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "initLocationForOverseaUser getLocation:%b", java.lang.Boolean.valueOf(z17));
        ((i11.h) this.f171329d.f170826o).m(this);
        if (!z17) {
            return false;
        }
        u60.h hVar = new u60.h(f18, f17);
        hVar.f506403c = 11;
        hVar.f506406f = java.lang.Integer.valueOf(hashCode());
        hVar.f506407g = true;
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i(this));
        return false;
    }
}
