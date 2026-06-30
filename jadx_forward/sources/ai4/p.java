package ai4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f86719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86719e = i17;
        this.f86720f = str;
        this.f86721g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ai4.p(this.f86719e, this.f86720f, this.f86721g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ai4.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86718d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qj4.s.f445491a.r(1L, (r20 & 2) != 0 ? null : new java.lang.Integer(this.f86719e), (r20 & 4) != 0 ? null : new java.lang.Integer(ai4.b0.f86661f), (r20 & 8) != 0 ? null : this.f86720f, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
            this.f86718d = 1;
            obj = this.f86721g.mo146xb9724478(this);
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
