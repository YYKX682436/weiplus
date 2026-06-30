package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f263007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f263008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su4.j1 f263009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 f263010h;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var, int i17, java.lang.Object obj, java.lang.Object obj2, su4.j1 j1Var) {
        this.f263010h = d2Var;
        this.f263006d = i17;
        this.f263007e = obj;
        this.f263008f = obj2;
        this.f263009g = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f263006d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f263007e;
        java.lang.Object obj2 = this.f263008f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PGetController", "step_cgiEnd type:%s reqTag:%s cgiResult:%s", valueOf, obj, obj2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var = this.f263010h;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).get(obj);
        if (d2Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.PGetController", "step_cgiEnd weird null");
            return;
        }
        d2Var2.f494389e = obj2;
        d2Var2.f494387c = true;
        if (d2Var2.f494386b) {
            su4.j1 j1Var = this.f263009g;
            if (j1Var != null) {
                j1Var.a(d2Var2);
            }
            ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).remove(obj);
        }
    }
}
