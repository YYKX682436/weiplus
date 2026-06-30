package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_StateObservable_ErrorWrapper extends androidx.camera.core.impl.StateObservable.ErrorWrapper {
    private final java.lang.Throwable error;

    public AutoValue_StateObservable_ErrorWrapper(java.lang.Throwable th6) {
        if (th6 == null) {
            throw new java.lang.NullPointerException("Null error");
        }
        this.error = th6;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper) {
            return this.error.equals(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getError());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    public java.lang.Throwable getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "ErrorWrapper{error=" + this.error + "}";
    }
}
