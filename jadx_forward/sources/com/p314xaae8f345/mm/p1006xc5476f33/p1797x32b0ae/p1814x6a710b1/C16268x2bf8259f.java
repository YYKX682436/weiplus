package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/lite/utils/LiteAppReporterDependencyImpl;", "Lcom/tencent/liteapp/gen/LiteAppReporterDependency;", "", "logid", "", "logString", "Ljz5/f0;", "kvlog", "Lcom/tencent/liteapp/gen/LiteAppMetricsInfo;", "getMetricsInfo", "generateUUID", "", "calcIsSample", "calcIsTemporarySample", "useNewSampling", "<init>", "()V", "Companion", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl */
/* loaded from: classes15.dex */
public final class C16268x2bf8259f implements com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.Companion INSTANCE = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.Companion(null);

    /* renamed from: STATUS_MAIN_PROCESS_START */
    public static final java.lang.String f37451x9476c3b9 = "LARS_MainProcessStart";
    public static final java.lang.String TAG = "MicroMsg.LiteAppReporterDependencyImpl";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/lite/utils/LiteAppReporterDependencyImpl$Companion;", "", "()V", "STATUS_MAIN_PROCESS_START", "", "TAG", "getLiteAppReporter", "Lcom/tencent/liteapp/gen/LiteAppReporter;", "appId", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl$Companion, reason: from kotlin metadata */
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getLiteAppReporter */
        public final com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e(java.lang.String appId) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m28853xaf65a0fc = com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874.m28853xaf65a0fc(appId, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65661x48610c87(appId));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m28853xaf65a0fc, "create(...)");
            return m28853xaf65a0fc;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: calcIsSample */
    public boolean mo28953xbf9c20e9() {
        java.lang.String j17 = j62.e.g().j("clicfg_liteapp_reporter_sampling_rate", "0", true, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        double parseDouble = java.lang.Double.parseDouble(j17);
        if (parseDouble < 0.0d) {
            parseDouble = 0.0d;
        }
        if (parseDouble > 1.0d) {
            parseDouble = 1.0d;
        }
        return c06.e.f119249d.i() < parseDouble;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: calcIsTemporarySample */
    public boolean mo28954xa0cdaafc() {
        java.lang.String j17 = j62.e.g().j("clicfg_liteapp_reporter_temporary_sampling_rate", "1", true, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        double parseDouble = java.lang.Double.parseDouble(j17);
        if (parseDouble < 0.0d) {
            parseDouble = 0.0d;
        }
        if (parseDouble > 1.0d) {
            parseDouble = 1.0d;
        }
        return c06.e.f119249d.i() < parseDouble;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: generateUUID */
    public java.lang.String mo28955x666e3eb0() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        return uuid;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: getMetricsInfo */
    public com.p314xaae8f345.p362xadfe2b3.gen.C3697x27e12f9e mo28956x734dc6db() {
        return new com.p314xaae8f345.p362xadfe2b3.gen.C3697x27e12f9e(0L, 0L, 0L);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: kvlog */
    public void mo28957x61b19f9(int i17, java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "kvlog: logString is null or empty");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.gen.InterfaceC3701xb469d6df
    /* renamed from: useNewSampling */
    public boolean mo28958x8c6235a0() {
        return j62.e.g().l("clicfg_liteapp_reporter_new_sampling", false, true, true);
    }
}
