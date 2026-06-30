package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sy implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.n52 f201383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f201384c;

    public sy(android.content.Context context, r45.n52 n52Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar) {
        this.f201382a = context;
        this.f201383b = n52Var;
        this.f201384c = dzVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp
    public void a(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errType, "errType");
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context2 = this.f201382a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "$context");
        r4Var.h3(context2, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "sendGiftCallback, success:" + z17 + " errCode:" + i17 + " errType:" + errType + " balance:" + l17);
        r45.n52 n52Var = this.f201383b;
        java.lang.String str4 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar = this.f201384c;
        if (!z17) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Sj(26, n52Var.m75939xb282bd08(1), "errCode:" + i17 + " errType:" + errType + " errMsg:" + str3, null);
            dzVar.f199714t = 0L;
            int ordinal = errType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xy(str3, dzVar));
                    return;
                } else {
                    if (i17 != 10000) {
                        if (i17 != 10003) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xy(null, dzVar));
                            return;
                        } else {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bz(dzVar));
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 25, n52Var.m75939xb282bd08(1), null, null, 8, null);
        if (l17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dzVar.f199713s;
            if (lVar != null) {
                qo0.b bVar = qo0.b.Y1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN", l17.longValue());
                lVar.M0(bVar, bundle);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = dzVar.f199713s;
            if (lVar2 != null) {
                lVar2.M0(qo0.b.Y1, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ry ryVar = dzVar.f199709o;
        if (ryVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wz wzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wz) ryVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = wzVar.f201783a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
            if (y1Var != null) {
                y1Var.q();
            }
            if (!wzVar.f201784b) {
                wzVar.f201785c.run();
                return;
            }
            android.widget.TextView textView = m10Var.f200538g;
            android.content.Context context3 = textView != null ? textView.getContext() : null;
            android.widget.TextView textView2 = m10Var.f200538g;
            if (textView2 != null && (context = textView2.getContext()) != null) {
                str4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.czq);
            }
            db5.t7.h(context3, str4);
        }
    }
}
