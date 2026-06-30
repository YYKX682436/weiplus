package iv0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f376614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mv0.a f376616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iv0.c f376617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(iv0.w wVar, mv0.a aVar, iv0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376615e = wVar;
        this.f376616f = aVar;
        this.f376617g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iv0.q(this.f376615e, this.f376616f, this.f376617g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iv0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f376614d;
        iv0.w wVar = this.f376615e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            iv0.w.l7(wVar).setScaleX(0.0f);
            iv0.w.l7(wVar).setScaleY(0.0f);
            wVar.A++;
            gx0.bf n76 = wVar.n7();
            this.f376614d = 1;
            if (n76.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        iv0.w.l7(wVar).post(new iv0.p(wVar, this.f376616f, this.f376617g));
        return jz5.f0.f384359a;
    }
}
