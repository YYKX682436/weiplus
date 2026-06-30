package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f148278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kn0.g f148279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f148282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(kn0.g gVar, long j17, java.lang.String str, r45.nw1 nw1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148279e = gVar;
        this.f148280f = j17;
        this.f148281g = str;
        this.f148282h = nw1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.h3(this.f148279e, this.f148280f, this.f148281g, this.f148282h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.h3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148278d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "enterPreloadPlayer: preload start");
            gl2.e eVar = new gl2.e(this.f148279e, this.f148280f, this.f148281g, this.f148282h, null, 16, null);
            this.f148278d = 1;
            if (eVar.m(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = uc.n.f507798k1;
        uc.m.f507797a = null;
        return jz5.f0.f384359a;
    }
}
