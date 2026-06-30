package dk5;

/* loaded from: classes9.dex */
public class d1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f316106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f316108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316110h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f316111i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316112m;

    public d1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, java.lang.String str2, byte[] bArr) {
        this.f316112m = activityC22567x42e895b8;
        this.f316106d = dVar;
        this.f316107e = str;
        this.f316108f = f9Var;
        this.f316109g = qVar;
        this.f316110h = str2;
        this.f316111i = bArr;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2 = this.f316107e;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f316106d;
        dVar.f68099xfeae815 = str2;
        if (i17 == 0 && gVar != null) {
            dVar.f68109x90a9378 = gVar.f69496x83ec3dd;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
        }
        if (i17 == 0 && hVar != null && hVar.f69553xb5f54fe9 == 0) {
            dVar.f68112x10a0fed7 = 199L;
            dVar.f68109x90a9378 = dVar.f68113xeb1a61d6;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f316108f;
            f9Var.r1(3);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
            ot0.q qVar = this.f316109g;
            java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.J(qVar, qVar.f430179d, qVar.H, this.f316110h, this.f316107e, this.f316111i, this.f316112m.I).second;
            if (obj != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(this.f316110h, (java.lang.Long) obj);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
