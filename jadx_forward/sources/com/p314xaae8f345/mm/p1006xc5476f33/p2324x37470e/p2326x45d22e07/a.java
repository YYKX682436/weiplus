package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a(android.media.MediaFormat format, java.lang.String fileName) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String string = format.getString("mime");
        int i17 = (string == null || !r26.n0.B(string, "video", false)) ? 0 : 1;
        if (i17 != 0) {
            c17 = dw3.h.f325744a.c("mux", java.lang.System.currentTimeMillis() + "..h264");
        } else {
            c17 = dw3.h.f325744a.c("mux", java.lang.System.currentTimeMillis() + "..aac");
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b(i17, i17, format, 0, 0, c17, null, null, 216, null);
    }
}
