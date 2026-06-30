package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class c implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.e f82713a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.picker.e eVar) {
        this.f82713a = eVar;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.appbrand.jsapi.picker.e eVar = this.f82713a;
        if (eVar.f420200d == null) {
            return;
        }
        if (!z17) {
            eVar.d("fail cancel", null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            eVar.d("fail", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("value", str);
            eVar.d("ok", hashMap);
        }
        eVar.f420200d.d(true);
    }
}
