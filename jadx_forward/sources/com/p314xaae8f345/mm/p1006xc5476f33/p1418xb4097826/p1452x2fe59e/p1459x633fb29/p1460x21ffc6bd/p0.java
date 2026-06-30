package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.o0 f35742x233c02ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.o0(null);

    /* renamed from: DEBUG */
    private static final boolean f35743x3de9e33 = false;
    private java.lang.String TAG = "Finder." + getClass().getSimpleName() + '_' + hashCode();

    /* renamed from: fetch$default */
    public static /* synthetic */ void m56461x34ddd257(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 p0Var, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, boolean z17, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        p0Var.mo56275x5cd06ba(obj, n0Var, z17);
    }

    /* renamed from: fetchLoadMore$default */
    public static /* synthetic */ void m56462x2f1fc2d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLoadMore");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        p0Var.mo56024xaef8a235(n0Var, z17);
    }

    /* renamed from: alive */
    public void mo56311x58998cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "alive.");
    }

    /* renamed from: dead */
    public void mo56312x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "dead.");
    }

    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    /* renamed from: fetchInit */
    public abstract void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var);

    /* renamed from: fetchLoadMore */
    public abstract void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, boolean z17);

    /* renamed from: fetchPreload */
    public void mo56463x5a77d9ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    /* renamed from: fetchRefresh */
    public abstract void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var);

    /* renamed from: getTAG */
    public java.lang.String m56464xb5886c64() {
        return this.TAG;
    }

    /* renamed from: setTAG */
    public void m56465xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.TAG = str;
    }
}
