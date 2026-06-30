package at0;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f95119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(at0.n nVar, yz5.l lVar, long j17) {
        super(1);
        this.f95117d = nVar;
        this.f95118e = lVar;
        this.f95119f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.position(0);
        at0.n nVar = this.f95117d;
        ms0.c cVar = nVar.f95146u;
        int i17 = cVar != null ? cVar.i() : 0;
        ms0.c cVar2 = nVar.f95146u;
        int h17 = cVar2 != null ? cVar2.h() : 0;
        yz5.l lVar = this.f95118e;
        if (h17 == 0 || h17 == 0) {
            lVar.mo146xb9724478(null);
        } else {
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(h17));
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer$takePicture$2$1", "invoke", "(Ljava/nio/IntBuffer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer$takePicture$2$1", "invoke", "(Ljava/nio/IntBuffer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                createBitmap.copyPixelsFromBuffer(it);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("take photo cost1 ");
                long j17 = this.f95119f;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", sb6.toString());
                lVar.mo146xb9724478(createBitmap);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewContainer", e17, "", new java.lang.Object[0]);
                lVar.mo146xb9724478(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
