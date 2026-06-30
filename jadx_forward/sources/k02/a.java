package k02;

/* loaded from: classes8.dex */
public class a implements k02.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h02.a f384594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f384595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j35.d f384596c;

    public a(h02.a aVar, boolean z17, j35.d dVar) {
        this.f384594a = aVar;
        this.f384595b = z17;
        this.f384596c = dVar;
    }

    @Override // k02.j
    public void a(boolean z17) {
        if (z17) {
            g02.c cVar = new g02.c();
            h02.a aVar = this.f384594a;
            cVar.a(aVar);
            java.lang.String str = aVar.f68429xa1e9e82c;
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("install_begin_time", 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, java.lang.System.currentTimeMillis()).apply();
            }
            g02.b.b(aVar.f68404x28d45f97, aVar.f68432x29cbf907, 4, aVar.f68426x4b6e68b9, aVar.f68411x238eb002, null, aVar.f68417x26b3182a);
            cVar.f348962j = (java.lang.System.currentTimeMillis() - aVar.f68440x1bb3b54a) / 1000;
            g02.b.c(4, cVar);
            if (this.f384595b) {
                g02.b.c(15, cVar);
            } else {
                g02.b.c(16, cVar);
            }
        }
        j35.d dVar = this.f384596c;
        if (dVar != null) {
            dVar.a(z17);
        }
    }

    @Override // k02.j
    public void b(boolean z17) {
        g02.c cVar = new g02.c();
        cVar.a(this.f384594a);
        if (z17) {
            g02.b.c(23, cVar);
        } else {
            g02.b.c(22, cVar);
        }
    }
}
