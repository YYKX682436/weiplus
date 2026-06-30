package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public class QuirkSettings {
    private final boolean mEnabledWhenDeviceHasQuirk;
    private final java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> mForceDisabledQuirks;
    private final java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> mForceEnabledQuirks;

    /* loaded from: classes13.dex */
    public static class Builder {
        private boolean mEnabledWhenDeviceHasQuirk = true;
        private java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> mForceDisabledQuirks;
        private java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> mForceEnabledQuirks;

        public androidx.camera.core.impl.QuirkSettings build() {
            return new androidx.camera.core.impl.QuirkSettings(this.mEnabledWhenDeviceHasQuirk, this.mForceEnabledQuirks, this.mForceDisabledQuirks);
        }

        public androidx.camera.core.impl.QuirkSettings.Builder forceDisableQuirks(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
            this.mForceDisabledQuirks = new java.util.HashSet(set);
            return this;
        }

        public androidx.camera.core.impl.QuirkSettings.Builder forceEnableQuirks(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
            this.mForceEnabledQuirks = new java.util.HashSet(set);
            return this;
        }

        public androidx.camera.core.impl.QuirkSettings.Builder setEnabledWhenDeviceHasQuirk(boolean z17) {
            this.mEnabledWhenDeviceHasQuirk = z17;
            return this;
        }
    }

    public static androidx.camera.core.impl.QuirkSettings withAllQuirksDisabled() {
        return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(false).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withDefaultBehavior() {
        return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(true).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withQuirksForceDisabled(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
        return new androidx.camera.core.impl.QuirkSettings.Builder().forceDisableQuirks(set).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withQuirksForceEnabled(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
        return new androidx.camera.core.impl.QuirkSettings.Builder().forceEnableQuirks(set).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.camera.core.impl.QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        androidx.camera.core.impl.QuirkSettings quirkSettings = (androidx.camera.core.impl.QuirkSettings) obj;
        return this.mEnabledWhenDeviceHasQuirk == quirkSettings.mEnabledWhenDeviceHasQuirk && java.util.Objects.equals(this.mForceEnabledQuirks, quirkSettings.mForceEnabledQuirks) && java.util.Objects.equals(this.mForceDisabledQuirks, quirkSettings.mForceDisabledQuirks);
    }

    public java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getForceDisabledQuirks() {
        return java.util.Collections.unmodifiableSet(this.mForceDisabledQuirks);
    }

    public java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getForceEnabledQuirks() {
        return java.util.Collections.unmodifiableSet(this.mForceEnabledQuirks);
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.mEnabledWhenDeviceHasQuirk), this.mForceEnabledQuirks, this.mForceDisabledQuirks);
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.mEnabledWhenDeviceHasQuirk;
    }

    public boolean shouldEnableQuirk(java.lang.Class<? extends androidx.camera.core.impl.Quirk> cls, boolean z17) {
        if (this.mForceEnabledQuirks.contains(cls)) {
            return true;
        }
        if (this.mForceDisabledQuirks.contains(cls)) {
            return false;
        }
        return this.mEnabledWhenDeviceHasQuirk && z17;
    }

    public java.lang.String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.mEnabledWhenDeviceHasQuirk + ", forceEnabledQuirks=" + this.mForceEnabledQuirks + ", forceDisabledQuirks=" + this.mForceDisabledQuirks + '}';
    }

    private QuirkSettings(boolean z17, java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set, java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set2) {
        this.mEnabledWhenDeviceHasQuirk = z17;
        this.mForceEnabledQuirks = set == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set);
        this.mForceDisabledQuirks = set2 == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set2);
    }
}
