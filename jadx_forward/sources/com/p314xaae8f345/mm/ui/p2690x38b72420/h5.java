package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f288286n;

    public h5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, java.lang.String str) {
        super(abstractActivityC22312xbd689c47, list, z17, 0);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f288286n = hashSet;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchSportContactAdapter", "matchUsernameSet %s", java.lang.Integer.valueOf(hashSet.size()));
        }
        ((qd0.n0) ((rd0.c1) this.f288237m)).f443104v = new com.p314xaae8f345.mm.ui.p2690x38b72420.g5(this);
    }
}
