package com.tencent.mm.plugin.appbrand.task.checkdemo;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f88998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f88999e;

    public a(com.tencent.mm.plugin.appbrand.task.checkdemo.b bVar, com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        this.f88998d = rVar;
        this.f88999e = iPCString;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bc7 bc7Var;
        if (m1Var.getType() != 1124) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error mismatch ");
            return 0;
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f88998d;
        if (i17 == 0 && i18 == 0) {
            r45.i00 i00Var = (r45.i00) oVar.f70711b.f70700a;
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = this.f88999e;
            if (i00Var == null || (bc7Var = i00Var.f376603d) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error nil resp");
                com.tencent.mm.plugin.appbrand.app.r9.Ai().z0(iPCString.f68406d, false);
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            } else {
                int i19 = bc7Var.f370669d;
                if (i19 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error,ErrCode %d", java.lang.Integer.valueOf(i19));
                    com.tencent.mm.plugin.appbrand.app.r9.Ai().z0(iPCString.f68406d, false);
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback success");
                    com.tencent.mm.plugin.appbrand.app.r9.Ai().z0(iPCString.f68406d, true);
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        }
        return 0;
    }
}
