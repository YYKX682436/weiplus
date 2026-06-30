package qf2;

/* loaded from: classes.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f443954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f443955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(qf2.y1 y1Var, dk2.m mVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443954e = y1Var;
        this.f443955f = mVar;
        this.f443956g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.j1(this.f443954e, this.f443955f, this.f443956g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443953d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qf2.y1 y1Var = this.f443954e;
            dk2.m mVar = this.f443955f;
            qf2.i1 i1Var = new qf2.i1(this.f443956g);
            this.f443953d = 1;
            if (qf2.y1.b7(y1Var, mVar, 3, true, i1Var, this) == aVar) {
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
