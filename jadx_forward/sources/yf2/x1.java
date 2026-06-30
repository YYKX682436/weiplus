package yf2;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f543346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f543347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543348g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(mm2.n0 n0Var, yf2.i2 i2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543346e = n0Var;
        this.f543347f = i2Var;
        this.f543348g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf2.x1(this.f543346e, this.f543347f, this.f543348g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543345d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.n0 n0Var = this.f543346e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = n0Var.f410798g;
            yf2.w1 w1Var = new yf2.w1(this.f543347f, n0Var, this.f543348g);
            this.f543345d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).a(w1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
