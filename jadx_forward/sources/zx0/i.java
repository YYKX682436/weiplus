package zx0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4005xdbfc01de f558550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.j f558551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f558552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4005xdbfc01de c4005xdbfc01de, zx0.j jVar, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558550e = c4005xdbfc01de;
        this.f558551f = jVar;
        this.f558552g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx0.i(this.f558550e, this.f558551f, this.f558552g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f558549d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4005xdbfc01de c4005xdbfc01de = this.f558550e;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.f1 b17 = ky0.h.f395012a.b(kz5.b0.c(c4005xdbfc01de.f129404c), ly0.p.f403761d, null);
            this.f558549d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) kz5.n0.Z((java.util.List) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin-CDNBridgeServiceListener", "cdnUrl:" + str);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        yx0.b8 b8Var = this.f558552g;
        if (z17) {
            this.f558551f.getClass();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m58);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            b8Var.I().d(c4005xdbfc01de.f129402a, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.NetworkFailed.m33752x130a215f(), string));
        } else {
            b8Var.I().e(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4006x492a12ee(c4005xdbfc01de.f129402a, str));
        }
        return jz5.f0.f384359a;
    }
}
