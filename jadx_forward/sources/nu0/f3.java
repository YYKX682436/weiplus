package nu0;

/* loaded from: classes5.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421471e = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.f3(this.f421471e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.f3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421470d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nu0.b4 b4Var = this.f421471e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "releaseImageSession >> release");
            nu0.q0 U6 = b4Var.U6();
            this.f421470d = 1;
            U6.getClass();
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(U6.f421606p, new nu0.d0(U6, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        b4Var.z7(nu0.c1.f421429f);
        return f0Var;
    }
}
