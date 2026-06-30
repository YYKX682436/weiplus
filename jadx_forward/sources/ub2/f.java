package ub2;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f507579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub2.k f507580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ub2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f507580e = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ub2.f(this.f507580e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f507579d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[release] before cancel");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f507580e.f507607c;
            if (r2Var != null) {
                this.f507579d = 1;
                if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[release] after cancel");
        long j17 = ub2.n.f507618b;
        if (j17 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22976x88aa831d.m83797x46fb07b9(j17);
            ub2.n.f507618b = 0L;
        }
        return jz5.f0.f384359a;
    }
}
