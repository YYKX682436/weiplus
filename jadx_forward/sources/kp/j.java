package kp;

/* loaded from: classes13.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.n f392308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f392309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kp.n nVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392308e = nVar;
        this.f392309f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.j(this.f392308e, this.f392309f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392307d;
        bw5.is0 is0Var = bw5.is0.WIFI_DIRECT_OP_TYPE_CREATE;
        kp.n nVar = this.f392308e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gz.m a17 = nVar.a();
                this.f392307d = 1;
                obj = ((kp.i1) a17).Ri(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            gz.b bVar = (gz.b) obj;
            if (bVar.f359175a) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar = nVar.f392331a;
                if (eVar != null) {
                    eVar.H0(this.f392309f, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS, bVar.f359178d, bVar.f359179e);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
                bw5.hs0 hs0Var = new bw5.hs0();
                hs0Var.e(is0Var);
                hs0Var.b(0);
                hs0Var.c("create group success");
                hs0Var.d(bVar.f359178d);
                hs0Var.f(bVar.f359179e);
                dVar.f(hs0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearConnectionProviderImpl", "createGroupAsync: create group failed");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar2 = nVar.f392331a;
                if (eVar2 != null) {
                    eVar2.H0(this.f392309f, bVar.f359176b, "", "");
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
                bw5.hs0 hs0Var2 = new bw5.hs0();
                hs0Var2.e(is0Var);
                bw5.xf0 xf0Var = bVar.f359176b;
                hs0Var2.b(xf0Var != null ? xf0Var.f116632d : -1);
                hs0Var2.c(bVar.f359177c);
                hs0Var2.d("");
                hs0Var2.f("");
                dVar2.f(hs0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearConnectionProviderImpl", "createGroupAsync: " + e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar3 = nVar.f392331a;
            if (eVar3 != null) {
                eVar3.H0(this.f392309f, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR, "", "");
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
            bw5.hs0 hs0Var3 = new bw5.hs0();
            hs0Var3.e(is0Var);
            hs0Var3.b(100200);
            hs0Var3.c("create group exception:" + e17.getMessage() + ':' + android.util.Log.getStackTraceString(e17));
            hs0Var3.d("");
            hs0Var3.f("");
            dVar3.f(hs0Var3);
        }
        return jz5.f0.f384359a;
    }
}
