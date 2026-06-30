package yn1;

/* loaded from: classes5.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f545176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.h4 f545177f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(pi0.l1 l1Var, yn1.h4 h4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545176e = l1Var;
        this.f545177f = h4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.d4(this.f545176e, this.f545177f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.d4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545175d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[releaseInstance] flutterHolder=");
            pi0.l1 l1Var = this.f545176e;
            sb6.append(l1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", sb6.toString());
            this.f545175d = 1;
            if (l1Var.h(this.f545177f, this) == aVar) {
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
