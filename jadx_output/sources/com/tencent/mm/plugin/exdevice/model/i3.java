package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f98922d;

    public i3(com.tencent.mm.plugin.exdevice.model.j3 j3Var, java.lang.Object obj) {
        this.f98922d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = (java.lang.String) this.f98922d;
        if (!com.tencent.mm.plugin.exdevice.model.l3.Ri().y0(str) || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str)) {
            return;
        }
        gm0.j1.n().f273288b.g(new p32.i(str, null));
    }
}
