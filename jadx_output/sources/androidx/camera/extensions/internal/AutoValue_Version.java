package androidx.camera.extensions.internal;

/* loaded from: classes13.dex */
final class AutoValue_Version extends androidx.camera.extensions.internal.Version {
    private final java.lang.String description;
    private final int major;
    private final int minor;
    private final int patch;

    public AutoValue_Version(int i17, int i18, int i19, java.lang.String str) {
        this.major = i17;
        this.minor = i18;
        this.patch = i19;
        if (str == null) {
            throw new java.lang.NullPointerException("Null description");
        }
        this.description = str;
    }

    @Override // androidx.camera.extensions.internal.Version
    public java.lang.String getDescription() {
        return this.description;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.major;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMinor() {
        return this.minor;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getPatch() {
        return this.patch;
    }
}
