package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85852d;

    public w(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85852d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f85852d.f85781c) {
            this.f85852d.a();
        }
    }
}
