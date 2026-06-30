package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f194038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        super(1);
        this.f194038d = r60Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        cm2.t item = (cm2.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f194038d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "[onBubbleContentClick] itemId = " + item.f124918d);
        if (r60Var.G.contains(item.getClass()) && (r2Var = r60Var.C) != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        df2.nt ntVar = (df2.nt) r60Var.U0(df2.nt.class);
        if (ntVar != null) {
            r45.yp5 yp5Var = new r45.yp5();
            yp5Var.set(0, java.lang.Long.valueOf(item.f124918d));
            yp5Var.set(2, 1);
            yp5Var.set(1, 2);
            yp5Var.set(3, item.f124930s);
            ntVar.a7(yp5Var);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = item.f124930s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", "[reportClick] reportExtBuff:".concat(gVar != null ? new java.lang.String(gVar.g(), r26.c.f450398a) : ""));
        return jz5.f0.f384359a;
    }
}
