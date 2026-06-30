package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class w implements tl1.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.x f82759a;

    public w(com.tencent.mm.plugin.appbrand.jsapi.picker.x xVar) {
        this.f82759a = xVar;
    }

    @Override // tl1.u
    public void a(java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        int i17 = iArr[0];
        int i18 = iArr[1];
        com.tencent.mm.plugin.appbrand.jsapi.picker.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.picker.n(null);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errMsg", "ok");
        hashMap.put("column", java.lang.Integer.valueOf(i17));
        hashMap.put("current", java.lang.Integer.valueOf(i18));
        nVar.t(hashMap);
        java.lang.ref.WeakReference weakReference = this.f82759a.f82742f;
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = weakReference != null ? (com.tencent.mm.plugin.appbrand.jsapi.t) weakReference.get() : null;
        if (tVar == null) {
            return;
        }
        nVar.p(tVar);
        nVar.m();
    }
}
