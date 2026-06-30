package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class l1 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1 f223116a;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.k1 k1Var) {
        this.f223116a = m1Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1 m1Var = this.f223116a;
        m1Var.f223121e = true;
        m1Var.m8146xced61ae5();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1 m1Var = this.f223116a;
        m1Var.f223121e = false;
        m1Var.m8146xced61ae5();
    }
}
