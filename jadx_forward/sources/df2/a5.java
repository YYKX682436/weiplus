package df2;

/* loaded from: classes3.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f311206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.d5 f311207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(long j17, df2.d5 d5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311206e = j17;
        this.f311207f = d5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.a5(this.f311206e, this.f311207f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.a5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311205d;
        long j17 = this.f311206e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchTestLiveGuideController", "dismissJob start without action");
            this.f311205d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchTestLiveGuideController", "dismiss after delay without action " + j17);
        this.f311207f.m7("delayDismissWithoutActionJob", false);
        return jz5.f0.f384359a;
    }
}
