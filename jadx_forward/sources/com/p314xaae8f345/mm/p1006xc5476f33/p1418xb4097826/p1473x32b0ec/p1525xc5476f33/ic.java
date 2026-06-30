package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public final float f194487a;

    /* renamed from: b, reason: collision with root package name */
    public final float f194488b;

    /* renamed from: c, reason: collision with root package name */
    public final float f194489c;

    /* renamed from: d, reason: collision with root package name */
    public final long f194490d;

    public ic(float f17, float f18, float f19, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 1.0f : f17;
        f18 = (i17 & 2) != 0 ? 1.4f : f18;
        f19 = (i17 & 4) != 0 ? 1.1f : f19;
        j17 = (i17 & 8) != 0 ? 300L : j17;
        this.f194487a = f17;
        this.f194488b = f18;
        this.f194489c = f19;
        this.f194490d = j17;
    }

    /* renamed from: equals */
    public boolean m56975xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic icVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic) obj;
        return java.lang.Float.compare(this.f194487a, icVar.f194487a) == 0 && java.lang.Float.compare(this.f194488b, icVar.f194488b) == 0 && java.lang.Float.compare(this.f194489c, icVar.f194489c) == 0 && this.f194490d == icVar.f194490d;
    }

    /* renamed from: hashCode */
    public int m56976x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f194487a) * 31) + java.lang.Float.hashCode(this.f194488b)) * 31) + java.lang.Float.hashCode(this.f194489c)) * 31) + java.lang.Long.hashCode(this.f194490d);
    }

    /* renamed from: toString */
    public java.lang.String m56977x9616526c() {
        return "AnimationConfig(scale40pt=" + this.f194487a + ", scale56pt=" + this.f194488b + ", scale44pt=" + this.f194489c + ", duration=" + this.f194490d + ')';
    }
}
