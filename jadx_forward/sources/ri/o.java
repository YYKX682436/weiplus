package ri;

/* loaded from: classes12.dex */
public abstract class o {
    public static void a(long j17) {
        if (j17 < 300000) {
            return;
        }
        int i17 = j17 < 600000 ? 70 : j17 < 1800000 ? 71 : 72;
        if (i17 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1540L, i17, 1L, false);
        }
    }

    public static void b(boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(1540L, z17 ? 2L : 3L, 1L, false);
    }

    public static void c(boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(1540L, z17 ? 4L : 5L, 1L, false);
    }
}
