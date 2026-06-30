package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vb f90214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90215e;

    public t(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, r45.vb vbVar) {
        this.f90215e = appBrandAuthorizeUI;
        this.f90214d = vbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f90215e;
        appBrandAuthorizeUI.s7(appBrandAuthorizeUI.f89312r, this.f90214d);
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
    }
}
