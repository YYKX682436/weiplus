package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class q implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.q f76731d = new com.tencent.mm.plugin.appbrand.av_device_usage.q();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f76732e = jz5.h.b(com.tencent.mm.plugin.appbrand.av_device_usage.p.f76726d);

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mm.plugin.appbrand.av_device_usage.o oVar = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "markInUse, scene: " + scene.name() + ", inUse: " + z17 + ", token: " + token);
        synchronized (oVar) {
            if (!z17) {
                java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.appbrand.av_device_usage.o.f76724j.get(scene);
                if (hashSet != null) {
                    hashSet.remove(token);
                }
            } else {
                java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76724j;
                java.lang.Object obj = hashMap.get(scene);
                if (obj == null) {
                    obj = new java.util.HashSet();
                    hashMap.put(scene, obj);
                }
                ((java.util.HashSet) obj).add(token);
            }
        }
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.appbrand.av_device_usage.v vVar = (com.tencent.mm.plugin.appbrand.av_device_usage.v) ((java.util.Map) ((jz5.n) f76732e).getValue()).get(scene);
        return vVar != null ? vVar.ec(scene, z17, hVar) : fb1.b.f260828a;
    }
}
