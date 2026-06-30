package qg5;

/* loaded from: classes8.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444533d;

    /* renamed from: e, reason: collision with root package name */
    public int f444534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f444535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f444536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444537h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(p3325xe03a0797.p3326xc267989b.z zVar, qg5.n5 n5Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444535f = zVar;
        this.f444536g = n5Var;
        this.f444537h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.g5(this.f444535f, this.f444536g, this.f444537h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.g5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.z zVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444534e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ct.q2 T6 = qg5.n5.T6(this.f444536g);
            p3325xe03a0797.p3326xc267989b.z zVar2 = this.f444535f;
            this.f444533d = zVar2;
            this.f444534e = 1;
            obj = ((qg5.l0) T6).nj(this.f444537h, this);
            if (obj == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (p3325xe03a0797.p3326xc267989b.z) this.f444533d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((p3325xe03a0797.p3326xc267989b.a0) zVar).U(obj);
        return jz5.f0.f384359a;
    }
}
