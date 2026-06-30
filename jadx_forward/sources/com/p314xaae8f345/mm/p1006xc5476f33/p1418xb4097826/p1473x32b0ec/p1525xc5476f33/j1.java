package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194578d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        this.f194578d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f194578d;
        km2.b bVar = v3Var.S;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:info is null, returning");
        } else if (bVar.f390599p == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:replayPrivilege is false");
        } else {
            r45.nw1 nw1Var = bVar.f390603t;
            if (nw1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn.liveInfo is null");
            } else {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(31));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:Current replay status: " + valueOf);
                if (valueOf != null && valueOf.intValue() == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(v3Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b2(v3Var, bVar, null), 3, null);
                } else if (valueOf != null && valueOf.intValue() == 0) {
                    v3Var.J1(bVar);
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    r45.sl1 sl1Var = bVar.f390604u;
                    if ((sl1Var != null ? sl1Var.m75939xb282bd08(0) : 0) != 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(v3Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z2(v3Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c2(bVar, v3Var), null), 3, null);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
