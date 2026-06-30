package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class s3 {
    public static final void a(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mars.xlog.Log.e("[WASkyline.Critical]", str + " : " + str2, java.util.Arrays.copyOf(obj, obj.length));
    }

    public static final void b(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mars.xlog.Log.i("[WASkyline.Critical]", str + " : " + str2, java.util.Arrays.copyOf(obj, obj.length));
    }

    public static final void c(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mars.xlog.Log.w("[WASkyline.Critical]", str + " : " + str2, java.util.Arrays.copyOf(obj, obj.length));
    }
}
