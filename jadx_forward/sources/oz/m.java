package oz;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oz.s f431704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oz.b f431705e;

    public m(oz.s sVar, oz.b bVar) {
        this.f431704d = sVar;
        this.f431705e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz.s.aj(this.f431704d, this.f431705e);
    }
}
