package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class mh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh f228724f;

    public mh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar, int i17, java.lang.String str) {
        this.f228724f = nhVar;
        this.f228722d = i17;
        this.f228723e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228724f.f228775a;
        activityC16384xb66222dd.f227977y2 = 1;
        activityC16384xb66222dd.f227957q2 = 4;
        if (!activityC16384xb66222dd.F2.e()) {
            this.f228724f.f228775a.F2.d();
        }
        int i17 = this.f228722d;
        if (i17 == 1 || i17 == 3) {
            this.f228724f.f228775a.S.f(false);
            db5.t7.m(this.f228724f.f228775a.mo55332x76847179(), this.f228724f.f228775a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573958gl4));
        } else if (i17 == 2) {
            this.f228724f.f228775a.f227938h.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kh(this), 380L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd2 = this.f228724f.f228775a;
            activityC16384xb66222dd2.f227977y2 = 3;
            java.lang.String str = this.f228723e;
            activityC16384xb66222dd2.f227943k2 = str;
            com.p314xaae8f345.mm.p947xba6de98f.q0 q0Var = activityC16384xb66222dd2.E2;
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.f226795a;
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_uploadVoice";
            mVar.f69592xf1ebe47b = 15;
            mVar.f69595x6d25b0d9 = str;
            mVar.f69601xaca5bdda = "VoiceData" + str;
            mVar.f69620xeb1a61d6 = com.p314xaae8f345.mm.vfs.w6.k(mVar.f69595x6d25b0d9);
            mVar.f69586x737ec037 = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "uploadVoiceFile %s %s %s", mVar.f69601xaca5bdda, mVar.f69595x6d25b0d9, mVar.f69575xf11df5f5);
            if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(q0Var)) != null) {
                this.f228724f.f228775a.f227957q2 = 2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUIV2", "cdn upload fail");
                this.f228724f.f228775a.f227957q2 = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd3 = this.f228724f.f228775a;
            activityC16384xb66222dd3.i7(13, activityC16384xb66222dd3.M.getF229151r());
            java.util.List list = this.f228724f.f228775a.f227969w2;
            if (list == null || list.size() <= 0) {
                this.f228724f.f228775a.X.setVisibility(8);
            } else {
                this.f228724f.f228775a.X.setVisibility(0);
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lh lhVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lh(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(lhVar, 500L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd4 = this.f228724f.f228775a;
        activityC16384xb66222dd4.f227979z1.setVisibility(8);
        activityC16384xb66222dd4.f227979z1.n();
        this.f228724f.f228775a.q7();
    }
}
