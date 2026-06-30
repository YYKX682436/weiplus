package bg2;

/* loaded from: classes12.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f19986d;

    public c7(bg2.j7 j7Var) {
        this.f19986d = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f19986d;
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "release before ".concat(j7Var.c()));
        j7Var.d().removeCallbacks(j7Var.f20219i);
        j7Var.f20218h = null;
        j7Var.f20211a.clear();
        java.util.Iterator it = j7Var.f20212b.values().iterator();
        while (it.hasNext()) {
            az2.j jVar = ((bg2.r6) it.next()).f20474i;
            if (jVar != null) {
                jVar.j();
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) j7Var.f20213c).clear();
        j7Var.f20212b.clear();
        j7Var.f20214d.clear();
        ((java.util.LinkedList) j7Var.f20215e).clear();
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "releaseAll after ".concat(j7Var.c()));
    }
}
