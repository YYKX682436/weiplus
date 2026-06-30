package ir1;

/* loaded from: classes11.dex */
public final class z1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f375611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 f375612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f375613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375614g;

    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f375611d = c0Var;
        this.f375612e = activityC12973x51f8d2d1;
        this.f375613f = weakReference;
        this.f375614g = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        int i19;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansSettingUI", "setTimelineSetting callback " + i17 + ", " + i18 + ", " + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f375611d;
        if (c0Var.f391645d) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1 = this.f375612e;
        activityC12973x51f8d2d1.f175504t = false;
        java.lang.ref.WeakReference weakReference = this.f375613f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1) weakReference.get();
        if (activityC12973x51f8d2d12 != null && (u3Var = activityC12973x51f8d2d12.f175505u) != null) {
            u3Var.dismiss();
            activityC12973x51f8d2d12.f175505u = null;
        }
        boolean z18 = true;
        c0Var.f391645d = true;
        if (!(rr6.f152244b.f152233a instanceof r45.t26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizFans.BizFansSettingUI", "not my resp");
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            rk.e wi6 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            boolean a76 = activityC12973x51f8d2d1.a7();
            int i27 = activityC12973x51f8d2d1.f175491d;
            ((gr1.h) wi6).getClass();
            if (i27 == 5) {
                tk.s[] sVarArr = tk.s.f501403d;
                i19 = 2;
            } else {
                tk.s[] sVarArr2 = tk.s.f501403d;
                i19 = 1;
            }
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(i19).f(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY, a76);
            if (activityC12973x51f8d2d1.f175493f != activityC12973x51f8d2d1.a7()) {
                activityC12973x51f8d2d1.f175496i = true;
            }
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1) weakReference.get();
        if (activityC12973x51f8d2d13 != null) {
            java.lang.String str2 = this.f375614g;
            if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str2, false)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC12973x51f8d2d13.f175497m).mo141623x754a37bb()).S(!activityC12973x51f8d2d13.Z6());
            } else if (r26.i0.n("biz_fans_remind_pref", str2, false)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC12973x51f8d2d13.f175498n).mo141623x754a37bb()).S(!activityC12973x51f8d2d13.a7());
            } else if (r26.i0.n("biz_fans_receive_on_msg_limited_pref", str2, false)) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe X6 = activityC12973x51f8d2d13.X6();
                java.util.LinkedList list = activityC12973x51f8d2d13.Y6().f466981e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    r45.k36 k36Var = (r45.k36) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "is_one_msg_before_reply")) {
                        z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "0");
                        break;
                    }
                }
                X6.S(!z17);
            }
            if (str != null && !r26.n0.N(str)) {
                z18 = false;
            }
            java.lang.String string = z18 ? activityC12973x51f8d2d13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572288an5) : str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.e1.A(activityC12973x51f8d2d13, "", string, activityC12973x51f8d2d13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572077y3), activityC12973x51f8d2d13.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ir1.h2(activityC12973x51f8d2d13, str2), new ir1.i2(activityC12973x51f8d2d13));
        }
        return 0;
    }
}
