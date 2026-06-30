package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class cp extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f130681b = "cuid";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f130682c = "duid";

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f130683d = "sessionid";

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.Stack<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch> f130684g = new java.util.Stack<>();

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch f130685e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f130686f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f130687h;

    /* loaded from: classes13.dex */
    public static class a implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.IMapService {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.mapsdk.internal.cm.a f130688a;

        public a(com.tencent.mapsdk.internal.cm.a aVar) {
            this.f130688a = aVar;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.IMapService
        /* renamed from: setAllow */
        public final void mo36675x52b56407(boolean z17) {
            this.f130688a.a(z17);
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.IMapService
        /* renamed from: setUseHttps */
        public final void mo36676x646f4e26(boolean z17) {
            this.f130688a.c(z17);
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.IMapService
        /* renamed from: setUseTest */
        public final void mo36677xa86bebf7(boolean z17) {
            this.f130688a.b(z17);
        }
    }

    public cp() {
    }

    private void b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str2)) {
            return;
        }
        this.f130686f.put(str, str2);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cr f() {
        java.util.Stack<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch> stack = f130684g;
        return stack.isEmpty() ? new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs() : stack.peek().f130665b;
    }

    private static java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> g() {
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap = new java.util.HashMap<>();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
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
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap2);
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, android.os.Bundle bundle) {
        super.a(bnVar, bundle);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(f().a());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cl
    public final java.util.Map<java.lang.String, java.lang.String> a_() {
        if (!android.text.TextUtils.isEmpty(this.f130687h)) {
            b(f130681b, this.f130687h);
        }
        b(f130682c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.e());
        b(f130683d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a());
        return this.f130686f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch chVar;
        super.d(bnVar);
        java.util.Stack<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch> stack = f130684g;
        if (stack.isEmpty() || (chVar = this.f130685e) == null) {
            return;
        }
        stack.remove(chVar);
        this.f130685e = null;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch e() {
        if (this.f130685e == null) {
            java.util.Stack<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch> stack = f130684g;
            if (stack.isEmpty()) {
                this.f130685e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
            } else {
                this.f130685e = stack.peek();
            }
        }
        return this.f130685e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76
    /* renamed from: getMapService */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.IMapService mo36674x6b73f1af(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn b17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch e17 = e();
        this.f130685e = e17;
        if (e17 == null || (b17 = e17.b(str)) == null) {
            return null;
        }
        return new com.tencent.mapsdk.internal.cp.a(b17);
    }

    private cp(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch chVar) {
        this.f130685e = chVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a17;
        super.a(bnVar);
        if (bnVar == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7 = bnVar.f130531a;
        if (c25966x7e4576a7 != null) {
            this.f130687h = c25966x7e4576a7.m99195x7b651f8d();
            java.lang.Object m99213x2f8cbf89 = c25966x7e4576a7.m99213x2f8cbf89();
            java.lang.String str = bnVar.F().f130542a;
            if (this.f130685e == null) {
                this.f130685e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
            }
            if (m99213x2f8cbf89 != null) {
                int m99214x6a85a0d8 = c25966x7e4576a7.m99214x6a85a0d8();
                if (m99214x6a85a0d8 == -1) {
                    a17 = a(bnVar, str, (java.lang.String) m99213x2f8cbf89);
                } else if (m99214x6a85a0d8 != 1) {
                    a17 = m99214x6a85a0d8 != 3 ? null : a(str, (java.lang.String) m99213x2f8cbf89);
                } else {
                    a17 = a(str, bnVar.mo36630x76847179().getResources().openRawResource(((java.lang.Integer) m99213x2f8cbf89).intValue()));
                }
                if (a17 != null) {
                    this.f130685e = a17;
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch chVar = this.f130685e;
            if (chVar != null) {
                chVar.f130664a = str;
            } else {
                this.f130685e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
            }
            f130684g.push(this.f130685e);
            android.content.Context c17 = c();
            com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f m35917xe26dab14 = com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f.m35906xaf65a0fc().m35916x93202167(c25966x7e4576a7.m99208x1862fe42()).m35919xb7de63a5(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d).m35918x2329aec2(c25966x7e4576a7.m99223x882fa58a()).m35917xe26dab14(c25966x7e4576a7.m99209x370e96cd());
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
            com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f m35920xdb6e1a83 = m35917xe26dab14.m35920xdb6e1a83(hashMap);
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap2 = new java.util.HashMap<>();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
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
            hashMap2.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap3);
            com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35930x316510(c17, m35920xdb6e1a83.m35923x2276927c(hashMap2).m35921x1a807e50(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gp.class).m35922x6debe106(f().b()));
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(f().a());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cl
    public final java.util.List<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p>> b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4376xef917861.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4372x8099cead.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4373x331dcc26.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4365x53be5a69.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a.class);
        arrayList.add(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4368xd398663a.class);
        return arrayList;
    }

    private static void a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f m35917xe26dab14 = com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f.m35906xaf65a0fc().m35916x93202167(c25966x7e4576a7.m99208x1862fe42()).m35919xb7de63a5(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133115d).m35918x2329aec2(c25966x7e4576a7.m99223x882fa58a()).m35917xe26dab14(c25966x7e4576a7.m99209x370e96cd());
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
        com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f m35920xdb6e1a83 = m35917xe26dab14.m35920xdb6e1a83(hashMap);
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap2 = new java.util.HashMap<>();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
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
        hashMap2.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.INLAND_WITHOUT_SAR_OF_CHINA.name(), hashMap3);
        com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35930x316510(context, m35920xdb6e1a83.m35923x2276927c(hashMap2).m35921x1a807e50(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gp.class).m35922x6debe106(f().b()));
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a17;
        java.lang.Object m99213x2f8cbf89 = c25966x7e4576a7.m99213x2f8cbf89();
        java.lang.String str = bnVar.F().f130542a;
        if (this.f130685e == null) {
            this.f130685e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
        }
        if (m99213x2f8cbf89 != null) {
            int m99214x6a85a0d8 = c25966x7e4576a7.m99214x6a85a0d8();
            if (m99214x6a85a0d8 == -1) {
                a17 = a(bnVar, str, (java.lang.String) m99213x2f8cbf89);
            } else if (m99214x6a85a0d8 != 1) {
                a17 = m99214x6a85a0d8 != 3 ? null : a(str, (java.lang.String) m99213x2f8cbf89);
            } else {
                a17 = a(str, bnVar.mo36630x76847179().getResources().openRawResource(((java.lang.Integer) m99213x2f8cbf89).intValue()));
            }
            if (a17 != null) {
                this.f130685e = a17;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch chVar = this.f130685e;
        if (chVar != null) {
            chVar.f130664a = str;
        } else {
            this.f130685e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
        }
        f130684g.push(this.f130685e);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = bnVar.mo36630x76847179().getResources().getAssets().open(str2);
        } catch (java.io.IOException unused) {
            inputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a17 = a(str, inputStream);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
            return a17;
        } catch (java.io.IOException unused2) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream2);
            throw th;
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, java.lang.String str, int i17) {
        return a(str, bnVar.mo36630x76847179().getResources().openRawResource(i17));
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a(java.lang.String str, java.io.InputStream inputStream) {
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
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a17 = a(str, new java.lang.String(byteArrayOutputStream2.toByteArray(), java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream2);
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                            return a17;
                        }
                    } catch (java.io.IOException unused) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                        throw th;
                    }
                }
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cj.f130673c, "-1");
            java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cj.f130674d, "_unknown");
            if (!"-1".equals(optString) && optString2.equals(str)) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.co coVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.co();
                coVar.f130664a = str;
                coVar.a(this);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        coVar.a(optJSONArray.getJSONObject(i17));
                    }
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ck.f130675e);
                if (optJSONObject != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq cqVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(optJSONObject, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cq.class, new java.lang.Object[0]);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs csVar = coVar.f130665b;
                    csVar.f130691a = cqVar.f130689a;
                    csVar.f130692b = cqVar.f130690b;
                }
                return coVar;
            }
        } catch (org.json.JSONException unused) {
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci();
    }

    public static <S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> S a(java.lang.Class<S> cls) {
        java.util.Stack<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch> stack = f130684g;
        if (stack.isEmpty()) {
            return (S) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ci().c(cls);
        }
        return (S) stack.peek().c(cls);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cl
    public final java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49301xf1b4e78f, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49303xa8e156cc, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49305x1e9c3d7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49307x3c2acf04, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dr.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49311xfd396c81, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.du.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49312x392537d8, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dv.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49313xacc31113, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49309xb7cf9898, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dt.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49314x3eab8366, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49315x86d6e0ce, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dy.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49308xadd3fcd3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49306x5f4cb24c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dq.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49310x592e14b7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cf.class);
        hashMap.put(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76.f49304xf8a96090, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.Cdo.class);
        return hashMap;
    }
}
