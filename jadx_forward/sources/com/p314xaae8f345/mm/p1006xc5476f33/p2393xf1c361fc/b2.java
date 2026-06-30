package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f262998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f262999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f263000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ su4.j1 f263002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 f263003i;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var, int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Runnable runnable, su4.j1 j1Var) {
        this.f263003i = d2Var;
        this.f262998d = i17;
        this.f262999e = obj;
        this.f263000f = obj2;
        this.f263001g = runnable;
        this.f263002h = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f262998d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f262999e;
        java.lang.Object obj2 = this.f263000f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PGetController", "step_getJsApi type:%s, reqTag:%s, jsParams:%s", valueOf, obj, obj2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2 d2Var = this.f263003i;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).get(obj);
        if (d2Var2 == null) {
            d2Var2 = new su4.d2();
            ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).put(obj, d2Var2);
        }
        d2Var2.f494386b = true;
        if (d2Var2.f494388d != null) {
            d2Var2.f494390f = obj2;
        } else {
            d2Var2.f494388d = obj2;
        }
        if (!d2Var2.f494385a) {
            this.f263001g.run();
            d2Var.c(i17, obj);
        } else if (d2Var2.f494387c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PGetController", "step_getJsApi preget hit type:%s, reqTag:%s, jsParams:%s", java.lang.Integer.valueOf(i17), obj, obj2);
            su4.j1 j1Var = this.f263002h;
            if (j1Var != null) {
                j1Var.a(d2Var2);
            }
            ((java.util.Map) ((java.util.ArrayList) d2Var.f263027b).get(i17)).remove(obj);
        }
    }
}
