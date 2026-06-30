package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class f3 extends com.p314xaae8f345.mm.p971x6de15a2e.x {
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.y
    public void Q7(int i17, int i18, long j17, long j18) {
        int i19;
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            synchronized (com.p314xaae8f345.mm.app.i3.f134983b) {
                com.p314xaae8f345.mm.app.h3 h3Var = (com.p314xaae8f345.mm.app.h3) ((java.util.HashMap) com.p314xaae8f345.mm.app.i3.f134984c).remove(java.lang.Integer.valueOf(i17));
                if (h3Var != null) {
                    com.p314xaae8f345.mm.app.i3.b(h3Var.f134971b, h3Var.f134970a);
                }
            }
            return;
        }
        if (i18 > 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            i19 = 100;
        } else {
            i19 = i18;
        }
        synchronized (com.p314xaae8f345.mm.app.i3.f134983b) {
            com.p314xaae8f345.mm.app.h3 h3Var2 = i19 == 100 ? (com.p314xaae8f345.mm.app.h3) ((java.util.HashMap) com.p314xaae8f345.mm.app.i3.f134984c).remove(java.lang.Integer.valueOf(i17)) : (com.p314xaae8f345.mm.app.h3) ((java.util.HashMap) com.p314xaae8f345.mm.app.i3.f134984c).get(java.lang.Integer.valueOf(i17));
            if (h3Var2 != null) {
                com.p314xaae8f345.mm.app.g3 g3Var = h3Var2.f134971b;
                java.lang.String str = h3Var2.f134970a;
                if (g3Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.app.c3(g3Var, str, i19, j17, j18));
                }
            }
        }
    }
}
