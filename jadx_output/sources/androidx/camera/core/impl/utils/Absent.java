package androidx.camera.core.impl.utils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class Absent<T> extends androidx.camera.core.impl.utils.Optional<T> {
    static final androidx.camera.core.impl.utils.Absent<java.lang.Object> sInstance = new androidx.camera.core.impl.utils.Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private java.lang.Object readResolve() {
        return sInstance;
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> withType() {
        return sInstance;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T t17) {
        m3.h.d(t17, "use Optional.orNull() instead of Optional.or(null)");
        return t17;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return null;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(m3.i iVar) {
        T t17 = (T) iVar.get();
        m3.h.d(t17, "use Optional.orNull() instead of a Supplier that returns null");
        return t17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.impl.utils.Optional
    public androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional) {
        optional.getClass();
        return optional;
    }
}
