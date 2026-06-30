package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class a4$$f implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String str2 = lp0.a.f320252f;
        if (str == null) {
            return null;
        }
        return str.equals(str2) ? str : java.lang.String.format("%s(%s)", str, str2);
    }
}
