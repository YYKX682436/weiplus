package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class nc implements ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni1.f f86928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wc f86929e;

    public nc(com.tencent.mm.plugin.appbrand.page.wc wcVar, ni1.f fVar) {
        this.f86929e = wcVar;
        this.f86928d = fVar;
    }

    @Override // ni1.f
    public void P() {
        this.f86928d.P();
    }

    @Override // ni1.f
    public void V() {
        this.f86928d.V();
        com.tencent.mm.plugin.appbrand.page.wc wcVar = this.f86929e;
        if (android.text.TextUtils.isEmpty(wcVar.B) || !wcVar.f0().b0()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.dd f07 = wcVar.f0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("document.title=\"");
        sb6.append(com.tencent.mm.plugin.appbrand.utils.w2.a(wcVar.B + "(PAUSED)"));
        sb6.append("\"");
        f07.evaluateJavascript(sb6.toString(), null);
    }
}
