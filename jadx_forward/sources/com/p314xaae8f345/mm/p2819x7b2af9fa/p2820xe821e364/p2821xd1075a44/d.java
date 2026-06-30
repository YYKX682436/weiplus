package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f296022a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d f296023b;

    public void a(int i17) {
        if (i17 < 64) {
            this.f296022a &= ~(1 << i17);
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = this.f296023b;
        if (dVar != null) {
            dVar.a(i17 - 64);
        }
    }

    public int b(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = this.f296023b;
        return dVar == null ? i17 >= 64 ? java.lang.Long.bitCount(this.f296022a) : java.lang.Long.bitCount(this.f296022a & ((1 << i17) - 1)) : i17 < 64 ? java.lang.Long.bitCount(this.f296022a & ((1 << i17) - 1)) : dVar.b(i17 - 64) + java.lang.Long.bitCount(this.f296022a);
    }

    public final void c() {
        if (this.f296023b == null) {
            this.f296023b = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d();
        }
    }

    public boolean d(int i17) {
        if (i17 < 64) {
            return (this.f296022a & (1 << i17)) != 0;
        }
        c();
        return this.f296023b.d(i17 - 64);
    }

    public void e(int i17, boolean z17) {
        if (i17 >= 64) {
            c();
            this.f296023b.e(i17 - 64, z17);
            return;
        }
        long j17 = this.f296022a;
        boolean z18 = (Long.MIN_VALUE & j17) != 0;
        long j18 = (1 << i17) - 1;
        this.f296022a = ((j17 & (~j18)) << 1) | (j17 & j18);
        if (z17) {
            h(i17);
        } else {
            a(i17);
        }
        if (z18 || this.f296023b != null) {
            c();
            this.f296023b.e(0, z18);
        }
    }

    public boolean f(int i17) {
        if (i17 >= 64) {
            c();
            return this.f296023b.f(i17 - 64);
        }
        long j17 = 1 << i17;
        long j18 = this.f296022a;
        boolean z17 = (j18 & j17) != 0;
        long j19 = j18 & (~j17);
        this.f296022a = j19;
        long j27 = j17 - 1;
        this.f296022a = (j19 & j27) | java.lang.Long.rotateRight((~j27) & j19, 1);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = this.f296023b;
        if (dVar != null) {
            if (dVar.d(0)) {
                h(63);
            }
            this.f296023b.f(0);
        }
        return z17;
    }

    public void g() {
        this.f296022a = 0L;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d dVar = this.f296023b;
        if (dVar != null) {
            dVar.g();
        }
    }

    public void h(int i17) {
        if (i17 < 64) {
            this.f296022a |= 1 << i17;
        } else {
            c();
            this.f296023b.h(i17 - 64);
        }
    }

    /* renamed from: toString */
    public java.lang.String m83632x9616526c() {
        if (this.f296023b == null) {
            return java.lang.Long.toBinaryString(this.f296022a);
        }
        return this.f296023b.m83632x9616526c() + "xx" + java.lang.Long.toBinaryString(this.f296022a);
    }
}
