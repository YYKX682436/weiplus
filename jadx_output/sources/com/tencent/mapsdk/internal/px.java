package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class px extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public com.tencent.mapsdk.internal.px.d f50810a;

    /* loaded from: classes13.dex */
    public static final class a extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "aoi_latitude")
        java.lang.String f50811a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "aoi_longitude")
        java.lang.String f50812b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "area")
        com.tencent.mapsdk.internal.px.b f50813c;

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiArea{latitude=");
            stringBuffer.append(this.f50811a);
            stringBuffer.append(", longitude=");
            stringBuffer.append(this.f50812b);
            stringBuffer.append(", area=");
            stringBuffer.append(this.f50813c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static final class b extends com.tencent.map.tools.json.JsonComposer implements com.tencent.map.tools.json.JsonParser.Deserializer<java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>>> {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "type")
        java.lang.String f50814a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.mapsdk.internal.px.b.class, name = "coordinates")
        java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> f50815b;

        private static java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> a(java.lang.Object obj) {
            java.util.ArrayList arrayList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                arrayList = new java.util.ArrayList();
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.Object obj2 = jSONArray.get(i17);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (obj2 instanceof org.json.JSONArray) {
                        org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj2;
                        int length2 = jSONArray2.length();
                        for (int i18 = 0; i18 < length2; i18++) {
                            java.lang.Object obj3 = jSONArray2.get(i18);
                            if (obj3 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray3 = (org.json.JSONArray) obj3;
                                if (jSONArray3.length() == 2) {
                                    arrayList2.add(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                                }
                            }
                        }
                        if (arrayList2.size() != length2) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.d("coordinates's data deserialize error!!");
                        }
                    }
                    arrayList.add(arrayList2);
                }
                if (arrayList.size() != length) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d("coordinates's area deserialize error!!");
                }
            }
            return arrayList;
        }

        @Override // com.tencent.map.tools.json.JsonParser.Deserializer
        public final /* synthetic */ java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> deserialize(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
            if (obj2 == null || !(obj2 instanceof org.json.JSONArray)) {
                return null;
            }
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.Object obj3 = jSONArray.get(i17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (obj3 instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj3;
                    int length2 = jSONArray2.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        java.lang.Object obj4 = jSONArray2.get(i18);
                        if (obj4 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray3 = (org.json.JSONArray) obj4;
                            if (jSONArray3.length() == 2) {
                                arrayList2.add(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                            }
                        }
                    }
                    if (arrayList2.size() != length2) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.d("coordinates's data deserialize error!!");
                    }
                }
                arrayList.add(arrayList2);
            }
            if (arrayList.size() != length) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d("coordinates's area deserialize error!!");
            }
            return arrayList;
        }

        public final java.lang.String toString() {
            int[] iArr;
            java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list = this.f50815b;
            int i17 = 0;
            if (list != null) {
                int size = list.size();
                iArr = new int[size];
                while (i17 < size) {
                    iArr[i17] = this.f50815b.get(i17).size();
                    i17++;
                }
                i17 = size;
            } else {
                iArr = null;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AreaData{type='");
            stringBuffer.append(this.f50814a);
            stringBuffer.append("', coordinates=");
            stringBuffer.append(i17);
            stringBuffer.append("#");
            stringBuffer.append(java.util.Arrays.toString(iArr));
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class c extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "fill_color")
        java.lang.String f50816a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "stroke_color")
        java.lang.String f50817b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "stroke_width")
        int f50818c;

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AoiStyle{fillColor='");
            stringBuffer.append(this.f50816a);
            stringBuffer.append("', strokeColor='");
            stringBuffer.append(this.f50817b);
            stringBuffer.append("', strokeWidth=");
            stringBuffer.append(this.f50818c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class d extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(ignore = true)
        public int f50819a = -1;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "uid")
        java.lang.String f50820b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        java.lang.String f50821c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "alias")
        java.lang.String f50822d;

        /* renamed from: e, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "type")
        java.lang.String f50823e;

        /* renamed from: f, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "styles")
        java.util.List<com.tencent.mapsdk.internal.px.e> f50824f;

        /* renamed from: g, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "shinei_id")
        java.lang.String f50825g;

        /* renamed from: h, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer.class, name = ya.b.LOCATION)
        com.tencent.tencentmap.mapsdk.maps.model.LatLng f50826h;

        /* renamed from: i, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "aoi_info")
        com.tencent.mapsdk.internal.px.a f50827i;

        /* renamed from: j, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "sub_pois")
        public java.util.List<com.tencent.mapsdk.internal.px.d> f50828j;

        public final java.lang.String a() {
            return !android.text.TextUtils.isEmpty(this.f50822d) ? this.f50822d : this.f50821c;
        }

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiDetail{displayId=");
            stringBuffer.append(this.f50819a);
            stringBuffer.append(", poiId='");
            stringBuffer.append(this.f50820b);
            stringBuffer.append("', name='");
            stringBuffer.append(this.f50821c);
            stringBuffer.append("', alias='");
            stringBuffer.append(this.f50822d);
            stringBuffer.append("', type='");
            stringBuffer.append(this.f50823e);
            stringBuffer.append("', poiStyles=");
            stringBuffer.append(this.f50824f);
            stringBuffer.append(", indoorId='");
            stringBuffer.append(this.f50825g);
            stringBuffer.append("', point=");
            stringBuffer.append(this.f50826h);
            stringBuffer.append(", poiArea=");
            stringBuffer.append(this.f50827i);
            stringBuffer.append(", subPois=");
            stringBuffer.append(this.f50828j);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class e extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(ignore = true)
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f50829a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(ignore = true)
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f50830b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "style_class")
        int f50831c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "icon_url")
        java.lang.String f50832d;

        /* renamed from: e, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "icon_type")
        int f50833e;

        /* renamed from: f, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "font_color")
        java.lang.String f50834f;

        /* renamed from: g, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "font_size")
        int f50835g;

        /* renamed from: h, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "font_stroke_color")
        java.lang.String f50836h;

        /* renamed from: i, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "font_stroke_width")
        int f50837i;

        /* renamed from: j, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = ya.b.LEVEL)
        int f50838j;

        /* renamed from: k, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "zindex")
        int f50839k;

        /* renamed from: l, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "aoi")
        com.tencent.mapsdk.internal.px.c f50840l;

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiStyle{icon=");
            stringBuffer.append(this.f50829a);
            stringBuffer.append(", type=");
            stringBuffer.append(this.f50831c);
            stringBuffer.append(", iconUrl='");
            stringBuffer.append(this.f50832d);
            stringBuffer.append("', iconDisplayType=");
            stringBuffer.append(this.f50833e);
            stringBuffer.append(", fontColor='");
            stringBuffer.append(this.f50834f);
            stringBuffer.append("', fontSize=");
            stringBuffer.append(this.f50835g);
            stringBuffer.append(", fontStrokeColor='");
            stringBuffer.append(this.f50836h);
            stringBuffer.append("', fontStrokeWidth=");
            stringBuffer.append(this.f50837i);
            stringBuffer.append(", level=");
            stringBuffer.append(this.f50838j);
            stringBuffer.append(", zindex=");
            stringBuffer.append(this.f50839k);
            stringBuffer.append(", aoiStyle=");
            stringBuffer.append(this.f50840l);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AoiInfo{poiDetail=");
        stringBuffer.append(this.f50810a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
