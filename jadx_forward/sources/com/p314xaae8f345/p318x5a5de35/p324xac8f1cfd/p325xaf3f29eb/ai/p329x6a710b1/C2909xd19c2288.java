package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1;

/* renamed from: com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil */
/* loaded from: classes13.dex */
public class C2909xd19c2288 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ThreadPoolExecutor f127434a;

    /* renamed from: com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil$a */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288 f127435a = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288();
    }

    public C2909xd19c2288() {
        a();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288 m21726x9cf0d20b() {
        return com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.a.f127435a;
    }

    public final void a() {
        this.f127434a = new java.util.concurrent.ThreadPoolExecutor(8, 64, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy());
    }

    /* renamed from: addWork */
    public void m21727xbb8b7b52(java.lang.Runnable runnable) {
        if (this.f127434a.isShutdown()) {
            return;
        }
        this.f127434a.execute(runnable);
    }

    /* renamed from: showDown */
    public void m21728xebc6ad3f() {
        if (this.f127434a.isShutdown()) {
            return;
        }
        this.f127434a.shutdown();
    }

    /* renamed from: waitThreadTime */
    public void m21729x2d6c9f4c() {
        if (android.os.Looper.getMainLooper().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            return;
        }
        try {
            java.lang.Thread.sleep(500L);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
