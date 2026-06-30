package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class s3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f90198e;

    public s3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI, android.widget.EditText editText) {
        this.f90197d = appBrandDebugUI;
        this.f90198e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f90197d;
            int parseInt = java.lang.Integer.parseInt(this.f90198e.getText().toString());
            appBrandDebugUI.getClass();
            com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
            kotlin.jvm.internal.o.d(a17);
            a17.putInt("AppBrandPreloadDowngradeSwitcher.MMKV_HARD_CODE_LEVEL_TAG", parseInt);
        } catch (java.lang.NumberFormatException unused) {
        }
    }
}
