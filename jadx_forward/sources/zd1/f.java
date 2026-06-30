package zd1;

/* loaded from: classes7.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        try {
            int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
            java.nio.ByteBuffer a17 = zd1.u.f553111a.a(bitmap, false);
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("buffer", a17);
            hashMap.put("shape", iArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(service.mo50357xcd94f799(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) service.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
            zd1.g gVar = new zd1.g();
            gVar.t(hashMap);
            gVar.u(service);
            gVar.m();
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
