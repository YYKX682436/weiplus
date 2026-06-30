package kp;

/* loaded from: classes13.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.n f392289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f392292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kp.n nVar, java.lang.String str, java.lang.String str2, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392289e = nVar;
        this.f392290f = str;
        this.f392291g = str2;
        this.f392292h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.i(this.f392289e, this.f392290f, this.f392291g, this.f392292h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392288d;
        bw5.is0 is0Var = bw5.is0.WIFI_DIRECT_OP_TYPE_CONNECT;
        long j17 = this.f392292h;
        java.lang.String str = this.f392291g;
        java.lang.String str2 = this.f392290f;
        kp.n nVar = this.f392289e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gz.m a17 = nVar.a();
                this.f392288d = 1;
                obj = ((kp.i1) a17).Bi(str2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            gz.a aVar2 = (gz.a) obj;
            boolean z17 = aVar2.f359172a;
            java.lang.String str3 = aVar2.f359174c;
            bw5.xf0 xf0Var = aVar2.f359173b;
            if (z17) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar = nVar.f392331a;
                if (eVar != null) {
                    eVar.P0(j17, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
                bw5.hs0 hs0Var = new bw5.hs0();
                hs0Var.e(is0Var);
                hs0Var.b(xf0Var != null ? xf0Var.f116632d : -1);
                hs0Var.c(str3);
                hs0Var.d(str2);
                hs0Var.f(str);
                dVar.f(hs0Var);
            } else {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar2 = nVar.f392331a;
                if (eVar2 != null) {
                    eVar2.P0(j17, xf0Var);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
                bw5.hs0 hs0Var2 = new bw5.hs0();
                hs0Var2.e(is0Var);
                hs0Var2.b(xf0Var != null ? xf0Var.f116632d : -1);
                hs0Var2.c(str3);
                hs0Var2.d(str2);
                hs0Var2.f(str);
                dVar2.f(hs0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearConnectionProviderImpl", "connectToGroupAsync: " + e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar3 = nVar.f392331a;
            if (eVar3 != null) {
                eVar3.P0(j17, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
            bw5.hs0 hs0Var3 = new bw5.hs0();
            hs0Var3.e(is0Var);
            hs0Var3.b(100201);
            hs0Var3.c(e17.getMessage());
            hs0Var3.d(str2);
            hs0Var3.f(str);
            dVar3.f(hs0Var3);
        }
        return jz5.f0.f384359a;
    }
}
