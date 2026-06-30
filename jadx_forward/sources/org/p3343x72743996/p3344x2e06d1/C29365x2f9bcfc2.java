package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.StreamUtil */
/* loaded from: classes7.dex */
public class C29365x2f9bcfc2 {
    /* renamed from: closeQuietly */
    public static void m152641xd71209a9(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: closeQuietly */
    public static void m152642xd71209a9(java.util.zip.ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (java.io.IOException unused) {
        }
    }
}
