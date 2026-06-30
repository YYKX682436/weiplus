package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182349d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        this.f182349d = activityC13590x9555381d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182349d;
        if (activityC13590x9555381d.E.J0()) {
            r45.gp0 gp0Var = activityC13590x9555381d.F;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
            o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var.T);
            if (Xf != null && Xf.f67093x10a0fed7 != 3) {
                Xf.f67093x10a0fed7 = 2;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf, "dataId");
                ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).T6(gp0Var.T);
            }
            o72.e2 Xf2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(o72.x1.W(gp0Var.T));
            if (Xf2 != null && Xf2.f67093x10a0fed7 != 3) {
                Xf2.f67093x10a0fed7 = 2;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf2, "dataId");
                ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).T6(o72.x1.W(gp0Var.T));
            }
            activityC13590x9555381d.f182144o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb_);
        } else {
            o72.r2 r2Var = activityC13590x9555381d.E;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = o72.x1.f425048a;
            if (r2Var.Q0()) {
                java.util.Iterator it = r2Var.f67640x5ab01132.f452497f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var2 = (r45.gp0) it.next();
                    o72.e2 Xf3 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var2.T);
                    if (Xf3 != null && Xf3.f67093x10a0fed7 != 3) {
                        Xf3.f67093x10a0fed7 = 2;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf3, "dataId");
                        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).U6(gp0Var2.T);
                    }
                    o72.e2 Xf4 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(o72.x1.W(gp0Var2.T));
                    if (Xf4 != null && Xf4.f67093x10a0fed7 != 3) {
                        Xf4.f67093x10a0fed7 = 2;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf4, "dataId");
                        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).U6(o72.x1.W(gp0Var2.T));
                    }
                }
                o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.f67645x88be67a1);
                int i17 = F.f67644x3059914a;
                if (i17 == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(3, F.f67645x88be67a1);
                } else if (i17 == 4) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(6, F.f67645x88be67a1);
                } else if (i17 == 9) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(11, F.f67645x88be67a1);
                } else if (i17 == 12) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(14, F.f67645x88be67a1);
                } else if (i17 == 15) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(16, F.f67645x88be67a1);
                } else if (i17 == 17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(18, F.f67645x88be67a1);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, not uploading");
            }
            activityC13590x9555381d.f182144o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cba);
        }
        activityC13590x9555381d.h7();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
