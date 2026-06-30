package gm0;

/* loaded from: classes12.dex */
public class w1 implements pq5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.y1 f354817a;

    public w1(gm0.y1 y1Var) {
        this.f354817a = y1Var;
    }

    @Override // pq5.b
    public void a(java.lang.Object obj) {
        hm0.t tVar = (hm0.t) obj;
        tVar.getClass();
        tVar.b();
        gm0.y1 y1Var = this.f354817a;
        if (y1Var.f354826f) {
            fm5.b bVar = new fm5.b(tVar, y1Var);
            synchronized (y1Var) {
                y1Var.f345714d.remove(bVar);
            }
        }
    }
}
