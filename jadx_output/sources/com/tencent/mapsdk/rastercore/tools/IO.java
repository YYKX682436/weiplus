package com.tencent.mapsdk.rastercore.tools;

/* loaded from: classes7.dex */
public class IO {
    public static final void safeClose(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
