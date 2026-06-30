package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ud extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f205798a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                so2.q2 q2Var = obj instanceof so2.q2 ? (so2.q2) obj : null;
                if (q2Var != null) {
                    java.util.HashSet hashSet = this.f205798a;
                    if (!hashSet.contains(java.lang.Long.valueOf(q2Var.m2()))) {
                        hashSet.add(java.lang.Long.valueOf(q2Var.m2()));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("object_id", pm0.v.u(q2Var.m2()));
                        jSONObject.put("page_type", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
                        if (q2Var.q2()) {
                            jSONObject.put("object_type", 1);
                        } else {
                            jSONObject.put("object_type", 2);
                        }
                        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                        ml2.o3[] o3VarArr = ml2.o3.f409306d;
                        java.lang.String jSONObject2 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
                    }
                }
            }
        }
    }
}
