package ms5;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f412685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f412687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.Map.Entry entry, java.lang.String str, org.json.JSONArray jSONArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f412685e = entry;
        this.f412686f = str;
        this.f412687g = jSONArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ms5.d(this.f412685e, this.f412686f, this.f412687g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ms5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f412684d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f abstractC25298xba75790f = (com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f) this.f412685e.getValue();
            ns5.a aVar2 = new ns5.a(this.f412686f, this.f412687g);
            this.f412684d = 1;
            abstractC25298xba75790f.getClass();
            if (com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f.b(abstractC25298xba75790f, aVar2, this) == aVar) {
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
