package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f85849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85850e;

    public u(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var, com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        this.f85850e = a0Var;
        this.f85849d = recordParam;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f85850e.f85781c) {
            com.tencent.mm.plugin.appbrand.media.record.a0 a0Var = this.f85850e;
            a0Var.f85782d = this.f85849d;
            com.tencent.mm.plugin.appbrand.media.record.a0.c(a0Var);
        }
    }
}
