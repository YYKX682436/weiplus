package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class z0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293585d;

    public z0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f293585d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        db5.s4 s4Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293585d;
        if (i17 >= k0Var.P.size()) {
            return false;
        }
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) k0Var.P.f309877d).get(i17);
        if (h4Var != null && h4Var.f309908s) {
            return false;
        }
        if (i17 < k0Var.P.size() && (s4Var = k0Var.f293419x) != null) {
            s4Var.a(k0Var.P.getItem(i17), i17);
        }
        k0Var.f293421x1.m8146xced61ae5();
        return false;
    }
}
