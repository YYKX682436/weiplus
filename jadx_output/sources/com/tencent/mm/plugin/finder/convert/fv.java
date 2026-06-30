package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fv {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ys f103423a;

    /* renamed from: b, reason: collision with root package name */
    public long f103424b;

    /* renamed from: c, reason: collision with root package name */
    public long f103425c;

    /* renamed from: d, reason: collision with root package name */
    public int f103426d;

    public fv(com.tencent.mm.plugin.finder.feed.ys ysVar, long j17, long j18, long j19, int i17) {
        this.f103423a = ysVar;
        this.f103424b = j17;
        this.f103425c = j19;
        this.f103426d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.fv)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.fv fvVar = (com.tencent.mm.plugin.finder.convert.fv) obj;
        return kotlin.jvm.internal.o.b(this.f103423a, fvVar.f103423a) && this.f103424b == fvVar.f103424b && this.f103425c == fvVar.f103425c && this.f103426d == fvVar.f103426d;
    }

    public int hashCode() {
        com.tencent.mm.plugin.finder.feed.ys ysVar = this.f103423a;
        return ((((((((ysVar == null ? 0 : ysVar.hashCode()) * 31) + java.lang.Long.hashCode(this.f103424b)) * 31) + java.lang.Long.hashCode(0L)) * 31) + java.lang.Long.hashCode(this.f103425c)) * 31) + java.lang.Integer.hashCode(this.f103426d);
    }

    public java.lang.String toString() {
        return "ExposeItem(item=" + this.f103423a + ", feedId=" + this.f103424b + ", sumTimeMs=0, startTimeMs=" + this.f103425c + ", position=" + this.f103426d + ')';
    }
}
