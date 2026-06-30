package i11;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f368663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f368664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f368665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368666g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f368667h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f368668i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f368669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i11.o f368670n;

    public n(i11.o oVar, boolean z17, double d17, double d18, int i17, double d19, double d27, double d28) {
        this.f368670n = oVar;
        this.f368663d = z17;
        this.f368664e = d17;
        this.f368665f = d18;
        this.f368666g = i17;
        this.f368667h = d19;
        this.f368668i = d27;
        this.f368669m = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        i11.o oVar = this.f368670n;
        bundle.putString("indoor_building_floor", oVar.f368671b.f368642r);
        bundle.putString("indoor_building_id", oVar.f368671b.f368641q);
        bundle.putInt("indoor_building_type", oVar.f368671b.f368643s);
        i11.h.c(oVar.f368671b, this.f368663d, this.f368664e, this.f368665f, this.f368666g, this.f368667h, this.f368668i, this.f368669m, bundle);
    }
}
