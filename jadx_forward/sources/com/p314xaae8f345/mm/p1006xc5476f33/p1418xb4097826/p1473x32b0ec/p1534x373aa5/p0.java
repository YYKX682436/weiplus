package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class p0 extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ea2 f198105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198106b;

    public p0(r45.ea2 ea2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590) {
        this.f198105a = ea2Var;
        this.f198106b = c14298xca26f590;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) this.f198105a.m75936x14adae67(2);
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f198106b;
            if (z17) {
                ml2.x1 x1Var = ml2.x1.f409750x;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590.f197313x;
                c14298xca26f590.c(c19792x256d2725, x1Var, null);
                c14298xca26f590.c(c19792x256d2725, ml2.x1.f409735f, null);
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exp_time", j19);
            ml2.x1 x1Var2 = ml2.x1.f409751y;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590.f197313x;
            c14298xca26f590.c(c19792x256d2725, x1Var2, jSONObject);
        }
    }
}
