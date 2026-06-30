package re2;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475976g;

    public k(boolean z17, yz5.l lVar, java.lang.String str, yz5.p pVar) {
        this.f475973d = z17;
        this.f475974e = lVar;
        this.f475975f = str;
        this.f475976g = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f475973d) {
            this.f475974e.mo146xb9724478(this.f475975f);
        } else {
            this.f475976g.mo149xb9724478(-1, "merge render failed");
        }
    }
}
