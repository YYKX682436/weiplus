package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 f159576e;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f159576e = l5Var;
        this.f159575d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl entered appId[%s]", this.f159575d.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d5 d5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d5(this);
        if (!this.f159576e.n(this.f159575d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl appId[%s], not in runtime stack, just cleanup", this.f159575d.f156336n);
            d5Var.run();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 i17 = this.f159576e.i(this.f159575d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e5 e5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e5(this, i17, d5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var = this.f159576e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f159575d;
        ze.m mVar = (ze.m) l5Var;
        mVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = i17 == null ? "null" : i17.f156336n;
        objArr[1] = c11510xdd90c2f2.f156336n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        e5Var.run();
        if (mVar.mo48806x666b03f3() > 1 || i17 != null) {
            if (c11510xdd90c2f2.R()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).l(i17, null, c11510xdd90c2f2, null);
                return;
            }
            return;
        }
        android.app.Activity m51610x19263085 = mVar.m51610x19263085();
        if (m51610x19263085 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "closeActivity: fail");
        } else if (!m51610x19263085.isFinishing()) {
            m51610x19263085.moveTaskToBack(true);
            if (mVar.mo48806x666b03f3() <= 0) {
                m51610x19263085.overridePendingTransition(0, 0);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).j(m51610x19263085, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose: activity closed");
    }
}
