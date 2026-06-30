package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public class s1 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96086a;

    public s1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96086a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j
    public void a(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96086a;
        p0Var.f96036x0.d(i17, "screenCaptureCallback");
        java.lang.String str = (java.lang.String) p0Var.L1.get(java.lang.Integer.valueOf(i17));
        if ((i27 & 1) == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Unsupported format %d", java.lang.Integer.valueOf(i27));
            ((md1.t) p0Var.O1).a(2, null, "unsupported format", -1, -1);
            return;
        }
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.flip();
        byteBuffer.get(bArr);
        int i28 = i18 * i19;
        int i29 = i28 / 4;
        byte[] bArr2 = new byte[limit];
        boolean z17 = false;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i28);
        for (int i37 = 0; i37 < i29; i37++) {
            int i38 = (i37 * 2) + i28;
            bArr2[i38] = bArr[i28 + i29 + i37];
            bArr2[i38 + 1] = bArr[i28 + i37];
        }
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr2, 17, i18, i19, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, i18, i19), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int size = byteArrayOutputStream.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(size));
        arrayList.add(0);
        arrayList.add(byteArray);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/cloudvoip/cloudvoice/service/OpenVoiceService$28", "onFrame", "(ILjava/nio/ByteBuffer;III)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/cloudvoip/cloudvoice/service/OpenVoiceService$28", "onFrame", "(ILjava/nio/ByteBuffer;III)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        p0Var.getClass();
        if (decodeByteArray != null && !decodeByteArray.isRecycled()) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(decodeByteArray, 90, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "bitmap filelen %s", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "error for saveBitmapToImage %s", e17.getMessage());
            }
        }
        if (!z17) {
            ((md1.t) p0Var.O1).a(1, null, "save fail", -1, -1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "saved at %s", str);
            ((md1.t) p0Var.O1).a(0, str, "", decodeByteArray.getWidth(), decodeByteArray.getHeight());
        }
    }
}
