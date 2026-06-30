package te2;

/* loaded from: classes.dex */
public final class la extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(te2.hc hcVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499746e = hcVar;
        this.f499747f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.la(this.f499746e, this.f499747f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.la) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499745d;
        te2.hc hcVar = this.f499746e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499745d = 1;
            obj = te2.hc.O6(hcVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = this.f499747f;
        java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0((android.graphics.Bitmap) obj, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(fj6, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(fj6).m43592x7a249f0b();
            if (m43592x7a249f0b < 0) {
                m43592x7a249f0b = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(j07, m43592x7a249f0b);
        }
        ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(hcVar.m158354x19263085(), str, bitmap, hcVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), 3, new te2.ka(str, hcVar, fj6)).show();
        return jz5.f0.f384359a;
    }
}
