package va1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final va1.b f515762a = new va1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f515763b = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    public final void a(java.lang.String instanceId, java.lang.String str, java.lang.String name, long j17, long j18, java.lang.String str2) {
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuditsUtil", "instanceId: %s, appId: %s, name: %s, start: %d, end : %d, args: %s", instanceId, str, name, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l();
        lVar.f168889a = str;
        lVar.f168890b = "Native";
        lVar.f168892d = name;
        lVar.f168891c = "X";
        lVar.f168893e = j17;
        lVar.f168894f = j18;
        if (str2 == null || (str3 = fp.s0.a(str2)) == null) {
            str3 = "";
        }
        lVar.f168895g = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuditsUtil", "traceEvent, instanceId: %s, appId: %s, name: %s, start: %d, end : %d, args: %s", instanceId, str, name, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str2);
        java.util.Map auditsTraceExtraDataMap = f515763b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(auditsTraceExtraDataMap, "auditsTraceExtraDataMap");
        synchronized (auditsTraceExtraDataMap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuditsUtil", "addEventToMap, event is " + lVar);
            if (!auditsTraceExtraDataMap.containsKey(instanceId)) {
                auditsTraceExtraDataMap.put(instanceId, new java.util.ArrayList());
            }
            java.util.List list = (java.util.List) auditsTraceExtraDataMap.get(instanceId);
            if (list != null) {
                list.add(lVar);
            }
        }
    }
}
