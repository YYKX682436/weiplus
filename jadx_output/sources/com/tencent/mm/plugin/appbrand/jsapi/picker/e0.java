package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f82726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.h0 f82728f;

    public e0(com.tencent.mm.plugin.appbrand.jsapi.picker.h0 h0Var, java.lang.String[] strArr, int i17) {
        this.f82728f = h0Var;
        this.f82726d = strArr;
        this.f82727e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.picker.h0 h0Var = this.f82728f;
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) h0Var.c(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3.class);
        if (appBrandOptionsPickerV3 == null) {
            h0Var.d("fail cant init view", null);
            return;
        }
        tl1.b bVar = h0Var.f420200d;
        bVar.post(new com.tencent.mm.plugin.appbrand.jsapi.picker.f0(h0Var, bVar));
        appBrandOptionsPickerV3.f91811h = this.f82727e;
        appBrandOptionsPickerV3.b();
        java.lang.String[] strArr = this.f82726d;
        appBrandOptionsPickerV3.f91807d = strArr;
        appBrandOptionsPickerV3.f91808e.f(java.util.Arrays.asList(strArr));
        bVar.setOnResultListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.g0(h0Var, bVar, appBrandOptionsPickerV3));
        bVar.setHeader(h0Var.f82744h);
        bVar.i();
    }
}
