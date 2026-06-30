package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class f3 extends com.tencent.mm.network.x {
    @Override // com.tencent.mm.network.y
    public void Q7(int i17, int i18, long j17, long j18) {
        int i19;
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            synchronized (com.tencent.mm.app.i3.f53450b) {
                com.tencent.mm.app.h3 h3Var = (com.tencent.mm.app.h3) ((java.util.HashMap) com.tencent.mm.app.i3.f53451c).remove(java.lang.Integer.valueOf(i17));
                if (h3Var != null) {
                    com.tencent.mm.app.i3.b(h3Var.f53438b, h3Var.f53437a);
                }
            }
            return;
        }
        if (i18 > 100) {
            com.tencent.mars.xlog.Log.w("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            i19 = 100;
        } else {
            i19 = i18;
        }
        synchronized (com.tencent.mm.app.i3.f53450b) {
            com.tencent.mm.app.h3 h3Var2 = i19 == 100 ? (com.tencent.mm.app.h3) ((java.util.HashMap) com.tencent.mm.app.i3.f53451c).remove(java.lang.Integer.valueOf(i17)) : (com.tencent.mm.app.h3) ((java.util.HashMap) com.tencent.mm.app.i3.f53451c).get(java.lang.Integer.valueOf(i17));
            if (h3Var2 != null) {
                com.tencent.mm.app.g3 g3Var = h3Var2.f53438b;
                java.lang.String str = h3Var2.f53437a;
                if (g3Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.app.c3(g3Var, str, i19, j17, j18));
                }
            }
        }
    }
}
