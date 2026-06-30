package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224998d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str) {
        this.f224998d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s();
        java.lang.String str = this.f224998d;
        synchronized (s17.f225493n) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_schedule_data");
            if (((java.util.concurrent.ConcurrentHashMap) s17.f225492m).containsKey(str)) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((java.util.concurrent.ConcurrentHashMap) s17.f225492m).get(str)).d();
            }
            ((java.util.concurrent.ConcurrentHashMap) s17.f225492m).remove(str);
            M.remove(str);
        }
    }
}
