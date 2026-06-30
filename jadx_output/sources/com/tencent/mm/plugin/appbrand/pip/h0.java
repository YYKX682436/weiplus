package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f87468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.i0 f87469e;

    public h0(com.tencent.mm.plugin.appbrand.pip.i0 i0Var, android.graphics.Point point) {
        this.f87469e = i0Var;
        this.f87468d = point;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f87469e.f87497a.f87523f;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.setStablePos(this.f87468d);
        }
    }
}
