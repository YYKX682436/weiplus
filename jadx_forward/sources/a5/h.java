package a5;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f82929a = new java.util.HashSet();

    /* renamed from: equals */
    public boolean m585xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.h.class != obj.getClass()) {
            return false;
        }
        return this.f82929a.equals(((a5.h) obj).f82929a);
    }

    /* renamed from: hashCode */
    public int m586x8cdac1b() {
        return this.f82929a.hashCode();
    }
}
