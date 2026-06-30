package oz;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oz.s f431718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oz.b f431719e;

    public r(oz.s sVar, oz.b bVar) {
        this.f431718d = sVar;
        this.f431719e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz.s.aj(this.f431718d, this.f431719e);
    }
}
