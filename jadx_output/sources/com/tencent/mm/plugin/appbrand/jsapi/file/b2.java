package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.c2 f81047g;

    public b2(com.tencent.mm.plugin.appbrand.jsapi.file.c2 c2Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81047g = c2Var;
        this.f81044d = lVar;
        this.f81045e = jSONObject;
        this.f81046f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81044d;
        if (lVar.isRunning()) {
            com.tencent.mm.plugin.appbrand.jsapi.j0 C = com.tencent.mm.plugin.appbrand.jsapi.file.c2.C(lVar, this.f81045e);
            com.tencent.mm.plugin.appbrand.jsapi.file.c2 c2Var = this.f81047g;
            int i17 = this.f81046f;
            java.util.Map map = C.f81319a;
            jc1.d dVar = C.f81321c;
            if (dVar != null) {
                lVar.a(i17, c2Var.q(null, dVar, map));
            } else {
                lVar.a(i17, c2Var.p(C.f81320b, map));
            }
        }
    }
}
