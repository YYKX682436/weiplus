package p16;

/* loaded from: classes16.dex */
public abstract class q extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public p16.n f432871e = p16.n.f432856d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f432872f;

    public final void c(p16.s sVar) {
        p16.w0 w0Var;
        if (!this.f432872f) {
            this.f432871e = this.f432871e.m157720x5a5dd5d();
            this.f432872f = true;
        }
        p16.n nVar = this.f432871e;
        p16.n nVar2 = sVar.f432876d;
        nVar.getClass();
        int i17 = 0;
        while (true) {
            int size = nVar2.f432857a.f432898e.size();
            w0Var = nVar2.f432857a;
            if (i17 >= size) {
                break;
            }
            nVar.h((java.util.Map.Entry) w0Var.f432898e.get(i17));
            i17++;
        }
        java.util.Iterator it = w0Var.c().iterator();
        while (it.hasNext()) {
            nVar.h((java.util.Map.Entry) it.next());
        }
    }
}
