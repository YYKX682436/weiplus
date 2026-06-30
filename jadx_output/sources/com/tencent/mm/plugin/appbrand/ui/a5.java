package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class a5 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI f89502d;

    public a5(com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI) {
        this.f89502d = appBrandGuideUI;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return false;
        }
        if (1 == keyEvent.getAction()) {
            jx3.f.INSTANCE.d(14750, 4, "");
            this.f89502d.finish();
        }
        return true;
    }
}
