package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv.c0 f159707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u f159708e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar, pv.c0 c0Var) {
        this.f159708e = uVar;
        this.f159707d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar = this.f159708e;
        uVar.getClass();
        pv.c0 c0Var = (pv.c0) i95.n0.c(pv.c0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = uVar.f159680a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12751x125fa002 c12751x125fa002 = o6Var.C1;
        if (c12751x125fa002 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, GlobalNativeWidgetContainerView is null");
        } else if (c12751x125fa002.getWidth() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, width is 0");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar = o6Var.D1;
            if (zVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, GlobalNativeWidgetContainerView is null");
            } else {
                mi1.v vVar = o6Var.f156354z;
                if (vVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, AppBrandCapsuleBarManager is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d d17 = vVar.d();
                    if (d17.getWidth() == 0 || d17.getHeight() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, optionButton width=" + d17.getWidth() + ",height=" + d17.getHeight());
                    } else {
                        int[] iArr = new int[2];
                        d17.getLocationInWindow(iArr);
                        android.content.Context context = o6Var.f156328d;
                        if (context == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, context is null");
                        } else {
                            android.app.Activity r07 = o6Var.r0();
                            if (r07 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, activity is null");
                            } else if (r07.isFinishing() || r07.isDestroyed()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, activity isDestroyed");
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9(context);
                                c12915xed9c02f9.m54093x4150ff41(((ov.f0) c0Var).Bi(pv.a0.f440009g));
                                c12915xed9c02f9.m54091x9baa4729(((c12751x125fa002.getWidth() - iArr[0]) - (d17.getWidth() / 2)) - com.p314xaae8f345.mm.ui.zk.a(context, 15));
                                c12915xed9c02f9.m54095x90c9d113(d17.getHeight() + iArr[1]);
                                c12915xed9c02f9.animate().alphaBy(0.0f).alpha(1.0f).setDuration(100L).start();
                                c12915xed9c02f9.m54092x2051c9c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.a0(uVar, zVar));
                                android.view.ViewGroup frameLayout = new android.widget.FrameLayout(context);
                                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                                layoutParams.topMargin = 0;
                                layoutParams.leftMargin = 0;
                                layoutParams.gravity = 8388613;
                                frameLayout.setPadding(0, com.p314xaae8f345.mm.ui.zk.a(context, 6), 0, 0);
                                frameLayout.addView(c12915xed9c02f9, layoutParams);
                                zVar.A(frameLayout);
                                uVar.f159693n = true;
                            }
                        }
                    }
                }
            }
        }
        ((ov.f0) this.f159707d).Ri(pv.a0.f440009g, true);
    }
}
