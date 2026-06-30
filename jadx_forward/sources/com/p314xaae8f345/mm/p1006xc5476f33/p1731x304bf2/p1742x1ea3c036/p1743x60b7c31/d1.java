package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g1 f221147g;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g1 g1Var, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221147g = g1Var;
        this.f221144d = str;
        this.f221145e = i17;
        this.f221146f = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g1 g1Var = this.f221147g;
        java.lang.String str = this.f221144d;
        int i17 = this.f221145e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221146f;
        org.json.JSONObject f17 = g1Var.f(str);
        if (i17 != 0) {
            if (i17 == 1) {
                q5Var.a(null, f17);
                return;
            }
        } else if (f17 != null) {
            q5Var.a(null, f17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e1(g1Var, str, q5Var);
        g1Var.f221178e = e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.add(new java.lang.ref.WeakReference(e1Var));
        ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.f1(g1Var, q5Var), 60000L, "MicroMsg.JsApiGetWepkgFileList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
        am.t20 t20Var = c6276xb08681d3.f136525g;
        t20Var.f89502a = 8;
        t20Var.f89508g = 0;
        t20Var.f89509h = arrayList;
        c6276xb08681d3.e();
    }
}
