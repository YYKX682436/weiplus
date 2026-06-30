package yy3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f549976d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f549977e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f549978f;

    /* renamed from: g, reason: collision with root package name */
    public int f549979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yy3.c f549980h;

    public b(yy3.c cVar, long j17) {
        this.f549980h = cVar;
        this.f549976d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f549980h.f549984b) {
            yy3.c cVar = this.f549980h;
            boolean z17 = true;
            cVar.f549990h = true;
            if (this.f549976d != cVar.f549987e) {
                cVar.f549990h = false;
                return;
            }
            if (((java.util.HashMap) cVar.f549983a).isEmpty()) {
                yy3.c cVar2 = this.f549980h;
                yy3.a aVar = cVar2.f549988f;
                if (aVar != null) {
                    long j17 = cVar2.f549987e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.i) aVar).f241474a;
                    if (j17 == c17345xe981d116.f241422q) {
                        c17345xe981d116.k(0L);
                    }
                }
                this.f549980h.f549990h = false;
                return;
            }
            byte[] bArr = (byte[]) ((java.util.HashMap) this.f549980h.f549983a).get("param_preview_data");
            this.f549977e = java.util.Arrays.copyOf(bArr, bArr.length);
            this.f549978f = new android.graphics.Point((android.graphics.Point) ((java.util.HashMap) this.f549980h.f549983a).get("param_camera_resolution"));
            this.f549979g = ((java.lang.Integer) ((java.util.HashMap) this.f549980h.f549983a).get("param_camera_rotation")).intValue();
            ((java.util.HashMap) this.f549980h.f549983a).clear();
            yy3.c cVar3 = this.f549980h;
            yy3.a aVar2 = cVar3.f549988f;
            if (aVar2 != null) {
                long j18 = cVar3.f549987e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d1162 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.i) aVar2).f241474a;
                if (j18 == c17345xe981d1162.f241422q) {
                    c17345xe981d1162.k(10L);
                }
            }
            synchronized (this.f549980h.f549985c) {
                int width = ((this.f549980h.f549992j.width() * this.f549980h.f549992j.height()) * 3) / 2;
                boolean z18 = et5.h.f338209a;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(width);
                byte[] bArr2 = this.f549977e;
                android.graphics.Point point = this.f549978f;
                int i17 = point.x;
                int i18 = point.y;
                android.graphics.Rect rect = this.f549980h.f549992j;
                int i19 = rect.left;
                int i27 = rect.top;
                int width2 = rect.width();
                int height = this.f549980h.f549992j.height();
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c cVar4 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c.f298507b;
                int g17 = cVar4.g(et5.h.c(bArr2), allocateDirect, i17, i18, i19, i27, width2, height);
                this.f549980h.f549993k++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardDetectQueue", "yuv crop ret %d", java.lang.Integer.valueOf(g17));
                if (g17 == 0) {
                    if ((allocateDirect == null ? -1 : cVar4.d(allocateDirect)) != 1) {
                        z17 = false;
                    }
                    if (z17) {
                        byte[] bArr3 = this.f549977e;
                        android.graphics.Point point2 = this.f549978f;
                        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr3, 17, point2.x, point2.y, null);
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        yuvImage.compressToJpeg(this.f549980h.f549992j, 80, byteArrayOutputStream);
                        float height2 = 448.0f / (this.f549979g % 180 != 0 ? this.f549980h.f549992j.height() : this.f549980h.f549992j.width());
                        android.graphics.Bitmap z07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(byteArrayOutputStream.toByteArray()), this.f549979g, height2, height2);
                        if (z07 != null) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putParcelable("param_card_bitmap", z07);
                            yy3.a aVar3 = this.f549980h.f549988f;
                            if (aVar3 != null) {
                                long j19 = this.f549976d;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d1163 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.i) aVar3).f241474a;
                                long j27 = c17345xe981d1163.f241422q;
                                if (j19 == j27) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardRectView", "bankcard decode success %s", java.lang.Long.valueOf(j27));
                                    c17345xe981d1163.p();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q qVar = c17345xe981d1163.f241425t;
                                    if (qVar != null) {
                                        qVar.a(j19, bundle);
                                    }
                                }
                            }
                            this.f549980h.f549990h = false;
                            return;
                        }
                    }
                }
                yy3.c cVar5 = this.f549980h;
                cVar5.f549990h = false;
                yy3.c.a(cVar5);
            }
        }
    }
}
