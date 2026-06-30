package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85853d;

    public x(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85853d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f85853d.f85781c) {
            this.f85853d.b();
        }
    }
}
