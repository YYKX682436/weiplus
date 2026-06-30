package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft.i f76450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f76451e;

    public h0(ft.i iVar, boolean z17) {
        this.f76450d = iVar;
        this.f76451e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ft.i iVar = this.f76450d;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "ljd stopLoading after db update");
            ((com.tencent.mm.plugin.taskbar.ui.y1) iVar).a(this.f76451e, com.tencent.mm.plugin.appbrand.appusage.j0.f76474h);
        }
    }
}
