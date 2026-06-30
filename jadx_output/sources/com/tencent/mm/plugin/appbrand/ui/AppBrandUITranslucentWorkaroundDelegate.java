package com.tencent.mm.plugin.appbrand.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class AppBrandUITranslucentWorkaroundDelegate implements androidx.lifecycle.x, db5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89444d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89445e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f89446f = false;

    public AppBrandUITranslucentWorkaroundDelegate(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        this.f89444d = appBrandUI;
    }

    @Override // db5.c
    public void k2() {
        this.f89445e = true;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onActivityResumed() {
        if (this.f89446f) {
            db5.f.b(this.f89444d);
            this.f89446f = false;
        }
    }

    @Override // db5.c
    public void q4() {
        this.f89445e = false;
    }
}
