package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f82094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82096c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82097d;

    public u7(long j17, long j18, int i17, int i18) {
        this.f82094a = j17;
        this.f82095b = j18;
        this.f82096c = i17;
        this.f82097d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.media.u7)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.u7 u7Var = (com.tencent.mm.plugin.appbrand.jsapi.media.u7) obj;
        return this.f82094a == u7Var.f82094a && this.f82095b == u7Var.f82095b && this.f82096c == u7Var.f82096c && this.f82097d == u7Var.f82097d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f82094a) * 31) + java.lang.Long.hashCode(this.f82095b)) * 31) + java.lang.Integer.hashCode(this.f82096c)) * 31) + java.lang.Integer.hashCode(this.f82097d);
    }

    public java.lang.String toString() {
        return "VideoMetaData(duration=" + this.f82094a + ", size=" + this.f82095b + ", width=" + this.f82096c + ", height=" + this.f82097d + ')';
    }
}
