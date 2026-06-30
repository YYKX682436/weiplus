package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes10.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f144861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144862f;

    public e1(int i17, long j17, java.lang.String str) {
        this.f144860d = i17;
        this.f144861e = j17;
        this.f144862f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p642xad8b531f.x1 x1Var = com.p314xaae8f345.mm.p642xad8b531f.x1.f145125a;
        java.util.LinkedList d17 = x1Var.d();
        int i17 = this.f144860d;
        long j17 = this.f144861e;
        java.lang.String str = this.f144862f;
        synchronized (d17) {
            kz5.h0.B(x1Var.d(), new com.p314xaae8f345.mm.p642xad8b531f.d1(i17, j17, str));
        }
    }
}
