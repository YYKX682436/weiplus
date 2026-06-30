package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_Identifier extends androidx.camera.core.impl.Identifier {
    private final java.lang.Object value;

    public AutoValue_Identifier(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null value");
        }
        this.value = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.camera.core.impl.Identifier) {
            return this.value.equals(((androidx.camera.core.impl.Identifier) obj).getValue());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Identifier
    public java.lang.Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "Identifier{value=" + this.value + "}";
    }
}
