package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes12.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h0 f225504a = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h0();

    public final long a(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : a(r6Var2);
        }
        return j17;
    }
}
