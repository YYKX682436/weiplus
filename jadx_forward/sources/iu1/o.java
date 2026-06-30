package iu1;

/* loaded from: classes9.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376461a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376461a = activityC13064xaf775f76;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376461a;
        android.app.Dialog dialog = activityC13064xaf775f76.L;
        if (dialog != null) {
            dialog.dismiss();
        }
        activityC13064xaf775f76.M = null;
        android.view.ViewGroup viewGroup = activityC13064xaf775f76.f176719o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView2");
            throw null;
        }
        viewGroup.setVisibility(8);
        activityC13064xaf775f76.A = false;
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            activityC13064xaf775f76.E = 0;
            if (activityC13064xaf775f76.f176730z) {
                activityC13064xaf775f76.f176730z = false;
            }
            lu1.a0.q(activityC13064xaf775f76, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 31);
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        r45.ri3 ri3Var = (r45.ri3) fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(ri3Var.f466439d));
        if (ri3Var.f466439d == 0) {
            activityC13064xaf775f76.f176720p = ri3Var.f466441f;
            activityC13064xaf775f76.f176722r = ri3Var.f466442g == 1;
            java.util.ArrayList arrayList = activityC13064xaf775f76.F;
            arrayList.clear();
            r45.ru ruVar = ri3Var.f466449q;
            if (ruVar != null) {
                arrayList.addAll(ruVar.f466742d);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri3Var.f466446n)) {
                activityC13064xaf775f76.f176723s = ri3Var.f466446n;
            }
            if (activityC13064xaf775f76.f176722r) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13064xaf775f76.f176716i;
                if (c12808x5de4409f == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                    throw null;
                }
                c12808x5de4409f.m1(false);
                activityC13064xaf775f76.H = ri3Var.f466445m;
                activityC13064xaf775f76.Z6();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13064xaf775f76.f176716i;
                if (c12808x5de4409f2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                    throw null;
                }
                c12808x5de4409f2.m1(true);
            }
            if (activityC13064xaf775f76.f176730z || activityC13064xaf775f76.K) {
                activityC13064xaf775f76.f176725u.clear();
                activityC13064xaf775f76.f176726v.clear();
                activityC13064xaf775f76.f176724t.clear();
                activityC13064xaf775f76.f176728x = null;
                if (activityC13064xaf775f76.f176730z) {
                    activityC13064xaf775f76.f176730z = false;
                }
                activityC13064xaf775f76.K = false;
            } else {
                ri3Var.f466450r = null;
            }
            activityC13064xaf775f76.a7(ri3Var.f466443h, ri3Var.f466444i, ri3Var.f466450r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = activityC13064xaf775f76.f176716i;
            if (c12808x5de4409f3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c12808x5de4409f3.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        } else {
            if (activityC13064xaf775f76.f176730z) {
                activityC13064xaf775f76.f176730z = false;
            }
            lu1.a0.r(activityC13064xaf775f76, ri3Var.f466440e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 31);
        }
        if (ri3Var.f466447o != 1) {
            return fVar2;
        }
        activityC13064xaf775f76.K = true;
        activityC13064xaf775f76.f176720p = 0;
        activityC13064xaf775f76.E = ri3Var.f466448p;
        activityC13064xaf775f76.Y6();
        return fVar2;
    }
}
