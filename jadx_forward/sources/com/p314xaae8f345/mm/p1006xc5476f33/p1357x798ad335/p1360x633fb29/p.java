package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f178638e;

    public p(long j17, int i17) {
        this.f178637d = j17;
        this.f178638e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f178637d;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        if (c17.f68441x10a0fed7 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().x(c17);
        }
        c17.f68410x4e46f707 = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        g02.c cVar = new g02.c();
        cVar.a(c17);
        g02.b.c(24, cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178649a.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f178638e + 1));
    }
}
