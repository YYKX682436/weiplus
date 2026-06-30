package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class r5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f198163b;

    public r5(int i17, r45.xn1 xn1Var) {
        this.f198162a = i17;
        this.f198163b = xn1Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("list_order", this.f198162a);
            r45.xn1 xn1Var = this.f198163b;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            jSONObject.put("user_useranme", c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null);
            jSONObject.put("user_identity", xn1Var.m75939xb282bd08(7));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
