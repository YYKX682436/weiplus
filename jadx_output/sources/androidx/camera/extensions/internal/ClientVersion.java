package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class ClientVersion {
    private static androidx.camera.extensions.internal.ClientVersion sCurrent = new androidx.camera.extensions.internal.ClientVersion("1.4.0");
    private final androidx.camera.extensions.internal.Version mVersion;

    public ClientVersion(java.lang.String str) {
        this.mVersion = androidx.camera.extensions.internal.Version.parse(str);
    }

    public static androidx.camera.extensions.internal.ClientVersion getCurrentVersion() {
        return sCurrent;
    }

    public static boolean isMaximumCompatibleVersion(androidx.camera.extensions.internal.Version version) {
        return getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) <= 0;
    }

    public static boolean isMinimumCompatibleVersion(androidx.camera.extensions.internal.Version version) {
        return getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) >= 0;
    }

    public static void setCurrentVersion(androidx.camera.extensions.internal.ClientVersion clientVersion) {
        sCurrent = clientVersion;
    }

    public androidx.camera.extensions.internal.Version getVersion() {
        return this.mVersion;
    }

    public java.lang.String toVersionString() {
        return this.mVersion.toString();
    }
}
