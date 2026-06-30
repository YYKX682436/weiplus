package dz0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f326593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326594e = c11015x5b190a3b;
        this.f326595f = n7Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.x1(this.f326594e, this.f326595f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326593d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dz0.w1 w1Var = new dz0.w1(this.f326595f, null);
            this.f326593d = 1;
            if (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b.P6(this.f326594e, w1Var, this) == aVar) {
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
