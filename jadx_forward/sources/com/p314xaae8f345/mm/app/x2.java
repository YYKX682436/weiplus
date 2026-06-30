package com.p314xaae8f345.mm.app;

/* loaded from: classes3.dex */
public enum x2 implements sk0.a {
    INSTANCE;

    @Override // sk0.a
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, objArr);
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2, objArr);
        } else if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2, objArr);
        } else {
            if (i17 != 7) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2, objArr);
        }
    }
}
