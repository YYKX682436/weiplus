package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class wd implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le f281703a;

    public wd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        this.f281703a = leVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee
    /* renamed from: onClick */
    public void mo79472xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "iStickToolsCallback click");
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar = this.f281703a;
        if (z17) {
            com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) tag;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomaa@app.origin")) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.m0(leVar);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomlive@app.origin")) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.n0(leVar);
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.o0(leVar, c10329x6f52684a, "1", true);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.p0(leVar, c10329x6f52684a, true);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 g0Var = leVar.f280958t;
        if (g0Var != null) {
            g0Var.b();
        }
    }
}
