package com.tencent.mm.feature.performance;

/* loaded from: classes5.dex */
public final /* synthetic */ class c2$$j implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (mm.o.a()) {
            if (java.lang.System.currentTimeMillis() % ((long) 10) == 0) {
                ap.a.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "MediaStore", new java.lang.Throwable(), null, "pathToUriMiss", str);
            }
        }
        return null;
    }
}
