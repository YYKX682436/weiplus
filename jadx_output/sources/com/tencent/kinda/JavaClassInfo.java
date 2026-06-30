package com.tencent.kinda;

/* loaded from: classes.dex */
public class JavaClassInfo {
    public static java.lang.String TAG = "JavaClassInfo";

    public static java.lang.String getClassName(java.lang.Object obj) {
        if (obj == null) {
            return "";
        }
        return "simple " + obj.toString();
    }

    public static java.lang.String getFullClassName(java.lang.Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
