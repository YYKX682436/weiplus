package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288269d;

    public h(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288269d = addressUIFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i17);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288269d;
        if (i17 < addressUIFragment.f287840o.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddressUI", "on item long click, but match header view");
            return true;
        }
        yk5.u uVar = addressUIFragment.f287843r;
        if (uVar != null && uVar.f544447x) {
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g item = addressUIFragment.f287842q.getItem(i17 - addressUIFragment.f287840o.getHeaderViewsCount());
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddressUI", "cont is null. position:%d, header count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(addressUIFragment.f287840o.getHeaderViewsCount()));
            return true;
        }
        java.lang.String e17 = item.e();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(e17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.b4(e17)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment2 = this.f288269d;
            addressUIFragment2.f287846u = e17;
            addressUIFragment2.H.g(view, i17, j17, addressUIFragment2, addressUIFragment2.S, addressUIFragment2.I, addressUIFragment2.f287839J);
        }
        return true;
    }
}
