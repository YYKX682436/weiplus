package zd1;

/* loaded from: classes7.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        try {
            int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            allocate.position(0);
            bitmap.copyPixelsToBuffer(allocate);
            allocate.position(0);
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("buffer", allocate);
            hashMap.put("shape", iArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
            zd1.e eVar = new zd1.e();
            eVar.t(hashMap);
            eVar.u(env);
            eVar.m();
            if (z17) {
                try {
                    bitmap.recycle();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    bitmap.recycle();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }
}
