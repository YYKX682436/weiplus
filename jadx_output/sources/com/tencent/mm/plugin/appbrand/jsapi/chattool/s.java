package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80449d;

    public s(com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar) {
        this.f80449d = tVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        cl0.e eVar;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String value = iPCString.f68406d;
        kotlin.jvm.internal.o.f(value, "value");
        if (value.length() > 0) {
            try {
                eVar = new cl0.e(iPCString.f68406d);
            } catch (cl0.f unused) {
                eVar = null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = this.f80449d;
            if (eVar == null || eVar.length() == 0) {
                tVar.b();
                return;
            }
            int length = eVar.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = eVar.optString(i17);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(new j91.a(optString, null, null, 0, 14, null));
                    }
                }
            }
            tVar.m(arrayList);
            tVar.k(new com.tencent.mm.plugin.appbrand.jsapi.chattool.r(tVar));
        }
    }
}
