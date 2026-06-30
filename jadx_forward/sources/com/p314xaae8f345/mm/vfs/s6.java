package com.p314xaae8f345.mm.vfs;

/* loaded from: classes7.dex */
public abstract class s6 {
    public static final java.lang.String a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.nio.charset.Charset charset) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "openRead(...)");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(C, charset);
        try {
            java.lang.String c17 = vz5.v.c(inputStreamReader);
            vz5.b.a(inputStreamReader, null);
            return c17;
        } finally {
        }
    }

    public static /* synthetic */ java.lang.String b(com.p314xaae8f345.mm.vfs.r6 r6Var, java.nio.charset.Charset charset, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            charset = r26.c.f450398a;
        }
        return a(r6Var, charset);
    }

    public static final void c(com.p314xaae8f345.mm.vfs.r6 r6Var, byte[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
        try {
            H.write(array);
            vz5.b.a(H, null);
        } finally {
        }
    }

    public static void d(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String text, java.nio.charset.Charset charset, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            charset = r26.c.f450398a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        c(r6Var, bytes);
    }
}
