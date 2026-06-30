package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class bo implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228301b;

    public bo(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, r45.wv3 wv3Var) {
        this.f228301b = coVar;
        this.f228300a = wv3Var;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ao aoVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ao(this, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            aoVar.run();
        } else {
            this.f228301b.D.post(aoVar);
        }
    }
}
