package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class b5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.n4 f288157n;

    public b5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, java.lang.String str) {
        super(abstractActivityC22312xbd689c47, list, z17, 0);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "Create!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, rd0.z0
    public void f(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = this.f288157n;
        if (n4Var != null) {
            n4Var.d4(str, 0, z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, android.widget.Adapter
    public int getCount() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (i17 >= 0) {
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        super.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "finish!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void u(com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var) {
        this.f288157n = n4Var;
    }
}
