package com.luggage.desensitization;

/* loaded from: classes.dex */
public class DesensitizationJni {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("android_desensitization");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/luggage/desensitization/DesensitizationJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/luggage/desensitization/DesensitizationJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native java.lang.String nativeStrDesensitizeDetectedContentWithMask(java.lang.String str, int i17, int i18);

    private native java.lang.String nativeStrDesensitizeDetectedContentWithMaskForPageInfo(java.lang.String str, int i17, int i18);

    private native java.lang.String nativeStrDesensitizeWithMask(java.lang.String str, int i17, int i18);

    public java.lang.String a(java.lang.String str, int i17, int i18) {
        return nativeStrDesensitizeDetectedContentWithMask(str, i17, i18);
    }
}
