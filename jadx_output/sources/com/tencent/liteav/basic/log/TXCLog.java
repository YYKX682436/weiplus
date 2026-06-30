package com.tencent.liteav.basic.log;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class TXCLog {
    static {
        com.tencent.liteav.base.util.q.a();
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(str, java.lang.String.format(str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        i(str, java.lang.String.format(str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        v(str, java.lang.String.format(str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        w(str, java.lang.String.format(str2, objArr));
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.d(str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.e(str, str2, new java.lang.Object[0]);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.i(str, str2, new java.lang.Object[0]);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.v(str, str2, new java.lang.Object[0]);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.w(str, str2, new java.lang.Object[0]);
    }
}
