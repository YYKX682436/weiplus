package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class j0 implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.k0 f82739a;

    public j0(com.tencent.mm.plugin.appbrand.jsapi.picker.k0 k0Var) {
        this.f82739a = k0Var;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.appbrand.jsapi.picker.k0 k0Var = this.f82739a;
        tl1.b bVar = k0Var.f420200d;
        if (bVar != null) {
            bVar.h();
        }
        if (!z17) {
            k0Var.d("fail cancel", null);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                k0Var.d("fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("value", str);
            k0Var.d("ok", hashMap);
        }
    }
}
