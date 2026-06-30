package qf2;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f444022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f444023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(qf2.y1 y1Var, dk2.m mVar, int i17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444021e = y1Var;
        this.f444022f = mVar;
        this.f444023g = i17;
        this.f444024h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.n1(this.f444021e, this.f444022f, this.f444023g, this.f444024h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444020d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qf2.y1 y1Var = this.f444021e;
            dk2.m mVar = this.f444022f;
            int i18 = this.f444023g;
            yz5.l lVar = this.f444024h;
            this.f444020d = 1;
            if (qf2.y1.b7(y1Var, mVar, i18, true, lVar, this) == aVar) {
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
