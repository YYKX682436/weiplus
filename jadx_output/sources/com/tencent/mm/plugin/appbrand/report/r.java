package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f88393d;

    public r(java.util.LinkedList linkedList) {
        this.f88393d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "reportToSvr, cgi back, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.appbrand.report.t.f88404d = ((r45.oc7) oVar.f70711b.f70700a).f382153d;
            com.tencent.mm.plugin.appbrand.report.t.a(com.tencent.mm.plugin.appbrand.report.t.f88404d);
            return 0;
        }
        java.util.Iterator it = this.f88393d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.report.t.c((r45.uc7) it.next());
        }
        return 0;
    }
}
