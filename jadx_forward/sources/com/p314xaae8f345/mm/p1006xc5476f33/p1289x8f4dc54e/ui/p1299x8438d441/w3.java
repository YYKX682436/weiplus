package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes9.dex */
public final class w3 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f176066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 f176067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f176068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176069g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.x26 f176070h;

    public w3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d0, java.lang.ref.WeakReference weakReference, java.lang.String str, r45.x26 x26Var) {
        this.f176066d = c0Var;
        this.f176067e = activityC13008x3fe6d8d0;
        this.f176068f = weakReference;
        this.f176069g = str;
        this.f176070h = x26Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting callback " + i17 + ", " + i18 + ", " + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f176066d;
        if (c0Var.f391645d) {
            return 0;
        }
        this.f176067e.f175626n = false;
        java.lang.ref.WeakReference weakReference = this.f176068f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0) weakReference.get();
        if (activityC13008x3fe6d8d0 != null && (u3Var = activityC13008x3fe6d8d0.f175627o) != null) {
            u3Var.dismiss();
            activityC13008x3fe6d8d0.f175627o = null;
        }
        c0Var.f391645d = true;
        if (!(rr6.f152244b.f152233a instanceof r45.y26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineSettingUI", "not my resp");
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a.f(this.f176070h.f471236g == 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5202x7bbacb65 c5202x7bbacb65 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5202x7bbacb65();
            c5202x7bbacb65.f135543g.getClass();
            c5202x7bbacb65.b(android.os.Looper.getMainLooper());
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d02 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0) weakReference.get();
        if (activityC13008x3fe6d8d02 != null) {
            java.lang.String str2 = this.f176069g;
            boolean n17 = r26.i0.n("biz_msg_rec_pref", str2, false);
            r45.x26 x26Var = activityC13008x3fe6d8d02.f175623h;
            if (n17) {
                activityC13008x3fe6d8d02.W6().S(!x26Var.f471233d);
            } else if (r26.i0.n("biz_msg_pay_for_head_pref", str2, false)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC13008x3fe6d8d02.f175621f).mo141623x754a37bb()).S(!x26Var.f471234e);
            } else if (r26.i0.n("biz_msg_finder_rec_pref", str2, false)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) activityC13008x3fe6d8d02.f175620e).mo141623x754a37bb()).S(x26Var.f471237h != 1);
            }
            if (str != null && !r26.n0.N(str)) {
                r9 = false;
            }
            java.lang.String string = r9 ? activityC13008x3fe6d8d02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572288an5) : str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.e1.A(activityC13008x3fe6d8d02, "", string, activityC13008x3fe6d8d02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572077y3), activityC13008x3fe6d8d02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.b4(activityC13008x3fe6d8d02, str2), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.c4(activityC13008x3fe6d8d02));
        }
        return 0;
    }
}
