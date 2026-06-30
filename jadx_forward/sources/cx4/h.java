package cx4;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f306142h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306143i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f306144m;

    public h(android.graphics.Bitmap bitmap, cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f306138d = bitmap;
        this.f306139e = mVar;
        this.f306140f = str;
        this.f306141g = i17;
        this.f306142h = i18;
        this.f306143i = str2;
        this.f306144m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17;
        oy4.x xVar = (oy4.x) ((ek0.e) i95.n0.c(ek0.e.class));
        xVar.getClass();
        android.graphics.Bitmap bm6 = this.f306138d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bm6, "bm");
        java.lang.String str = "";
        if (xVar.Ni()) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bm6.getByteCount());
            bm6.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            int length = array.length / 4;
            int i17 = length * 3;
            byte[] bArr = new byte[i17];
            java.util.Iterator it = e06.p.m(0, length).iterator();
            while (((e06.j) it).hasNext()) {
                int b17 = ((kz5.x0) it).b();
                int i18 = b17 * 3;
                int i19 = b17 * 4;
                bArr[i18] = array[i19];
                bArr[i18 + 1] = array[i19 + 1];
                bArr[i18 + 2] = array[i19 + 2];
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            allocateDirect.put(bArr);
            ny4.e eVar = oy4.x.f431618d;
            if (eVar != null && (a17 = eVar.a(allocateDirect, bm6.getWidth(), bm6.getHeight())) != null) {
                str = a17;
            }
            xVar.wi();
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306139e.f306167a, "doReportCaptureOCRResult url=" + this.f306140f + ", scene=" + this.f306141g + ", keyWordScanTime=" + this.f306142h);
        fo3.s.INSTANCE.Tb(this.f306140f, this.f306143i, str2, this.f306144m, this.f306141g);
    }
}
