package i11;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f368654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f368655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f368656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f368658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f368659i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f368660m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i11.m f368661n;

    public l(i11.m mVar, boolean z17, double d17, double d18, int i17, double d19, double d27, double d28) {
        this.f368661n = mVar;
        this.f368654d = z17;
        this.f368655e = d17;
        this.f368656f = d18;
        this.f368657g = i17;
        this.f368658h = d19;
        this.f368659i = d27;
        this.f368660m = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        i11.m mVar = this.f368661n;
        bundle.putString("indoor_building_floor", mVar.f368662b.f368642r);
        bundle.putString("indoor_building_id", mVar.f368662b.f368641q);
        bundle.putInt("indoor_building_type", mVar.f368662b.f368643s);
        i11.h.c(mVar.f368662b, this.f368654d, this.f368655e, this.f368656f, this.f368657g, this.f368658h, this.f368659i, this.f368660m, bundle);
    }
}
