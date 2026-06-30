package df2;

/* loaded from: classes3.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f312288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f312289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(java.lang.String str, long j17, df2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312287e = str;
        this.f312288f = j17;
        this.f312289g = r4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.m4(this.f312287e, this.f312288f, this.f312289g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.m4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312286d;
        long j17 = this.f312288f;
        java.lang.String str = this.f312287e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubscribeNextLiveGuideController", "dismissDelay " + str + " start delay " + j17);
            this.f312286d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubscribeNextLiveGuideController", "dismissDelay " + str + " after delay " + j17);
        this.f312289g.m7(str, false);
        return jz5.f0.f384359a;
    }
}
