package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class px extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "detail")
    public com.tencent.mapsdk.internal.px.d f132343a;

    /* loaded from: classes13.dex */
    public static final class a extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "aoi_latitude")
        java.lang.String f132344a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "aoi_longitude")
        java.lang.String f132345b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "area")
        com.tencent.mapsdk.internal.px.b f132346c;

        /* renamed from: toString */
        public final java.lang.String m36915x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiArea{latitude=");
            stringBuffer.append(this.f132344a);
            stringBuffer.append(", longitude=");
            stringBuffer.append(this.f132345b);
            stringBuffer.append(", area=");
            stringBuffer.append(this.f132346c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static final class b extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer<java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>>> {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "type")
        java.lang.String f132347a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35883x9bfa94d3 = com.tencent.mapsdk.internal.px.b.class, m35885x337a8b = "coordinates")
        java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> f132348b;

        private static java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> a(java.lang.Object obj) {
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
                                    arrayList2.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                                }
                            }
                        }
                        if (arrayList2.size() != length2) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("coordinates's data deserialize error!!");
                        }
                    }
                    arrayList.add(arrayList2);
                }
                if (arrayList.size() != length) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("coordinates's area deserialize error!!");
                }
            }
            return arrayList;
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer
        /* renamed from: deserialize */
        public final /* synthetic */ java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> mo35869x6820db7f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
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
                                arrayList2.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                            }
                        }
                    }
                    if (arrayList2.size() != length2) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("coordinates's data deserialize error!!");
                    }
                }
                arrayList.add(arrayList2);
            }
            if (arrayList.size() != length) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("coordinates's area deserialize error!!");
            }
            return arrayList;
        }

        /* renamed from: toString */
        public final java.lang.String m36916x9616526c() {
            int[] iArr;
            java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list = this.f132348b;
            int i17 = 0;
            if (list != null) {
                int size = list.size();
                iArr = new int[size];
                while (i17 < size) {
                    iArr[i17] = this.f132348b.get(i17).size();
                    i17++;
                }
                i17 = size;
            } else {
                iArr = null;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AreaData{type='");
            stringBuffer.append(this.f132347a);
            stringBuffer.append("', coordinates=");
            stringBuffer.append(i17);
            stringBuffer.append("#");
            stringBuffer.append(java.util.Arrays.toString(iArr));
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class c extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "fill_color")
        java.lang.String f132349a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "stroke_color")
        java.lang.String f132350b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "stroke_width")
        int f132351c;

        /* renamed from: toString */
        public final java.lang.String m36917x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AoiStyle{fillColor='");
            stringBuffer.append(this.f132349a);
            stringBuffer.append("', strokeColor='");
            stringBuffer.append(this.f132350b);
            stringBuffer.append("', strokeWidth=");
            stringBuffer.append(this.f132351c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class d extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
        public int f132352a = -1;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "uid")
        java.lang.String f132353b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)
        java.lang.String f132354c;

        /* renamed from: d, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "alias")
        java.lang.String f132355d;

        /* renamed from: e, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "type")
        java.lang.String f132356e;

        /* renamed from: f, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "styles")
        java.util.List<com.tencent.mapsdk.internal.px.e> f132357f;

        /* renamed from: g, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "shinei_id")
        java.lang.String f132358g;

        /* renamed from: h, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35883x9bfa94d3 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26043x78b27d19.class, m35885x337a8b = ya.b.f77489x9ff58fb5)
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132359h;

        /* renamed from: i, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "aoi_info")
        com.tencent.mapsdk.internal.px.a f132360i;

        /* renamed from: j, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "sub_pois")
        public java.util.List<com.tencent.mapsdk.internal.px.d> f132361j;

        public final java.lang.String a() {
            return !android.text.TextUtils.isEmpty(this.f132355d) ? this.f132355d : this.f132354c;
        }

        /* renamed from: toString */
        public final java.lang.String m36918x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiDetail{displayId=");
            stringBuffer.append(this.f132352a);
            stringBuffer.append(", poiId='");
            stringBuffer.append(this.f132353b);
            stringBuffer.append("', name='");
            stringBuffer.append(this.f132354c);
            stringBuffer.append("', alias='");
            stringBuffer.append(this.f132355d);
            stringBuffer.append("', type='");
            stringBuffer.append(this.f132356e);
            stringBuffer.append("', poiStyles=");
            stringBuffer.append(this.f132357f);
            stringBuffer.append(", indoorId='");
            stringBuffer.append(this.f132358g);
            stringBuffer.append("', point=");
            stringBuffer.append(this.f132359h);
            stringBuffer.append(", poiArea=");
            stringBuffer.append(this.f132360i);
            stringBuffer.append(", subPois=");
            stringBuffer.append(this.f132361j);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes13.dex */
    public static class e extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f132362a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f132363b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "style_class")
        int f132364c;

        /* renamed from: d, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "icon_url")
        java.lang.String f132365d;

        /* renamed from: e, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "icon_type")
        int f132366e;

        /* renamed from: f, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "font_color")
        java.lang.String f132367f;

        /* renamed from: g, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "font_size")
        int f132368g;

        /* renamed from: h, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "font_stroke_color")
        java.lang.String f132369h;

        /* renamed from: i, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "font_stroke_width")
        int f132370i;

        /* renamed from: j, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = ya.b.f77487x44fa364)
        int f132371j;

        /* renamed from: k, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "zindex")
        int f132372k;

        /* renamed from: l, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "aoi")
        com.tencent.mapsdk.internal.px.c f132373l;

        /* renamed from: toString */
        public final java.lang.String m36919x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiStyle{icon=");
            stringBuffer.append(this.f132362a);
            stringBuffer.append(", type=");
            stringBuffer.append(this.f132364c);
            stringBuffer.append(", iconUrl='");
            stringBuffer.append(this.f132365d);
            stringBuffer.append("', iconDisplayType=");
            stringBuffer.append(this.f132366e);
            stringBuffer.append(", fontColor='");
            stringBuffer.append(this.f132367f);
            stringBuffer.append("', fontSize=");
            stringBuffer.append(this.f132368g);
            stringBuffer.append(", fontStrokeColor='");
            stringBuffer.append(this.f132369h);
            stringBuffer.append("', fontStrokeWidth=");
            stringBuffer.append(this.f132370i);
            stringBuffer.append(", level=");
            stringBuffer.append(this.f132371j);
            stringBuffer.append(", zindex=");
            stringBuffer.append(this.f132372k);
            stringBuffer.append(", aoiStyle=");
            stringBuffer.append(this.f132373l);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* renamed from: toString */
    public final java.lang.String m36914x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AoiInfo{poiDetail=");
        stringBuffer.append(this.f132343a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
