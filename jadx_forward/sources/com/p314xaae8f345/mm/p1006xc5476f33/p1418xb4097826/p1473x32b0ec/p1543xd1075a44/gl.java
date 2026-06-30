package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class gl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f199992e;

    /* renamed from: f, reason: collision with root package name */
    public int f199993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl f199994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f199995h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar, boolean z17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199994g = hlVar;
        this.f199995h = z17;
        this.f199996i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gl(this.f199994g, this.f199995h, this.f199996i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199993f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar = this.f199994g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hlVar.f200107b.u1();
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = hlVar.f200106a;
            boolean z17 = this.f199995h;
            c22789xd23e9a9b.o(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayPagWidget", "playGiftAnimation launch timer by " + (c22789xd23e9a9b.c() / 1000));
            this.f199991d = hlVar;
            java.lang.String str = this.f199996i;
            this.f199992e = str;
            this.f199993f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            c22789xd23e9a9b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fl(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), hlVar, rVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, playOnce! useRfx:" + z17);
            rj.j c17 = nn2.d.f420204a.c();
            if (str == null) {
                str = "";
            }
            rj.j.a(c17, str, hlVar.f200106a, null, 4, null);
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        hlVar.f200106a.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, playOnce end!");
        return jz5.f0.f384359a;
    }
}
