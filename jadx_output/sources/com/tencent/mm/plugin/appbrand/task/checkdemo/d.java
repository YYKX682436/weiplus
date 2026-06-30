package com.tencent.mm.plugin.appbrand.task.checkdemo;

/* loaded from: classes4.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f89001d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.task.checkdemo.c.f89000r, "WxaCheckDemoInfo")};

    public d(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.task.checkdemo.c.f89000r, "WxaCheckDemoInfo", dm.wc.f240923h);
    }

    public void y0() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "deleteAll");
            super.execSQL("WxaCheckDemoInfo", "delete from WxaCheckDemoInfo");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", e17, " deleteAll Exception", new java.lang.Object[0]);
        }
    }

    public boolean z0(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData,invalid input %s", str);
            return false;
        }
        com.tencent.mm.plugin.appbrand.task.checkdemo.c cVar = new com.tencent.mm.plugin.appbrand.task.checkdemo.c();
        cVar.field_appId = str;
        boolean z18 = get(cVar, new java.lang.String[0]);
        cVar.field_permissionDemo = z17;
        cVar.field_versiontime = com.tencent.mm.sdk.platformtools.t8.i1();
        if (!(z18 ? update(cVar, new java.lang.String[0]) : insert(cVar))) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData appId:%s ok", str);
        return true;
    }
}
