package rh;

/* loaded from: classes12.dex */
public abstract class s2 extends rh.z2 {

    /* renamed from: b, reason: collision with root package name */
    public static final rh.s2 f477038b = new rh.r2(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f477039a;

    public s2(java.lang.Object obj) {
        this.f477039a = obj;
    }

    /* renamed from: equals */
    public boolean m162374xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.lang.String.valueOf(this.f477039a).equals(java.lang.String.valueOf(((rh.s2) obj).f477039a));
    }

    /* renamed from: hashCode */
    public int m162375x8cdac1b() {
        return java.util.Objects.hash(this.f477039a);
    }

    /* renamed from: toString */
    public java.lang.String m162376x9616526c() {
        return java.lang.String.valueOf(this.f477039a);
    }
}
