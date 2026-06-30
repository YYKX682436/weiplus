package a6;

/* loaded from: classes14.dex */
public final class m extends a6.g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f83202c;

    /* renamed from: a, reason: collision with root package name */
    public static final a6.m f83200a = new a6.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.io.File f83201b = new java.io.File("/proc/self/fd");

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f83203d = true;

    public m() {
        super(null);
    }

    @Override // a6.g
    public boolean a(p135x2eae8f.p138x35e001.AbstractC1421x275421 size, h6.k kVar) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        if (size instanceof p135x2eae8f.p138x35e001.C1420x6f1c9387) {
            p135x2eae8f.p138x35e001.C1420x6f1c9387 c1420x6f1c9387 = (p135x2eae8f.p138x35e001.C1420x6f1c9387) size;
            if (c1420x6f1c9387.f125445d < 75 || c1420x6f1c9387.f125446e < 75) {
                return false;
            }
        }
        synchronized (this) {
            int i17 = f83202c;
            f83202c = i17 + 1;
            if (i17 >= 50) {
                f83202c = 0;
                java.lang.String[] list = f83201b.list();
                if (list == null) {
                    list = new java.lang.String[0];
                }
                int length = list.length;
                f83203d = length < 750;
                if (!f83203d && kVar != null && kVar.m132934x74bf41ce() <= 5) {
                    kVar.a("LimitedFileDescriptorHardwareBitmapService", 5, p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", java.lang.Integer.valueOf(length)), null);
                }
            }
            z17 = f83203d;
        }
        return z17;
    }
}
