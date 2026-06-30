package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 f182446a;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var) {
        this.f182446a = l2Var;
    }

    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.a(o1Var.f182569b);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f1 f1Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = o1Var.f182569b;
            f1Var.getClass();
            if (b1Var != null) {
                r45.gp0 gp0Var = b1Var.f182431b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", gp0Var.T);
                java.util.ArrayList arrayList = f1Var.f182451a;
                arrayList.remove(b1Var);
                arrayList.remove(f1Var.c(gp0Var.T));
                java.util.Iterator it = f1Var.f182453c.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e1) it.next())).f182532g = true;
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) this.f182446a.f182526a).k(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a.size());
    }
}
