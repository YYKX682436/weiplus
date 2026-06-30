package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$d */
/* loaded from: classes8.dex */
public final /* synthetic */ class CallableC5037x56f1711 implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String a17 = um0.a.a();
        return a17.length() > 1024 ? a17.substring(0, 1024) : a17;
    }
}
