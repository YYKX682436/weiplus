package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 f200353d;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 n7Var) {
        this.f200353d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n7 n7Var = this.f200353d;
        n7Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onSingSongClick");
        yz5.l lVar = n7Var.P;
        if (lVar != null) {
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i7.f200179e);
        }
        n7Var.f0(true);
        if (n7Var.e0()) {
            ll2.e.d(ll2.e.f400666a, "anchorlive.bottom.newmusic.song", false, false, 6, null);
        } else {
            ll2.e.d(ll2.e.f400666a, "startlive.more.newmusic.song", false, false, 6, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(n7Var, false, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = n7Var.H;
        sf2.x xVar = (sf2.x) lVar2.U0(sf2.x.class);
        if (xVar != null) {
            xVar.s7(true);
        }
        sf2.x xVar2 = (sf2.x) lVar2.U0(sf2.x.class);
        if (xVar2 != null) {
            xVar2.c7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
