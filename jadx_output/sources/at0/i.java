package at0;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(at0.n nVar, yz5.l lVar, long j17) {
        super(1);
        this.f13584d = nVar;
        this.f13585e = lVar;
        this.f13586f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.position(0);
        at0.n nVar = this.f13584d;
        ms0.c cVar = nVar.f13613u;
        int i17 = cVar != null ? cVar.i() : 0;
        ms0.c cVar2 = nVar.f13613u;
        int h17 = cVar2 != null ? cVar2.h() : 0;
        yz5.l lVar = this.f13585e;
        if (h17 == 0 || h17 == 0) {
            lVar.invoke(null);
        } else {
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(h17));
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer$takePicture$2$1", "invoke", "(Ljava/nio/IntBuffer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer$takePicture$2$1", "invoke", "(Ljava/nio/IntBuffer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                createBitmap.copyPixelsFromBuffer(it);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("take photo cost1 ");
                long j17 = this.f13586f;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", sb6.toString());
                lVar.invoke(createBitmap);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e17, "", new java.lang.Object[0]);
                lVar.invoke(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
