package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f201713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f201714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f201715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f201716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201717i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f201718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f201719n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar, long j17, long j18, dk2.g gVar, java.lang.String str, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201713e = ggVar;
        this.f201714f = j17;
        this.f201715g = j18;
        this.f201716h = gVar;
        this.f201717i = str;
        this.f201718m = i17;
        this.f201719n = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wf(this.f201713e, this.f201714f, this.f201715g, this.f201716h, this.f201717i, this.f201718m, this.f201719n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        oz5.n nVar;
        dk2.xf W0;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f201712d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f201713e;
        long j17 = this.f201714f;
        long j18 = this.f201715g;
        dk2.g gVar = this.f201716h;
        java.lang.String str = this.f201717i;
        int i18 = this.f201718m;
        int i19 = this.f201719n;
        this.f201712d = 1;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg.f199962z;
        ggVar.getClass();
        oz5.n nVar2 = new oz5.n(pz5.f.b(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", "pay, giftId:" + str + " price:" + i18 + ",comboId:" + gVar.f315000b + ",liveId:" + j17 + ",objectId:" + j18 + ", fromScene:" + ggVar.f199976x);
        boolean z17 = ggVar.f199976x == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193953m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = ggVar.m58104xb7f4f95a();
        if (m58104xb7f4f95a == null || (W0 = m58104xb7f4f95a.W0()) == null) {
            nVar = nVar2;
        } else {
            android.content.Context context = ggVar.f199966n.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a2 = ggVar.m58104xb7f4f95a();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = null;
            java.lang.String str2 = m58104xb7f4f95a2 != null ? ((mm2.e1) m58104xb7f4f95a2.P0(mm2.e1.class)).f410526w : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a3 = ggVar.m58104xb7f4f95a();
            byte[] bArr = m58104xb7f4f95a3 != null ? ((mm2.e1) m58104xb7f4f95a3.P0(mm2.e1.class)).f410518o : null;
            kz5.p0 p0Var = kz5.p0.f395529d;
            if (z17) {
                r45.b82 b82Var = new r45.b82();
                b82Var.set(0, 10);
                gVar2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(b82Var.mo14344x5f01b1f6());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yf yfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yf(ggVar, i18, nVar2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            nVar = nVar2;
            dk2.xf.d(W0, context, j17, j18, str, i19, i18, gVar, "", 4, gVar2, p0Var, null, null, str2, bArr, yfVar, 6144, null);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
