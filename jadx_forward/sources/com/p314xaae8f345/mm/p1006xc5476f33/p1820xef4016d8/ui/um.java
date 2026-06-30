package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class um implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vm f229048b;

    public um(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vm vmVar, r45.wv3 wv3Var) {
        this.f229048b = vmVar;
        this.f229047a = wv3Var;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tm tmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tm(this, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            tmVar.run();
        } else {
            this.f229048b.f229104n.post(tmVar);
        }
    }
}
