package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ub implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnLayoutChangeListener f87145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.vb f87146e;

    public ub(com.tencent.mm.plugin.appbrand.page.vb vbVar, android.view.View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f87146e = vbVar;
        this.f87145d = onLayoutChangeListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87146e.f87181d.f86539a.getPageArea().removeOnLayoutChangeListener(this.f87145d);
    }
}
