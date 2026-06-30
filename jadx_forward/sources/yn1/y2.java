package yn1;

/* loaded from: classes11.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(yn1.a4 a4Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545460e = a4Var;
        this.f545461f = str;
        this.f545462g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.y2(this.f545460e, this.f545461f, this.f545462g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545459d;
        long j17 = this.f545462g;
        boolean z17 = true;
        yn1.a4 a4Var = this.f545460e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yn1.z0 z0Var = yn1.z0.f545466a;
                vn1.m b17 = a4Var.b();
                java.lang.String str = this.f545461f;
                this.f545459d = 1;
                obj = z0Var.b(b17, str, this);
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
            java.lang.String str2 = a4Var.f545139a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[connectToDeviceAsync] success=");
            sb6.append(booleanValue);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
            if (aVar2 != null) {
                if (!booleanValue) {
                    z17 = false;
                }
                aVar2.C(j17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a4Var.f545139a, "[connectToDeviceAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = a4Var.f545142d;
            if (aVar3 != null) {
                aVar3.C(j17, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
