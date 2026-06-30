package androidx.camera.core.impl.utils;

/* loaded from: classes15.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public static <T> androidx.camera.core.impl.utils.Optional<T> absent() {
        return androidx.camera.core.impl.utils.Absent.withType();
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> fromNullable(T t17) {
        return t17 == null ? absent() : new androidx.camera.core.impl.utils.Present(t17);
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> of(T t17) {
        t17.getClass();
        return new androidx.camera.core.impl.utils.Present(t17);
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional);

    public abstract T or(T t17);

    public abstract T or(m3.i iVar);

    public abstract T orNull();

    public abstract java.lang.String toString();
}
