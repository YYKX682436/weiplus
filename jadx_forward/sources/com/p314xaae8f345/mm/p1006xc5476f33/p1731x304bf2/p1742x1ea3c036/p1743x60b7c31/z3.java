package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class z3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a4 f221318d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a4 a4Var) {
        this.f221318d = a4Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean(ya.b.f77504xbb80cbe3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a4 a4Var = this.f221318d;
        if (z17) {
            try {
                a4Var.f221122e.e(new org.json.JSONObject(bundle.getString("ret")));
            } catch (org.json.JSONException unused) {
            }
        } else {
            a4Var.f221122e.c(bundle.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb), null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.h(this);
    }
}
