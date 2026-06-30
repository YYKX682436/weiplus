package cp0;

/* loaded from: classes15.dex */
public final class i implements cp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp0.l f302280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f302281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ip0.a f302282c;

    public i(cp0.l lVar, java.util.Map.Entry entry, ip0.a aVar) {
        this.f302280a = lVar;
        this.f302281b = entry;
        this.f302282c = aVar;
    }

    @Override // cp0.b
    public void a(boolean z17) {
        if (z17) {
            this.f302280a.b((cp0.f) ((jz5.l) this.f302281b.getValue()).f384367e, this.f302282c, "onDataItemLoadEnd");
        }
    }
}
