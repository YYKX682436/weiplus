package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class b3 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f72578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72580f;

    public b3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, java.util.ArrayList arrayList, java.lang.String str) {
        this.f72580f = launchAAUI;
        this.f72578d = arrayList;
        this.f72579e = str;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72580f;
        android.app.Dialog dialog = launchAAUI.A1;
        if (dialog != null && dialog.isShowing()) {
            launchAAUI.A1.dismiss();
        }
        launchAAUI.B1 = false;
        java.util.ArrayList arrayList = this.f72578d;
        arrayList.clear();
        int i17 = vVar.f351158c;
        java.lang.String str = this.f72579e;
        p13.u uVar = vVar.f351156a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "onSearchError: errorCode=%d | originQuery=%s", java.lang.Integer.valueOf(i17), uVar.f351141c);
            if (!uVar.f351141c.equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same Query");
                return;
            }
        } else if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "search result %d", java.lang.Integer.valueOf(vVar.f351160e.size()));
            if (str == null || !str.equals(uVar.f351141c)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same query origin:%s current:%s", uVar.f351141c, str);
                return;
            }
            java.util.List list = vVar.f351160e;
            if (list != null && list.size() > 0) {
                for (p13.y yVar : vVar.f351160e) {
                    java.lang.String str2 = yVar.f351187e;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2) ? false : com.tencent.mm.plugin.aa.ui.LaunchAAUI.q7(h61.o.i(str2))) {
                        arrayList.add(yVar.f351187e);
                    }
                }
            }
        }
        launchAAUI.o7(arrayList);
    }
}
