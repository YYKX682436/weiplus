package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp;

/* loaded from: classes7.dex */
public final class f3 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f173714c;

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
        f173714c = new java.util.concurrent.ConcurrentHashMap();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onResolve */
    public final void m53726x910e830d(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        yz5.p pVar = (yz5.p) f173714c.remove(java.lang.Integer.valueOf(i17));
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), result);
        }
    }
}
