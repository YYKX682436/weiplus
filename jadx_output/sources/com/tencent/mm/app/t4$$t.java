package com.tencent.mm.app;

/* loaded from: classes8.dex */
public final /* synthetic */ class t4$$t implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String a17 = um0.a.a();
        return a17.length() > 1024 ? a17.substring(0, 1024) : a17;
    }
}
