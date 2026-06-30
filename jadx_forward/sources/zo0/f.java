package zo0;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.c f556069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.g f556070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ip0.a f556071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ep0.h f556072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zo0.c f556073h;

    public f(fp0.c cVar, zo0.g gVar, ip0.a aVar, ep0.h hVar, zo0.c cVar2) {
        this.f556069d = cVar;
        this.f556070e = gVar;
        this.f556071f = aVar;
        this.f556072g = hVar;
        this.f556073h = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((fp0.o) this.f556069d).d(new zo0.e(this.f556070e, this.f556071f, this.f556072g, this.f556073h));
    }
}
