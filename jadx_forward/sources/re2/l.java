package re2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f475978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.w f475979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(re2.w wVar, java.lang.String str, yz5.l lVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f475979e = wVar;
        this.f475980f = str;
        this.f475981g = lVar;
        this.f475982h = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new re2.l(this.f475979e, this.f475980f, this.f475981g, this.f475982h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((re2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f475978d;
        java.lang.String str = this.f475980f;
        re2.w wVar = this.f475979e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.util.List list = wVar.f476029b;
                this.f475978d = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new re2.e(list, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            z17 = ((java.lang.Boolean) obj).booleanValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveAvatarMerger", "doMerge: renderer threw: " + th6.getMessage());
            z17 = false;
        }
        wVar.f476031d.post(new re2.k(z17, this.f475981g, str, this.f475982h));
        return jz5.f0.f384359a;
    }
}
