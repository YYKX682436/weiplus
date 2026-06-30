package rv0;

/* loaded from: classes5.dex */
public final class w5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f481848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(rv0.z6 z6Var, float f17, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481847e = z6Var;
        this.f481848f = f17;
        this.f481849g = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.w5(this.f481847e, this.f481848f, this.f481849g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.w5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481846d;
        rv0.z6 z6Var = this.f481847e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r76 = z6Var.r7(new java.lang.Double(this.f481848f));
            this.f481846d = 1;
            if (rv0.z6.n7(z6Var, r76, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ex0.r n17 = this.f481849g.n();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (n17 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = n17.k().add(z6Var.s7());
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) z6Var.t7().f357791y.mo3195x754a37bb();
            if (c4128x879fba0a == null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            }
            if (c4128x879fba0a.m33983x7b953cf2()) {
                gx0.bh bhVar = (gx0.bh) ((jz5.n) z6Var.f481892o).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(add);
                bhVar.i7(add, c4128x879fba0a);
            }
        }
        return f0Var;
    }
}
