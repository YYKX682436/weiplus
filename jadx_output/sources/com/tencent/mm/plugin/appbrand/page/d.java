package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.e f86508e;

    public d(com.tencent.mm.plugin.appbrand.page.e eVar, int i17) {
        this.f86508e = eVar;
        this.f86507d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.e eVar = this.f86508e;
        com.tencent.mm.plugin.appbrand.jsapi.l F = eVar.f86550d.F();
        int i17 = this.f86507d;
        if (F != null && ((com.tencent.luggage.sdk.jsapi.component.b) eVar.f86550d.F()).getContentView() != null) {
            ((com.tencent.luggage.sdk.jsapi.component.b) eVar.f86550d.F()).getContentView().setBackgroundColor(i17);
        }
        com.tencent.mm.plugin.appbrand.page.bd bdVar = eVar.f86550d.f86379q;
        if (bdVar != null) {
            bdVar.setBackgroundColor(i17);
        }
    }
}
