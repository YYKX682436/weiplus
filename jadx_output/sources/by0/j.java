package by0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public ny4.e f36334a;

    public final void a() {
        jz5.f0 f0Var;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ny4.e eVar = this.f36334a;
            if (eVar != null) {
                eVar.c();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        this.f36334a = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.MJOcrApi", "destroyEnv");
    }

    public final by0.i b(android.graphics.Bitmap bitmap) {
        float min = java.lang.Math.min(960.0f / bitmap.getWidth(), 960.0f / bitmap.getHeight());
        if (min < 1.0f) {
            bitmap = com.tencent.mm.sdk.platformtools.x.F0(bitmap, min, min, true);
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        return new by0.i(bitmap, allocateDirect);
    }

    public final java.lang.String c(android.graphics.Bitmap bitmap) {
        java.lang.Object m521constructorimpl;
        ny4.e eVar;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            eVar = this.f36334a;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (eVar == null) {
            return null;
        }
        by0.i b17 = b(bitmap);
        java.nio.Buffer buffer = b17.f36333b;
        android.graphics.Bitmap bitmap2 = b17.f36332a;
        m521constructorimpl = kotlin.Result.m521constructorimpl(eVar.a(buffer, bitmap2.getWidth(), bitmap2.getHeight()));
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MJOcrApi", "getImageOcrResult: ", m524exceptionOrNullimpl);
        }
        return (java.lang.String) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }

    public final boolean d() {
        java.lang.Object m521constructorimpl;
        if (this.f36334a != null) {
            return true;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ny4.e eVar = new ny4.e();
            this.f36334a = eVar;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(eVar.e(false)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = ((java.lang.Boolean) m521constructorimpl).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MJOcrApi", "initEnv >> " + booleanValue);
        return booleanValue;
    }
}
