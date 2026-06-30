package so5;

/* loaded from: classes14.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492350d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f492352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f492353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f492354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(so5.k0 k0Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492352f = k0Var;
        this.f492353g = i17;
        this.f492354h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        so5.e0 e0Var = new so5.e0(this.f492352f, this.f492353g, this.f492354h, interfaceC29045xdcb5ca57);
        e0Var.f492351e = obj;
        return e0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492350d;
        so5.k0 k0Var = this.f492352f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f492351e;
            boolean z17 = k0Var.f492399p;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCameraPreviewApply: ");
            int i18 = this.f492353g;
            sb6.append(i18);
            sb6.append(", ");
            int i19 = this.f492354h;
            sb6.append(i19);
            sb6.append(", fromResolutionSwitch=");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", sb6.toString());
            yz5.v vVar = k0Var.f492397n;
            if (vVar != null) {
                java.lang.Integer num = new java.lang.Integer(k0Var.f492394h);
                java.lang.Integer num2 = new java.lang.Integer(i18);
                java.lang.Integer num3 = new java.lang.Integer(i19);
                zq4.b bVar = k0Var.f492392f;
                java.lang.Integer num4 = new java.lang.Integer(bVar != null ? bVar.f556575b : 0);
                zq4.b bVar2 = k0Var.f492392f;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar2 == null || bVar2.f556574a);
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
                this.f492350d = 1;
                if (vVar.D(y0Var, num, num2, num3, num4, valueOf, valueOf2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        k0Var.f492399p = false;
        return jz5.f0.f384359a;
    }
}
