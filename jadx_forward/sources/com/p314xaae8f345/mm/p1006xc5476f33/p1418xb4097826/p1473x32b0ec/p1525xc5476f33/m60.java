package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class m60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f195000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.t f195001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, cm2.t tVar) {
        super(0);
        this.f195000d = r60Var;
        this.f195001e = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f195000d;
        so2.j5 j5Var = ((mm2.f6) r60Var.P0(mm2.f6.class)).f410582w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        cm2.t tVar2 = this.f195001e;
        boolean z17 = tVar2 instanceof cm2.t;
        cm2.t tVar3 = z17 ? tVar2 : null;
        if (tVar3 != null) {
            cm2.t tVar4 = z17 ? tVar2 : null;
            boolean z18 = false;
            if (tVar4 != null) {
                tVar4.f124922h = 0;
            }
            if (tVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.t1(r60Var, tVar2);
            } else if (tVar.f124918d == tVar3.f124918d) {
                long j17 = ((mm2.f6) r60Var.P0(mm2.f6.class)).L;
                so2.j5 j5Var2 = ((mm2.f6) r60Var.P0(mm2.f6.class)).f410582w;
                cm2.t tVar5 = j5Var2 instanceof cm2.t ? (cm2.t) j5Var2 : null;
                java.lang.String str = tVar5 != null ? tVar5.f124929r : null;
                long j18 = tVar3.f124918d;
                java.lang.String str2 = r60Var.f195631s;
                if (j17 == j18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar3.f124929r, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "promoteIdHideByVisitor = " + j17 + ", newPromoteInfo.mPromoteId = " + tVar3.f124918d + ", only update data");
                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar3);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updatePromoteData curPromoteItem:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = r60Var.f195633u;
                    sb6.append(ep0Var != null ? ep0Var.hashCode() : 0);
                    sb6.append(", promoteData = ");
                    sb6.append(tVar2.f124918d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showBubble: reportExtBuff:");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = tVar2.f124930s;
                    sb7.append(gVar != null ? new java.lang.String(gVar.g(), r26.c.f450398a) : "");
                    sb7.append(", businessExtBuff:");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = tVar2.f124931t;
                    sb7.append(gVar2 != null ? new java.lang.String(gVar2.g(), r26.c.f450398a) : "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", sb7.toString());
                    r60Var.E1(tVar2);
                    r60Var.x1(tVar2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2 = r60Var.f195633u;
                    if (ep0Var2 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 C1 = r60Var.C1(tVar2);
                        if (C1 != null) {
                            C1.l(tVar2);
                            r60Var.F1(null);
                            r60Var.y1(C1);
                            android.view.ViewGroup viewGroup = r60Var.f195635w;
                            if (viewGroup == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                                throw null;
                            }
                            viewGroup.removeAllViews();
                            r60Var.v1(null, C1);
                        }
                        r60Var.f195633u = C1;
                        z18 = true;
                    } else {
                        ep0Var2.f0(tVar2);
                        r60Var.F1(null);
                    }
                    ((mm2.f6) r60Var.P0(mm2.f6.class)).L = 0L;
                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar2);
                    df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
                    if (pvVar != null) {
                        pvVar.d7(r60Var);
                    }
                    r60Var.G1();
                    if (z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
                    }
                    pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q60(r60Var));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.t1(r60Var, tVar2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.u1(r60Var);
        }
        return jz5.f0.f384359a;
    }
}
