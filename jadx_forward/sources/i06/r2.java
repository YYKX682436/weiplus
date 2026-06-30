package i06;

/* loaded from: classes12.dex */
public final class r2 implements java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type[] f368274d;

    /* renamed from: e, reason: collision with root package name */
    public final int f368275e;

    public r2(java.lang.reflect.Type[] types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        this.f368274d = types;
        this.f368275e = java.util.Arrays.hashCode(types);
    }

    /* renamed from: equals */
    public boolean m134401xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof i06.r2) {
            if (java.util.Arrays.equals(this.f368274d, ((i06.r2) obj).f368274d)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return kz5.z.d0(this.f368274d, ", ", "[", "]", 0, null, null, 56, null);
    }

    /* renamed from: hashCode */
    public int m134402x8cdac1b() {
        return this.f368275e;
    }

    /* renamed from: toString */
    public java.lang.String m134403x9616526c() {
        return getTypeName();
    }
}
