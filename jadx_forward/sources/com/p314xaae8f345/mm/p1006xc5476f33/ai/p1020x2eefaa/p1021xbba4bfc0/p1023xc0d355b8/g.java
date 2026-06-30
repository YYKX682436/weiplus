package com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8;

/* loaded from: classes8.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f156202a = new com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.C11502x8b5df69f(this, com.p314xaae8f345.mm.app.a0.f134821d);

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.g gVar, java.lang.String str) {
        java.lang.String[] split;
        gVar.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (split = str.split(",")) != null && split.length >= 5 && "All".equals(split[1])) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[3], 0L) / 1000;
            long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[4], 0L) / 1000;
            c81.b wi6 = c81.b.wi();
            wi6.m134976x2690a4ac();
            wi6.f121189d.c("last_enter_finder_time", V);
            c81.b wi7 = c81.b.wi();
            wi7.m134976x2690a4ac();
            wi7.f121189d.c("last_exit_finder_time", V2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h
    public void a() {
        this.f156202a.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h
    public void b() {
        this.f156202a.mo48814x2efc64();
    }
}
