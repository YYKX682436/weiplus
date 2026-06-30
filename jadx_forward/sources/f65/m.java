package f65;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.m f341429a = new f65.m();

    /* renamed from: b, reason: collision with root package name */
    public static long f341430b;

    /* renamed from: c, reason: collision with root package name */
    public static long f341431c;

    /* renamed from: d, reason: collision with root package name */
    public static long f341432d;

    /* renamed from: e, reason: collision with root package name */
    public static long f341433e;

    /* renamed from: f, reason: collision with root package name */
    public static long f341434f;

    /* renamed from: g, reason: collision with root package name */
    public static long f341435g;

    /* renamed from: h, reason: collision with root package name */
    public static long f341436h;

    /* renamed from: i, reason: collision with root package name */
    public static long f341437i;

    /* renamed from: j, reason: collision with root package name */
    public static long f341438j;

    /* renamed from: k, reason: collision with root package name */
    public static long f341439k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f341440l;

    public final void a(int i17) {
        if (f341440l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "report is done, no to do again");
            return;
        }
        f341440l = true;
        long j17 = f341433e;
        long j18 = j17 != 0 ? f341432d / j17 : 0L;
        long j19 = f341436h;
        long j27 = j19 != 0 ? f341435g / j19 : 0L;
        long j28 = f341439k;
        long j29 = j28 != 0 ? f341438j / j28 : 0L;
        long j37 = j17 + j28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "report >> clsTime: " + f341432d + ", clsNum: " + f341433e + ", ocrTime: " + f341435g + ", ocrNum: " + f341436h + ", clusterTime: " + f341438j + ", clusterNum: " + f341439k + ", action: " + i17 + ", clsAverTime: " + j18 + ", ocrAverTime: " + j27 + ", clusterAverTime:" + j29);
        if (f341430b != 0 && j37 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f341430b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "total struct >> startTime: " + f341430b + ", totalNum: " + j37 + ", time: " + currentTimeMillis);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd c6660xaea6cfd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd();
            c6660xaea6cfd.f140065f = 0L;
            c6660xaea6cfd.f140064e = currentTimeMillis / j37;
            c6660xaea6cfd.f140063d = j37;
            c6660xaea6cfd.k();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd c6660xaea6cfd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd();
        c6660xaea6cfd2.f140065f = 1L;
        c6660xaea6cfd2.f140064e = j18;
        c6660xaea6cfd2.f140063d = f341433e;
        c6660xaea6cfd2.k();
        f65.p pVar = f65.p.f341467a;
        long j38 = j29;
        pVar.c(f341433e, j18, 1, i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd c6660xaea6cfd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd();
        c6660xaea6cfd3.f140065f = 2L;
        c6660xaea6cfd3.f140064e = j27;
        c6660xaea6cfd3.f140063d = f341436h;
        c6660xaea6cfd3.k();
        pVar.c(f341436h, j27, 2, i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd c6660xaea6cfd4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6660xaea6cfd();
        c6660xaea6cfd4.f140065f = 3L;
        c6660xaea6cfd4.f140064e = j38;
        c6660xaea6cfd4.f140063d = f341439k;
        c6660xaea6cfd4.k();
        pVar.c(f341439k, j38, 3, i17);
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> startTimeStamp: " + f341434f + ", stopTimeStamp: " + currentTimeMillis + ", before totalNum: " + f341436h + ", before totalTime: " + f341435g);
        long j17 = f341434f;
        if (currentTimeMillis < j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> time error");
        } else {
            f341436h++;
            f341435g += currentTimeMillis - j17;
        }
    }
}
