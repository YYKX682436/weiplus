package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f201600d;

    public vg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar, int i17, int i18) {
        this.f201600d = bhVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String m57974xa5e154b5;
        java.lang.String m57972xa23efc4f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f201600d;
        int i18 = bhVar.K;
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = bhVar.G;
        if (itemId == 0) {
            bhVar.K = 1;
            m57972xa23efc4f = bhVar.m57972xa23efc4f();
            textView.setText(m57972xa23efc4f);
        } else if (itemId == 1) {
            bhVar.K = 2;
            m57974xa5e154b5 = bhVar.m57974xa5e154b5();
            textView.setText(m57974xa5e154b5);
        }
        if (i18 != bhVar.K) {
            bhVar.j();
        }
    }
}
