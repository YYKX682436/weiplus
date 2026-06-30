package k02;

/* loaded from: classes8.dex */
public class i implements k02.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g02.c f384615a;

    public i(g02.c cVar) {
        this.f384615a = cVar;
    }

    @Override // k02.j
    public void a(boolean z17) {
        if (z17) {
            g02.b.c(4, this.f384615a);
        }
    }

    @Override // k02.j
    public void b(boolean z17) {
        g02.c cVar = this.f384615a;
        if (z17) {
            g02.b.c(23, cVar);
        } else {
            g02.b.c(22, cVar);
        }
    }
}
