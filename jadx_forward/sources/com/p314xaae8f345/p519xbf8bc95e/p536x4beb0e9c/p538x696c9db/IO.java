package com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db;

/* loaded from: classes7.dex */
public class IO {
    /* renamed from: safeClose */
    public static final void m37447xbb07de6b(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
