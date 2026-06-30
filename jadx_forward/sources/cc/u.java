package cc;

/* loaded from: classes14.dex */
public abstract class u implements cc.i0 {

    /* renamed from: d, reason: collision with root package name */
    public transient java.util.Set f121933d;

    /* renamed from: e, reason: collision with root package name */
    public transient java.util.Collection f121934e;

    /* renamed from: f, reason: collision with root package name */
    public transient java.util.Map f121935f;

    public abstract java.util.Map a();

    /* renamed from: equals */
    public boolean mo14606xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc.i0)) {
            return false;
        }
        return ((cc.e) ((cc.a) this).a()).equals(((cc.a) ((cc.i0) obj)).a());
    }

    /* renamed from: hashCode */
    public int m14611x8cdac1b() {
        return ((cc.e) a()).hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14612x9616526c() {
        return a().toString();
    }
}
