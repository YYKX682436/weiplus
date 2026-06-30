package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class cp extends com.tencent.mapsdk.internal.bm implements com.tencent.mapsdk.internal.cl, com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f49148b = "cuid";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f49149c = "duid";

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f49150d = "sessionid";

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.Stack<com.tencent.mapsdk.internal.ch> f49151g = new java.util.Stack<>();

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ch f49152e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f49153f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f49154h;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.mapsdk.internal.cm.a f49155a;

        public a(com.tencent.mapsdk.internal.cm.a aVar) {
            this.f49155a = aVar;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setAllow(boolean z17) {
            this.f49155a.a(z17);
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setUseHttps(boolean z17) {
            this.f49155a.c(z17);
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setUseTest(boolean z17) {
            this.f49155a.b(z17);
        }
    }

    public cp() {
    }

    private void b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mapsdk.internal.hr.a(str2)) {
            return;
        }
        this.f49153f.put(str, str2);
    }

    public static com.tencent.mapsdk.internal.cr f() {
        java.util.Stack<com.tencent.mapsdk.internal.ch> stack = f49151g;
        return stack.isEmpty() ? new com.tencent.mapsdk.internal.cs() : stack.peek().f49132b;
    }

    private static java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> g() {
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap = new java.util.HashMap<>();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
            hashMap2.put("apikey.map.qq.com", "apikey-cn.map.qq.com");
            hashMap2.put("s0.map.gtimg.com", "s0-cn.map.gtimg.com");
            hashMap2.put("s1.map.gtimg.com", "s1-cn.map.gtimg.com");
            hashMap2.put("s2.map.gtimg.com", "s2-cn.map.gtimg.com");
            hashMap2.put("s3.map.gtimg.com", "s3-cn.map.gtimg.com");
            hashMap2.put("overseactrl.map.qq.com", "overseactrl-cn.map.qq.com");
            hashMap2.put("sdkgw.map.qq.com", "sdkgw-cn.map.qq.com");
            hashMap2.put("pr.map.qq.com", "pr-cn.map.qq.com");
            hashMap2.put("datalayer.map.qq.com", "datalayer-cn.map.qq.com");
            hashMap2.put("vectorsdk.map.qq.com", "vectorsdk-cn.map.qq.com");
            hashMap2.put("tafrtt.map.qq.com", "tafrtt-cn.map.qq.com");
            hashMap2.put("p0.map.gtimg.com", "p0-cn.map.gtimg.com");
            hashMap2.put("p1.map.gtimg.com", "p1-cn.map.gtimg.com");
            hashMap2.put("p2.map.gtimg.com", "p2-cn.map.gtimg.com");
            hashMap2.put("p3.map.gtimg.com", "p3-cn.map.gtimg.com");
        }
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap2);
        return hashMap;
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> h() {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("apikey-cn.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk-cn.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk-cn.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0-cn.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("tafrtt-cn.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p0-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("apikey-cn.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("overseactrl-cn.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s0-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("confinfo-cn.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p0-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw-cn.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("sdkgw-cn.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr-cn.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("pr-cn.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("sdkgw.map.qq.com/sdk/log", "map_nf_pr");
        hashMap.put("sdkgw-cn.map.qq.com/sdk/log", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s0-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        hashMap.put("datalayer-cn.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        return hashMap;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(com.tencent.mapsdk.internal.bn bnVar, android.os.Bundle bundle) {
        super.a(bnVar, bundle);
        com.tencent.mapsdk.internal.hn.a(f().a());
    }

    @Override // com.tencent.mapsdk.internal.cl
    public final java.util.Map<java.lang.String, java.lang.String> a_() {
        if (!android.text.TextUtils.isEmpty(this.f49154h)) {
            b(f49148b, this.f49154h);
        }
        b(f49149c, com.tencent.mapsdk.internal.hn.e());
        b(f49150d, com.tencent.mapsdk.internal.hs.a());
        return this.f49153f;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void d(com.tencent.mapsdk.internal.bn bnVar) {
        com.tencent.mapsdk.internal.ch chVar;
        super.d(bnVar);
        java.util.Stack<com.tencent.mapsdk.internal.ch> stack = f49151g;
        if (stack.isEmpty() || (chVar = this.f49152e) == null) {
            return;
        }
        stack.remove(chVar);
        this.f49152e = null;
    }

    public final com.tencent.mapsdk.internal.ch e() {
        if (this.f49152e == null) {
            java.util.Stack<com.tencent.mapsdk.internal.ch> stack = f49151g;
            if (stack.isEmpty()) {
                this.f49152e = new com.tencent.mapsdk.internal.ci();
            } else {
                this.f49152e = stack.peek();
            }
        }
        return this.f49152e;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol
    public com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService getMapService(java.lang.String str) {
        com.tencent.mapsdk.internal.cn b17;
        com.tencent.mapsdk.internal.ch e17 = e();
        this.f49152e = e17;
        if (e17 == null || (b17 = e17.b(str)) == null) {
            return null;
        }
        return new com.tencent.mapsdk.internal.cp.a(b17);
    }

    private cp(com.tencent.mapsdk.internal.ch chVar) {
        this.f49152e = chVar;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(com.tencent.mapsdk.internal.bn bnVar) {
        com.tencent.mapsdk.internal.ch a17;
        super.a(bnVar);
        if (bnVar == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = bnVar.f48998a;
        if (tencentMapOptions != null) {
            this.f49154h = tencentMapOptions.getCustomUserId();
            java.lang.Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
            java.lang.String str = bnVar.F().f49009a;
            if (this.f49152e == null) {
                this.f49152e = new com.tencent.mapsdk.internal.ci();
            }
            if (protocolDataDesc != null) {
                int protocolFrom = tencentMapOptions.getProtocolFrom();
                if (protocolFrom == -1) {
                    a17 = a(bnVar, str, (java.lang.String) protocolDataDesc);
                } else if (protocolFrom != 1) {
                    a17 = protocolFrom != 3 ? null : a(str, (java.lang.String) protocolDataDesc);
                } else {
                    a17 = a(str, bnVar.getContext().getResources().openRawResource(((java.lang.Integer) protocolDataDesc).intValue()));
                }
                if (a17 != null) {
                    this.f49152e = a17;
                }
            }
            com.tencent.mapsdk.internal.ch chVar = this.f49152e;
            if (chVar != null) {
                chVar.f49131a = str;
            } else {
                this.f49152e = new com.tencent.mapsdk.internal.ci();
            }
            f49151g.push(this.f49152e);
            android.content.Context c17 = c();
            com.tencent.map.tools.net.NetConfig arguments = com.tencent.map.tools.net.NetConfig.create().setAdapterType(tencentMapOptions.getNetAdapterType()).setLogEnable(com.tencent.mapsdk.internal.tf.f51582d).setForceHttps(tencentMapOptions.isForceHttps()).setArguments(tencentMapOptions.getNetParams());
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
            hashMap.put("apikey-cn.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
            hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
            hashMap.put("vectorsdk-cn.map.qq.com/mvd_map", "map_nf_mvd");
            hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("vectorsdk-cn.map.qq.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("p0-cn.map.gtimg.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
            hashMap.put("vectorsdk-cn.map.qq.com/indoormap2", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
            hashMap.put("vectorsdk-cn.map.qq.com/indoormap2/index", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
            hashMap.put("vectorsdk-cn.map.qq.com/indoormapx", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
            hashMap.put("vectorsdk-cn.map.qq.com/indoormapx/index", "map_nf_indoor");
            hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
            hashMap.put("tafrtt-cn.map.qq.com/rttserverex/", "map_nf_trfc");
            hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p0-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p1-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p2-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p3-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
            hashMap.put("apikey-cn.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
            hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
            hashMap.put("overseactrl-cn.map.qq.com", "map_nf_wdVer");
            hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s0-cn.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s1-cn.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s2-cn.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s3-cn.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
            hashMap.put("confinfo-cn.map.qq.com/confinfo", "map_nf_hdVer");
            hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p0-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p1-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p2-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p3-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
            hashMap.put("sdkgw-cn.map.qq.com/map/traffic/event", "map_nf_pnt");
            hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
            hashMap.put("sdkgw-cn.map.qq.com/map/poi/detail", "map_nf_aoi");
            hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
            hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
            hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
            hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
            hashMap.put("pr-cn.map.qq.com/ditusdk/monitor", "map_nf_pr");
            hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
            hashMap.put("pr-cn.map.qq.com/pingd", "map_nf_pr");
            hashMap.put("sdkgw.map.qq.com/sdk/log", "map_nf_pr");
            hashMap.put("sdkgw-cn.map.qq.com/sdk/log", "map_nf_pr");
            hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s0-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s1-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s2-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s3-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
            hashMap.put("datalayer-cn.map.qq.com/console/datalayer/data", "map_nf_visLyr");
            com.tencent.map.tools.net.NetConfig netFlowRuleList = arguments.setNetFlowRuleList(hashMap);
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap2 = new java.util.HashMap<>();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
                hashMap3.put("apikey.map.qq.com", "apikey-cn.map.qq.com");
                hashMap3.put("s0.map.gtimg.com", "s0-cn.map.gtimg.com");
                hashMap3.put("s1.map.gtimg.com", "s1-cn.map.gtimg.com");
                hashMap3.put("s2.map.gtimg.com", "s2-cn.map.gtimg.com");
                hashMap3.put("s3.map.gtimg.com", "s3-cn.map.gtimg.com");
                hashMap3.put("overseactrl.map.qq.com", "overseactrl-cn.map.qq.com");
                hashMap3.put("sdkgw.map.qq.com", "sdkgw-cn.map.qq.com");
                hashMap3.put("pr.map.qq.com", "pr-cn.map.qq.com");
                hashMap3.put("datalayer.map.qq.com", "datalayer-cn.map.qq.com");
                hashMap3.put("vectorsdk.map.qq.com", "vectorsdk-cn.map.qq.com");
                hashMap3.put("tafrtt.map.qq.com", "tafrtt-cn.map.qq.com");
                hashMap3.put("p0.map.gtimg.com", "p0-cn.map.gtimg.com");
                hashMap3.put("p1.map.gtimg.com", "p1-cn.map.gtimg.com");
                hashMap3.put("p2.map.gtimg.com", "p2-cn.map.gtimg.com");
                hashMap3.put("p3.map.gtimg.com", "p3-cn.map.gtimg.com");
            }
            hashMap2.put(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap3);
            com.tencent.map.tools.net.NetManager.init(c17, netFlowRuleList.setRegionHostList(hashMap2).setProcessor(com.tencent.mapsdk.internal.gp.class).setProxyRuleList(f().b()));
        }
        com.tencent.mapsdk.internal.hn.a(f().a());
    }

    @Override // com.tencent.mapsdk.internal.cl
    public final java.util.List<java.lang.Class<? extends com.tencent.mapsdk.internal.p>> b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.sso.Header.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.sso.Package.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.sso.Tag.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp.class);
        arrayList.add(com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp.class);
        return arrayList;
    }

    private static void a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.map.tools.net.NetConfig arguments = com.tencent.map.tools.net.NetConfig.create().setAdapterType(tencentMapOptions.getNetAdapterType()).setLogEnable(com.tencent.mapsdk.internal.tf.f51582d).setForceHttps(tencentMapOptions.isForceHttps()).setArguments(tencentMapOptions.getNetParams());
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("apikey-cn.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk-cn.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk-cn.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0-cn.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("vectorsdk-cn.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("tafrtt-cn.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p0-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3-cn.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("apikey-cn.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("overseactrl-cn.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s0-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3-cn.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("confinfo-cn.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p0-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3-cn.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw-cn.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("sdkgw-cn.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr-cn.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("pr-cn.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("sdkgw.map.qq.com/sdk/log", "map_nf_pr");
        hashMap.put("sdkgw-cn.map.qq.com/sdk/log", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s0-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3-cn.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        hashMap.put("datalayer-cn.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        com.tencent.map.tools.net.NetConfig netFlowRuleList = arguments.setNetFlowRuleList(hashMap);
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap2 = new java.util.HashMap<>();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
            hashMap3.put("apikey.map.qq.com", "apikey-cn.map.qq.com");
            hashMap3.put("s0.map.gtimg.com", "s0-cn.map.gtimg.com");
            hashMap3.put("s1.map.gtimg.com", "s1-cn.map.gtimg.com");
            hashMap3.put("s2.map.gtimg.com", "s2-cn.map.gtimg.com");
            hashMap3.put("s3.map.gtimg.com", "s3-cn.map.gtimg.com");
            hashMap3.put("overseactrl.map.qq.com", "overseactrl-cn.map.qq.com");
            hashMap3.put("sdkgw.map.qq.com", "sdkgw-cn.map.qq.com");
            hashMap3.put("pr.map.qq.com", "pr-cn.map.qq.com");
            hashMap3.put("datalayer.map.qq.com", "datalayer-cn.map.qq.com");
            hashMap3.put("vectorsdk.map.qq.com", "vectorsdk-cn.map.qq.com");
            hashMap3.put("tafrtt.map.qq.com", "tafrtt-cn.map.qq.com");
            hashMap3.put("p0.map.gtimg.com", "p0-cn.map.gtimg.com");
            hashMap3.put("p1.map.gtimg.com", "p1-cn.map.gtimg.com");
            hashMap3.put("p2.map.gtimg.com", "p2-cn.map.gtimg.com");
            hashMap3.put("p3.map.gtimg.com", "p3-cn.map.gtimg.com");
        }
        hashMap2.put(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap3);
        com.tencent.map.tools.net.NetManager.init(context, netFlowRuleList.setRegionHostList(hashMap2).setProcessor(com.tencent.mapsdk.internal.gp.class).setProxyRuleList(f().b()));
    }

    private void a(com.tencent.mapsdk.internal.bn bnVar, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.ch a17;
        java.lang.Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
        java.lang.String str = bnVar.F().f49009a;
        if (this.f49152e == null) {
            this.f49152e = new com.tencent.mapsdk.internal.ci();
        }
        if (protocolDataDesc != null) {
            int protocolFrom = tencentMapOptions.getProtocolFrom();
            if (protocolFrom == -1) {
                a17 = a(bnVar, str, (java.lang.String) protocolDataDesc);
            } else if (protocolFrom != 1) {
                a17 = protocolFrom != 3 ? null : a(str, (java.lang.String) protocolDataDesc);
            } else {
                a17 = a(str, bnVar.getContext().getResources().openRawResource(((java.lang.Integer) protocolDataDesc).intValue()));
            }
            if (a17 != null) {
                this.f49152e = a17;
            }
        }
        com.tencent.mapsdk.internal.ch chVar = this.f49152e;
        if (chVar != null) {
            chVar.f49131a = str;
        } else {
            this.f49152e = new com.tencent.mapsdk.internal.ci();
        }
        f49151g.push(this.f49152e);
    }

    private com.tencent.mapsdk.internal.ch a(com.tencent.mapsdk.internal.bn bnVar, java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = bnVar.getContext().getResources().getAssets().open(str2);
        } catch (java.io.IOException unused) {
            inputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            com.tencent.mapsdk.internal.ch a17 = a(str, inputStream);
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
            return a17;
        } catch (java.io.IOException unused2) {
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream2);
            throw th;
        }
    }

    private com.tencent.mapsdk.internal.ch a(com.tencent.mapsdk.internal.bn bnVar, java.lang.String str, int i17) {
        return a(str, bnVar.getContext().getResources().openRawResource(i17));
    }

    private com.tencent.mapsdk.internal.ch a(java.lang.String str, java.io.InputStream inputStream) {
        if (inputStream != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                byte[] bArr = new byte[1024];
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (-1 != read) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } else {
                            com.tencent.mapsdk.internal.ch a17 = a(str, new java.lang.String(byteArrayOutputStream2.toByteArray(), java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
                            com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream2);
                            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                            return a17;
                        }
                    } catch (java.io.IOException unused) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
                        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                        return new com.tencent.mapsdk.internal.ci();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
                        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                        throw th;
                    }
                }
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return new com.tencent.mapsdk.internal.ci();
    }

    private com.tencent.mapsdk.internal.ch a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String optString = jSONObject.optString(com.tencent.mapsdk.internal.cj.f49140c, "-1");
            java.lang.String optString2 = jSONObject.optString(com.tencent.mapsdk.internal.cj.f49141d, "_unknown");
            if (!"-1".equals(optString) && optString2.equals(str)) {
                com.tencent.mapsdk.internal.co coVar = new com.tencent.mapsdk.internal.co();
                coVar.f49131a = str;
                coVar.a(this);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.mapsdk.internal.cm.a_);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        coVar.a(optJSONArray.getJSONObject(i17));
                    }
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.mapsdk.internal.ck.f49142e);
                if (optJSONObject != null) {
                    com.tencent.mapsdk.internal.cq cqVar = (com.tencent.mapsdk.internal.cq) com.tencent.map.tools.json.JsonUtils.parseToModel(optJSONObject, com.tencent.mapsdk.internal.cq.class, new java.lang.Object[0]);
                    com.tencent.mapsdk.internal.cs csVar = coVar.f49132b;
                    csVar.f49158a = cqVar.f49156a;
                    csVar.f49159b = cqVar.f49157b;
                }
                return coVar;
            }
        } catch (org.json.JSONException unused) {
        }
        return new com.tencent.mapsdk.internal.ci();
    }

    public static <S extends com.tencent.mapsdk.internal.cn> S a(java.lang.Class<S> cls) {
        java.util.Stack<com.tencent.mapsdk.internal.ch> stack = f49151g;
        if (stack.isEmpty()) {
            return (S) new com.tencent.mapsdk.internal.ci().c(cls);
        }
        return (S) stack.peek().c(cls);
    }

    @Override // com.tencent.mapsdk.internal.cl
    public final java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, com.tencent.mapsdk.internal.dk.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_INDOOR_DATA, com.tencent.mapsdk.internal.dm.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_MAP_DATA, com.tencent.mapsdk.internal.dp.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_MAP_STYLE, com.tencent.mapsdk.internal.dr.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_RTT_DATA, com.tencent.mapsdk.internal.du.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_SATELLITE_DATA, com.tencent.mapsdk.internal.dv.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_SKETCH_DATA, com.tencent.mapsdk.internal.dw.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_OVERSEA_DATA, com.tencent.mapsdk.internal.dt.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, com.tencent.mapsdk.internal.dx.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_TRAFFIC_EVENT, com.tencent.mapsdk.internal.dy.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_OFFLINE_MAP_DATA, com.tencent.mapsdk.internal.ds.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_MAP_POI_DATA, com.tencent.mapsdk.internal.dq.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_PROMOTE_IMAGE_DATA, com.tencent.mapsdk.internal.cf.class);
        hashMap.put(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_MAP_BEHAVIOUR, com.tencent.mapsdk.internal.Cdo.class);
        return hashMap;
    }
}
