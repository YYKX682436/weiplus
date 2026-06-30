package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class hb {

    /* renamed from: a, reason: collision with root package name */
    public final sun.misc.Unsafe f45172a;

    public hb(sun.misc.Unsafe unsafe) {
        this.f45172a = unsafe;
    }

    public final int a(java.lang.Class cls) {
        return this.f45172a.arrayBaseOffset(cls);
    }

    public final int b(java.lang.Class cls) {
        return this.f45172a.arrayIndexScale(cls);
    }

    public abstract void c(long j17, byte[] bArr, long j18, long j19);

    public abstract boolean d(java.lang.Object obj, long j17);

    public abstract byte e(long j17);

    public abstract byte f(java.lang.Object obj, long j17);

    public abstract double g(java.lang.Object obj, long j17);

    public abstract float h(java.lang.Object obj, long j17);

    public final int i(java.lang.Object obj, long j17) {
        return this.f45172a.getInt(obj, j17);
    }

    public final long j(java.lang.Object obj, long j17) {
        return this.f45172a.getLong(obj, j17);
    }

    public final java.lang.Object k(java.lang.Object obj, long j17) {
        return this.f45172a.getObject(obj, j17);
    }

    public final long l(java.lang.reflect.Field field) {
        return this.f45172a.objectFieldOffset(field);
    }

    public abstract void m(java.lang.Object obj, long j17, boolean z17);

    public abstract void n(java.lang.Object obj, long j17, byte b17);

    public abstract void o(java.lang.Object obj, long j17, double d17);

    public abstract void p(java.lang.Object obj, long j17, float f17);

    public final void q(java.lang.Object obj, long j17, int i17) {
        this.f45172a.putInt(obj, j17, i17);
    }

    public final void r(java.lang.Object obj, long j17, long j18) {
        this.f45172a.putLong(obj, j17, j18);
    }

    public final void s(java.lang.Object obj, long j17, java.lang.Object obj2) {
        this.f45172a.putObject(obj, j17, obj2);
    }
}
