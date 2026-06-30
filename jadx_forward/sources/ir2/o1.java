package ir2;

/* loaded from: classes2.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f375735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.v1 f375736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(ir2.p1 p1Var, ir2.v1 v1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375735e = p1Var;
        this.f375736f = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.o1(this.f375735e, this.f375736f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375734d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.f375735e.f375740b;
            this.f375734d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).mo771x2f8fd3(this.f375736f, this) == aVar) {
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
