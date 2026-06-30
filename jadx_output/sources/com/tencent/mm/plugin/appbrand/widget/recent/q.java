package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView f92036a;

    public q(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView) {
        this.f92036a = appBrandCommonUsedTaskView;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer errType:%d, errCode:%d, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            synchronized (this.f92036a.f91871u) {
                appBrandCommonUsedTaskView = this.f92036a;
                appBrandCommonUsedTaskView.f91869s = false;
            }
            appBrandCommonUsedTaskView.post(new com.tencent.mm.plugin.appbrand.widget.recent.p(this));
            return;
        }
        if (fVar instanceof r45.rs3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "get common used app request success");
            r45.rs3 rs3Var = (r45.rs3) oVar.f70711b.f70700a;
            com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.b(this.f92036a, rs3Var, true);
            r45.rs3 rs3Var2 = com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedCache", "setResponse");
            synchronized (com.tencent.mm.plugin.appbrand.widget.recent.k.f91995b) {
                com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a = rs3Var;
            }
            if (rs3Var != null) {
                try {
                    com.tencent.mm.sdk.platformtools.o4.M("appbrand_multi_task_mmkv_name").D("appbrand_multi_task_common_used_resp_key", new java.lang.String(n56.a.b(rs3Var.toByteArray(), false)));
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedCache", "setResponse, encode error");
                }
            }
            synchronized (this.f92036a.f91871u) {
                this.f92036a.f91869s = false;
            }
        }
    }
}
