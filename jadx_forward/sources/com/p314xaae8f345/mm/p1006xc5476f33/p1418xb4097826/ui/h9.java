package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class h9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f210853d;

    public h9(int i17, v65.n nVar, int i18) {
        this.f210853d = nVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        v65.n nVar = this.f210853d;
        if (valueOf != null && valueOf.intValue() == 1) {
            nVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n8.f211073d);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            nVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n8.f211074e);
        }
    }
}
