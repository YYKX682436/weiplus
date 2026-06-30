package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class o9 implements r.a {
    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = null;
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.Object obj2 = list.get(i17);
            java.lang.String obj3 = obj2.toString();
            if (!android.text.TextUtils.isEmpty(obj3)) {
                if ((obj2 instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.k9) && com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.f274469b && !((com.p314xaae8f345.mm.sdk.p2603x2137b148.k9) obj2).f274349c) {
                    if (!android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.a(str, obj3)) {
                        sb6.append(' ');
                    }
                    sb6.append(obj3);
                    if (i17 < list.size() - 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.a(obj3, list.get(i17 + 1).toString())) {
                        sb6.append(' ');
                    }
                    str = null;
                } else {
                    sb6.append(obj3);
                    str = obj3;
                }
            }
        }
        return sb6.toString();
    }
}
