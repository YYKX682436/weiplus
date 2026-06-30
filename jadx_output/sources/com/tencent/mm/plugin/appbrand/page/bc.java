package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class bc implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f86440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.cc f86441e;

    public bc(com.tencent.mm.plugin.appbrand.page.cc ccVar) {
        this.f86441e = ccVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.appbrand.page.cc ccVar = this.f86441e;
        if (ccVar.f86499a == null) {
            ccVar.a();
            return;
        }
        int i17 = this.f86440d + 1;
        this.f86440d = i17;
        if (i17 == 2) {
            ccVar.a();
            ((com.tencent.mm.plugin.appbrand.page.ac) ccVar.f86499a).run();
        }
    }
}
