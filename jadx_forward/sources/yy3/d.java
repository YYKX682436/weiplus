package yy3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f549994d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f549995e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f549996f;

    /* renamed from: g, reason: collision with root package name */
    public int f549997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f549998h = new boolean[4];

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yy3.f f549999i;

    public d(yy3.f fVar, long j17) {
        this.f549999i = fVar;
        this.f549994d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        synchronized (this.f549999i.f550002b) {
            yy3.f fVar = this.f549999i;
            fVar.f550008h = true;
            if (this.f549994d != fVar.f550005e) {
                fVar.f550008h = false;
                return;
            }
            if (!((java.util.HashMap) fVar.f550001a).isEmpty()) {
                byte[] bArr = (byte[]) ((java.util.HashMap) this.f549999i.f550001a).get("param_preview_data");
                this.f549995e = java.util.Arrays.copyOf(bArr, bArr.length);
                this.f549996f = new android.graphics.Point((android.graphics.Point) ((java.util.HashMap) this.f549999i.f550001a).get("param_camera_resolution"));
                this.f549997g = ((java.lang.Integer) ((java.util.HashMap) this.f549999i.f550001a).get("param_camera_rotation")).intValue();
                ((java.util.HashMap) this.f549999i.f550001a).clear();
            }
            yy3.f fVar2 = this.f549999i;
            yy3.e eVar = fVar2.f550006f;
            long j17 = fVar2.f550005e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n) eVar).f241496e;
            if (j17 == c17345xe981d116.f241422q) {
                c17345xe981d116.k(10L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16182x357affe c16182x357affe = new com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16182x357affe(this.f549999i.f550012l.width(), this.f549999i.f550012l.height());
            synchronized (this.f549999i.f550003c) {
                byte[] bArr2 = this.f549995e;
                if (bArr2 == null || bArr2.length <= 0) {
                    i17 = 0;
                } else {
                    java.lang.System.currentTimeMillis();
                    if (this.f549997g % 180 != 0) {
                        android.graphics.Point point = this.f549996f;
                        int i18 = ((point.x * point.y) * 3) / 2;
                        boolean z17 = et5.h.f338209a;
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                        java.nio.ByteBuffer c17 = et5.h.c(this.f549995e);
                        android.graphics.Point point2 = this.f549996f;
                        et5.h.a(allocateDirect, c17, point2.x, point2.y);
                        byte[] f17 = et5.h.f(allocateDirect);
                        android.graphics.Point point3 = this.f549996f;
                        int i19 = point3.x;
                        int i27 = point3.y;
                        android.graphics.Rect rect = this.f549999i.f550012l;
                        i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16183x46c0b853.m65230x70b603d1(f17, i19, i27, rect.left, rect.top, rect.height(), this.f549999i.f550012l.width(), c16182x357affe, this.f549998h);
                    } else {
                        byte[] bArr3 = this.f549995e;
                        android.graphics.Point point4 = this.f549996f;
                        int i28 = point4.y;
                        int i29 = point4.x;
                        android.graphics.Rect rect2 = this.f549999i.f550012l;
                        i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16183x46c0b853.m65230x70b603d1(bArr3, i28, i29, rect2.left, rect2.top, rect2.height(), this.f549999i.f550012l.width(), c16182x357affe, this.f549998h);
                    }
                    java.lang.System.currentTimeMillis();
                    java.util.Arrays.toString(this.f549998h);
                    yy3.f fVar3 = this.f549999i;
                    fVar3.f550010j++;
                    if (fVar3.c() && this.f549999i.f550010j < 60) {
                        i17 = 2;
                    }
                }
            }
            if (this.f549997g % 180 != 0) {
                boolean[] zArr = this.f549998h;
                boolean z18 = zArr[0];
                zArr[0] = zArr[2];
                zArr[2] = z18;
                boolean z19 = zArr[1];
                zArr[1] = zArr[3];
                zArr[3] = z19;
            }
            synchronized (this.f549999i.f550002b) {
                long j18 = this.f549994d;
                yy3.f fVar4 = this.f549999i;
                if (j18 == fVar4.f550005e) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBooleanArray("param_card_edge", this.f549998h);
                    yy3.e eVar2 = this.f549999i.f550006f;
                    if (eVar2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n) eVar2).a(this.f549994d, bundle);
                    }
                    if (i17 != 1) {
                        yy3.f fVar5 = this.f549999i;
                        fVar5.f550008h = false;
                        yy3.f.a(fVar5);
                        return;
                    }
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inSampleSize = 1;
                    byte[] bArr4 = c16182x357affe.f37114x980f2579;
                    int i37 = c16182x357affe.f37115x156bf666;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(options);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i37));
                    arrayList.add(0);
                    arrayList.add(bArr4);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Boolean.TRUE);
                    arrayList2.add(config);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(decodeByteArray, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap copy = decodeByteArray.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
                    yj0.a.e(decodeByteArray, copy, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    if (this.f549999i.c() && 1 == this.f549999i.f550009i) {
                        byte[] bArr5 = this.f549995e;
                        if (this.f549997g % 180 != 0) {
                            android.graphics.Point point5 = this.f549996f;
                            int i38 = ((point5.x * point5.y) * 3) / 2;
                            boolean z27 = et5.h.f338209a;
                            java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(i38);
                            java.nio.ByteBuffer c18 = et5.h.c(this.f549995e);
                            android.graphics.Point point6 = this.f549996f;
                            et5.h.a(allocateDirect2, c18, point6.x, point6.y);
                            bArr5 = et5.h.f(allocateDirect2);
                        }
                        byte[] bArr6 = bArr5;
                        try {
                            android.graphics.Point point7 = this.f549996f;
                            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr6, 17, point7.y, point7.x, null);
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            yuvImage.compressToJpeg(this.f549999i.f550012l, 40, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            int length = byteArray.length;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(java.lang.Integer.valueOf(length));
                            arrayList3.add(0);
                            arrayList3.add(byteArray);
                            java.lang.Object obj2 = new java.lang.Object();
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap decodeByteArray2 = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue(), ((java.lang.Integer) arrayList3.get(2)).intValue());
                            yj0.a.e(obj2, decodeByteArray2, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                            copy = decodeByteArray2;
                        } catch (java.lang.RuntimeException unused) {
                        }
                    }
                    if (copy == null) {
                        yy3.f fVar6 = this.f549999i;
                        fVar6.f550008h = false;
                        yy3.f.a(fVar6);
                        return;
                    }
                    copy.getWidth();
                    copy.getHeight();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putByteArray("param_card_bitmap", com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b(copy, 80));
                    yy3.e eVar3 = this.f549999i.f550006f;
                    long j19 = this.f549994d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d1162 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n) eVar3).f241496e;
                    long j27 = c17345xe981d1162.f241422q;
                    if (j19 == j27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardRectView", "license decode success %s", java.lang.Long.valueOf(j27));
                        c17345xe981d1162.p();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q qVar = c17345xe981d1162.f241425t;
                        if (qVar != null) {
                            qVar.a(j19, bundle2);
                        }
                    }
                    this.f549999i.f550008h = false;
                } else {
                    fVar4.f550008h = false;
                    yy3.f.a(fVar4);
                }
            }
        }
    }
}
