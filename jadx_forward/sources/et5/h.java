package et5;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f338209a;

    static {
        zs5.n0 n0Var = zs5.n0.f556983a;
        boolean z17 = ((zs5.a0) ((jz5.n) zs5.n0.f556984b).mo141623x754a37bb()) == zs5.a0.f556850e;
        f338209a = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxQBarUtil", "WxQBarUtil.init enableCrossPlatform: %s", java.lang.Boolean.valueOf(z17));
    }

    public static int a(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18) {
        if (byteBuffer == null || byteBuffer2 == null) {
            return -1;
        }
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c.f298507b.i(byteBuffer2, byteBuffer, i17, i18);
    }

    public static void b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f fVar, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t tVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.t();
            tVar.f298664d = bitmap.getWidth();
            tVar.f298665e = bitmap.getHeight();
            fVar.f298537d.add(tVar);
        }
    }

    public static java.nio.ByteBuffer c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public static java.nio.ByteBuffer d(android.graphics.Bitmap bitmap) {
        try {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocateDirect);
            return allocateDirect;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxQBarUtil", th6, "buildByteBufferFromBitmap exception", new java.lang.Object[0]);
            return null;
        }
    }

    public static int e(java.nio.ByteBuffer byteBuffer, int[] iArr, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        if (!f338209a) {
            return -1;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c.f298507b.a(str, i17, i18, str2, i19, byteBuffer);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxQBarUtil", "encode failed, result null");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxQBarUtil", "encode result: %d, size: %d, %d", java.lang.Integer.valueOf(a17.f298669d), java.lang.Integer.valueOf(a17.f298670e), java.lang.Integer.valueOf(a17.f298671f));
        if (iArr != null && iArr.length >= 2) {
            iArr[0] = a17.f298670e;
            iArr[1] = a17.f298671f;
        }
        return a17.f298669d;
    }

    public static byte[] f(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.remaining() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxQBarUtil", "getDataFromByteBuffer remaining 0");
            return null;
        }
        int position = byteBuffer.position();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    public static int g(int i17) {
        if (i17 != 17) {
            return i17 != 842094169 ? -1 : 4;
        }
        return 3;
    }
}
