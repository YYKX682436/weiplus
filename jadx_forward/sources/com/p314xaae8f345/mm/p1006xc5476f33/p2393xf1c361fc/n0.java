package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f263105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f263106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 f263107f;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.f0 f0Var) {
        this.f263107f = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(this.f263105d);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 Ai = ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Ai(jSONArray.getString(i17));
                t90.e eVar = (t90.e) i95.n0.c(t90.e.class);
                gm0.j1.i();
                java.lang.String d17 = gm0.j1.u().d();
                ((s90.e) eVar).getClass();
                b21.r c17 = b21.u.c(d17, Ai, 9, null);
                if (c17 != null) {
                    arrayList.add(c17);
                }
            }
            boolean z17 = this.f263106e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var = this.f263107f;
            if (!z17 || (list = q0Var.f263132o) == null) {
                q0Var.f263132o = arrayList;
            } else {
                list.addAll(arrayList);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
