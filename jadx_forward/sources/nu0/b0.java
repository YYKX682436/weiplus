package nu0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(nu0.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421402e = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.b0(this.f421402e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421401d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nu0.q0 q0Var = this.f421402e;
            this.f421401d = 1;
            if (q0Var.O6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = this.f421402e.f421608r;
        if (c4063x855a1ef82 != null) {
            c4063x855a1ef82.j();
        }
        nu0.q0 q0Var2 = this.f421402e;
        az0.i5 i5Var = az0.i5.f97090a;
        if (i5Var.t()) {
            c4063x855a1ef8 = i5Var.q().k(new android.os.Handler(android.os.Looper.getMainLooper()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4063x855a1ef8, "newImageSession(...)");
        } else {
            c4063x855a1ef8 = null;
        }
        q0Var2.f421608r = c4063x855a1ef8;
        return jz5.f0.f384359a;
    }
}
