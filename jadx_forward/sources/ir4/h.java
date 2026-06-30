package ir4;

/* loaded from: classes11.dex */
public final class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir4.k f375800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375801b;

    public h(ir4.k kVar, java.lang.String str) {
        this.f375800a = kVar;
        this.f375801b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        ir4.k kVar = this.f375800a;
        java.util.List list = kVar.f375807e;
        java.lang.String str = this.f375801b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) kVar.f375807e).iterator();
            while (it.hasNext()) {
                kv.e0 e0Var = (kv.e0) ((java.lang.ref.WeakReference) it.next()).get();
                if (e0Var != null) {
                    e0Var.U(str);
                } else {
                    it.remove();
                }
            }
        }
    }
}
