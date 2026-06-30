package com.tencent.mm.app;

/* loaded from: classes3.dex */
public final class y extends i75.a {
    public y() {
        super(com.tencent.mm.app.a0.f53288d);
    }

    @Override // i75.a, androidx.lifecycle.o
    public void a(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.a(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f289505d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb6.toString());
    }

    @Override // i75.a, androidx.lifecycle.o
    public void c(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.c(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f289505d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb6.toString());
    }
}
