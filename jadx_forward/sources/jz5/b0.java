package jz5;

/* loaded from: classes12.dex */
public final class b0 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f384349d;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(java.lang.Object obj) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f384349d & 65535, ((jz5.b0) obj).f384349d & 65535);
    }

    /* renamed from: equals */
    public boolean m141620xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof jz5.b0) {
            return this.f384349d == ((jz5.b0) obj).f384349d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m141621x8cdac1b() {
        return java.lang.Short.hashCode(this.f384349d);
    }

    /* renamed from: toString */
    public java.lang.String m141622x9616526c() {
        return java.lang.String.valueOf(65535 & this.f384349d);
    }
}
