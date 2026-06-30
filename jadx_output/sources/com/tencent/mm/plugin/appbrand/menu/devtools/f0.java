package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f85898d;

    public f0(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f85898d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85898d.y1().O().f47398a.requestV8GarbageCollectionForTest();
    }
}
