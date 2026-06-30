package jz5;

/* loaded from: classes7.dex */
public final class r implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte f384377d;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(java.lang.Object obj) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f384377d & 255, ((jz5.r) obj).f384377d & 255);
    }

    /* renamed from: equals */
    public boolean m141646xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof jz5.r) {
            return this.f384377d == ((jz5.r) obj).f384377d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m141647x8cdac1b() {
        return java.lang.Byte.hashCode(this.f384377d);
    }

    /* renamed from: toString */
    public java.lang.String m141648x9616526c() {
        return java.lang.String.valueOf(this.f384377d & 255);
    }
}
