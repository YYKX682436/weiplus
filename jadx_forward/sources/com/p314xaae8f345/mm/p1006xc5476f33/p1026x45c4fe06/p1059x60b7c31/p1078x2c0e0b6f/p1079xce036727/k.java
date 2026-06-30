package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f161857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f161856e = str;
        this.f161857f = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.k(this.f161856e, this.f161857f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f161855d;
        java.lang.String str = this.f161856e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0.class);
            this.f161855d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p) b0Var;
            pVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: runtime is null");
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
            } else {
                yb1.p pVar2 = (yb1.p) b17.K1(yb1.p.class);
                if (pVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: getPageContentService is null");
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                } else {
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.j(pVar2, b17, nVar, pVar, null), 3, null);
                }
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str2 = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInMMProcess appIdClient:" + str + " filePath:" + str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_CODE", 0);
        bundle.putString("KEY_PAGE_CONTENT_PATH", str2);
        this.f161857f.a(bundle);
        return jz5.f0.f384359a;
    }
}
