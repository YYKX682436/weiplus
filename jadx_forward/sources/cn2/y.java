package cn2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f125169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f125170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f125171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.k f125172g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cn2.c0 c0Var, android.view.View view, cn2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f125170e = c0Var;
        this.f125171f = view;
        this.f125172g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cn2.y(this.f125170e, this.f125171f, this.f125172g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f125169d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            cn2.c0 c0Var = this.f125170e;
            android.view.View view = this.f125171f;
            cn2.k kVar = this.f125172g;
            cn2.h hVar = kVar.f125095f;
            long j17 = hVar.f125062h;
            int i18 = hVar.f125063i;
            boolean z17 = kVar.f125094e;
            this.f125169d = 1;
            obj = cn2.c0.e(c0Var, view, j17, i18, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
