package zk;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554931d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982 f554933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f554934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982 c5090xb499f982, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554933f = c5090xb499f982;
        this.f554934g = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zk.k kVar = new zk.k(this.f554933f, this.f554934g, interfaceC29045xdcb5ca57);
        kVar.f554932e = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554931d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f554932e;
            zk.j jVar = new zk.j(this.f554933f, this.f554934g, null);
            this.f554932e = y0Var;
            this.f554931d = 1;
            obj = p3325xe03a0797.p3326xc267989b.a4.c(15000L, jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            return list;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareableChatRecordsProvider", "[!] writeCdnInfos: getCdnInfos timeout");
        return kz5.p0.f395529d;
    }
}
