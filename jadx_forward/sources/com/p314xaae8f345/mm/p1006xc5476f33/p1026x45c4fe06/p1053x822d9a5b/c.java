package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class c implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d f159605a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar) {
        this.f159605a = dVar;
    }

    @Override // mp1.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar = this.f159605a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f159610v, "onCloseWithAnimation, transform to float ball animation cancel");
        dVar.f174772n.q(true);
    }

    @Override // mp1.b
    /* renamed from: onAnimationEnd */
    public void mo50325xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar = this.f159605a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f159610v, "onCloseWithAnimation, transform to float ball animation end");
        dVar.f174772n.q(false);
    }
}
