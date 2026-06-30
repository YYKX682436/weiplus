package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
public final class CompareSizesByArea implements java.util.Comparator<android.util.Size> {
    private boolean mReverse;

    public CompareSizesByArea() {
        this(false);
    }

    public CompareSizesByArea(boolean z17) {
        this.mReverse = z17;
    }

    @Override // java.util.Comparator
    public int compare(android.util.Size size, android.util.Size size2) {
        int signum = java.lang.Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.mReverse ? signum * (-1) : signum;
    }
}
