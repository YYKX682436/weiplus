package si0;

/* loaded from: classes4.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f489579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489579e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.c1(this.f489579e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489578d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ob4.a aVar2 = new ob4.a(this.f489579e);
                this.f489578d = 1;
                obj = aVar2.s(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            return (r45.n96) obj;
        } catch (ob4.b e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircroMsg.SnsNativeRouterPlugin", "jumpToSNSDetailWithSnsId: error=" + e17.getMessage());
            return null;
        }
    }
}
