package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class ta extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.sa f288732m;

    public ta(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, com.p314xaae8f345.mm.ui.p2690x38b72420.sa saVar) {
        super(l4Var, false, 0);
        this.f288732m = saVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f288732m.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        return this.f288732m.j(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.sa saVar = this.f288732m;
        if (!saVar.f288714q.equalsIgnoreCase("")) {
            saVar.f288714q = "";
        }
        saVar.s();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.sa saVar = this.f288732m;
        if (!saVar.f288714q.equalsIgnoreCase(str)) {
            saVar.f288714q = str;
        }
        saVar.s();
        com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = this.f288584i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), true);
        }
    }
}
