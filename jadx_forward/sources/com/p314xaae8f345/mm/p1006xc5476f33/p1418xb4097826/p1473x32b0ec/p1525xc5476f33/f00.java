package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 f194010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var) {
        super(1);
        this.f194010d = w00Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk2.x4 x4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar;
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToFinderLive from:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = this.f194010d;
        sb6.append(((mm2.c1) w00Var.P0(mm2.c1.class)).f410385o);
        sb6.append(" to:");
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = w00Var.f196376q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (x4Var = nVar.f390688g) != null) {
            if (x4Var.B == null) {
                x4Var.B = new r45.ta4();
            }
            r45.ta4 ta4Var = x4Var.B;
            if (ta4Var != null) {
                km2.q l76 = ((mm2.o4) w00Var.P0(mm2.o4.class)).l7();
                if (l76 == null || (str = l76.f390705c) == null) {
                    str = "";
                }
                ta4Var.set(9, str);
            }
            if (w00Var.R && (apVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap) w00Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.class)) != null) {
                java.lang.String sdkUserId = w00Var.I;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
                java.lang.String E1 = apVar.E1(sdkUserId, ((mm2.y2) apVar.P0(mm2.y2.class)).f411093m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "getShowingBulletLiveMsgByUserId key:" + E1);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) apVar.F.get(E1);
                r45.ch1 ch1Var = (viewGroup == null || (tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) apVar.A.get(viewGroup)) == null || !tnVar.f195970d.get()) ? null : tnVar.f195986t;
                if (ch1Var != null) {
                    r45.ta4 ta4Var2 = x4Var.B;
                    if (ta4Var2 != null) {
                        ta4Var2.set(16, hc2.b.a(ch1Var));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "goToFinderLive replayGift:" + ch1Var.hashCode());
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str4 = a52.a.f83117l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getCurCommentscene(...)");
            y4Var.getClass();
            y4Var.f409819a = str4;
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.view.ViewGroup viewGroup2 = w00Var.f446856d;
            android.content.Context context = viewGroup2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str5 = str2 == null ? "" : str2;
            android.content.Context context2 = viewGroup2.getContext();
            ((vd2.f1) e0Var).Bi(context, null, str5, context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null, x4Var, null);
        }
        return jz5.f0.f384359a;
    }
}
