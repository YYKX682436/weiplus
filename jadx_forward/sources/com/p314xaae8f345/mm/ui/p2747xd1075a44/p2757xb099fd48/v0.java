package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class v0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293543d;

    public v0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f293543d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293543d;
        if (i17 < k0Var.L.size() || k0Var.M.size() <= 0 || i17 >= k0Var.L.size() + k0Var.M.size()) {
            return true;
        }
        db5.h4 h4Var = (db5.h4) k0Var.M.getItem(i17 - k0Var.L.size());
        if (h4Var == null || h4Var.f309908s) {
            return false;
        }
        db5.s4 s4Var = k0Var.f293416u;
        if (s4Var == null) {
            return true;
        }
        s4Var.a(h4Var, i17);
        return true;
    }
}
