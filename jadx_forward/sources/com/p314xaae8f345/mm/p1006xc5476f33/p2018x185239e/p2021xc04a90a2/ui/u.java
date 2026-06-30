package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v f238255d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v vVar) {
        this.f238255d = vVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.x xVar = this.f238255d.f238263m;
        if (xVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l) xVar;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv longclick!");
        r45.ow3 ow3Var = (r45.ow3) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17116x472c8308 activityC17116x472c8308 = lVar.f238221a;
        rl5.r rVar = new rl5.r(activityC17116x472c8308, view);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.j(lVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.k(lVar, ow3Var);
        int[] iArr = activityC17116x472c8308.f238105p;
        rVar.h(view, jVar, kVar, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
