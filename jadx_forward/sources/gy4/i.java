package gy4;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gy4.u uVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359136e = uVar;
        this.f359137f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gy4.i(this.f359136e, this.f359137f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        c01.nb nbVar;
        p3325xe03a0797.p3326xc267989b.z zVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f359135d;
        java.lang.String fileId = this.f359137f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qg5.l0 l0Var = (qg5.l0) this.f359136e.T6();
            l0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
            qg5.r rVar = (qg5.r) l0Var.f444591t.get();
            c01.ob obVar = rVar == null ? null : (c01.ob) ((java.util.Map) ((jz5.n) rVar.f444686d).mo141623x754a37bb()).get(fileId);
            if (obVar == null || (nbVar = obVar.f118907b) == null || (zVar = nbVar.f118885b) == null) {
                return null;
            }
            this.f359135d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.a0) zVar).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c01.mb mbVar = (c01.mb) obj;
        if (mbVar != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p0(fileId, mbVar.f118865a, mbVar.f118866b);
        }
        return null;
    }
}
