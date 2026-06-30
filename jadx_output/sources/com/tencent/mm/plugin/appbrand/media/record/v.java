package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85851d;

    public v(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85851d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f85851d.f85781c) {
            com.tencent.mm.plugin.appbrand.media.record.a0.d(this.f85851d);
        }
    }
}
