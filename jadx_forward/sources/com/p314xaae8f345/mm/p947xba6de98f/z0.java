package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f152713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.b1 f152714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.m f152715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.d1 f152716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w65.m f152717h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p947xba6de98f.b1 b1Var, dn.m mVar, com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var, w65.m mVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152714e = b1Var;
        this.f152715f = mVar;
        this.f152716g = d1Var;
        this.f152717h = mVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.z0(this.f152714e, this.f152715f, this.f152716g, this.f152717h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p947xba6de98f.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f152713d;
        com.p314xaae8f345.mm.p947xba6de98f.b1 b1Var = this.f152714e;
        dn.m mVar = this.f152715f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.concurrent.ConcurrentHashMap V6 = b1Var.V6();
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var = this.f152716g;
            V6.put(field_mediaId, new com.p314xaae8f345.mm.p947xba6de98f.r0(field_mediaId, d1Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnMediaFSC", "add task " + mVar.f69601xaca5bdda + ", size:" + mVar.f69620xeb1a61d6 + ", md5:" + mVar.f69593x419c9c3d + ", now task count:" + b1Var.V6().size());
            long j17 = d1Var.f152453p;
            if (j17 <= 300000) {
                j17 = 300000;
            }
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            w65.m mVar2 = this.f152717h;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p947xba6de98f.v0) ((jz5.n) b1Var.f152422i).mo141623x754a37bb());
            this.f152713d = 1;
            if (((lm.r) nVar).Zi(mVar2, j17, weakReference, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        b1Var.V6().remove(mVar.f69601xaca5bdda);
        return jz5.f0.f384359a;
    }
}
