package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes.dex */
public enum b0 {
    /* JADX INFO: Fake field, exist only in values array */
    DoNothing(0),
    /* JADX INFO: Fake field, exist only in values array */
    DoCache(1),
    /* JADX INFO: Fake field, exist only in values array */
    DoDecrypt(2),
    /* JADX INFO: Fake field, exist only in values array */
    DoDelete(4);

    b0(int i17) {
    }

    public static int a(java.lang.String str) {
        if ("cache".equals(str)) {
            return 1;
        }
        if ("delete".equals(str)) {
            return 4;
        }
        return "decrypt".equals(str) ? 2 : 0;
    }
}
