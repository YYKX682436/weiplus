package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class rc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d f146019d;

    public rc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d activityC10369x3b98011d) {
        this.f146019d = activityC10369x3b98011d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d activityC10369x3b98011d = this.f146019d;
        java.lang.String string = activityC10369x3b98011d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4c);
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d.f145500v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(activityC10369x3b98011d.f145514q);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 u17 = db5.e1.u(activityC10369x3b98011d, string, arrayList.size() <= 3 ? activityC10369x3b98011d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofr, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC10369x3b98011d.d7(arrayList), "、")) : activityC10369x3b98011d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofs, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC10369x3b98011d.d7(arrayList.subList(0, 3)), "、"), java.lang.Integer.valueOf(arrayList.size())), new com.p314xaae8f345.mm.p648x55baa833.ui.pc(this), new com.p314xaae8f345.mm.p648x55baa833.ui.qc(this));
        u17.f293364i.setMaxLines(4);
        android.widget.Button button = u17.f293362g;
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ofo);
        button.setTextColor(activityC10369x3b98011d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        return false;
    }
}
