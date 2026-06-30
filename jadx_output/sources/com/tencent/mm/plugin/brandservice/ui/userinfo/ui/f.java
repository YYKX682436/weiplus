package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.userinfo.ui.f f94570a = new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.f();

    public final boolean a(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, java.lang.String str) {
        mMNeat7extView.b(str);
        return ((com.tencent.neattextview.textview.layout.NeatLayout) mMNeat7extView.i(i65.a.b(mMNeat7extView.getContext(), 232), Integer.MAX_VALUE)).L > 1;
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
