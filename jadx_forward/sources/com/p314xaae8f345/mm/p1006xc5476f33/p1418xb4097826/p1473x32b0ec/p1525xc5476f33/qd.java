package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.be f195524d;

    public qd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.be beVar) {
        this.f195524d = beVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin$checkDanmaku$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.be beVar = this.f195524d;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) beVar.w1()).k(java.lang.Boolean.valueOf(!((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) beVar.w1()).mo144003x754a37bb()).booleanValue()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = beVar.f193556u;
        if (slVar != null) {
            if (slVar != null) {
                slVar.dismiss();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) beVar.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
            if (mgVar != null) {
                mgVar.J1();
            }
            beVar.f193556u = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc.f200279p.a(beVar.S0(), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin$checkDanmaku$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
