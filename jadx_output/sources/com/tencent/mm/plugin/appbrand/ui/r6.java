package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class r6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f89980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI f89981f;

    public r6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, java.lang.String str, android.view.View view) {
        this.f89981f = appBrandProcessShareMessageProxyUI;
        this.f89979d = str;
        this.f89980e = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f89979d, this.f89980e);
        this.f89981f.finish();
    }
}
