package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f234641a;

    public final java.lang.String a() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t0.a() + '_' + c() + '_' + this.f234641a;
    }

    public final java.lang.String b(int i17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t0.a() + '_' + c() + '_' + i17;
    }

    public abstract java.lang.String c();

    public abstract int d();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.o0.e():void");
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeOOMMonitor", c() + " reset");
        for (int i17 = 19; -1 < i17; i17--) {
            java.lang.String b17 = b(i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0.f234660b;
            o4Var.W(b17);
            c();
            o4Var.q(b17, -1L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0.f234660b.f274431d.m84114x361a9b();
        this.f234641a = 0;
    }

    public final void g(long j17) {
        if (this.f234641a < 20) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0.f234660b.B(a(), j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeOOMMonitor", c() + " store [" + a() + ", " + j17 + ']');
            this.f234641a = this.f234641a + 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0.f234660b.f274431d.m84114x361a9b();
    }
}
