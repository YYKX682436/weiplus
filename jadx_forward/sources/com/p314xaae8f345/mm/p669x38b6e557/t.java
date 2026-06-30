package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p669x38b6e557.u f146378d;

    public t(com.p314xaae8f345.mm.p669x38b6e557.u uVar) {
        this.f146378d = uVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 4 && i18 == -102) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p669x38b6e557.s(this));
            return;
        }
        com.p314xaae8f345.mm.p669x38b6e557.u uVar = this.f146378d;
        dp.a.m125854x26a183b(uVar.f146380e, "DefaultRSA check pass", 0).show();
        com.p314xaae8f345.mm.p669x38b6e557.k0.a(uVar.f146380e, "");
    }
}
