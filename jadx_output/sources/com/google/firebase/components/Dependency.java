package com.google.firebase.components;

/* loaded from: classes13.dex */
public final class Dependency {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f44645a;

    public Dependency(java.lang.Class cls, int i17, int i18) {
        if (cls == null) {
            throw new java.lang.NullPointerException("Null dependency interface.");
        }
        this.f44645a = cls;
    }

    public static com.google.firebase.components.Dependency required(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 1, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.firebase.components.Dependency) {
            return this.f44645a == ((com.google.firebase.components.Dependency) obj).f44645a;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44645a.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ 0;
    }

    public final java.lang.String toString() {
        return "Dependency{interface=" + this.f44645a + ", required=true, direct=true}";
    }
}
