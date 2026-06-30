package com.tencent.mm.app;

/* loaded from: classes.dex */
public class j2 extends ak0.k {
    @Override // ak0.k
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 2 || i17 == 3) {
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i(str, str2);
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.w(str, str2);
        } else if (i17 == 6) {
            com.tencent.mars.xlog.Log.e(str, str2);
        } else {
            throw new java.lang.IllegalStateException("Unknown log priority " + i17);
        }
    }
}
