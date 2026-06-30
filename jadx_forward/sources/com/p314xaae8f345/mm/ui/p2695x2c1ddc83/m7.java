package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class m7 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 f289403a;

    public m7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var) {
        this.f289403a = q7Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = this.f289403a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = q7Var.f289555p;
        if (y7Var != null) {
            y7Var.c();
        }
        q7Var.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var = this.f289403a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = q7Var.f289555p;
        if (y7Var != null) {
            y7Var.c();
        }
        q7Var.notifyDataSetInvalidated();
    }
}
