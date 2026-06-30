package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f262972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f262973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 f262974f;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var, int i17, java.lang.Object obj) {
        this.f262974f = d2Var;
        this.f262972d = i17;
        this.f262973e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f262972d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f262973e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PGetController", "step_doCgiReq type:%s, reqTag:%s", valueOf, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var = this.f262974f;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).get(obj);
        if (d2Var2 == null) {
            d2Var2 = new su4.d2();
            ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).put(obj, d2Var2);
        }
        d2Var2.f494385a = true;
    }
}
