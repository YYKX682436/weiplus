package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f201856d;

    public xg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar, int i17, int i18) {
        this.f201856d = bhVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f201856d;
        int i18 = bhVar.L;
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = bhVar.H;
        if (itemId == 0) {
            bhVar.L = 1;
            textView.setText(bhVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573056lu2));
        } else if (itemId == 1) {
            bhVar.L = 2;
            textView.setText(bhVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.luo));
        }
        if (i18 != bhVar.L) {
            bhVar.j();
        }
    }
}
