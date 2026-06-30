package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qh {

    /* renamed from: d, reason: collision with root package name */
    private static final int f50930d = 256;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f50931e = "custom-layer";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f50932f = "layer-infos";

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.re f50933a;

    /* renamed from: c, reason: collision with root package name */
    public int f50935c;

    /* renamed from: g, reason: collision with root package name */
    private android.content.Context f50936g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.SharedPreferences f50937h;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.qi> f50934b = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private java.util.Set<com.tencent.mapsdk.internal.qh.a> f50938i = new java.util.HashSet();

    /* renamed from: com.tencent.mapsdk.internal.qh$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qi f50939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mapsdk.internal.qi qiVar) {
            super(256, 256);
            this.f50939a = qiVar;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
        public final java.net.URL getTileUrl(int i17, int i18, int i19) {
            com.tencent.mapsdk.internal.qi qiVar = this.f50939a;
            if (i19 <= qiVar.f50948c && i19 >= qiVar.f50949d) {
                try {
                    return new java.net.URL(this.f50939a.a(i17, i18, i19));
                } catch (java.net.MalformedURLException unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes13.dex */
    public class a implements com.tencent.map.tools.json.JsonEncoder, com.tencent.map.tools.json.JsonParser {

        /* renamed from: b, reason: collision with root package name */
        private static final java.lang.String f50941b = "id";

        /* renamed from: c, reason: collision with root package name */
        private static final java.lang.String f50942c = "version";

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f50944d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f50945e;

        private a() {
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mapsdk.internal.qh.a)) {
                return false;
            }
            com.tencent.mapsdk.internal.qh.a aVar = (com.tencent.mapsdk.internal.qh.a) obj;
            java.lang.String str = this.f50944d;
            if (str == null ? aVar.f50944d != null : !str.equals(aVar.f50944d)) {
                return false;
            }
            java.lang.String str2 = this.f50945e;
            java.lang.String str3 = aVar.f50945e;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }

        public int hashCode() {
            java.lang.String str = this.f50944d;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            java.lang.String str2 = this.f50945e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.tencent.map.tools.json.JsonParser
        public void parse(org.json.JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f50944d = jSONObject.optString("id");
                this.f50945e = jSONObject.optString(f50942c);
            }
        }

        @Override // com.tencent.map.tools.json.JsonEncoder
        public org.json.JSONObject toJson() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("id", this.f50944d);
                jSONObject.put(f50942c, this.f50945e);
            } catch (org.json.JSONException unused) {
            }
            return jSONObject;
        }

        public /* synthetic */ a(com.tencent.mapsdk.internal.qh qhVar, byte b17) {
            this();
        }
    }

    public qh(android.content.Context context, com.tencent.mapsdk.internal.re reVar, com.tencent.mapsdk.internal.bn.b bVar) {
        this.f50936g = context;
        this.f50933a = reVar;
        this.f50935c = reVar.f51155h.K;
        this.f50937h = com.tencent.mapsdk.internal.ku.a(context, "custom-layer." + bVar.c());
        b();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.CustomLayer a(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        int i17;
        if (this.f50933a == null) {
            return null;
        }
        customLayerOptions.getLayerId();
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50200a, this.f50935c);
        com.tencent.mapsdk.internal.re reVar = this.f50933a;
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
        java.lang.String str = "custom_layer_" + com.tencent.mapsdk.internal.li.a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        tileOverlayOptions.reuseTile(true);
        tileOverlayOptions.levelOffset(0);
        com.tencent.mapsdk.internal.qi a17 = a(customLayerOptions.getLayerId());
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "cache_dir", (java.lang.Object) str, this.f50935c);
        if (a17 != null) {
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "version", (java.lang.Object) a17.f50947b, this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "minZoom", java.lang.Integer.valueOf(a17.f50949d), this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "maxZoom", java.lang.Integer.valueOf(a17.f50948c), this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "layerId", (java.lang.Object) a17.f50946a, this.f50935c);
            tileOverlayOptions.tileProvider(new com.tencent.mapsdk.internal.qh.AnonymousClass1(a17));
            tileOverlayOptions.versionInfo(a17.f50947b);
        }
        com.tencent.mapsdk.internal.qz a18 = reVar.a(tileOverlayOptions);
        com.tencent.mapsdk.internal.qi a19 = a(customLayerOptions.getLayerId());
        if (a18 == null || a19 == null) {
            return null;
        }
        if (a19.f50950e) {
            a18.a(true);
            a19.f50950e = false;
        }
        int i18 = a19.f50949d;
        int i19 = a19.f50948c;
        com.tencent.mapsdk.internal.re reVar2 = a18.f51133q;
        if (reVar2 != null && (i17 = a18.f51132p) >= 0) {
            reVar2.a(i17, i18, i19);
        }
        a18.a(a19.f50949d, a19.f50948c);
        com.tencent.mapsdk.internal.hg hgVar = this.f50933a.f51155h.f49000c;
        if (hgVar != null) {
            hgVar.c().f49768a++;
        }
        com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50200a, this.f50935c);
        return new com.tencent.mapsdk.internal.at(a18);
    }

    private void b() {
        android.content.SharedPreferences sharedPreferences = this.f50937h;
        if (sharedPreferences != null) {
            java.lang.String string = sharedPreferences.getString(f50932f, null);
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    try {
                        this.f50938i.add((com.tencent.mapsdk.internal.qh.a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONArray.getJSONObject(i17), com.tencent.mapsdk.internal.qh.a.class, this));
                    } catch (org.json.JSONException unused) {
                    }
                }
            } catch (org.json.JSONException unused2) {
            }
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions b(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
        java.lang.String str = "custom_layer_" + com.tencent.mapsdk.internal.li.a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        tileOverlayOptions.reuseTile(true);
        tileOverlayOptions.levelOffset(0);
        com.tencent.mapsdk.internal.qi a17 = a(customLayerOptions.getLayerId());
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "cache_dir", (java.lang.Object) str, this.f50935c);
        if (a17 != null) {
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "version", (java.lang.Object) a17.f50947b, this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "minZoom", java.lang.Integer.valueOf(a17.f50949d), this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "maxZoom", java.lang.Integer.valueOf(a17.f50948c), this.f50935c);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "layerId", (java.lang.Object) a17.f50946a, this.f50935c);
            tileOverlayOptions.tileProvider(new com.tencent.mapsdk.internal.qh.AnonymousClass1(a17));
            tileOverlayOptions.versionInfo(a17.f50947b);
        }
        return tileOverlayOptions;
    }

    public final com.tencent.mapsdk.internal.qi a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.tencent.mapsdk.internal.qi qiVar : this.f50934b) {
            if (qiVar != null && str.equals(qiVar.f50946a)) {
                return qiVar;
            }
        }
        return null;
    }

    public final void a() {
        boolean z17;
        boolean z18;
        byte b17 = 0;
        if (this.f50938i.isEmpty() && !this.f50934b.isEmpty()) {
            z17 = false;
            for (com.tencent.mapsdk.internal.qi qiVar : this.f50934b) {
                com.tencent.mapsdk.internal.qh.a aVar = new com.tencent.mapsdk.internal.qh.a(this, b17);
                aVar.f50944d = qiVar.f50946a;
                aVar.f50945e = qiVar.f50947b;
                this.f50938i.add(aVar);
                z17 = true;
            }
        } else {
            z17 = false;
            for (com.tencent.mapsdk.internal.qi qiVar2 : this.f50934b) {
                java.util.Iterator<com.tencent.mapsdk.internal.qh.a> it = this.f50938i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z18 = false;
                        break;
                    }
                    com.tencent.mapsdk.internal.qh.a next = it.next();
                    if (next.f50944d.equals(qiVar2.f50946a)) {
                        if (!next.f50945e.equalsIgnoreCase(qiVar2.f50947b)) {
                            qiVar2.f50950e = true;
                            next.f50945e = qiVar2.f50947b;
                        }
                        z18 = true;
                    }
                }
                if (!z18) {
                    com.tencent.mapsdk.internal.qh.a aVar2 = new com.tencent.mapsdk.internal.qh.a(this, b17);
                    aVar2.f50944d = qiVar2.f50946a;
                    aVar2.f50945e = qiVar2.f50947b;
                    this.f50938i.add(aVar2);
                    z17 = true;
                }
            }
        }
        if (z17) {
            com.tencent.mapsdk.internal.ku.a(this.f50937h).a(f50932f, com.tencent.map.tools.json.JsonUtils.collectionToJson(this.f50938i));
        }
    }

    private void a(com.tencent.mapsdk.internal.qg qgVar) {
        if (qgVar == null || !qgVar.f50928a) {
            return;
        }
        this.f50934b.clear();
        this.f50934b.addAll(qgVar.f50929b);
        a();
    }
}
