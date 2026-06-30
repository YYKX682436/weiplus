package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class g0 implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl1.b f82733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 f82734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.h0 f82735c;

    public g0(com.tencent.mm.plugin.appbrand.jsapi.picker.h0 h0Var, tl1.b bVar, com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 appBrandOptionsPickerV3) {
        this.f82735c = h0Var;
        this.f82733a = bVar;
        this.f82734b = appBrandOptionsPickerV3;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        this.f82733a.d(true);
        com.tencent.mm.plugin.appbrand.jsapi.picker.h0 h0Var = this.f82735c;
        if (!z17) {
            h0Var.d("fail cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = this.f82734b;
        appBrandOptionsPickerV3.f91808e.e();
        hashMap.put("value", appBrandOptionsPickerV3.f91807d[appBrandOptionsPickerV3.f91810g]);
        appBrandOptionsPickerV3.f91808e.e();
        hashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(appBrandOptionsPickerV3.f91810g));
        h0Var.d("ok", hashMap);
    }
}
