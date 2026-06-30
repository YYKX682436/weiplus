package dz0;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326298d;

    public a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.a(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new dz0.a((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326298d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f326298d = 1;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new bw5.sg();
            lVar.f152198b = new bw5.tg();
            lVar.f152200d = 20785;
            lVar.f152199c = "/cgi-bin/micromsg-bin/findergettranscribeparam";
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            iVar.p(lVar.a());
            b17 = rm0.h.b(iVar, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        if (!fVar.b()) {
            return new vu0.x(null, 0, 0, 0, 15, null);
        }
        int i18 = ((bw5.tg) fVar.f152151d).f114954d;
        bw5.gz gzVar = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? null : bw5.gz.M4a : bw5.gz.Aac : bw5.gz.Silk : bw5.gz.Wav : bw5.gz.Pcm;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gzVar, "forNumber(...)");
        int ordinal = gzVar.ordinal();
        tu0.a aVar2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? tu0.a.f503603e : tu0.a.f503605g : tu0.a.f503604f : tu0.a.f503603e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        return new vu0.x(aVar2, 0, ((bw5.tg) fVar2).f114955e, ((bw5.tg) fVar2).f114956f, 2, null);
    }
}
