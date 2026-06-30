package eg2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334085e;

    /* renamed from: f, reason: collision with root package name */
    public int f334086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f334087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334089i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334090m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(eg2.i0 i0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334087g = i0Var;
        this.f334088h = str;
        this.f334089i = str2;
        this.f334090m = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg2.e0(this.f334087g, this.f334088h, this.f334089i, this.f334090m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334086f;
        java.lang.String str2 = this.f334090m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            eg2.i0 i0Var = this.f334087g;
            if (i0Var.f334110b.get()) {
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f334088h);
            sb6.append(this.f334089i);
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            java.lang.String sb7 = sb6.toString();
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(sb7);
            com.p314xaae8f345.mm.vfs.w6.u(r17);
            com.p314xaae8f345.mm.vfs.w6.t(r17);
            if (i0Var.f334110b.get()) {
                return null;
            }
            this.f334084d = sb7;
            this.f334085e = str2;
            this.f334086f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f423615f = sb7;
            fVar.f423611b = false;
            b17.d(str2, fVar.a(), new eg2.d0(rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            str = sb7;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f334084d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue() && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDBaseTask", "downloadImage success: " + str);
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveHDBaseTask", "downloadImage failed for: " + str2);
        return null;
    }
}
