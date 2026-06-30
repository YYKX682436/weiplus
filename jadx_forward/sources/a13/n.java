package a13;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f82091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f82092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a13.t tVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82092e = tVar;
        this.f82093f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a13.n(this.f82092e, this.f82093f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a13.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f82091d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f2 f2Var = this.f82092e.f82112o;
                java.lang.String str = this.f82093f;
                this.f82091d = 1;
                f2Var.getClass();
                obj = mx3.f0.b(str, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            vx3.i iVar = (vx3.i) obj;
            if (iVar.f522829m != vx3.g.f522813g) {
                c13.b0.f119393d.m(iVar);
            } else {
                c13.b0.f119393d.m(null);
            }
        } catch (java.lang.Exception unused) {
            c13.b0.f119393d.m(null);
        }
        return jz5.f0.f384359a;
    }
}
