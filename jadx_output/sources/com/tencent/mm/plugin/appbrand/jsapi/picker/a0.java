package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl1.j f82710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.b0 f82711f;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.picker.b0 b0Var, int i17, tl1.j jVar) {
        this.f82711f = b0Var;
        this.f82709d = i17;
        this.f82710e = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.picker.b0 b0Var = this.f82711f;
        tl1.b b17 = b0Var.b(false);
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 appBrandMultiOptionsPickerV2 = (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2) ((b17 == null || !com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2.class.isInstance(b17.getPicker())) ? null : b17.getPicker());
        if (appBrandMultiOptionsPickerV2 == null) {
            b0Var.d("fail picker not exists", null);
        } else {
            appBrandMultiOptionsPickerV2.d(this.f82709d, this.f82710e);
            b0Var.d("ok", null);
        }
    }
}
