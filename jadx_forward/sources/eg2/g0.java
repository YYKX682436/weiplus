package eg2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f334101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(eg2.i0 i0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334101e = i0Var;
        this.f334102f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg2.g0(this.f334101e, this.f334102f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        eg2.i0 i0Var = this.f334101e;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334100d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                eg2.o0 o0Var = eg2.o0.f334138a;
                java.lang.String b17 = i0Var.b();
                java.lang.String str = this.f334102f;
                int c17 = i0Var.c();
                this.f334100d = 1;
                if (o0Var.a(b17, null, str, c17, 4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDBaseTask", "endTask sent for taskId=" + this.f334102f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderLiveHDBaseTask", e17, "endTask error", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
