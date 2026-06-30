package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes7.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f301861a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f301862b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f301863c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f301864d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f301865e;

    public l2(java.lang.Object obj) {
        this.f301861a = obj;
    }

    public java.nio.ByteBuffer a() {
        if (this.f301864d == null) {
            this.f301864d = new by5.i0(this.f301861a, "getBuffer", new java.lang.Class[0]);
        }
        try {
            return (java.nio.ByteBuffer) this.f301864d.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getBuffer invoke failed, error: " + e17);
            return null;
        }
    }

    public int b() {
        if (this.f301862b == null) {
            this.f301862b = new by5.i0(this.f301861a, "getErrorCode", new java.lang.Class[0]);
        }
        try {
            return ((java.lang.Integer) this.f301862b.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getErrorCode invoke failed, error: " + e17);
            return -2;
        }
    }

    public java.lang.String c() {
        if (this.f301863c == null) {
            this.f301863c = new by5.i0(this.f301861a, "getUrl", new java.lang.Class[0]);
        }
        try {
            return (java.lang.String) this.f301863c.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getUrl invoke failed, error: " + e17);
            return null;
        }
    }

    public void d() {
        if (this.f301865e == null) {
            this.f301865e = new by5.i0(this.f301861a, "release", new java.lang.Class[0]);
        }
        try {
            this.f301865e.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "release invoke failed, error: " + e17);
        }
    }
}
