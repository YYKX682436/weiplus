package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class q implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.s f82753a;

    public q(com.tencent.mm.plugin.appbrand.jsapi.picker.s sVar) {
        this.f82753a = sVar;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        com.tencent.mm.plugin.appbrand.jsapi.picker.s sVar = this.f82753a;
        sVar.f420200d.h();
        if (!z17) {
            sVar.d("fail cancel", null);
            return;
        }
        if (iArr == null || iArr.length <= 0) {
            sVar.d("fail error result", null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 : iArr) {
            jSONArray.put(i17);
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("current", jSONArray);
        sVar.d("ok", hashMap);
    }
}
