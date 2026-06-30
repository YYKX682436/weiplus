package ss5;

/* loaded from: classes3.dex */
public interface k0 extends i95.m {
    static com.p314xaae8f345.mm.p944x882e457a.i B4(ss5.k0 k0Var, r45.kv0 kv0Var, java.lang.String str, byte[] bArr, long j17, long j18, java.lang.String nonceId, java.lang.String str2, int i17, boolean z17, int i18, r45.rn1 rn1Var, int i19, r45.qt2 qt2Var, java.lang.String str3, ss5.j0 callback, java.lang.String str4, r45.qm1 qm1Var, r45.o72 o72Var, boolean z18, r45.y12 y12Var, r45.x82 x82Var, long j19, r45.wm1 wm1Var, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCgiFinderGetLiveMsg");
        }
        int i28 = (i27 & 512) != 0 ? 0 : i18;
        r45.rn1 rn1Var2 = (i27 & 1024) != 0 ? null : rn1Var;
        int i29 = (i27 & 2048) != 0 ? 4 : i19;
        r45.qt2 contextObj = (i27 & 4096) != 0 ? new r45.qt2() : qt2Var;
        java.lang.String str5 = (i27 & 8192) != 0 ? null : str3;
        r45.o72 o72Var2 = (131072 & i27) != 0 ? null : o72Var;
        boolean z19 = (262144 & i27) != 0 ? false : z18;
        r45.y12 y12Var2 = (524288 & i27) != 0 ? null : y12Var;
        r45.x82 x82Var2 = (1048576 & i27) != 0 ? null : x82Var;
        r45.wm1 wm1Var2 = (i27 & 4194304) != 0 ? null : wm1Var;
        ((ke2.v0) k0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        return new ke2.c(kv0Var == null ? db2.t4.f309704a.b(3976, contextObj) : kv0Var, str, bArr, j17, j18, nonceId, str2, i17, z17, i28, rn1Var2, i29, contextObj, str5, callback, str4, qm1Var, o72Var2, z19, y12Var2, x82Var2, j19, wm1Var2);
    }
}
