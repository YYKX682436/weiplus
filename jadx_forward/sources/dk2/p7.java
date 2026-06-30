package dk2;

/* loaded from: classes3.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315444h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f315445i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315446m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ce2.i iVar, java.lang.String str5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315441e = str;
        this.f315442f = str2;
        this.f315443g = str3;
        this.f315444h = str4;
        this.f315445i = iVar;
        this.f315446m = str5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.p7(this.f315441e, this.f315442f, this.f315443g, this.f315444h, this.f315445i, this.f315446m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.p7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f315440d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f315441e;
            java.lang.String str2 = this.f315442f;
            java.lang.String str3 = this.f315443g;
            java.lang.String str4 = this.f315444h;
            java.lang.String str5 = "checkAndDownloadMultiAnimation id:" + this.f315441e + " name:" + this.f315445i.f67809x225f1eb0 + " animationId:" + this.f315446m;
            this.f315440d = 1;
            obj = dk2.s7.a(str, str2, str3, str4, str5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
