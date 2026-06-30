package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class y4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI f90346d;

    public y4(com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI) {
        this.f90346d = appBrandGuideUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jx3.f.INSTANCE.d(14750, 2, "");
        this.f90346d.finish();
    }
}
