package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.utils.SimplePool<com.tencent.cloud.component.common.ai.log.d> f45896a = new com.tencent.cloud.component.common.ai.utils.SimplePool<>(30, "LogInfoPool");

    /* loaded from: classes14.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.tencent.cloud.component.common.ai.log.e f45897a = new com.tencent.cloud.component.common.ai.log.e();
    }

    public void a(com.tencent.cloud.component.common.ai.log.d dVar) {
        dVar.f45890a = 2;
        dVar.f45891b = 0L;
        dVar.f45892c = "";
        dVar.f45893d = "";
        dVar.f45894e = "";
        dVar.f45895f = "";
        synchronized (com.tencent.cloud.component.common.ai.log.e.class) {
            this.f45896a.release(dVar);
        }
    }
}
