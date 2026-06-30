package p53;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p53.e f433588d;

    public d(p53.e eVar) {
        this.f433588d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p53.e eVar = this.f433588d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabBridgeUI", "load tools process, web page load time:%d", java.lang.Long.valueOf(currentTimeMillis - eVar.f433589d));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.f223304f == eVar.f433591f.hashCode()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.d(eVar.f433591f, eVar.f433590e, false, true, true, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabBridgeUI", "GameTabWidget.mHashCode(%d) != hashCode(%d), dont need turn page!", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.f223304f), java.lang.Integer.valueOf(eVar.f433591f.hashCode()));
        }
    }
}
