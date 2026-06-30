package androidx.camera.core.impl.utils;

/* loaded from: classes15.dex */
final class Present<T> extends androidx.camera.core.impl.utils.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    public Present(T t17) {
        this.mReference = t17;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.core.impl.utils.Present) {
            return this.mReference.equals(((androidx.camera.core.impl.utils.Present) obj).mReference);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T t17) {
        m3.h.d(t17, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public java.lang.String toString() {
        return "Optional.of(" + this.mReference + ")";
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional) {
        optional.getClass();
        return this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(m3.i iVar) {
        iVar.getClass();
        return this.mReference;
    }
}
