package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes9.dex */
public final class q3 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f176029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f176030e;

    public q3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.ref.WeakReference weakReference) {
        this.f176029d = c0Var;
        this.f176030e = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "getTimelineSetting callback " + i17 + ", " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f176029d;
        if (c0Var.f391645d) {
            return 0;
        }
        boolean z18 = true;
        c0Var.f391645d = true;
        java.lang.ref.WeakReference weakReference = this.f176030e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0) weakReference.get();
            if (activityC13008x3fe6d8d0 != null) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0.f175618p;
                if (str != null && !r26.n0.N(str)) {
                    z18 = false;
                }
                if (z18) {
                    str = activityC13008x3fe6d8d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.amc);
                }
                java.lang.String str2 = str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                db5.e1.A(activityC13008x3fe6d8d0, "", str2, activityC13008x3fe6d8d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572077y3), activityC13008x3fe6d8d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.x3(activityC13008x3fe6d8d0), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.y3(activityC13008x3fe6d8d0));
            }
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152244b.f152233a;
        if (!(fVar instanceof r45.ip3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineSettingUI", "not my resp");
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTimelineSettingResp");
        r45.ip3 ip3Var = (r45.ip3) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d02 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0) weakReference.get();
        if (activityC13008x3fe6d8d02 != null) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0.f175618p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "initData personalized_recommend_setting=" + ip3Var.f458782d);
            p3325xe03a0797.p3326xc267989b.p2.a(activityC13008x3fe6d8d02.f175625m, null, 1, null);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = activityC13008x3fe6d8d02.m79336x8b97809d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).m("biz_msg_rec_loading_pref", true);
            activityC13008x3fe6d8d02.W6().O(ip3Var.f458782d);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC13008x3fe6d8d02.f175620e).mo141623x754a37bb()).O(ip3Var.f458787i == 1);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC13008x3fe6d8d02.f175621f).mo141623x754a37bb()).O(ip3Var.f458784f);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            r45.dn c17 = eVar.c();
            if ((c17 != null ? c17.f454120n : 0) == 1) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d2 = activityC13008x3fe6d8d02.m79336x8b97809d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d2);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d2).m("biz_msg_read_dot_switch", false);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d3 = activityC13008x3fe6d8d02.m79336x8b97809d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d3);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d3).m("biz_msg_my_my_biz_setting_title", false);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC13008x3fe6d8d02.f175622g).mo141623x754a37bb();
                boolean z19 = ip3Var.f458786h == 1;
                eVar.f(z19);
                c21541x1c1b08fe.O(z19);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d4 = activityC13008x3fe6d8d02.m79336x8b97809d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d4);
            r45.jm6 d17 = eVar.d();
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting settingInfo is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting timelineSettingControlBit=%d", java.lang.Integer.valueOf(d17.f459488d));
                int i28 = d17.f459488d;
                for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270812c).mo141623x754a37bb()) {
                    if ((num.intValue() & i28) != 0) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d4).m("biz_msg_rec_pref", !z17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d5 = activityC13008x3fe6d8d02.m79336x8b97809d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d5);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d5).m("biz_msg_pay_for_head_pref", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d6 = activityC13008x3fe6d8d02.m79336x8b97809d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d6);
            r45.jm6 d18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a.d();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d6).m("biz_msg_finder_rec_pref", !(((d18 != null ? d18.f459488d : 0) & 8) != 0));
        }
        return 0;
    }
}
