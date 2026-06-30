package g4;

/* loaded from: classes.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349999d;

    /* renamed from: e, reason: collision with root package name */
    public int f350000e;

    public o1(g4.f4 f4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.o1 o1Var = new g4.o1(null, completion);
        o1Var.f349999d = obj;
        return o1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.o1) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        g4.d4 d4Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350000e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f349999d;
            d4Var = null;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f349999d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d4Var = (g4.d4) obj;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d4Var == g4.d4.LAUNCH_INITIAL_REFRESH);
        this.f349999d = null;
        this.f350000e = 2;
        if (kVar.mo771x2f8fd3(valueOf, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
