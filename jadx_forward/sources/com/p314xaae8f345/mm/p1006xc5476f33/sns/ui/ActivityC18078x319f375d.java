package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI */
/* loaded from: classes4.dex */
public class ActivityC18078x319f375d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int Z = 0;
    public java.util.ArrayList D;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f248799J;
    public int N;
    public long P;
    public long Q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f248800d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm f248801e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f248802f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj f248804h;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f248807n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f248808o;

    /* renamed from: q, reason: collision with root package name */
    public gc4.i f248810q;

    /* renamed from: r, reason: collision with root package name */
    public int f248811r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.e8 f248812s;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248815v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248816w;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f248803g = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f248805i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();

    /* renamed from: m, reason: collision with root package name */
    public boolean f248806m = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248809p = false;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 f248813t = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880();

    /* renamed from: u, reason: collision with root package name */
    public boolean f248814u = false;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f248817x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int f248818y = 86400;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f248819z = l44.a0.a();
    public android.view.View A = null;
    public boolean B = true;
    public boolean C = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.sns.ui.SnsMsgUI.1
        {
            this.f39173x3fe91575 = -1499688230;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea c6053xf2312ea) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea c6053xf2312ea2 = c6053xf2312ea;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            am.nv nvVar = c6053xf2312ea2.f136338g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "msg comment update commentUniqueId: %s snsId: %s", nvVar.f88997b, nvVar.f88996a);
            int i17 = 0;
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.this;
                if (i17 >= com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).getCount()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).getItem(i17);
                if (v1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2 q2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d;
                    java.lang.String k17 = q2Var2.k(q2Var2.t(v1Var));
                    if (k17 == null) {
                        k17 = "";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                    if (k17.equals(c6053xf2312ea2.f136338g.f88997b)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).notifyDataSetChanged();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
                        break;
                    }
                }
                i17++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            return false;
        }
    };
    public final android.view.View.OnClickListener F = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rl(this);
    public long G = 0;
    public long H = 0;
    public final db5.t4 K = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kl(this);
    public final l75.q0 L = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pl(this);
    public final java.lang.Runnable M = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ql(this);
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public final java.util.HashMap V = new java.util.HashMap();
    public final java.util.HashMap W = new java.util.HashMap();
    public final java.util.HashMap X = new java.util.HashMap();
    public boolean Y = false;

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar = activityC18078x319f375d.f248801e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return bmVar;
    }

    public static /* synthetic */ int[] U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        int[] iArr = activityC18078x319f375d.f248817x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return iArr;
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        activityC18078x319f375d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        r45.j96 j96Var = new r45.j96();
        j96Var.f459208d = z17 ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(activityC18078x319f375d.f248799J, 12, j96Var);
        gm0.j1.i();
        if (gm0.j1.n().f354821b.h(q2Var, 0)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC18078x319f375d.f248815v;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18078x319f375d, activityC18078x319f375d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18078x319f375d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbx), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ml(activityC18078x319f375d, q2Var));
            activityC18078x319f375d.f248815v = Q;
            Q.show();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public static /* synthetic */ android.view.View.OnClickListener W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        android.view.View.OnClickListener onClickListener = activityC18078x319f375d.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return onClickListener;
    }

    public static /* synthetic */ java.util.HashMap X6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.HashMap hashMap = activityC18078x319f375d.X;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return hashMap;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.e8 Y6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var = activityC18078x319f375d.f248812s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return e8Var;
    }

    public static /* synthetic */ java.lang.String Z6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.lang.String g76 = activityC18078x319f375d.g7(v1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return g76;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        activityC18078x319f375d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = null;
        if (v1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(v1Var.f67469x29d1290e);
                c17933xe8d1b226 = (W0 != null || (y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(v1Var.f67469x29d1290e)) == null) ? W0 : y07.m70298xd15b2ed8();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return c17933xe8d1b226;
    }

    public static void b7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        activityC18078x319f375d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (activityC18078x319f375d.f7(v1Var).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: can check later");
            activityC18078x319f375d.l7(v1Var);
        } else {
            activityC18078x319f375d.q7(v1Var, true, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: try doScene NetSceneSnsObjectDetial");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public static void c7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        activityC18078x319f375d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo70496xb06685ab(i17);
        activityC18078x319f375d.f248801e.mo735xb0dfc7d8(null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tl(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            onBackPressed();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return dispatchKeyEvent;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm(this, this, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return bmVar;
    }

    public final java.lang.Boolean f7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        boolean z17 = true;
        boolean z18 = c01.id.e() - v1Var.f67460xac3be4e < this.f248818y;
        if (!z18) {
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(v1Var.f67469x29d1290e) != null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "enableCheckVisibilityOnLaterPage: [%b], timeInLimit=[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return valueOf;
    }

    public final java.lang.String g7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.f67467x63ce98ea;
        java.lang.String t07 = j17 == 0 ? ca4.z0.t0(v1Var.f67469x29d1290e) : ca4.z0.t0(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return t07;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.p314xaae8f345.mm.R.id.n_c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.csu;
    }

    public int h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f560994zy;
    }

    public java.util.List i7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar = this.f248801e;
        if (bmVar == null || !((java.util.HashMap) bmVar.f249493u).isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return arrayList;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f248801e.f249493u).entrySet()) {
            if (entry != null && ((java.lang.Integer) entry.getValue()).intValue() == 2) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        mo56582xbf7c1df6(k7());
        d7();
        m78561xe5bc8f21(h7());
        this.f248804h = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj(this);
        this.f248807n = findViewById(com.p314xaae8f345.mm.R.id.n_a);
        this.f248800d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.n_c);
        t7();
        this.f248802f = com.p314xaae8f345.mm.ui.id.b(this).inflate(j7(), (android.view.ViewGroup) null);
        this.f248803g = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byg, (android.view.ViewGroup) null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "autoLoad " + this.f248814u);
        if (!this.f248814u || m7()) {
            this.f248800d.addFooterView(this.f248802f);
        } else {
            this.f248800d.addFooterView(this.f248803g);
        }
        this.f248801e = e7();
        java.util.ArrayList arrayList = this.D;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    this.f248801e.B(str);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar = this.f248801e;
        gc4.h hVar = new gc4.h(this);
        bmVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar.f249492t = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "setUnreadCommentFetchCallback null:%b", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar2 = this.f248801e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vl vlVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vl(this);
        bmVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar2.f249490r = vlVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar3 = this.f248801e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wl wlVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wl(this);
        bmVar3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar3.f249489q = wlVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar4 = this.f248801e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xl xlVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xl(this);
        bmVar4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar4.f249491s = xlVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar5 = this.f248801e;
        bmVar5.f294144h = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yl(this);
        this.f248800d.setAdapter((android.widget.ListAdapter) bmVar5);
        this.f248800d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zl(this));
        android.view.LayoutInflater.from(this);
        new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        new db5.g4(this);
        new db5.g4(this);
        this.f248800d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hl(this));
        this.f248800d.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.il(this));
        this.f248800d.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jl(this));
        if (m7() || this.f248801e.getCount() != 0) {
            this.f248800d.setVisibility(0);
            android.view.View view = this.f248807n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(true);
        } else {
            this.f248800d.setVisibility(8);
            android.view.View view2 = this.f248807n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(n7());
        }
        if (!m7() && ((this.f248801e.H() && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() == 0) || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() == com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().J0(false))) {
            android.view.View view3 = this.f248802f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f248801e.H() && this.f248814u) {
            this.f248800d.removeFooterView(this.f248803g);
        }
        r7();
        if (this.f248801e.H() && this.f248814u) {
            this.f248800d.removeFooterView(this.f248803g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public int j7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.css;
    }

    public int k7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.p314xaae8f345.mm.R.C30867xcad56011.jcy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void l7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        java.lang.String str;
        int i17;
        ?? r37;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.f67469x29d1290e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetail: comment field_type:%d", java.lang.Integer.valueOf(v1Var.f67472x2262335f));
        int i18 = v1Var.f67472x2262335f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a;
        java.util.HashMap hashMap = this.X;
        if (i18 == 1) {
            this.R++;
            r45.k76 k76Var = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
            if (k76Var != null) {
                str = "goToCommentDetail";
                r2Var.j("view_clk", g7(v1Var), 1, -1, k76Var.f460000p, "");
                r37 = 1;
            } else {
                str = "goToCommentDetail";
                r37 = 1;
            }
        } else {
            str = "goToCommentDetail";
            if (i18 == 2) {
                r45.e86 r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.r(v1Var);
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.b(r17)) {
                    i17 = 1;
                    this.T++;
                } else {
                    i17 = 1;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.d(r17)) {
                        this.U++;
                    }
                }
                this.S += i17;
                r37 = i17;
                r2Var.j("view_clk", g7(v1Var), 2, r17.f454677y, r17.f454665m, r17.f454663h);
            }
            r37 = 1;
        }
        java.util.HashMap hashMap2 = this.W;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(v1Var.S))) {
            hashMap2.put(java.lang.Integer.valueOf(v1Var.S), java.lang.Integer.valueOf(((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(v1Var.S))).intValue() + r37));
        } else {
            hashMap2.put(java.lang.Integer.valueOf(v1Var.S), java.lang.Integer.valueOf((int) r37));
        }
        r45.k76 k76Var2 = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
        xa4.b.f534354a.f("view_clk", g7(v1Var), v1Var, (k76Var2 != null && xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var2.f460009y))) ? false : r37);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        boolean z17 = (v1Var.f67459xe928fe86 & 2) > 0 ? r37 : false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "skip goToCommentDetail, comment.isSnsDelFlag");
            this.f248801e.B(java.lang.String.valueOf(j17));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_COMMENT_TYPE", v1Var.f67472x2262335f);
        int i19 = v1Var.f67472x2262335f;
        if (i19 == 3 || i19 == 5) {
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18114x28d7f256.class);
            intent.putExtra("INTENT_TALKER", v1Var.f67471x114ef53e);
            try {
                intent.putExtra("INTENT_SOURCE", ((r45.k76) new r45.k76().mo11468x92b714fd(v1Var.f67461x5e5c2922)).f459996i);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
            }
        } else {
            intent.putExtra("intent_show_bless_bubble", i19 == 22 ? r37 : false);
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        }
        int i27 = v1Var.f67472x2262335f;
        if (i27 != 7 && i27 != 8 && i27 != 16) {
            intent.putExtra("INTENT_SNSID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", j17));
            str2 = str;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MomentAds.k(mo55332x76847179(), null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            str2 = str;
            intent.putExtra("INTENT_SNSID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", j17));
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "sns id " + j17 + "was not exist!");
                if (v1Var.f67472x2262335f == 16) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            int q17 = gm0.j1.u().c().q(14, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "current client version %s, [%s, %s]", java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(b17.m70354x74235b3e().f38233xcb07c51), java.lang.Integer.valueOf(b17.m70354x74235b3e().f38232x7958c4ff));
            if (q17 < b17.m70354x74235b3e().f38233xcb07c51 || (b17.m70354x74235b3e().f38232x7958c4ff > 0 && q17 > b17.m70354x74235b3e().f38232x7958c4ff)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.m70354x74235b3e().f38235x77f491fb)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsMsgUI", "compatible jump url is null!");
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", b17.m70354x74235b3e().f38235x77f491fb);
                    intent2.putExtra("showShare", false);
                    intent2.putExtra("show_bottom", false);
                    intent2.putExtra("needRedirect", false);
                    intent2.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent2, this);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        int i28 = v1Var.f67472x2262335f;
        if (i28 == 2) {
            intent.putExtra("INTENT_FROMSUI", (boolean) r37);
            intent.putExtra("INTENT_FROMSUI_COMMENTID", v1Var.f67458x3aefdbd0);
        } else if (i28 == 8 || i28 == 16) {
            intent.putExtra("INTENT_FROMSUI", (boolean) r37);
            intent.putExtra("INTENT_FROMSUI_COMMENTID", v1Var.f67458x3aefdbd0);
        }
        if (this.f248801e.w(java.lang.String.valueOf(v1Var.f67469x29d1290e))) {
            intent.putExtra("INTENT_COMMENT_forbid_access", (boolean) r37);
        }
        intent.putExtra("intent_content_enable_show_access_view", (boolean) r37);
        startActivityForResult(intent, (int) r37);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public boolean m7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return false;
    }

    public boolean n7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return false;
    }

    public boolean o7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("result_forbid_access", false);
            long longExtra = intent.getLongExtra("result_access_sns_id", 0L);
            java.lang.String valueOf = java.lang.String.valueOf(longExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf) && longExtra != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onActivityResult: need forbid:%b, snsId:%s", java.lang.Boolean.valueOf(booleanExtra), valueOf);
                if (booleanExtra) {
                    this.f248801e.B(valueOf);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar = this.f248801e;
                    bmVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    ((java.util.HashMap) bmVar.f249493u).put(valueOf, 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                }
            }
            boolean booleanExtra2 = intent.getBooleanExtra("result_finish", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onActivityResult: isFinish=[%b]", java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                finish();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        if (intent != null) {
            this.f248813t.a(intent.getIntExtra("sns_gallery_op_id", 0));
        }
        if (intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_msg_forbid_access_snsid_list");
            this.D = stringArrayListExtra;
            if (stringArrayListExtra != null) {
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next)) {
                        this.f248801e.B(next);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onBackPressed");
        if (this.B && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", this.f248813t);
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onCreate");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(210, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(683, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(218, this);
        this.f248808o = c01.z1.r();
        this.f248812s = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        this.f248809p = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
        this.B = getIntent().getBooleanExtra("sns_msg_can_update_to_read", true);
        this.D = getIntent().getStringArrayListExtra("sns_msg_forbid_access_snsid_list");
        this.C = false;
        if (this.f248809p) {
            this.f248814u = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().add(this.L);
        mo64405x4dab7448(mo78508x85b50c3c());
        mo43517x10010bd5();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.P = java.lang.System.currentTimeMillis();
        this.N = getIntent().getIntExtra("sns_msg_comment_list_scene", 0);
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
            Aj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            Aj.f247690e = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.I();
        }
        this.E.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarActionReporter", "setEntranceType >> 2");
        ta4.g1.f498281b = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String r17 = c01.z1.r();
        java.lang.String format = java.lang.String.format("%s", java.lang.Long.valueOf(c01.id.a() / 1000));
        ((ce0.e) jVar).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.K(r17, 7, "MomentsUnreadMsgStatus", format);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) this.f248801e.getItem(adapterContextMenuInfo.position);
        if (v1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        this.I = v1Var.S;
        this.f248799J = v1Var.f67469x29d1290e;
        try {
            r45.k76 k76Var = (r45.k76) new r45.k76().mo11468x92b714fd(v1Var.f67461x5e5c2922);
            if (k76Var != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) this.f248812s).n(k76Var.f459991d, true);
                java.lang.String g27 = n17 != null ? n17.g2() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k76Var.f459993f) ? k76Var.f459993f : k76Var.f459991d;
                if (g27 == null) {
                    g27 = "";
                }
                contextMenu.setHeaderTitle(g27);
                if (v1Var.f67465xf4ca6712 == 0) {
                    contextMenu.add(adapterContextMenuInfo.position, 1, 1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbt));
                } else {
                    contextMenu.add(adapterContextMenuInfo.position, 2, 1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbs));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.lang.String str;
        java.lang.String str2;
        long j17;
        java.util.HashMap hashMap3;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str3 = "onDestroy";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.Q = super.mo78509x4b0ac5a2();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0 && this.B && o7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(210, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(683, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(218, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo49775xc84af884(this.L);
        this.f248801e.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().N(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248815v;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f248815v = null;
        }
        java.lang.String str4 = "reportBrowseMsgListInfo";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportBrowseMsgListInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.HashMap hashMap4 = this.V;
        java.util.Iterator it6 = hashMap4.values().iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = this.X;
            hashMap2 = this.W;
            str = str3;
            java.lang.String str5 = "";
            str2 = str4;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) it6.next();
            if (v1Var != null) {
                it = it6;
                j17 = elapsedRealtime;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                hashMap3 = hashMap4;
                if (v1Var.f67462xff7b64c5 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z17 = false;
                }
                if (!z17) {
                    int i27 = v1Var.f67472x2262335f;
                    if (i27 == 1) {
                        i18++;
                    } else if (i27 == 2) {
                        i17++;
                    }
                }
                int i28 = i17;
                int intValue = hashMap2.containsKey(java.lang.Integer.valueOf(v1Var.S)) ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(v1Var.S))).intValue() : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                r45.k76 k76Var = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
                boolean z19 = (k76Var != null && xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var.f460009y))) ? false : true;
                int i29 = v1Var.f67466xa9a2f4d7 == 1 ? 1 : 0;
                cl0.g gVar = new cl0.g();
                try {
                    gVar.h("fid", g7(v1Var));
                    gVar.o("cid", v1Var.S);
                    gVar.h("usr", v1Var.f67471x114ef53e);
                    gVar.o("type", v1Var.f67472x2262335f);
                    gVar.o("ig", v1Var.f67465xf4ca6712);
                    gVar.o("is_expired", z19 ? 1 : 0);
                    gVar.o("is_relate", i29);
                    if (intValue > 0) {
                        gVar.o("click", intValue);
                    }
                    if (v1Var.f67472x2262335f == 2) {
                        r45.e86 r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.r(v1Var);
                        gVar.o("CommentType", r17.f454677y);
                        gVar.o("cmt_text_length", android.text.TextUtils.isEmpty(r17.f454663h) ? 0 : r17.f454663h.length());
                    }
                    str5 = gVar.toString().replaceAll(",", ";");
                } catch (cl0.f e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUI", "browseJson, json error:" + e17.getMessage());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(";");
                    stringBuffer.append(str5);
                } else {
                    stringBuffer.append(str5);
                }
                i17 = i28;
            } else {
                j17 = elapsedRealtime;
                hashMap3 = hashMap4;
                it = it6;
            }
            i19++;
            str3 = str;
            str4 = str2;
            it6 = it;
            elapsedRealtime = j17;
            hashMap4 = hashMap3;
        }
        long j18 = elapsedRealtime;
        java.util.HashMap hashMap5 = hashMap4;
        if (this.f248810q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "create empty stopRemindReportInfo");
            this.f248810q = new gc4.i(false, "");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6899x72e4da92 c6899x72e4da92 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6899x72e4da92();
        c6899x72e4da92.f142160j = this.P;
        c6899x72e4da92.f142154d = this.N;
        c6899x72e4da92.f142157g = this.Q;
        c6899x72e4da92.f142158h = this.R;
        c6899x72e4da92.f142159i = this.S;
        c6899x72e4da92.f142166p = this.T;
        c6899x72e4da92.f142167q = this.U;
        c6899x72e4da92.f142156f = i17;
        c6899x72e4da92.f142155e = i18;
        gc4.i iVar = this.f248810q;
        iVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        c6899x72e4da92.f142162l = iVar.f351989a ? 1L : 0L;
        gc4.i iVar2 = this.f248810q;
        iVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        c6899x72e4da92.f142163m = c6899x72e4da92.b("EduTriggerFeedid", iVar2.f351990b, true);
        c6899x72e4da92.f142161k = c6899x72e4da92.b("BrowseJson", "[" + stringBuffer.toString() + "]", true);
        c6899x72e4da92.f142164n = this.Y ? 1L : 0L;
        c6899x72e4da92.f142165o = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18077x78e7e20f.X6().booleanValue() ? 1L : 0L;
        c6899x72e4da92.k();
        hashMap5.clear();
        hashMap2.clear();
        hashMap.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "reportBrowseMsgListInfo debugLog [%d] cost[%d]", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j18));
        c6899x72e4da92.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Aj.f247690e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        this.A = null;
        this.E.mo48814x2efc64();
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        kj.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45921xfba3e90a(), this.f248811r);
        this.f248811r = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onPause");
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f314350n) != null) {
            this.G = java.lang.Math.max(0L, ((int) mVar.f389776e) - this.G);
        }
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() > this.H ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - this.H : 1L;
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45974xeaf03f15(705, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45918xf43e41bd(), 1, this.G, this.H);
        this.G = 0L;
        this.H = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        kj.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f314350n) != null) {
            this.G = (int) mVar.f389776e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().c(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.c();
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
    
        if (r7.booleanValue() != false) goto L38;
     */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p944x882e457a.m1 r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f248801e.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void p7() {
        int t17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0) {
            if (this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
            }
            this.C = true;
            t17 = !this.f248801e.H() ? 1 : 0;
        } else {
            t17 = this.f248801e.t();
        }
        this.f248801e.mo735xb0dfc7d8(null, null);
        if (!this.f248814u) {
            if (this.f248802f.getParent() != null) {
                this.f248800d.removeFooterView(this.f248802f);
            }
            if (this.f248803g.getParent() == null && t17 > 0) {
                this.f248800d.addFooterView(this.f248803g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
            }
        }
        this.f248814u = true;
        android.view.View view = this.f248802f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "onListFooterClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "onListFooterClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public final void q7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.f67469x29d1290e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2(j17);
        p2Var.f246106g = true;
        p2Var.f246107h = v1Var;
        p2Var.f246108i = z18;
        if (z17) {
            this.f248816w = db5.e1.Q(this, "", mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ll(this, p2Var));
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(p2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "requestCheckVisibility: feedId=%s, showLoading=%b, fromPhotoClick:%b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void r7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ul(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void s7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEmptyViewForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f248800d.setVisibility(8);
        android.view.View view = this.f248807n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "setEmptyViewForClearMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "setEmptyViewForClearMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Y = true;
        m78501x43e00957(n7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmptyViewForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void t7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f248800d.setBackground(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }
}
