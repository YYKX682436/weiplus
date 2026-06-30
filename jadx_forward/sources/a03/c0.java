package a03;

/* loaded from: classes11.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f81937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f81938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a03.h0 h0Var, java.util.Map map, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81937e = h0Var;
        this.f81938f = map;
        this.f81939g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a03.c0(this.f81937e, this.f81938f, this.f81939g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object cj6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81936d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a03.h0 h0Var = this.f81937e;
            java.lang.String str = h0Var.f81962q;
            java.util.Map map = this.f81938f;
            this.f81936d = 1;
            cj6 = a03.h0.cj(h0Var, "watch_later", str, map, null, this, 8, null);
            if (cj6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            cj6 = obj;
        }
        android.content.Context context = this.f81939g;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        this.f81936d = 2;
        if (pi0.l1.v((pi0.l1) cj6, context, c10716x931597c6, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
