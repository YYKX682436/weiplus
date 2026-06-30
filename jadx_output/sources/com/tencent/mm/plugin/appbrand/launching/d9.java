package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class d9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84571a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84572b = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String instanceId, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct wAAppTaskVersionFallBackActionStruct = (com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct) f84571a.remove(instanceId);
        if (wAAppTaskVersionFallBackActionStruct == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WAAppTaskUpdateResultAfterVersionFallBackStruct wAAppTaskUpdateResultAfterVersionFallBackStruct = new com.tencent.mm.autogen.mmdata.rpt.WAAppTaskUpdateResultAfterVersionFallBackStruct();
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61881d = wAAppTaskUpdateResultAfterVersionFallBackStruct.b("Appid", wAAppTaskVersionFallBackActionStruct.f61893d, true);
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61882e = wAAppTaskUpdateResultAfterVersionFallBackStruct.b("Username", wAAppTaskVersionFallBackActionStruct.f61894e, true);
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61883f = wAAppTaskUpdateResultAfterVersionFallBackStruct.b("InstanceId", wAAppTaskVersionFallBackActionStruct.f61902m, true);
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61884g = wAAppTaskVersionFallBackActionStruct.f61895f;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61885h = wAAppTaskVersionFallBackActionStruct.f61896g;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61886i = wAAppTaskVersionFallBackActionStruct.f61897h;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61887j = z17 ? 1L : 0L;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61888k = j17;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61889l = wAAppTaskVersionFallBackActionStruct.f61899j;
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61890m = wAAppTaskUpdateResultAfterVersionFallBackStruct.b("NetType", wAAppTaskVersionFallBackActionStruct.f61900k, true);
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61891n = wAAppTaskVersionFallBackActionStruct.f61901l;
        java.lang.Integer num = (java.lang.Integer) f84572b.remove(instanceId);
        if (num == null) {
            num = 10000;
        }
        wAAppTaskUpdateResultAfterVersionFallBackStruct.f61892o = num.intValue();
        wAAppTaskUpdateResultAfterVersionFallBackStruct.k();
    }

    public static final void b(java.lang.String instanceId, int i17) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        f84572b.put(instanceId, java.lang.Integer.valueOf(i17));
    }
}
