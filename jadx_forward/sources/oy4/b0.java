package oy4;

@j95.b
/* loaded from: classes5.dex */
public final class b0 extends i95.w implements dk0.j {

    /* renamed from: d, reason: collision with root package name */
    public static ny4.f f431591d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f431592e = "";

    public float[] Ai(android.graphics.Bitmap bitmap) {
        boolean z17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (f431591d != null) {
            z17 = true;
        } else {
            ny4.f fVar = new ny4.f();
            f431591d = fVar;
            try {
                z17 = fVar.c("MODEL_WECLIP_FEATURE");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCLIPV2ApiImpl", "initEnv >> Exception: " + e17.getMessage(), e17);
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCLIPV2ApiImpl", "initEnv >> " + z17 + ' ' + f431591d);
            if (z17) {
                ny4.f fVar2 = f431591d;
                if (fVar2 == null || (str = fVar2.f422997b) == null) {
                    str = "";
                }
                f431592e = str;
                f431592e = r26.n0.p0(str, "/", str);
            } else {
                f431591d = null;
            }
        }
        if (!z17) {
            return new float[0];
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        kz5.x0 it = e06.p.m(0, length).iterator();
        while (((e06.j) it).f327747f) {
            int b17 = it.b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        float[] fArr = new float[0];
        try {
            try {
                ny4.f fVar3 = f431591d;
                fArr = fVar3 != null ? fVar3.a(allocateDirect, bitmap.getWidth(), bitmap.getHeight()) : new float[0];
            } finally {
                wi();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCLIPV2ApiImpl", "getImageFeatureResult >> applyReq error: " + e18.getMessage(), e18);
        }
        return fArr;
    }

    public final void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCLIPV2ApiImpl", "destroyEnv " + f431591d);
        try {
            try {
                ny4.f fVar = f431591d;
                if (fVar != null) {
                    fVar.b();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCLIPV2ApiImpl", "destroyEnv >> Exception: " + e17.getMessage(), e17);
            }
        } finally {
            f431591d = null;
        }
    }
}
