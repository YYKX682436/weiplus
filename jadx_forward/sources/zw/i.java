package zw;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f558048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f558049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f558050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f558051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, qc0.m1 m1Var, yz5.l lVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558048d = z17;
        this.f558049e = m1Var;
        this.f558050f = lVar;
        this.f558051g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zw.i(this.f558048d, this.f558049e, this.f558050f, this.f558051g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zw.i iVar = (zw.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (this.f558048d) {
            zw.o oVar = zw.o.f558069a;
            qc0.m1 m1Var = this.f558049e;
            p3325xe03a0797.p3326xc267989b.l.d(zw.o.f558070b, null, null, new zw.d(m1Var.f442946d, this.f558051g, this.f558050f, m1Var, m1Var.f442949g, null), 3, null);
        } else {
            java.util.List list = this.f558049e.f442946d;
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((qc0.l1) obj2).f442929b)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            zw.o oVar2 = zw.o.f558069a;
            p3325xe03a0797.p3326xc267989b.l.d(zw.o.f558070b, null, null, new zw.g(arrayList, this.f558049e, this.f558051g, this.f558050f, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
