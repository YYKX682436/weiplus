package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.u3 f88963d;

    public t3(com.tencent.mm.plugin.appbrand.u3 u3Var) {
        this.f88963d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f88963d.f89263a.f78450b.S || this.f88963d.f89263a.f78450b.L0()) {
            return;
        }
        java.lang.Class[] clsArr = {al1.b.class, al1.l.class, zl1.t.class};
        for (int i17 = 0; i17 < 3; i17++) {
            this.f88963d.f89263a.f78450b.s0().d(clsArr[i17]);
        }
    }
}
