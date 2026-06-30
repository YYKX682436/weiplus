package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class u implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final fb1.h f76739d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f76740e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f76741f;

    public u(fb1.h onStatusChange) {
        kotlin.jvm.internal.o.g(onStatusChange, "onStatusChange");
        this.f76739d = onStatusChange;
        this.f76740e = new java.util.ArrayList();
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        fb1.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "onStatusChange, value: " + ((java.lang.Boolean) obj));
        java.util.Iterator it = this.f76740e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((com.tencent.mm.plugin.appbrand.av_device_usage.i) obj2).a()) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.av_device_usage.i iVar = (com.tencent.mm.plugin.appbrand.av_device_usage.i) obj2;
        boolean z17 = iVar != null;
        if (this.f76741f != z17) {
            if (z17) {
                kotlin.jvm.internal.o.d(iVar);
                cVar = new fb1.a(com.tencent.mm.plugin.appbrand.av_device_usage.s.a(iVar.f76710a));
            } else {
                cVar = fb1.b.f260828a;
            }
            this.f76739d.a(cVar);
            this.f76741f = z17;
        }
    }
}
