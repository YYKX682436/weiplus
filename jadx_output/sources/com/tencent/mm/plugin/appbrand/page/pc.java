package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class pc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wc f87016d;

    public pc(com.tencent.mm.plugin.appbrand.page.wc wcVar) {
        this.f87016d = wcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.wc wcVar = this.f87016d;
        android.view.ViewGroup viewGroup = wcVar.f86371f;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(viewGroup)) {
            ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).P0(new com.tencent.mm.plugin.appbrand.page.oc(this, viewGroup));
        }
    }
}
