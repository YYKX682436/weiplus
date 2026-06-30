package bg2;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101603d;

    /* renamed from: e, reason: collision with root package name */
    public int f101604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.k f101605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f101606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bg2.k kVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101605f = kVar;
        this.f101606g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.f(this.f101605f, this.f101606g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101604e;
        bg2.k kVar = this.f101605f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.u4 f76 = kVar.f7();
            java.lang.String str2 = f76 != null ? f76.f315687a : null;
            this.f101603d = str2;
            this.f101604e = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f101606g, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f101603d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk2.u4 f77 = kVar.f7();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f77 != null ? f77.f315687a : null)) {
            dk2.u4 f78 = kVar.f7();
            boolean z17 = false;
            if (f78 != null) {
                if (f78.f315691e == 4) {
                    z17 = true;
                }
            }
            if (z17) {
                dk2.u4 f79 = kVar.f7();
                if (f79 != null) {
                    f79.f315691e = 2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = kVar.f498674d.f498681h;
                kVar.Z6(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null) != null ? r8.f491912f : null));
            }
        }
        return jz5.f0.f384359a;
    }
}
