package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class r7 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 f289581a;

    public r7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var) {
        this.f289581a = y7Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = this.f289581a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7.a(y7Var, -1);
        y7Var.c();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = this.f289581a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7.b(y7Var, -1);
        y7Var.c();
    }
}
