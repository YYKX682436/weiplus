package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f88781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.t f88782e;

    public s(com.tencent.mm.plugin.appbrand.service.t tVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f88782e = tVar;
        this.f88781d = magicBrushView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.service.t tVar = this.f88782e;
        hh.g gVar = tVar.f88784e;
        gVar.getClass();
        com.tencent.magicbrush.ui.MagicBrushView view = this.f88781d;
        kotlin.jvm.internal.o.g(view, "view");
        gVar.f281441a.remove(view);
        tVar.f88783d.removeView(view);
    }
}
