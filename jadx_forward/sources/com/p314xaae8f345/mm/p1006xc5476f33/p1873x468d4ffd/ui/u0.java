package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes3.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 f230962d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 c16553x9b9a9a23) {
        this.f230962d = c16553x9b9a9a23;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 c16553x9b9a9a23 = this.f230962d;
        c16553x9b9a9a23.f230753g.setText(java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Long.valueOf(((c16553x9b9a9a23.f230756m - 400) - c16553x9b9a9a23.f230755i) / java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)), java.lang.Long.valueOf(java.lang.Math.max(java.lang.Math.round((r1 % r3.toMillis(1L)) / java.util.concurrent.TimeUnit.SECONDS.toMillis(1L)), 0L))));
        c16553x9b9a9a23.f230750d.mo50297x7c4d7ca2(this, 1000L);
        c16553x9b9a9a23.f230755i += 1000;
    }
}
