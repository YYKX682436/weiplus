package gx0;

/* loaded from: classes5.dex */
public final class wg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(gx0.bh bhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358676e = bhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.wg(this.f358676e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.wg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358675d;
        gx0.bh bhVar = this.f358676e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jx0.h0 h0Var = (jx0.h0) bhVar.L.j();
            if (h0Var != null) {
                this.f358675d = 1;
                if (h0Var.b(this) == aVar) {
                    return aVar;
                }
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
        if (bhVar.V6().f357788v.mo3195x754a37bb() == gx0.fd.f357965h) {
            gx0.bf V6 = bhVar.V6();
            this.f358675d = 2;
            if (gx0.bf.t7(V6, false, this, 1, null) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
