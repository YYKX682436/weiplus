package mn2;

/* loaded from: classes11.dex */
public class o implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn2.q f411608b;

    public o(mn2.q qVar, java.lang.String str) {
        this.f411608b = qVar;
        this.f411607a = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        synchronized (this.f411608b.f411623d) {
            java.util.Iterator it = ((java.util.ArrayList) this.f411608b.f411623d).iterator();
            while (it.hasNext()) {
                kv.e0 e0Var = (kv.e0) ((java.lang.ref.WeakReference) it.next()).get();
                if (e0Var != null) {
                    e0Var.U(this.f411607a);
                } else {
                    it.remove();
                }
            }
        }
    }
}
