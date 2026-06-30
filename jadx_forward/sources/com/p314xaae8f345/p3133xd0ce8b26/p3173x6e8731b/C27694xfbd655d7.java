package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ZidlLibraryLoader */
/* loaded from: classes4.dex */
public class C27694xfbd655d7 {
    private static final java.lang.String TAG = "ZidlLibraryLoader";

    /* renamed from: instance */
    private static final com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7 f60639x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7();

    /* renamed from: _hellAccFlag_ */
    private byte f60640x7f11beae;

    /* renamed from: allInOneSo */
    private boolean f60641xc59a605c = true;

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7 m119551x9cf0d20b() {
        return f60639x21169495;
    }

    /* renamed from: loadLibrary */
    public void m119552xeb57c8f5(java.lang.String str, java.lang.String str2) {
        if (this.f60641xc59a605c) {
            str = str2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("zidl2");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c(TAG, "load library " + str, new java.lang.Object[0]);
    }

    /* renamed from: setLibLoadMode */
    public void m119553xa6e1fb8c(boolean z17) {
        this.f60641xc59a605c = z17;
    }
}
