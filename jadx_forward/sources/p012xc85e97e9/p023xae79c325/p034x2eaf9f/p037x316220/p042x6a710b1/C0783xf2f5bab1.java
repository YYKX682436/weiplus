package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.CompareSizesByArea */
/* loaded from: classes13.dex */
public final class C0783xf2f5bab1 implements java.util.Comparator<android.util.Size> {

    /* renamed from: mReverse */
    private boolean f1869xdfa705b5;

    public C0783xf2f5bab1() {
        this(false);
    }

    public C0783xf2f5bab1(boolean z17) {
        this.f1869xdfa705b5 = z17;
    }

    @Override // java.util.Comparator
    public int compare(android.util.Size size, android.util.Size size2) {
        int signum = java.lang.Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f1869xdfa705b5 ? signum * (-1) : signum;
    }
}
