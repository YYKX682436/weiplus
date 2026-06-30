package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class sn implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228966b;

    public sn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, r45.wv3 wv3Var) {
        this.f228966b = coVar;
        this.f228965a = wv3Var;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rn rnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rn(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            rnVar.run();
        } else {
            this.f228966b.D.post(rnVar);
        }
    }
}
