package dk2;

/* loaded from: classes3.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f315482i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315483m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ce2.i iVar, java.lang.String str5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315478e = str;
        this.f315479f = str2;
        this.f315480g = str3;
        this.f315481h = str4;
        this.f315482i = iVar;
        this.f315483m = str5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.q7(this.f315478e, this.f315479f, this.f315480g, this.f315481h, this.f315482i, this.f315483m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.q7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f315477d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f315478e;
            java.lang.String str2 = this.f315479f;
            java.lang.String str3 = this.f315480g;
            java.lang.String str4 = this.f315481h;
            java.lang.String str5 = "checkAndDownloadMultiAnimation id:" + this.f315478e + " name:" + this.f315482i.f67809x225f1eb0 + " animationId:" + this.f315483m + " land ";
            this.f315477d = 1;
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
