package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class x4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI f90326d;

    public x4(com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI) {
        this.f90326d = appBrandGuideUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f90326d.finish();
    }
}
