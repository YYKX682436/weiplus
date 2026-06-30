package com.tme.p3259xc83515e4.p3260xf6c6b17;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¨\u0006\t"}, d2 = {"Lcom/tme/karaoke/lib_singresource/DecryptMedia;", "", "", "fileOffset", "Ljava/nio/ByteBuffer;", "buffer", "", "len", "decrypt_native", "lib_singresource_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tme.karaoke.lib_singresource.DecryptMedia */
/* loaded from: classes5.dex */
public final class C28054x50d16a77 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f302194d;

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f302195a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f302196b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f302197c;

    static {
        try {
            if (f302194d) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("singdecrypt");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singresource/DecryptMedia", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tme/karaoke/lib_singresource/DecryptMedia", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f302194d = true;
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public C28054x50d16a77(yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f302195a = (i17 & 1) != 0 ? null : lVar;
    }

    /* renamed from: decrypt_native */
    private final native int m122170x65408b09(long fileOffset, java.nio.ByteBuffer buffer, int len);

    public final int a(long j17, byte[] buffer, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        if (!f302194d) {
            i17 = -1000;
        } else if (i17 == 0) {
            i17 = 0;
        } else {
            if (this.f302196b == null) {
                this.f302196b = java.nio.ByteBuffer.allocateDirect(i17);
            }
            java.nio.ByteBuffer byteBuffer = this.f302196b;
            if (byteBuffer == null) {
                byteBuffer = java.nio.ByteBuffer.allocateDirect(i17);
            }
            int i18 = i17;
            while (i18 > 0) {
                byteBuffer.clear();
                int min = java.lang.Math.min(java.lang.Math.min(i17, byteBuffer.limit()), i18);
                int i19 = i17 - i18;
                byteBuffer.put(buffer, i19, min);
                int m122170x65408b09 = m122170x65408b09((i17 + j17) - i18, byteBuffer, min);
                if (m122170x65408b09 < 0) {
                    return m122170x65408b09;
                }
                byteBuffer.flip();
                byteBuffer.get(buffer, i19, min);
                i18 -= min;
            }
        }
        synchronized (com.tme.p3259xc83515e4.p3260xf6c6b17.C28054x50d16a77.class) {
            if (!this.f302197c) {
                this.f302197c = true;
                yz5.l lVar = this.f302195a;
                if (lVar != null) {
                    jz5.l[] lVarArr = new jz5.l[2];
                    lVarArr[0] = new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17 >= 0 ? "0" : java.lang.String.valueOf(i17));
                    lVarArr[1] = new jz5.l("type", "decryptMedia");
                    lVar.mo146xb9724478(kz5.c1.k(lVarArr));
                }
            }
        }
        return i17;
    }
}
