package dz0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f326332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326333e = c11015x5b190a3b;
        this.f326334f = n7Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.c2(this.f326333e, this.f326334f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326332d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dz0.b2 b2Var = new dz0.b2(this.f326334f, null);
            this.f326332d = 1;
            if (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b.P6(this.f326333e, b2Var, this) == aVar) {
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
