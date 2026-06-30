package h5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f360517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h5.f f360518e;

    public e(h5.f fVar, java.util.List list) {
        this.f360518e = fVar;
        this.f360517d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (f5.a aVar : this.f360517d) {
            java.lang.Object obj = this.f360518e.f360524e;
            g5.d dVar = (g5.d) aVar;
            dVar.f350411b = obj;
            dVar.d(dVar.f350413d, obj);
        }
    }
}
