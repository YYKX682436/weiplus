package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class ya extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f85442d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.launching.xa.f85418s, "PluginDevLaunchInfo")};

    public ya(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.launching.xa.f85418s, "PluginDevLaunchInfo", dm.j9.f237866h);
    }

    public boolean D0(java.lang.String str, java.lang.String str2, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.xa xaVar = new com.tencent.mm.plugin.appbrand.launching.xa();
        xaVar.field_appId = str;
        xaVar.field_versionDesc = str2;
        xaVar.field_devKey = j17;
        if (!super.get(xaVar, com.tencent.mm.plugin.appbrand.launching.xa.f85417r)) {
            boolean insert = super.insert(xaVar);
            com.tencent.mars.xlog.Log.i("PluginDevLaunchInfoStorage", "setPluginInfo insert appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(insert));
            return insert;
        }
        xaVar.field_devKey = j17;
        boolean update = super.update(xaVar, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("PluginDevLaunchInfoStorage", "setPluginInfo update appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.xa xaVar = new com.tencent.mm.plugin.appbrand.launching.xa();
        xaVar.field_appId = str;
        xaVar.field_versionDesc = str2;
        return super.delete(xaVar, com.tencent.mm.plugin.appbrand.launching.xa.f85417r);
    }

    public long z0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("PluginDevLaunchInfoStorage", "getDevKey appId null");
            return 0L;
        }
        com.tencent.mm.plugin.appbrand.launching.xa xaVar = new com.tencent.mm.plugin.appbrand.launching.xa();
        xaVar.field_appId = str;
        xaVar.field_versionDesc = str2;
        if (super.get(xaVar, com.tencent.mm.plugin.appbrand.launching.xa.f85417r)) {
            com.tencent.mars.xlog.Log.i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s success devKey:%d", str, str2, java.lang.Long.valueOf(xaVar.field_devKey));
            return xaVar.field_devKey;
        }
        com.tencent.mars.xlog.Log.i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s fail", str, str2);
        return 0L;
    }
}
