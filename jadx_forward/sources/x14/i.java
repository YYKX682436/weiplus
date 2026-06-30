package x14;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f532981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae f532982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae c17502xca6168ae, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532981e = z17;
        this.f532982f = c17502xca6168ae;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x14.i(this.f532981e, this.f532982f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x14.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532980d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return (android.graphics.Bitmap) obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return (android.graphics.Bitmap) obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f532981e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae c17502xca6168ae = this.f532982f;
        if (z17) {
            kv.b0 b0Var = c17502xca6168ae.f243183x0;
            java.lang.String str = c17502xca6168ae.f243181l1;
            this.f532980d = 1;
            obj = ((hn1.s) b0Var).fj(str, 0.0f, this);
            if (obj == aVar) {
                return aVar;
            }
            return (android.graphics.Bitmap) obj;
        }
        kv.b0 b0Var2 = c17502xca6168ae.f243183x0;
        java.lang.String str2 = c17502xca6168ae.f243181l1;
        this.f532980d = 2;
        obj = ((hn1.s) b0Var2).mj(str2, null, 0.0f, this);
        if (obj == aVar) {
            return aVar;
        }
        return (android.graphics.Bitmap) obj;
    }
}
