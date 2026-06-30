package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l f282696a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f282697b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f282698c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Long f282699d;

    public final fk4.k a(long j17) {
        return (fk4.k) f282697b.get(java.lang.Long.valueOf(j17));
    }

    public final boolean b(long j17) {
        java.lang.Boolean bool = (java.lang.Boolean) f282698c.get(java.lang.Long.valueOf(j17));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, fk4.k downloader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloader, "downloader");
        f282697b.put(java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()), downloader);
        downloader.f345167v = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k(msgInfo);
    }

    public final fk4.k d(long j17) {
        return (fk4.k) f282697b.remove(java.lang.Long.valueOf(j17));
    }
}
