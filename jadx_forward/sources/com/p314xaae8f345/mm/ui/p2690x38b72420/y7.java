package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class y7 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment f288795d;

    public y7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f288795d = openIMAddressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMAddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i17);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment = this.f288795d;
        if (i17 < openIMAddressUIFragment.f288052e.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIMAddressUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = openIMAddressUIFragment.f288054g;
        if (uVar != null && uVar.f544447x) {
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g item = openIMAddressUIFragment.f288053f.getItem(i17 - openIMAddressUIFragment.f288052e.getHeaderViewsCount());
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMAddressUI", "cont is null. position:%d, header count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(openIMAddressUIFragment.f288052e.getHeaderViewsCount()));
            return true;
        }
        java.lang.String e17 = item.e();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(e17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.b4(e17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(e17)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment2 = this.f288795d;
            openIMAddressUIFragment2.f288055h = e17;
            openIMAddressUIFragment2.f288056i.g(view, i17, j17, openIMAddressUIFragment2, openIMAddressUIFragment2.f288062r, openIMAddressUIFragment2.f288057m, openIMAddressUIFragment2.f288058n);
        }
        return true;
    }
}
