package rp1;

/* loaded from: classes13.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480046d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7) {
        this.f480046d = c12917x19ac03e7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34 m54100xd0aac668;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallView$initCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCollapseViewClick isCurrentCollapsedState: ");
        rp1.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480046d;
        sb6.append(c12917x19ac03e7.w());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewV2", sb6.toString());
        m54100xd0aac668 = c12917x19ac03e7.m54100xd0aac668();
        if (m54100xd0aac668.getVisibility() == 0 && !c12917x19ac03e7.x()) {
            android.graphics.PointF pointF = c12917x19ac03e7.C;
            c12917x19ac03e7.z(pointF.x, pointF.y);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallView$initCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
