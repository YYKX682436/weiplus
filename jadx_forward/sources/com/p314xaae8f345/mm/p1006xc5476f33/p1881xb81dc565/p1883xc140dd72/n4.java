package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f231266a = new java.util.concurrent.ConcurrentHashMap(1);

    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j4 j4Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m4 m4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.k4(this, m4Var, i17, i18, str, j4Var, z17));
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: on exit");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f231266a).remove(str);
    }
}
