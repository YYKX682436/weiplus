package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class z2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        ph.u uVar;
        rh.e3 i17;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        gi.u0.f272123a = true;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null || (i17 = uVar.f354296h.i(sh.c.class)) == null) {
            return;
        }
        ((sh.c) i17).o();
    }
}
