package com.p314xaae8f345.p2841xd11c237d.smc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/paymars/smc/UDRKVCommReportFeatureService;", "Lea5/l;", "", "getProjectId", "", "addToPeriod", "", "taskId", "Lcom/tencent/wechat/aff/udr/x;", "resource", "Ljz5/f0;", "postProcessAsync", "<init>", "()V", "Companion", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.paymars.smc.UDRKVCommReportFeatureService */
/* loaded from: classes8.dex */
public final class C23038xfb732ccd extends ea5.l {
    private static final java.lang.String TAG = "UDRKVCommReportFeatureService";

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: addToPeriod */
    public boolean mo40417x561213dd() {
        return true;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6eea8388";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, final com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config postProcess: %s process:%s", resource.m117639xfb83cc9b(), bm5.f1.a());
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.paymars.smc.UDRKVCommReportFeatureService$postProcessAsync$1
            @Override // java.lang.Runnable
            public final void run() {
                ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84276x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84530xaf68cd3c(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x.this.m117639xfb83cc9b());
            }
        });
    }
}
