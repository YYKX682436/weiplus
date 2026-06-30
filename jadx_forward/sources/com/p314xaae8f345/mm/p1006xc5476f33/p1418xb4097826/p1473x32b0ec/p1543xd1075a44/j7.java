package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 f200262d;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 n7Var) {
        this.f200262d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 n7Var = this.f200262d;
        n7Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onBgMusicClick");
        yz5.l lVar = n7Var.P;
        if (lVar != null) {
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i7.f200178d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = n7Var.H;
        qo0.c.a(lVar2.f194858g, qo0.b.f446915m2, null, 2, null);
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(n7Var, false, 1, null);
        if (n7Var.e0()) {
            ll2.e.d(ll2.e.f400666a, "anchorlive.bottom.music.bgmusic", false, false, 6, null);
        } else {
            ll2.e.d(ll2.e.f400666a, "startlive.bottom.music.bgmusic", false, false, 6, null);
        }
        df2.od odVar = (df2.od) lVar2.U0(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_MUSIC_COUNT)) {
            z17 = true;
        }
        if (z17) {
            df2.dd ddVar = df2.od.f312485w;
            gk2.e S0 = lVar2.S0();
            df2.od odVar2 = (df2.od) lVar2.U0(df2.od.class);
            ddVar.a(S0, 2, 7, odVar2 != null ? odVar2.f312491r : null, 14);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
