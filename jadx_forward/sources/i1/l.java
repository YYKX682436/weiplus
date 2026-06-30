package i1;

/* loaded from: classes14.dex */
public final class l extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368500c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368501d;

    public l(float f17, float f18) {
        super(false, false, 3, null);
        this.f368500c = f17;
        this.f368501d = f18;
    }

    /* renamed from: equals */
    public boolean m134464xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.l)) {
            return false;
        }
        i1.l lVar = (i1.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368500c), java.lang.Float.valueOf(lVar.f368500c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368501d), java.lang.Float.valueOf(lVar.f368501d));
    }

    /* renamed from: hashCode */
    public int m134465x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368500c) * 31) + java.lang.Float.hashCode(this.f368501d);
    }

    /* renamed from: toString */
    public java.lang.String m134466x9616526c() {
        return "LineTo(x=" + this.f368500c + ", y=" + this.f368501d + ')';
    }
}
