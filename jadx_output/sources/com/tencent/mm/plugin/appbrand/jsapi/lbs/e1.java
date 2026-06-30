package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class e1 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81409d;

    public e1(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var) {
        this.f81409d = j1Var;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 == 0) {
            this.f81409d.f81434g.j(i17, str, aVar);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.lbs.d dVar = this.f81409d.f81435h;
        dVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        hashMap.put("errStr", str);
        synchronized (dVar) {
            dVar.p(dVar.f81398i);
            dVar.t(hashMap);
            dVar.m();
        }
    }
}
