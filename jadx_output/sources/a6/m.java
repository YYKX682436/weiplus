package a6;

/* loaded from: classes14.dex */
public final class m extends a6.g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f1669c;

    /* renamed from: a, reason: collision with root package name */
    public static final a6.m f1667a = new a6.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.io.File f1668b = new java.io.File("/proc/self/fd");

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f1670d = true;

    public m() {
        super(null);
    }

    @Override // a6.g
    public boolean a(coil.size.Size size, h6.k kVar) {
        boolean z17;
        kotlin.jvm.internal.o.g(size, "size");
        if (size instanceof coil.size.PixelSize) {
            coil.size.PixelSize pixelSize = (coil.size.PixelSize) size;
            if (pixelSize.f43912d < 75 || pixelSize.f43913e < 75) {
                return false;
            }
        }
        synchronized (this) {
            int i17 = f1669c;
            f1669c = i17 + 1;
            if (i17 >= 50) {
                f1669c = 0;
                java.lang.String[] list = f1668b.list();
                if (list == null) {
                    list = new java.lang.String[0];
                }
                int length = list.length;
                f1670d = length < 750;
                if (!f1670d && kVar != null && kVar.getLevel() <= 5) {
                    kVar.a("LimitedFileDescriptorHardwareBitmapService", 5, kotlin.jvm.internal.o.m("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", java.lang.Integer.valueOf(length)), null);
                }
            }
            z17 = f1670d;
        }
        return z17;
    }
}
