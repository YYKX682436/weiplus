package pn4;

/* loaded from: classes14.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f438694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jy3 f438695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.iy3 f438696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(pn4.q0 q0Var, r45.jy3 jy3Var, r45.iy3 iy3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438694e = q0Var;
        this.f438695f = jy3Var;
        this.f438696g = iy3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pn4.o0(this.f438694e, this.f438695f, this.f438696g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f438693d;
        pn4.q0 q0Var = this.f438694e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f438693d = 1;
            obj = pn4.q0.d(q0Var, this.f438695f, this.f438696g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.ly3 ly3Var = (r45.ly3) obj;
        if (ly3Var != null) {
            if (ly3Var.m75933x41a8a7f2(1)) {
                q0Var.j("has_unknow_character");
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(q0Var.g());
                com.p314xaae8f345.mm.vfs.w6.f(q0Var.g());
                this.f438693d = 2;
                if (pn4.q0.c(q0Var, ly3Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
