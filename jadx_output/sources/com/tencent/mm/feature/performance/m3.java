package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67607e;

    /* renamed from: f, reason: collision with root package name */
    public long f67608f;

    public m3(java.lang.String scope, int i17) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f67606d = scope;
        this.f67607e = i17;
    }

    public final void a() {
        this.f67608f = android.os.SystemClock.uptimeMillis();
        com.tencent.mm.feature.performance.l3 l3Var = com.tencent.mm.feature.performance.r4.f67658h;
        ((android.os.Handler) ((jz5.n) com.tencent.mm.feature.performance.r4.f67659i).getValue()).postDelayed(this, this.f67607e * 60000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ef, code lost:
    
        if (mm.l.c() != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.performance.m3.run():void");
    }
}
