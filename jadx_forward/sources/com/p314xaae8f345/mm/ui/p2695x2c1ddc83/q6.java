package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289553d;

    public q6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289553d = c22376x88ed722d;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = this.f289553d;
            if (i17 >= c22376x88ed722d.f288905o.getChildCount()) {
                return;
            }
            yf5.n nVar = (yf5.n) c22376x88ed722d.f288905o.getChildAt(i17).getTag();
            if (nVar != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(nVar.f543459m)) {
                c22376x88ed722d.f288905o.m80528x14659756(i17);
                return;
            }
            i17++;
        }
    }
}
