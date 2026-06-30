package b63;

/* loaded from: classes11.dex */
public class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b63.i f99682a;

    public h(b63.i iVar) {
        this.f99682a = iVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        synchronized (this.f99682a.f99684b.f99687d) {
            java.util.Iterator it = ((java.util.ArrayList) this.f99682a.f99684b.f99687d).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) ((java.lang.ref.WeakReference) it.next()).get();
                if (n1Var != null) {
                    if (((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di((java.lang.String) this.f99682a.f99684b.b(n1Var.f272434m).first).f67427x81118851.equals(((b63.e) aVar.f375106a).f99679d)) {
                        n1Var.U(n1Var.f272434m);
                    }
                } else {
                    it.remove();
                }
            }
        }
    }
}
