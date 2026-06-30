package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class f5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 implements rd0.z0 {

    /* renamed from: m, reason: collision with root package name */
    public final rd0.a1 f288237m;

    public f5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, int i17) {
        super(abstractActivityC22312xbd689c47, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f288237m = new qd0.n0(this, list);
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d a(int i17, int i18) {
        return ((qd0.n0) this.f288237m).f(i17, i18);
    }

    @Override // rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d c(int i17) {
        return ((qd0.n0) this.f288237m).d(i17);
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d d(int i17) {
        return ((qd0.n0) this.f288237m).c(i17);
    }

    public void f(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = this.f288584i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), z17);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((qd0.n0) this.f288237m).f443108z;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        return ((qd0.n0) this.f288237m).e(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "finish!");
        r();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18;
        qd0.n0 n0Var = (qd0.n0) this.f288237m;
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = n0Var.f443103u;
        int headerViewsCount = i17 - o4Var.f288609d.O3().getHeaderViewsCount();
        int i19 = n0Var.f443087e;
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = o4Var.f288609d;
        if (headerViewsCount == i19) {
            if (n0Var.f443086d) {
                int selectedItemPosition = l4Var.O3().getSelectedItemPosition();
                n0Var.f443086d = false;
                n0Var.j(n0Var.f443096n, true, false);
                l4Var.O3().setSelection(selectedItemPosition);
            } else {
                n0Var.f443086d = true;
                n0Var.j(n0Var.f443096n, true, false);
                l4Var.O3().setSelection(n0Var.f443087e);
            }
        } else {
            if (headerViewsCount != n0Var.f443090h) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = o4Var.getItem(headerViewsCount);
                if (item == null || !item.f288388x || (i18 = n0Var.f443083a) == Integer.MAX_VALUE) {
                    return false;
                }
                if (item.f288366b == i18) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.c9.b(1);
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2690x38b72420.c9.b(0);
                return false;
            }
            if (n0Var.f443089g) {
                int selectedItemPosition2 = l4Var.O3().getSelectedItemPosition();
                n0Var.f443089g = false;
                n0Var.j(n0Var.f443096n, true, false);
                l4Var.O3().setSelection(selectedItemPosition2);
            } else {
                n0Var.f443089g = true;
                n0Var.j(n0Var.f443096n, true, false);
                l4Var.O3().setSelection(n0Var.f443090h);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        qd0.n0 n0Var = (qd0.n0) this.f288237m;
        n0Var.getClass();
        int i17 = dVar.f288366b + 1;
        int[] iArr = {n0Var.f443084b, n0Var.f443085c, n0Var.f443088f, n0Var.f443091i};
        for (int i18 = 0; i18 < 4; i18++) {
            if (i17 == iArr[i18]) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        ((qd0.n0) this.f288237m).i();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        ((qd0.n0) this.f288237m).g(str, iArr, z17);
    }

    public f5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, int i17, boolean z18, int i18) {
        super(abstractActivityC22312xbd689c47, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f288237m = new qd0.n0(this, list, z18, i18);
    }

    public f5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, int i17, boolean z18, boolean z19) {
        super(abstractActivityC22312xbd689c47, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f288237m = new qd0.n0(this, list, z18, z19);
    }
}
