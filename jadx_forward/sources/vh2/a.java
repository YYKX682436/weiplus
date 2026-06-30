package vh2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f518572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.h84 h84Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518572e = h84Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh2.a(this.f518572e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.g84 g84Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518571d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.LinkedList m75941xfb821914 = this.f518572e.m75941xfb821914(4);
            if (m75941xfb821914 != null && (g84Var = (r45.g84) kz5.n0.Z(m75941xfb821914)) != null) {
                i95.m c17 = i95.n0.c(zy.u.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
                java.lang.String m75945x2fec8307 = g84Var.m75945x2fec8307(1);
                java.lang.String m75945x2fec83072 = g84Var.m75945x2fec8307(2);
                this.f518571d = 1;
                if (zy.w.Lc(p37, m75945x2fec8307, true, m75945x2fec83072, 0, 0, null, null, this, 120, null) == aVar) {
                    return aVar;
                }
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
