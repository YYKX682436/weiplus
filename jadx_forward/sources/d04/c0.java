package d04;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f306920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25308xdf65b80c f306921e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb, com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c) {
        this.f306920d = c17326x8613bffb;
        this.f306921e = c25308xdf65b80c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        int previewFormat;
        android.graphics.Point point;
        com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb.H1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f306920d;
        c17326x8613bffb.getClass();
        try {
            xy3.a scanCamera = c17326x8613bffb.getScanCamera();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scanCamera);
            previewFormat = scanCamera.f448189a.getParameters().getPreviewFormat();
            xy3.a scanCamera2 = c17326x8613bffb.getScanCamera();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scanCamera2);
            point = scanCamera2.f448195g;
            c25308xdf65b80c = this.f306921e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeMaskView", e17, "getFrameBitmap exception", new java.lang.Object[0]);
        }
        if (c25308xdf65b80c != null) {
            int i18 = c25308xdf65b80c.f296772e;
            byte[] bArr = c25308xdf65b80c.f296771d;
            if (bArr != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap data length: %d, size: %d, %d, rotation: %d, previewFormat: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(c25308xdf65b80c.f296773f), java.lang.Integer.valueOf(c25308xdf65b80c.f296774g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(previewFormat));
                android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(c25308xdf65b80c.f296771d, previewFormat, point.x, point.y, null);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int size = byteArrayOutputStream.size();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(size));
                arrayList.add(0);
                arrayList.add(byteArray);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "getFrameBitmap", "(Lcom/tencent/qbar/ScanDecodeFrameData;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "getFrameBitmap", "(Lcom/tencent/qbar/ScanDecodeFrameData;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap bitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                    if (i18 != 0) {
                        bitmap = c17326x8613bffb.E(bitmap, i18, c17326x8613bffb.getMeasuredWidth(), c17326x8613bffb.getMeasuredHeight());
                    }
                    c17326x8613bffb.f241219J = bitmap;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new d04.b0(c17326x8613bffb));
                }
            }
        }
        bitmap = null;
        c17326x8613bffb.f241219J = bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new d04.b0(c17326x8613bffb));
    }
}
