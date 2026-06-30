package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f163642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(yz5.a aVar) {
        super(0);
        this.f163642d = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f163642d.mo152xb9724478();
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, hostComponent is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).V0() : null;
        if (V0 != null) {
            return V0.mo32091x9a3f0ba2();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, pageView is null");
        return null;
    }
}
