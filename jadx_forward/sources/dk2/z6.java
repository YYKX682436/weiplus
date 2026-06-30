package dk2;

/* loaded from: classes3.dex */
public final class z6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yq4 f315956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(r45.yq4 yq4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315956e = yq4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.z6(this.f315956e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.z6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f315955d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            r45.yq4 yq4Var = this.f315956e;
            r45.gs5 gs5Var = (r45.gs5) yq4Var.m75936x14adae67(1);
            java.lang.String m75945x2fec8307 = gs5Var != null ? gs5Var.m75945x2fec8307(0) : null;
            r45.gs5 gs5Var2 = (r45.gs5) yq4Var.m75936x14adae67(1);
            java.lang.String m75945x2fec83072 = gs5Var2 != null ? gs5Var2.m75945x2fec8307(1) : null;
            this.f315955d = 1;
            if (zy.w.Lc(p37, m75945x2fec8307, true, m75945x2fec83072, 0, 0, null, null, this, 120, null) == aVar) {
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
