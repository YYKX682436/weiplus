package com.tencent.mm.booter;

/* loaded from: classes.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63455d;

    public n2(int i17) {
        this.f63455d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10675, this.f63455d + "," + com.tencent.mm.sdk.platformtools.a0.f192439b);
    }
}
