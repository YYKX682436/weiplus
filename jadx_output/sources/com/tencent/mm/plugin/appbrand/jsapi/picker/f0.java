package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl1.b f82729d;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.picker.h0 h0Var, tl1.b bVar) {
        this.f82729d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl1.b bVar = this.f82729d;
        if (bVar.getPicker() == null || !(bVar.getPicker() instanceof android.view.View)) {
            return;
        }
        ((android.view.View) bVar.getPicker()).requestLayout();
    }
}
