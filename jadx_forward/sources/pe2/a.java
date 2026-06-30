package pe2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public float f435142d;

    /* renamed from: e, reason: collision with root package name */
    public int f435143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f435144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 f435145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f435146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 c14181x8c64b469, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435144f = j17;
        this.f435145g = c14181x8c64b469;
        this.f435146h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe2.a(this.f435144f, this.f435145g, this.f435146h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        float f17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435143e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            f17 = 360.0f / (((float) this.f435144f) / 60.0f);
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f17 = this.f435142d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 c14181x8c64b469 = this.f435145g;
            float f18 = c14181x8c64b469.f193059m;
            if (f18 <= 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheerCountDownView", "endCountDown");
                this.f435146h.mo152xb9724478();
                return jz5.f0.f384359a;
            }
            float f19 = f18 - f17;
            c14181x8c64b469.f193059m = f19;
            if (f19 < 0.0f) {
                c14181x8c64b469.f193059m = 0.0f;
            }
            c14181x8c64b469.invalidate();
            if (c14181x8c64b469.f193059m > 0.0f) {
                this.f435142d = f17;
                this.f435143e = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(60L, this) == aVar) {
                    return aVar;
                }
            }
        }
    }
}
