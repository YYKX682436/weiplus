package com.p302x1ea3c036.p303x85af7841;

/* renamed from: com.luggage.desensitization.DesensitizationJni */
/* loaded from: classes.dex */
public class C2842x8c5ff3c4 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("android_desensitization");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/luggage/desensitization/DesensitizationJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/luggage/desensitization/DesensitizationJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nativeStrDesensitizeDetectedContentWithMask */
    private native java.lang.String m21081x455c32d2(java.lang.String str, int i17, int i18);

    /* renamed from: nativeStrDesensitizeDetectedContentWithMaskForPageInfo */
    private native java.lang.String m21082xeb145194(java.lang.String str, int i17, int i18);

    /* renamed from: nativeStrDesensitizeWithMask */
    private native java.lang.String m21083xbb3a52a9(java.lang.String str, int i17, int i18);

    public java.lang.String a(java.lang.String str, int i17, int i18) {
        return m21081x455c32d2(str, i17, i18);
    }
}
