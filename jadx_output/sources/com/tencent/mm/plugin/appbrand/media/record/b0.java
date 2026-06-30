package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes.dex */
public class b0 implements com.tencent.mm.plugin.appbrand.media.record.c0 {
    @Override // com.tencent.mm.plugin.appbrand.media.record.c0
    public void loadLibrary(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/media/record/AudioRecordUtil$1", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/media/record/AudioRecordUtil$1", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
