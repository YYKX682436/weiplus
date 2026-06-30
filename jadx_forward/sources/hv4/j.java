package hv4;

/* loaded from: classes8.dex */
public final class j implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f366835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv4.l f366836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f366837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366838d;

    public j(ot0.q qVar, hv4.l lVar, r45.sn3 sn3Var, java.lang.String str) {
        this.f366835a = qVar;
        this.f366836b = lVar;
        this.f366837c = sn3Var;
        this.f366838d = str;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        byte[] a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(bitmap);
        ot0.k1 a18 = ot0.j1.a();
        ot0.q qVar = this.f366835a;
        hv4.l lVar = this.f366836b;
        java.lang.String str3 = lVar.f366841f.f453163o;
        ((ez.w0) a18).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str3, "", a17);
        lVar.E(this.f366837c, this.f366838d);
    }
}
