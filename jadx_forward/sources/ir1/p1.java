package ir1;

/* loaded from: classes11.dex */
public final class p1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f375565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f375566e;

    public p1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.ref.WeakReference weakReference) {
        this.f375565d = c0Var;
        this.f375566e = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansSettingUI", "cgiGetBizFansSetting callback " + i17 + ", " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f375565d;
        if (c0Var.f391645d) {
            return 0;
        }
        boolean z17 = true;
        c0Var.f391645d = true;
        java.lang.ref.WeakReference weakReference = this.f375566e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1) weakReference.get();
            if (activityC12973x51f8d2d1 != null) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1.f175490v;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                }
                if (z17) {
                    str = activityC12973x51f8d2d1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.amc);
                }
                java.lang.String str2 = str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                db5.e1.A(activityC12973x51f8d2d1, "", str2, activityC12973x51f8d2d1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572077y3), activityC12973x51f8d2d1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ir1.b2(activityC12973x51f8d2d1), new ir1.c2(activityC12973x51f8d2d1));
            }
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152244b.f152233a;
        if (!(fVar instanceof r45.wn3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizFans.BizFansSettingUI", "not my resp");
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSettingResp");
        r45.wn3 wn3Var = (r45.wn3) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1) weakReference.get();
        if (activityC12973x51f8d2d12 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(activityC12973x51f8d2d12.f175502r, null, 1, null);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = activityC12973x51f8d2d12.m79336x8b97809d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).m("biz_fans_msg_loading_pref", true);
            java.util.LinkedList<r45.k36> list = wn3Var.f470843d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
            for (r45.k36 k36Var : list) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "filter_spam_fansmsg")) {
                    activityC12973x51f8d2d12.f175492e = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "0");
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "close_notice_fansmsg")) {
                    activityC12973x51f8d2d12.f175493f = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "0");
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "private_msg_scope")) {
                    java.lang.String value = k36Var.f459875e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                    activityC12973x51f8d2d12.d7(java.lang.Integer.parseInt(value));
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "is_one_msg_before_reply")) {
                    activityC12973x51f8d2d12.f175495h = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "1");
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC12973x51f8d2d12.f175497m).mo141623x754a37bb()).O(activityC12973x51f8d2d12.f175492e);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC12973x51f8d2d12.f175498n).mo141623x754a37bb()).O(activityC12973x51f8d2d12.f175493f);
            activityC12973x51f8d2d12.X6().O(activityC12973x51f8d2d12.f175495h);
        }
        return 0;
    }
}
