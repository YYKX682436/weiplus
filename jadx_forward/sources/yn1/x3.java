package yn1;

/* loaded from: classes11.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yn1.a4 a4Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545452e = a4Var;
        this.f545453f = str;
        this.f545454g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.x3(this.f545452e, this.f545453f, this.f545454g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.x3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545451d;
        long j17 = this.f545454g;
        boolean z17 = true;
        yn1.a4 a4Var = this.f545452e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yn1.z0 z0Var = yn1.z0.f545466a;
                vn1.m b17 = a4Var.b();
                java.lang.String str = this.f545453f;
                this.f545451d = 1;
                obj = z0Var.s(b17, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
            if (aVar2 != null) {
                if (!booleanValue) {
                    z17 = false;
                }
                aVar2.x(j17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a4Var.f545139a, "[startBLEScanningAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = a4Var.f545142d;
            if (aVar3 != null) {
                aVar3.x(j17, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
