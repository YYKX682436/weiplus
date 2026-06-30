package ke5;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.a f388595d;

    public c(ke5.a aVar) {
        this.f388595d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tb5.v vVar = ((tb5.y) ((tb5.m0) this.f388595d.f388574b.f542241c.a(tb5.m0.class))).f498638f;
        if (vVar.f498633q != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - vVar.f498633q;
            if (currentTimeMillis > 100) {
                vVar.f498630n.add(java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        vVar.f498633q = 0L;
    }
}
