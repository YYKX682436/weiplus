package l41;

/* loaded from: classes8.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f397407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.j0 f397408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.s4 f397409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j41.h0 h0Var, j41.j0 j0Var, r45.s4 s4Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f397407e = h0Var;
        this.f397408f = j0Var;
        this.f397409g = s4Var;
        this.f397410h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l41.n0(this.f397407e, this.f397408f, this.f397409g, this.f397410h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f397406d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                m41.b bVar = new m41.b(this.f397407e, this.f397408f, this.f397409g);
                this.f397406d = 1;
                if (bVar.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", "asyncEnterKefuChat finished, username: %s", this.f397410h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConfirmController", "asyncEnterKefuChat exception: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
