package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f196515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cj1 f196516e;

    public wo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, r45.cj1 cj1Var) {
        this.f196515d = apVar;
        this.f196516e = cj1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateBulletShowingInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!zl2.r4.f555483a.w1()) {
            r45.zb4 zb4Var = new r45.zb4();
            java.lang.String m75945x2fec8307 = this.f196516e.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            zb4Var.set(0, m75945x2fec8307);
            zb4Var.set(1, java.lang.Boolean.TRUE);
            ((mm2.s2) this.f196515d.P0(mm2.s2.class)).f410944p.mo7808x76db6cb1(zb4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateBulletShowingInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
