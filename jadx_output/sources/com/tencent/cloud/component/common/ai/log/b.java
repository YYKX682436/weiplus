package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.log.AiLogConfig f45879a;

    /* renamed from: b, reason: collision with root package name */
    public int f45880b = android.os.Process.myPid();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f45881c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f45882d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.log.c f45883e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f45884f;

    public b(android.content.Context context, com.tencent.cloud.component.common.ai.log.AiLogConfig aiLogConfig) {
        this.f45879a = aiLogConfig;
        this.f45881c = context.getPackageName();
        this.f45882d = new java.lang.ref.WeakReference<>(context);
        a(context);
    }

    public void a(android.content.Context context) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("FileLogThread");
        this.f45884f = handlerThread;
        handlerThread.start();
        this.f45883e = new com.tencent.cloud.component.common.ai.log.c(this.f45884f.getLooper(), this.f45879a, context);
        com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new com.tencent.cloud.component.common.ai.log.a(this, this.f45879a.getDirLog()));
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.d acquire;
        if (this.f45879a.isOpen() && i17 >= this.f45879a.getMinLevel()) {
            if (this.f45879a.isLogCat() && i17 == 7) {
                android.util.Log.wtf(str, str2);
            }
            com.tencent.cloud.component.common.ai.log.e eVar = com.tencent.cloud.component.common.ai.log.e.a.f45897a;
            eVar.getClass();
            synchronized (com.tencent.cloud.component.common.ai.log.e.class) {
                acquire = eVar.f45896a.acquire();
            }
            if (acquire == null) {
                acquire = new com.tencent.cloud.component.common.ai.log.d(i17, str, str2);
            } else {
                acquire.f45891b = java.lang.System.currentTimeMillis();
                acquire.f45890a = i17;
                acquire.f45892c = str;
                acquire.f45893d = str2;
            }
            long id6 = java.lang.Thread.currentThread().getId();
            acquire.f45894e = this.f45880b + "-" + id6;
            acquire.f45895f = this.f45881c;
            com.tencent.cloud.component.common.ai.log.c cVar = this.f45883e;
            if (cVar != null) {
                android.os.Message obtainMessage = cVar.obtainMessage();
                obtainMessage.what = 1;
                obtainMessage.obj = acquire;
                cVar.sendMessage(obtainMessage);
            }
        }
    }
}
