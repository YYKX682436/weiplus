package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f166220a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 f166221b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f166222c;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 process) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        this.f166220a = rt6;
        this.f166221b = process;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f166222c = linkedList;
        if (rt6.q2() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a) rt6.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a.class)).f168859f) {
            linkedList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f2.f166138d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("app(");
        sb6.append(rt6.f156336n);
        sb6.append(") mayShowSplashAdWhenLaunch:");
        sb6.append(rt6.v0());
        sb6.append(", isCheckShowAdPrepareProcessReady:");
        sb6.append(rt6.A2 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", sb6.toString());
        if (rt6.v0()) {
            if (!(rt6.A2 != null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + rt6.f156336n + ") do not add prepare orientation action");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + rt6.f156336n + ") add prepare orientation action");
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g2(this));
    }
}
