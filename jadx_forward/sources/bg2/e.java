package bg2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101576d;

    /* renamed from: e, reason: collision with root package name */
    public int f101577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.k f101578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f101579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bg2.k kVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101578f = kVar;
        this.f101579g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.e(this.f101578f, this.f101579g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101577e;
        bg2.k kVar = this.f101578f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.u4 f76 = kVar.f7();
            java.lang.String str2 = f76 != null ? f76.f315687a : null;
            this.f101576d = str2;
            this.f101577e = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f101579g, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f101576d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk2.u4 f77 = kVar.f7();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f77 != null ? f77.f315687a : null)) {
            kVar.h7();
            bg2.d dVar = (bg2.d) kVar.N6(bg2.d.class);
            if (dVar != null) {
                dVar.f101529h = null;
            }
        }
        return jz5.f0.f384359a;
    }
}
