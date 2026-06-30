package com.p314xaae8f345.mm.p977xf15b111;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f153755e;

    public e(java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f153754d = str;
        this.f153755e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f153754d);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/normsgext/d$m$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/normsgext/d$m$1", "run", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        this.f153755e.countDown();
    }
}
