package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vb f90192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90193e;

    public s(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, r45.vb vbVar) {
        this.f90193e = appBrandAuthorizeUI;
        this.f90192d = vbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f90193e;
        appBrandAuthorizeUI.r7(appBrandAuthorizeUI.f89311q, this.f90192d);
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
    }
}
