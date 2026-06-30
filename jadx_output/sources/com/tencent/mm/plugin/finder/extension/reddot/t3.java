package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes5.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.t3 f105871d = new com.tencent.mm.plugin.finder.extension.reddot.t3();

    @Override // java.lang.Runnable
    public final void run() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_COUNT_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_LAST_TIME_LONG_SYNC, 0L);
    }
}
