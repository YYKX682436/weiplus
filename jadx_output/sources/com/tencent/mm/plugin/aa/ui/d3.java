package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f72601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f72602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72603f;

    public d3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, p13.c cVar, java.util.ArrayList arrayList) {
        this.f72603f = launchAAUI;
        this.f72601d = cVar;
        this.f72602e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72603f;
        if (launchAAUI.B1) {
            android.app.Dialog dialog = launchAAUI.A1;
            if (dialog != null && dialog.isShowing()) {
                launchAAUI.A1.dismiss();
            }
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f72601d);
            launchAAUI.B1 = false;
            java.util.ArrayList arrayList = this.f72602e;
            arrayList.clear();
            launchAAUI.o7(arrayList);
        }
    }
}
