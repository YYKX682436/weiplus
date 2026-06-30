package com.tencent.kinda.framework.app;

@j95.b
/* loaded from: classes12.dex */
public class SubCoreKinda extends i95.w {
    public static final java.lang.String TAG = "MicroMsg.SubCoreKinda";
    private com.tencent.kinda.framework.app.KindaCacheStg cacheStg;
    private com.tencent.kinda.framework.app.KindaConfigCacheStg configCacheStg;

    public static com.tencent.kinda.framework.app.SubCoreKinda getCore() {
        return (com.tencent.kinda.framework.app.SubCoreKinda) i95.n0.c(com.tencent.kinda.framework.app.SubCoreKinda.class);
    }

    public com.tencent.kinda.framework.app.KindaCacheStg getCacheStg() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (getCore().cacheStg == null) {
            getCore().cacheStg = new com.tencent.kinda.framework.app.KindaCacheStg(gm0.j1.u().f273153f);
        }
        return getCore().cacheStg;
    }

    public com.tencent.kinda.framework.app.KindaConfigCacheStg getConfigCacheStg() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (getCore().configCacheStg == null) {
            getCore().configCacheStg = new com.tencent.kinda.framework.app.KindaConfigCacheStg(gm0.j1.u().f273153f);
        }
        return getCore().configCacheStg;
    }
}
