package com.tencent.mm.app;

/* loaded from: classes3.dex */
public enum x2 implements sk0.a {
    INSTANCE;

    @Override // sk0.a
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i(str, str2, objArr);
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.w(str, str2, objArr);
        } else if (i17 == 6) {
            com.tencent.mars.xlog.Log.e(str, str2, objArr);
        } else {
            if (i17 != 7) {
                return;
            }
            com.tencent.mars.xlog.Log.e(str, str2, objArr);
        }
    }
}
