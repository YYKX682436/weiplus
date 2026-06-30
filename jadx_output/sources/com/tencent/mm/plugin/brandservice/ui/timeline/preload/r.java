package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.r f94422d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (eq1.n0.f255843g) {
            r45.wm6 wm6Var = new r45.wm6();
            wm6Var.f389292d = 6;
            wm6Var.f389293e = (int) (java.lang.System.currentTimeMillis() / 1000);
            jz5.g gVar = eq1.n0.f255842f;
            wm6Var.f389295g = (java.lang.String) ((jz5.n) gVar).getValue();
            wm6Var.f389301p = (java.lang.String) ((jz5.n) gVar).getValue();
            return wm6Var;
        }
        r45.vm6 f17 = is1.l.f(6);
        r45.wm6 wm6Var2 = new r45.wm6();
        wm6Var2.f389295g = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.a(f17) + "videoPrefetcher.js";
        wm6Var2.f389301p = f17.f388374f;
        wm6Var2.f389293e = f17.f388373e;
        return wm6Var2;
    }
}
