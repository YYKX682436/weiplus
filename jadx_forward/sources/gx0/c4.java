package gx0;

/* loaded from: classes5.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.f4 f357812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(gx0.f4 f4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357812e = f4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.c4(this.f357812e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.c4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357811d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        gx0.f4 f4Var = this.f357812e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f357811d = 1;
            java.lang.Object d76 = gx0.bf.d7((gx0.bf) ((jz5.n) f4Var.E).mo141623x754a37bb(), null, null, false, this, 7, null);
            if (d76 != aVar) {
                d76 = f0Var;
            }
            if (d76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((du0.o) ((jz5.n) f4Var.f358619m).mo141623x754a37bb()).U6(false);
        return f0Var;
    }
}
