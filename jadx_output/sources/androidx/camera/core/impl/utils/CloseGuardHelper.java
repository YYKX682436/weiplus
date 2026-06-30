package androidx.camera.core.impl.utils;

/* loaded from: classes15.dex */
public final class CloseGuardHelper {
    private final androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl mImpl;

    /* loaded from: classes15.dex */
    public static final class CloseGuardApi30Impl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        private final android.util.CloseGuard mPlatformImpl = new android.util.CloseGuard();

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
            this.mPlatformImpl.close();
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(java.lang.String str) {
            this.mPlatformImpl.open(str);
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
            this.mPlatformImpl.warnIfOpen();
        }
    }

    /* loaded from: classes15.dex */
    public interface CloseGuardImpl {
        void close();

        void open(java.lang.String str);

        void warnIfOpen();
    }

    /* loaded from: classes15.dex */
    public static final class CloseGuardNoOpImpl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(java.lang.String str) {
            m3.h.d(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
        }
    }

    private CloseGuardHelper(androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl closeGuardImpl) {
        this.mImpl = closeGuardImpl;
    }

    public static androidx.camera.core.impl.utils.CloseGuardHelper create() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? new androidx.camera.core.impl.utils.CloseGuardHelper(new androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardApi30Impl()) : new androidx.camera.core.impl.utils.CloseGuardHelper(new androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardNoOpImpl());
    }

    public void close() {
        this.mImpl.close();
    }

    public void open(java.lang.String str) {
        this.mImpl.open(str);
    }

    public void warnIfOpen() {
        this.mImpl.warnIfOpen();
    }
}
