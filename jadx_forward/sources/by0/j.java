package by0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public ny4.e f117867a;

    public final void a() {
        jz5.f0 f0Var;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ny4.e eVar = this.f117867a;
            if (eVar != null) {
                eVar.c();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        this.f117867a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJOcrApi", "destroyEnv");
    }

    public final by0.i b(android.graphics.Bitmap bitmap) {
        float min = java.lang.Math.min(960.0f / bitmap.getWidth(), 960.0f / bitmap.getHeight());
        if (min < 1.0f) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(bitmap, min, min, true);
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
        java.lang.Object m143895xf1229813;
        ny4.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            eVar = this.f117867a;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (eVar == null) {
            return null;
        }
        by0.i b17 = b(bitmap);
        java.nio.Buffer buffer = b17.f117866b;
        android.graphics.Bitmap bitmap2 = b17.f117865a;
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(eVar.a(buffer, bitmap2.getWidth(), bitmap2.getHeight()));
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJOcrApi", "getImageOcrResult: ", m143898xd4a2fc34);
        }
        return (java.lang.String) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
    }

    public final boolean d() {
        java.lang.Object m143895xf1229813;
        if (this.f117867a != null) {
            return true;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ny4.e eVar = new ny4.e();
            this.f117867a = eVar;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(eVar.e(false)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = ((java.lang.Boolean) m143895xf1229813).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJOcrApi", "initEnv >> " + booleanValue);
        return booleanValue;
    }
}
