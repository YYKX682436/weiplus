package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/report/service/KVReportService;", "Lcom/tencent/mm/service/MMService;", "<init>", "()V", "com/tencent/mm/plugin/report/service/a0", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.report.service.KVReportService */
/* loaded from: classes8.dex */
public final class C17198xa4bc9336 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.a0 f239670m = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.a0(null);

    /* renamed from: n, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.n f239671n;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b0 f239672i = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b0();

    public static final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.a0 a0Var = f239670m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVReportService", "bind from " + bm5.f1.a());
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17198xa4bc9336.class);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.z(a0Var);
            android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.class);
            boolean z17 = l85.j1.f398720a;
            l85.j1.b("MicroMsg.KVReportService", intent2);
            l85.h1.b(intent, zVar, 0, "mm", true, intent2);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.KVReportService", th6, "", new java.lang.Object[0]);
        }
    }

    public static final void j(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.n nVar = f239671n;
        if (nVar != null) {
            nVar.X3(bundle);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("aidl not ready yet");
        }
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVReportService", "onBind");
        return this.f239672i;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVReportService", "onCreate");
    }
}
