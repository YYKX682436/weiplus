package sc3;

/* loaded from: classes7.dex */
public final class g1 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f487982b;

    public g1(sc3.k1 k1Var, long j17) {
        this.f487981a = k1Var;
        this.f487982b = j17;
    }

    @Override // cl.j1
    public final void a(java.lang.String str, cl.k1 k1Var) {
        sc3.k1 k1Var2 = this.f487981a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = k1Var2.f488015n;
        if (c16416x87606a7b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        if (c16416x87606a7b.f229352f.length() > 0) {
            je3.k kVar = je3.k.f380831e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b2 = k1Var2.f488015n;
            if (c16416x87606a7b2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
                throw null;
            }
            java.lang.String str2 = c16416x87606a7b2.f229352f;
            java.lang.String str3 = k1Var2.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72 enumC16456x617fbd72 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37617x23fdb9;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            je3.i.M2(kVar, str2, str3, enumC16456x617fbd72, android.os.SystemClock.elapsedRealtime() - this.f487982b, null, 0.0f, 48, null);
        }
        k1Var2.Y0();
    }
}
