package c4;

/* loaded from: classes15.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final c4.p0 f119863a;

    public o0(java.lang.String str, int i17, int i18) {
        if (str != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    this.f119863a = new c4.q0(str, i17, i18);
                    return;
                } else {
                    this.f119863a = new c4.r0(str, i17, i18);
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        throw new java.lang.NullPointerException("package shouldn't be null");
    }

    /* renamed from: equals */
    public boolean m14112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.o0)) {
            return false;
        }
        return this.f119863a.equals(((c4.o0) obj).f119863a);
    }

    /* renamed from: hashCode */
    public int m14113x8cdac1b() {
        return this.f119863a.hashCode();
    }

    public o0(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        java.lang.String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!android.text.TextUtils.isEmpty(packageName)) {
                this.f119863a = new c4.q0(remoteUserInfo);
                return;
            }
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        throw new java.lang.NullPointerException("package shouldn't be null");
    }
}
