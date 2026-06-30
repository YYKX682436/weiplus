package aq;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f94526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f94527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f94528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4988x89c61bdd f94529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.nio.Buffer buffer, int i17, int i18, com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94526e = buffer;
        this.f94527f = i17;
        this.f94528g = i18;
        this.f94529h = c4988x89c61bdd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.x(this.f94526e, this.f94527f, this.f94528g, this.f94529h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94525d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", ocr start");
            ny4.e eVar = aq.r0.f94475c;
            if (eVar != null) {
                str = eVar.a(this.f94526e, this.f94527f, this.f94528g);
            } else {
                str = null;
            }
            java.lang.Thread.currentThread().getName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", "ocr result is return");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            aq.w wVar = new aq.w(this.f94529h, str, null);
            this.f94525d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, wVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
