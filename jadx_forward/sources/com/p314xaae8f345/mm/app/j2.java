package com.p314xaae8f345.mm.app;

/* loaded from: classes.dex */
public class j2 extends ak0.k {
    @Override // ak0.k
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 2 || i17 == 3) {
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2);
        } else if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        } else {
            throw new java.lang.IllegalStateException("Unknown log priority " + i17);
        }
    }
}
