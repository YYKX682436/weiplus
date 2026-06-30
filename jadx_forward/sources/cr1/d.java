package cr1;

/* loaded from: classes11.dex */
public final class d implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr1.g f303368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303369b;

    public d(cr1.g gVar, java.lang.String str) {
        this.f303368a = gVar;
        this.f303369b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        cr1.g gVar = this.f303368a;
        java.util.List list = gVar.f303375e;
        java.lang.String str = this.f303369b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) gVar.f303375e).iterator();
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
