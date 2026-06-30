package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e f127412a;

    /* renamed from: b, reason: collision with root package name */
    public int f127413b = android.os.Process.myPid();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f127414c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f127415d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c f127416e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f127417f;

    public b(android.content.Context context, com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e c2904xd06a783e) {
        this.f127412a = c2904xd06a783e;
        this.f127414c = context.getPackageName();
        this.f127415d = new java.lang.ref.WeakReference<>(context);
        a(context);
    }

    public void a(android.content.Context context) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("FileLogThread");
        this.f127417f = handlerThread;
        handlerThread.start();
        this.f127416e = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c(this.f127417f.getLooper(), this.f127412a, context);
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.a(this, this.f127412a.m21651x15b8626d()));
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.d m21724xba9b60d6;
        if (this.f127412a.m21656xb9a70294() && i17 >= this.f127412a.m21654x293c65c8()) {
            if (this.f127412a.m21655xe6c45fbc() && i17 == 7) {
                android.util.Log.wtf(str, str2);
            }
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.e eVar = com.tencent.cloud.component.common.ai.log.e.a.f127430a;
            eVar.getClass();
            synchronized (com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.e.class) {
                m21724xba9b60d6 = eVar.f127429a.m21724xba9b60d6();
            }
            if (m21724xba9b60d6 == null) {
                m21724xba9b60d6 = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.d(i17, str, str2);
            } else {
                m21724xba9b60d6.f127424b = java.lang.System.currentTimeMillis();
                m21724xba9b60d6.f127423a = i17;
                m21724xba9b60d6.f127425c = str;
                m21724xba9b60d6.f127426d = str2;
            }
            long id6 = java.lang.Thread.currentThread().getId();
            m21724xba9b60d6.f127427e = this.f127413b + "-" + id6;
            m21724xba9b60d6.f127428f = this.f127414c;
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c cVar = this.f127416e;
            if (cVar != null) {
                android.os.Message obtainMessage = cVar.obtainMessage();
                obtainMessage.what = 1;
                obtainMessage.obj = m21724xba9b60d6;
                cVar.sendMessage(obtainMessage);
            }
        }
    }
}
