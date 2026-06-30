package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public final class s3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f171731e;

    public s3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI, android.widget.EditText editText) {
        this.f171730d = appBrandDebugUI;
        this.f171731e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171730d;
            int parseInt = java.lang.Integer.parseInt(this.f171731e.getText().toString());
            appBrandDebugUI.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            a17.putInt("AppBrandPreloadDowngradeSwitcher.MMKV_HARD_CODE_LEVEL_TAG", parseInt);
        } catch (java.lang.NumberFormatException unused) {
        }
    }
}
