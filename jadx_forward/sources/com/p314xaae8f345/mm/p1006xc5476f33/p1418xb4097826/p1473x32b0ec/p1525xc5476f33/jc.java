package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public final float f194612a;

    /* renamed from: b, reason: collision with root package name */
    public final float f194613b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f194614c;

    /* renamed from: d, reason: collision with root package name */
    public final int f194615d;

    public jc(float f17, float f18, android.graphics.drawable.Drawable drawable, int i17) {
        this.f194612a = f17;
        this.f194613b = f18;
        this.f194614c = drawable;
        this.f194615d = i17;
    }

    /* renamed from: equals */
    public boolean m56985xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc jcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc) obj;
        return java.lang.Float.compare(this.f194612a, jcVar.f194612a) == 0 && java.lang.Float.compare(this.f194613b, jcVar.f194613b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194614c, jcVar.f194614c) && this.f194615d == jcVar.f194615d;
    }

    /* renamed from: hashCode */
    public int m56986x8cdac1b() {
        int hashCode = ((java.lang.Float.hashCode(this.f194612a) * 31) + java.lang.Float.hashCode(this.f194613b)) * 31;
        android.graphics.drawable.Drawable drawable = this.f194614c;
        return ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f194615d);
    }

    /* renamed from: toString */
    public java.lang.String m56987x9616526c() {
        return "AnimationState(originalScaleX=" + this.f194612a + ", originalScaleY=" + this.f194613b + ", originalBackground=" + this.f194614c + ", originalBgColor=" + this.f194615d + ')';
    }
}
