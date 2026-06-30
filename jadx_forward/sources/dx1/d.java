package dx1;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx1.c f326015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f326017f;

    public d(dx1.c cVar, boolean z17, boolean z18) {
        this.f326015d = cVar;
        this.f326016e = z17;
        this.f326017f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dx1.g.f326022a.c(this.f326015d, this.f326016e, this.f326017f);
    }
}
