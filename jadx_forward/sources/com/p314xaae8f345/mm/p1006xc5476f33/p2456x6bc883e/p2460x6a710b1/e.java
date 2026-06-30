package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270024d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g gVar, java.util.List list) {
        this.f270024d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f270024d;
            if (i17 >= list.size() || i17 >= 5) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0.b().d((java.lang.String) list.get(i17), false);
            i17++;
        }
    }
}
