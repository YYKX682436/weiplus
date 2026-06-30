package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class d1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 f288190d;

    public d1(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1) {
        this.f288190d = activityC22292xa218e7a1;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288190d;
        if (i17 < activityC22292xa218e7a1.f287872d.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomContactUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = activityC22292xa218e7a1.f287879n;
        if (uVar != null && uVar.f544447x) {
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) activityC22292xa218e7a1.f287878m.getItem(i17 - activityC22292xa218e7a1.f287872d.getHeaderViewsCount());
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomContactUI", "null == ct position=%s", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(d17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.b4(d17)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a12 = this.f288190d;
            activityC22292xa218e7a12.f287881p = d17;
            activityC22292xa218e7a12.f287880o.g(view, i17, j17, activityC22292xa218e7a12, activityC22292xa218e7a12.f287884s, activityC22292xa218e7a12.f287882q, activityC22292xa218e7a12.f287883r);
        }
        return true;
    }
}
