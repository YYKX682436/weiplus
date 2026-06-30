package y00;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f540033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y00.a f540034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y00.s f540035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f540036g;

    public c(int i17, y00.a aVar, y00.s sVar, java.util.Map map) {
        this.f540033d = i17;
        this.f540034e = aVar;
        this.f540035f = sVar;
        this.f540036g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int h17 = gm0.j1.b().h();
        int i17 = this.f540033d;
        y00.a aVar = this.f540034e;
        if (h17 == i17) {
            y00.h.b(this.f540035f.f540078a, aVar.f540023a, this.f540036g, aVar.f540025c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardFetcher", "memcache put skipped: uin changed, msgSvrId=" + aVar.f540023a);
    }
}
