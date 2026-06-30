package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public interface p {
    static /* synthetic */ void b(com.tencent.mm.plugin.appbrand.headless.p pVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i18 & 2) != 0) {
            str = null;
        }
        pVar.a(i17, str);
    }

    void a(int i17, java.lang.String str);

    void onSuccess(java.lang.String str);
}
