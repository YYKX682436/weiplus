package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "handleDeviceInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("input data is invalidate", null);
            return;
        }
        java.lang.String optString = e17.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("handleDeviceInfo", "handleDeviceInfo action=%s", optString);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(be1.x0.f4239x24728b, optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("handleDeviceInfo", be1.x0.f4239x24728b);
            double optDouble = e17.optDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, -1.0d);
            if (optDouble < 0.0d || optDouble > 1.0d) {
                q5Var.a("volume should in 0.0-1.0", null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.i1(context, optDouble, this, q5Var));
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(be1.j0.f4221x24728b, optString)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.h1(context, q5Var, this));
        }
        q5Var.a(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
