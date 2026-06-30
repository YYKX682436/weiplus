package bg2;

/* loaded from: classes12.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f101519d;

    public c7(bg2.j7 j7Var) {
        this.f101519d = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f101519d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "release before ".concat(j7Var.c()));
        j7Var.d().mo50300x3fa464aa(j7Var.f101752i);
        j7Var.f101751h = null;
        j7Var.f101744a.clear();
        java.util.Iterator it = j7Var.f101745b.values().iterator();
        while (it.hasNext()) {
            az2.j jVar = ((bg2.r6) it.next()).f102007i;
            if (jVar != null) {
                jVar.j();
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) j7Var.f101746c).clear();
        j7Var.f101745b.clear();
        j7Var.f101747d.clear();
        ((java.util.LinkedList) j7Var.f101748e).clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "releaseAll after ".concat(j7Var.c()));
    }
}
