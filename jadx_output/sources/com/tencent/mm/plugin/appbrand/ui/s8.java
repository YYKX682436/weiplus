package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f90206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation.AnimationListener f90207f;

    public s8(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, int i17, android.view.animation.Animation.AnimationListener animationListener) {
        this.f90205d = appBrandRuntime;
        this.f90206e = i17;
        this.f90207f = animationListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.u8.a(this.f90205d, this.f90206e, this.f90207f);
    }
}
