package dl4;

/* loaded from: classes3.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o11.g f317001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ff0.s f317002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317004g;

    public s0(o11.g gVar, ff0.s sVar, java.lang.String str, java.lang.String str2) {
        this.f317001d = gVar;
        this.f317002e = sVar;
        this.f317003f = str;
        this.f317004g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f317001d.f423640e;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        java.lang.String str2 = this.f317003f;
        if (j17) {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
            ff0.s sVar = this.f317002e;
            if (sVar != null) {
                ((dl4.n) sVar).a(str2, N, N != null);
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingImageLoader", "downloadImage session: " + currentTimeMillis + ", imageKey: " + this.f317004g + ", url: %s", str2);
        dl4.d1 d1Var = dl4.d1.f316916a;
        java.lang.String str3 = this.f317003f;
        dl4.d1.b(d1Var, currentTimeMillis, str3, this.f317004g, this.f317001d, new dl4.r0(currentTimeMillis, str, this.f317002e, str3));
    }
}
