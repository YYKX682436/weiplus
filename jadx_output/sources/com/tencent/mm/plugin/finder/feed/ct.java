package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public interface ct extends fs2.c {
    static void i(com.tencent.mm.plugin.finder.feed.ct ctVar, long j17, boolean z17, boolean z18, rn5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoFlingToRefresh");
        }
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        if ((i17 & 8) != 0) {
            aVar = null;
        }
        com.tencent.mm.plugin.finder.feed.v00 v00Var = (com.tencent.mm.plugin.finder.feed.v00) ctVar;
        if (j17 <= 0) {
            v00Var.l().M(z17, z18, aVar);
        } else {
            v00Var.l().postDelayed(new com.tencent.mm.plugin.finder.feed.j00(v00Var, z17, z18, aVar), j17);
        }
    }
}
