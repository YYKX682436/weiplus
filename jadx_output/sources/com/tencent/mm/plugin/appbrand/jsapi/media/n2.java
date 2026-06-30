package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class n2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.p2 f81949d;

    public n2(com.tencent.mm.plugin.appbrand.jsapi.media.p2 p2Var) {
        this.f81949d = p2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.jsapi.media.p2 p2Var = this.f81949d;
        if (itemId == 1) {
            p2Var.f81989h.f81782h.f81628g = false;
        } else if (itemId == 2) {
            p2Var.f81989h.f81782h.f81627f = false;
        }
        if (menuItem.getItemId() == 1 && !p2Var.f81989h.D(p2Var.f81985d, p2Var.f81986e, p2Var.f81987f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseImage", "check camera permission fail");
            return;
        }
        if (menuItem.getItemId() == 2 && !p2Var.f81989h.E(p2Var.f81985d, p2Var.f81986e, p2Var.f81987f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseImage", "check external storage permission fail");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "start select after source choose");
        android.content.Context context = p2Var.f81988g;
        com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var = p2Var.f81989h;
        com.tencent.mm.plugin.appbrand.ipc.d.b(context, e3Var.f81782h, e3Var.f81783i);
    }
}
