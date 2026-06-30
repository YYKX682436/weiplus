package in1;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f374304d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f374305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in1.e f374306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(in1.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f374306f = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        in1.a aVar = new in1.a(this.f374306f, interfaceC29045xdcb5ca57);
        aVar.f374305e = obj;
        return aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((in1.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f374304d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((p3325xe03a0797.p3326xc267989b.y0) this.f374305e).hashCode();
            in1.e eVar = this.f374306f;
            java.lang.String str = eVar.f374312e;
            kv.b0 b0Var = eVar.f374317m;
            java.lang.String str2 = eVar.f374315h;
            float f17 = eVar.f374313f;
            this.f374304d = 1;
            if (((hn1.s) b0Var).mj(str, str2, f17, this) == aVar) {
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
