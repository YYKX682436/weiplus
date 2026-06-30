package ln0;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401177d;

    public c(ln0.p pVar) {
        this.f401177d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f401177d.f401205a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getP2pParamsMap$p(...)");
        ln0.p pVar = this.f401177d;
        synchronized (map) {
            java.util.Iterator it = pVar.f401205a.keySet().iterator();
            while (it.hasNext()) {
                pVar.h((java.lang.String) it.next());
            }
        }
    }
}
