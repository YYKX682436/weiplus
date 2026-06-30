package zo0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo0.g f556065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ip0.a f556066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep0.h f556067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zo0.c f556068g;

    public e(zo0.g gVar, ip0.a aVar, ep0.h hVar, zo0.c cVar) {
        this.f556065d = gVar;
        this.f556066e = aVar;
        this.f556067f = hVar;
        this.f556068g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f556065d.b(this.f556066e, this.f556067f, new zo0.d(this.f556068g));
    }
}
