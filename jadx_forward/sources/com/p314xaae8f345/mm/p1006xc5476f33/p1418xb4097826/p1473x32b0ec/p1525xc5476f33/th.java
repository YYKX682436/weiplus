package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class th implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh f195934e;

    public th(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar) {
        this.f195933d = viewGroup;
        this.f195934e = whVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBgDecoration by running delay task. ");
        android.view.ViewGroup viewGroup = this.f195933d;
        sb6.append(viewGroup.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDecorationPlugin", sb6.toString());
        android.content.Context context = viewGroup.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if ((abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isDestroyed()) ? false : true) {
            android.content.Context context2 = viewGroup.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null;
            if ((abstractActivityC21394xb3d2c0cf2 == null || abstractActivityC21394xb3d2c0cf2.isFinishing()) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar = this.f195934e;
                if (((mm2.c1) whVar.P0(mm2.c1.class)).U7()) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh.t1(whVar, ((fy2.d) whVar.P0(fy2.d.class)).f348773g);
            }
        }
    }
}
