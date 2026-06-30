package kj;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.FrameMetrics f389766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f389767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f389768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kj.l f389769h;

    public k(kj.l lVar, java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        this.f389769h = lVar;
        this.f389765d = str;
        this.f389766e = frameMetrics;
        this.f389767f = f17;
        this.f389768g = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f389769h) {
            kj.j jVar = (kj.j) this.f389769h.f389771b.get(this.f389765d);
            if (jVar != null) {
                jVar.a(this.f389765d, this.f389766e, this.f389767f, this.f389768g);
            }
            java.util.Iterator it = this.f389769h.f389772c.values().iterator();
            while (it.hasNext()) {
                ((kj.j) it.next()).a(this.f389765d, this.f389766e, this.f389767f, this.f389768g);
            }
        }
    }
}
