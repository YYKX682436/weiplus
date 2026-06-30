package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public abstract class ExtensionVersion {
    private static final java.lang.String TAG = "ExtenderVersion";
    private static volatile androidx.camera.extensions.internal.ExtensionVersion sExtensionVersion;

    /* loaded from: classes14.dex */
    public static class DefaultExtenderVersioning extends androidx.camera.extensions.internal.ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public androidx.camera.extensions.internal.Version getVersionObject() {
            return null;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            return false;
        }
    }

    /* loaded from: classes14.dex */
    public static class VendorExtenderVersioning extends androidx.camera.extensions.internal.ExtensionVersion {
        private static androidx.camera.extensions.impl.ExtensionVersionImpl sImpl;
        private androidx.camera.extensions.internal.Version mRuntimeVersion;

        public VendorExtenderVersioning() {
            if (sImpl == null) {
                sImpl = new androidx.camera.extensions.impl.ExtensionVersionImpl();
            }
            androidx.camera.extensions.internal.Version parse = androidx.camera.extensions.internal.Version.parse(sImpl.checkApiVersion(androidx.camera.extensions.internal.ClientVersion.getCurrentVersion().toVersionString()));
            if (parse != null && androidx.camera.extensions.internal.ClientVersion.getCurrentVersion().getVersion().getMajor() == parse.getMajor()) {
                this.mRuntimeVersion = parse;
            }
            androidx.camera.core.Logger.d(androidx.camera.extensions.internal.ExtensionVersion.TAG, "Selected vendor runtime: " + this.mRuntimeVersion);
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public androidx.camera.extensions.internal.Version getVersionObject() {
            return this.mRuntimeVersion;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            try {
                return sImpl.isAdvancedExtenderImplemented();
            } catch (java.lang.NoSuchMethodError unused) {
                return false;
            }
        }
    }

    private static androidx.camera.extensions.internal.ExtensionVersion getInstance() {
        if (sExtensionVersion != null) {
            return sExtensionVersion;
        }
        synchronized (androidx.camera.extensions.internal.ExtensionVersion.class) {
            if (sExtensionVersion == null) {
                try {
                    sExtensionVersion = new androidx.camera.extensions.internal.ExtensionVersion.VendorExtenderVersioning();
                } catch (java.lang.NoClassDefFoundError unused) {
                    androidx.camera.core.Logger.d(TAG, "No versioning extender found. Falling back to default.");
                    sExtensionVersion = new androidx.camera.extensions.internal.ExtensionVersion.DefaultExtenderVersioning();
                }
            }
        }
        return sExtensionVersion;
    }

    public static androidx.camera.extensions.internal.Version getRuntimeVersion() {
        return getInstance().getVersionObject();
    }

    public static void injectInstance(androidx.camera.extensions.internal.ExtensionVersion extensionVersion) {
        sExtensionVersion = extensionVersion;
    }

    public static boolean isAdvancedExtenderSupported() {
        return getInstance().isAdvancedExtenderSupportedInternal();
    }

    public static boolean isExtensionVersionSupported() {
        return getInstance().getVersionObject() != null;
    }

    public static boolean isMaximumCompatibleVersion(androidx.camera.extensions.internal.Version version) {
        return getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) <= 0;
    }

    public static boolean isMinimumCompatibleVersion(androidx.camera.extensions.internal.Version version) {
        return getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) >= 0;
    }

    public abstract androidx.camera.extensions.internal.Version getVersionObject();

    public abstract boolean isAdvancedExtenderSupportedInternal();
}
