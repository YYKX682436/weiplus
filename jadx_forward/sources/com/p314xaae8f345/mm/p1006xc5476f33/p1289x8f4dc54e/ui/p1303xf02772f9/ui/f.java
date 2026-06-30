package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.f f176103a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.f();

    public final boolean a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, java.lang.String str) {
        c22624x85d69039.b(str);
        return ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) c22624x85d69039.i(i65.a.b(c22624x85d69039.getContext(), 232), Integer.MAX_VALUE)).L > 1;
    }

    public final java.lang.String b(java.lang.String[] strArr, int i17) {
        int length = strArr.length;
        java.lang.String str = "";
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            java.lang.String str2 = strArr[i18];
            int i27 = i19 + 1;
            if (i19 <= i17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                if (i19 != i17) {
                    str2 = str2 + (char) 12289;
                }
                sb6.append(str2);
                str = sb6.toString();
            }
            i18++;
            i19 = i27;
        }
        return str;
    }
}
