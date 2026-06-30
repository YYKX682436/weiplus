package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class b7 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288159d;

    public b7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0) {
        this.f288159d = activityC22321x6fa86dd0;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0 = this.f288159d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = activityC22321x6fa86dd0.f288036e.getItem(i17);
        if (item != null && (item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
            if (!activityC22321x6fa86dd0.f288036e.f288611f) {
                new rl5.r(activityC22321x6fa86dd0.mo55332x76847179()).g(view, i17, j17, new com.p314xaae8f345.mm.ui.p2690x38b72420.z6(this, i17), new com.p314xaae8f345.mm.ui.p2690x38b72420.a7(this, str), activityC22321x6fa86dd0.f288046r, activityC22321x6fa86dd0.f288047s);
            }
        }
        return true;
    }
}
