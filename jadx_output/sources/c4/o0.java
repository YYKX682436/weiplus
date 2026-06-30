package c4;

/* loaded from: classes15.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final c4.p0 f38330a;

    public o0(java.lang.String str, int i17, int i18) {
        if (str != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    this.f38330a = new c4.q0(str, i17, i18);
                    return;
                } else {
                    this.f38330a = new c4.r0(str, i17, i18);
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        throw new java.lang.NullPointerException("package shouldn't be null");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.o0)) {
            return false;
        }
        return this.f38330a.equals(((c4.o0) obj).f38330a);
    }

    public int hashCode() {
        return this.f38330a.hashCode();
    }

    public o0(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        java.lang.String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!android.text.TextUtils.isEmpty(packageName)) {
                this.f38330a = new c4.q0(remoteUserInfo);
                return;
            }
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        throw new java.lang.NullPointerException("package shouldn't be null");
    }
}
