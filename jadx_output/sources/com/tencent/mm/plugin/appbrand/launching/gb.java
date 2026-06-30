package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class gb implements java.util.concurrent.Callable, wu5.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.hb f84630d;

    public gb(com.tencent.mm.plugin.appbrand.launching.hb hbVar) {
        this.f84630d = hbVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.launching.hb hbVar = this.f84630d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hbVar.f84647d = java.lang.System.currentTimeMillis();
        try {
            return this.f84630d.call();
        } finally {
            this.f84630d.f84648e = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.appbrand.launching.hb hbVar2 = this.f84630d;
            hbVar2.f84649f = hbVar2.f84648e - this.f84630d.f84647d;
        }
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return this.f84630d.f();
    }
}
