package pk2;

/* loaded from: classes3.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437394d;

    /* renamed from: e, reason: collision with root package name */
    public int f437395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.l2 f437396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(pk2.l2 l2Var, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437396f = l2Var;
        this.f437397g = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.j2(this.f437396f, this.f437397g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pk2.l2 l2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437395e;
        pk2.l2 l2Var2 = this.f437396f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pk2.i2 i2Var = pk2.l2.f437471m;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f437397g.f437611d;
            java.lang.String e17 = xy2.c.e(abstractActivityC21394xb3d2c0cf);
            this.f437394d = l2Var2;
            this.f437395e = 1;
            obj = i2Var.b(abstractActivityC21394xb3d2c0cf, "addItem", e17, this);
            if (obj == aVar) {
                return aVar;
            }
            l2Var = l2Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l2Var = (pk2.l2) this.f437394d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l2Var.f437473h = (r45.v71) obj;
        l2Var2.f437474i = null;
        return jz5.f0.f384359a;
    }
}
