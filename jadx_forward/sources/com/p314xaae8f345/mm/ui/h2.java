package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f290303a;

    /* renamed from: b, reason: collision with root package name */
    public long f290304b;

    public h2(long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f290303a = (i17 & 1) != 0 ? 1000L : j17;
    }

    public final boolean a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - this.f290304b < this.f290303a;
        this.f290304b = currentTimeMillis;
        return z17;
    }
}
