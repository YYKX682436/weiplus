package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class v implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public final fb1.d[] f76742d;

    /* renamed from: e, reason: collision with root package name */
    public final fb1.d[] f76743e;

    public v(fb1.d[] scenesCheckBefore, fb1.d[] scenesCheckUsing) {
        kotlin.jvm.internal.o.g(scenesCheckBefore, "scenesCheckBefore");
        kotlin.jvm.internal.o.g(scenesCheckUsing, "scenesCheckUsing");
        this.f76742d = scenesCheckBefore;
        this.f76743e = scenesCheckUsing;
    }

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        kotlin.jvm.internal.o.g(scene, "scene");
        fb1.d[] dVarArr = this.f76742d;
        int i17 = 0;
        for (fb1.d dVar : dVarArr) {
            if (com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(dVar).a()) {
                fb1.a aVar = new fb1.a(com.tencent.mm.plugin.appbrand.av_device_usage.s.a(dVar));
                com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, scene: " + scene + ", status: " + aVar);
                if (z17 && hVar != null) {
                    com.tencent.mm.plugin.appbrand.av_device_usage.u uVar = new com.tencent.mm.plugin.appbrand.av_device_usage.u(new com.tencent.mm.plugin.appbrand.av_device_usage.r(hVar));
                    int length = dVarArr.length;
                    while (i17 < length) {
                        fb1.d dVar2 = dVarArr[i17];
                        com.tencent.mm.plugin.appbrand.av_device_usage.j a17 = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(dVar2);
                        if (a17 instanceof com.tencent.mm.plugin.appbrand.av_device_usage.i) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse false, observe " + dVar2);
                            com.tencent.mm.plugin.appbrand.av_device_usage.i observable = (com.tencent.mm.plugin.appbrand.av_device_usage.i) a17;
                            kotlin.jvm.internal.o.g(observable, "observable");
                            uVar.f76740e.add(observable);
                            nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.t(observable, uVar));
                        }
                        i17++;
                    }
                }
                return aVar;
            }
        }
        fb1.b bVar = fb1.b.f260828a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, scene: " + scene + ", status: " + bVar);
        if (hVar != null) {
            com.tencent.mm.plugin.appbrand.av_device_usage.u uVar2 = new com.tencent.mm.plugin.appbrand.av_device_usage.u(new com.tencent.mm.plugin.appbrand.av_device_usage.r(hVar));
            fb1.d[] dVarArr2 = this.f76743e;
            int length2 = dVarArr2.length;
            while (i17 < length2) {
                fb1.d dVar3 = dVarArr2[i17];
                com.tencent.mm.plugin.appbrand.av_device_usage.j a18 = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(dVar3);
                if (a18 instanceof com.tencent.mm.plugin.appbrand.av_device_usage.i) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "canIUse, observe " + dVar3);
                    com.tencent.mm.plugin.appbrand.av_device_usage.i observable2 = (com.tencent.mm.plugin.appbrand.av_device_usage.i) a18;
                    kotlin.jvm.internal.o.g(observable2, "observable");
                    uVar2.f76740e.add(observable2);
                    nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.t(observable2, uVar2));
                }
                i17++;
            }
        }
        return bVar;
    }
}
