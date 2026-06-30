package vu0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.s f521671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru0.d f521672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.t f521674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vu0.s sVar, ru0.d dVar, java.util.List list, yu0.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521671d = sVar;
        this.f521672e = dVar;
        this.f521673f = list;
        this.f521674g = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vu0.p(this.f521671d, this.f521672e, this.f521673f, this.f521674g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vu0.p pVar = (vu0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f521672e.f481193a;
        yu0.t tVar = this.f521674g;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = tVar.f547373f;
        vu0.s sVar = this.f521671d;
        sVar.getClass();
        java.lang.String str = tVar.f547369b;
        ru0.d dVar = new ru0.d(c3971x241f78, str);
        yu0.m mVar = (yu0.m) ((jz5.n) sVar.f521686e).mo141623x754a37bb();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (mVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f521687f;
            java.util.List<com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9> list = this.f521673f;
            concurrentHashMap.put(dVar, java.lang.Integer.valueOf(list.size()));
            sVar.f521688g.put(dVar, new java.util.ArrayList());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 : list) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                java.lang.String uuid2 = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid2, "toString(...)");
                vu0.m mVar2 = new vu0.m(c3971x241f78, c4179xedb0cdf9, c4128x879fba0a);
                java.lang.String m34366xfb85ada3 = c4179xedb0cdf9.m34366xfb85ada3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34366xfb85ada3, "getText(...)");
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = c3971x241f78;
                p3325xe03a0797.p3326xc267989b.l.d(mVar.f547351i, mVar.f547349g, null, new yu0.g(new yu0.d(uuid, kz5.b0.c(new yu0.c(uuid, uuid2, new yu0.p(r26.i0.t(m34366xfb85ada3, "\n", "", true), str, tVar.f547370c, mVar2)))), mVar, null), 2, null);
                arrayList.add(f0Var);
                c3971x241f78 = c3971x241f782;
            }
        }
        return f0Var;
    }
}
