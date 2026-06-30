package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f229489f;

    public c0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f229487d = str;
        this.f229488e = str2;
        this.f229489f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        je3.i.x2((je3.i) c17, "MagicTempFileClearTimeout", 1, null, 1.0f, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout! " + this.f229487d + " deletePath " + this.f229488e);
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b0(this.f229488e, this.f229487d, this.f229489f));
    }
}
