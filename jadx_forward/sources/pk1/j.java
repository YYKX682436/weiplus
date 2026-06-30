package pk1;

/* loaded from: classes7.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str) {
        super(0);
        this.f436989d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean m17;
        java.lang.String src = this.f436989d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        int i17 = nk1.d.f419482e;
        android.net.Uri parse = android.net.Uri.parse(src);
        nk1.a aVar = new nk1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, af1.z.f86049a, nk1.c.f419481r.mo10288xb8a7ce81(), null, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parse);
        nk1.d dVar = new nk1.d(aVar, new ze1.a(aVar, parse, null, 4, null), null);
        try {
            try {
                m17 = ye1.b.f542712a.a(dVar);
                java.lang.String b17 = dVar.b();
                if (b17 == null) {
                    b17 = src;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbContainerFormatInferer", "isHls, src: " + src + ", finalUrl: " + b17);
                src = b17;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ThumbContainerFormatInferer", e17, "judge isHls fail", new java.lang.Object[0]);
                m17 = ve1.g.m(src);
            }
            vz5.b.a(dVar, null);
            return new pk1.g(m17, src);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(dVar, th6);
                throw th7;
            }
        }
    }
}
