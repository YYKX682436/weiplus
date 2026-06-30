package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87157d;

    public v2(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        this.f87157d = w2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87157d;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = w2Var.G;
        if (i3Var == null) {
            return;
        }
        i3Var.c0(new com.tencent.mm.plugin.appbrand.page.l3(i3Var, w2Var, "scene_swipe_back", null));
    }
}
