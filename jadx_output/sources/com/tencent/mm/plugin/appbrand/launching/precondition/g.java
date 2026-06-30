package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.f f84988e;

    public g(com.tencent.mm.plugin.appbrand.launching.precondition.f fVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f84988e = fVar;
        this.f84987d = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f312615d).a(this);
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.launching.precondition.e eVar = this.f84988e.f84980c;
            eVar.f84957f.e(this.f84987d, eVar.f84955d.f84910o);
        } finally {
            this.f84988e.f84980c.f84955d.c();
        }
    }
}
