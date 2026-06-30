package df2;

/* loaded from: classes3.dex */
public final class qt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f312721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.wt f312722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(long j17, df2.wt wtVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312721e = j17;
        this.f312722f = wtVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qt(this.f312721e, this.f312722f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qt) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312720d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDismissAfterReserve: dismiss after click, delay=");
            long j17 = this.f312721e;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", sb6.toString());
            this.f312720d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        df2.wt wtVar = this.f312722f;
        wtVar.n7("dismissAfterReserve", false);
        wtVar.f313246s = null;
        return jz5.f0.f384359a;
    }
}
