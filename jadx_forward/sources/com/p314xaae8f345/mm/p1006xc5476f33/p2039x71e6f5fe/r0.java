package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes12.dex */
public class r0 implements e04.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0 f240669d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0 q0Var) {
        this.f240669d = q0Var;
    }

    @Override // e04.v2
    public void v5(int i17, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "drawTranslationResult() called with: sessionId = [" + i17 + "], newBitmap = [" + bitmap + "]");
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0 q0Var = this.f240669d;
            if (q0Var.f240658o.containsKey(java.lang.Integer.valueOf(i17))) {
                if (q0Var.f240659p.containsKey(java.lang.Integer.valueOf(i17)) && q0Var.f240660q.containsKey(java.lang.Integer.valueOf(i17))) {
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i17))).f141283i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f240660q.get(java.lang.Integer.valueOf(i17))).longValue();
                    ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i17))).k();
                    q0Var.f240659p.remove(java.lang.Integer.valueOf(i17));
                    q0Var.f240660q.remove(java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(q0Var.f240659p.size()), java.lang.Integer.valueOf(q0Var.f240660q.size()));
                }
                if (gm0.j1.a()) {
                    java.lang.String Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).Zi("jpg");
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o2();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2) q0Var.f240658o.get(java.lang.Integer.valueOf(i17));
                        o2Var.f65913x8ebc8b93 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(p2Var.f240508a + com.p314xaae8f345.mm.vfs.w6.l(p2Var.f240508a));
                        o2Var.f65916x970b0f9e = Zi;
                        o2Var.f65912xd38f425d = p2Var.f240510c;
                        o2Var.f65919x12058dee = p2Var.f240511d;
                        o2Var.f65911x28e32c02 = p2Var.f240512e;
                        o2Var.f65915xd108e39c = p2Var.f240514g;
                        o2Var.f65914xc84b1af5 = p2Var.f240515h;
                        o2Var.f65918x22181090 = p2Var.f240516i;
                        o2Var.f65917x195a47e9 = p2Var.f240517j;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanTranslation", "translate %d success, insert translate result %s", java.lang.Integer.valueOf(i17), Zi);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).cj().z0(o2Var);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409();
                        am.ct ctVar = c5974x1d8a7409.f136272g;
                        ctVar.f87933a = i17;
                        ctVar.f87935c = true;
                        ctVar.f87936d = Zi;
                        ctVar.getClass();
                        ctVar.getClass();
                        if (q0Var.f240659p.containsKey(java.lang.Integer.valueOf(i17))) {
                            ctVar.f87934b = (int) ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) q0Var.f240659p.get(java.lang.Integer.valueOf(i17))).f141278d;
                        }
                        c5974x1d8a7409.e();
                        q0Var.f240658o.remove(java.lang.Integer.valueOf(i17));
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginScanTranslation", e17, "save translate result file error", new java.lang.Object[0]);
                        q0Var.fj(i17);
                    }
                }
            }
        }
    }
}
