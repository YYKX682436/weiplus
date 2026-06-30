package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class wd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f83791d;

    public wd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f83791d = mdVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.jsapi.md mdVar = this.f83791d;
        if (itemId == 1) {
            mdVar.getClass();
            mdVar.b(new com.tencent.mm.plugin.appbrand.jsapi.ae(mdVar));
            return;
        }
        if (itemId == 2) {
            mdVar.getClass();
            mdVar.b(new com.tencent.mm.plugin.appbrand.jsapi.be(mdVar));
        } else if (itemId == 3) {
            mdVar.getClass();
            mdVar.b(new com.tencent.mm.plugin.appbrand.jsapi.pd(mdVar));
        } else {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.md.a(mdVar);
        }
    }
}
