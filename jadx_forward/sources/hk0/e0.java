package hk0;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.u0 f363261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f363262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(hk0.u0 u0Var, java.util.ArrayList arrayList, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363261e = u0Var;
        this.f363262f = arrayList;
        this.f363263g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hk0.e0(this.f363261e, this.f363262f, this.f363263g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk0.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363260d;
        hk0.u0 u0Var = this.f363261e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f363260d = 1;
            hk0.u0.O6(u0Var, this.f363262f, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new hk0.i(hk0.d1.f363255f, new hk0.k(hk0.l.f363300h, this.f363263g)));
        this.f363260d = 2;
        hk0.u0.N6(u0Var, arrayList, this);
        return f0Var == aVar ? aVar : f0Var;
    }
}
