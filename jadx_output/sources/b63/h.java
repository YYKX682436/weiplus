package b63;

/* loaded from: classes11.dex */
public class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b63.i f18149a;

    public h(b63.i iVar) {
        this.f18149a = iVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        synchronized (this.f18149a.f18151b.f18154d) {
            java.util.Iterator it = ((java.util.ArrayList) this.f18149a.f18151b.f18154d).iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.ui.n1 n1Var = (com.tencent.mm.pluginsdk.ui.n1) ((java.lang.ref.WeakReference) it.next()).get();
                if (n1Var != null) {
                    if (((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di((java.lang.String) this.f18149a.f18151b.b(n1Var.f190901m).first).field_avatarURL.equals(((b63.e) aVar.f293573a).f18146d)) {
                        n1Var.U(n1Var.f190901m);
                    }
                } else {
                    it.remove();
                }
            }
        }
    }
}
