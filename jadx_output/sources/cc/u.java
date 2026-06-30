package cc;

/* loaded from: classes14.dex */
public abstract class u implements cc.i0 {

    /* renamed from: d, reason: collision with root package name */
    public transient java.util.Set f40400d;

    /* renamed from: e, reason: collision with root package name */
    public transient java.util.Collection f40401e;

    /* renamed from: f, reason: collision with root package name */
    public transient java.util.Map f40402f;

    public abstract java.util.Map a();

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc.i0)) {
            return false;
        }
        return ((cc.e) ((cc.a) this).a()).equals(((cc.a) ((cc.i0) obj)).a());
    }

    public int hashCode() {
        return ((cc.e) a()).hashCode();
    }

    public java.lang.String toString() {
        return a().toString();
    }
}
