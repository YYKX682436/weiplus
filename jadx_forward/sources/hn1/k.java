package hn1;

/* loaded from: classes9.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f363991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363990e = str;
        this.f363991f = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hn1.k(this.f363990e, this.f363991f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hn1.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363989d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(kv.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String str = this.f363990e;
            java.util.Map map = this.f363991f;
            this.f363989d = 1;
            if (kv.b0.n4((kv.b0) c17, str, null, 0.0f, map, this, 4, null) == aVar) {
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
