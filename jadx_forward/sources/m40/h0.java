package m40;

/* loaded from: classes10.dex */
public interface h0 extends i95.m {
    static com.p314xaae8f345.mm.p944x882e457a.i ci(m40.h0 h0Var, long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, dm.w3 w3Var, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, int i19, java.lang.String str4, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }
        boolean z27 = (i27 & 32) != 0 ? false : z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i27 & 64) != 0 ? null : gVar;
        dm.w3 w3Var2 = (i27 & 128) == 0 ? w3Var : null;
        long j19 = (i27 & 256) != 0 ? 0L : j18;
        java.lang.String username = (i27 & 512) != 0 ? "" : str2;
        boolean z28 = (i27 & 1024) != 0 ? true : z18;
        boolean z29 = (i27 & 2048) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i27 & 4096) != 0 ? "" : str3;
        int i28 = (i27 & 16384) != 0 ? 6 : i19;
        java.lang.String clientUdfKv = (i27 & 32768) != 0 ? "" : str4;
        ((j40.m) h0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedObjectId, "encryptedObjectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientUdfKv, "clientUdfKv");
        return ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ai(j17, str, i17, i18, feedUsername, z27, gVar2, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var2, j19, username, z28, z29, encryptedObjectId, qt2Var, i28, clientUdfKv);
    }
}
