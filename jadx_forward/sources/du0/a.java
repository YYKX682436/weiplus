package du0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f324853d;

    /* renamed from: e, reason: collision with root package name */
    public int f324854e;

    public a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du0.a(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new du0.a((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        i95.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324854e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(pp0.q0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pp0.q0 q0Var = (pp0.q0) c17;
            this.f324853d = q0Var;
            this.f324854e = 1;
            yy0.k8 k8Var = (yy0.k8) q0Var;
            java.lang.Object wi6 = k8Var.wi(this);
            mVar = k8Var;
            if (wi6 == aVar) {
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
            i95.m mVar2 = (pp0.q0) this.f324853d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mVar = mVar2;
        }
        this.f324853d = null;
        this.f324854e = 2;
        if (((yy0.k8) mVar).Ai(this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
