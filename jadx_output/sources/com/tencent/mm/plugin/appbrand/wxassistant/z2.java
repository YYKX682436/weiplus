package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes12.dex */
public final class z2 implements com.tencent.mm.plugin.appbrand.wxassistant.r2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f92358a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f92359b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f92360c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f92361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f92362e;

    public z2(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f92358a = view;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f92360c = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        this.f92361d = linkedHashMap2;
        this.f92359b = view;
        linkedHashMap.clear();
        linkedHashMap2.clear();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        f(newSerializer, view, new java.lang.StringBuilder());
        newSerializer.endDocument();
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.o.f(stringWriter2, "toString(...)");
        r26.v vVar = r26.v.f368918e;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^\\s*<\\?xml\\b.*?\\?>\\s*", 8);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceFirst = compile.matcher(stringWriter2).replaceFirst("");
        kotlin.jvm.internal.o.f(replaceFirst, "replaceFirst(...)");
        this.f92362e = replaceFirst;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String b() {
        if (this.f92359b == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ViewSerializer", "serializeXml fail rootView is null");
            return "";
        }
        java.lang.String str = this.f92362e;
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String c() {
        java.util.List<com.tencent.mm.plugin.appbrand.wxassistant.y2> list;
        android.view.View view = this.f92359b;
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ViewSerializer", "rootView is null");
            return "";
        }
        kotlin.jvm.internal.o.d(view);
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 == null) {
            list = kz5.p0.f313996d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            g(view, view2, arrayList);
            list = arrayList;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.tencent.mm.plugin.appbrand.wxassistant.y2 y2Var : list) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                android.graphics.RectF rectF = y2Var.f92351a;
                jSONObject.put("x", java.lang.Float.valueOf(rectF.left / ik1.w.f()));
                jSONObject.put("y", java.lang.Float.valueOf(rectF.top / ik1.w.f()));
                jSONObject.put("width", java.lang.Float.valueOf(rectF.width() / ik1.w.f()));
                jSONObject.put("height", java.lang.Float.valueOf(rectF.height() / ik1.w.f()));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("rect", jSONObject);
                jSONObject2.put("tagName", y2Var.f92352b);
                jSONObject2.put("xPath", y2Var.f92353c);
                jSONArray.put(jSONObject2);
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.d(jSONArray2);
            return jSONArray2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ViewSerializer", "serializeViewInfosToJSON failed", e17);
            return "";
        }
    }

    public final java.lang.String d(java.lang.Object obj) {
        return obj == null ? "" : r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(obj.toString(), "&", "&amp;", false, 4, null), "<", "&lt;", false), ">", "&gt;", false), "\"", "&quot;", false);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public void destroy() {
        this.f92359b = null;
        ((java.util.LinkedHashMap) this.f92360c).clear();
        ((java.util.LinkedHashMap) this.f92361d).clear();
    }

    public final java.lang.String e(android.view.View view) {
        return view instanceof android.widget.TextView ? com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT : view instanceof android.widget.ImageView ? "image" : view instanceof fl1.a ? "modal" : view instanceof zl1.t ? "tab-bar" : view instanceof tl1.b ? "picker-view" : view instanceof android.view.ViewGroup ? "container" : "view";
    }

    public final void f(org.xmlpull.v1.XmlSerializer xmlSerializer, android.view.View view, java.lang.StringBuilder sb6) {
        int i17;
        com.tencent.mm.picker.base.view.WheelView wheelView;
        int currentItem;
        java.lang.String str;
        int i18;
        int i19;
        p51.b bVar;
        if (view.getVisibility() == 0 && view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getWidth() > 0 && view.getHeight() > 0) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                i17 = -1;
            } else {
                e06.k m17 = e06.p.m(0, viewGroup.getChildCount());
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
                kz5.x0 it = m17.iterator();
                while (((e06.j) it).f246214f) {
                    arrayList.add(viewGroup.getChildAt(it.b()));
                }
                int indexOf = arrayList.indexOf(view);
                java.lang.String e17 = e(view);
                int i27 = 1;
                for (int i28 = 0; i28 < indexOf; i28++) {
                    android.view.View childAt = viewGroup.getChildAt(i28);
                    kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                    if (kotlin.jvm.internal.o.b(e17, e(childAt))) {
                        i27++;
                    }
                }
                i17 = i27;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(e(view));
            sb7.append(i17 == 1 ? "" : "[" + i17 + ']');
            java.lang.String sb8 = sb7.toString();
            java.lang.String str2 = sb6 + '/' + sb8;
            kotlin.jvm.internal.o.f(str2, "toString(...)");
            java.util.Map map = this.f92360c;
            map.put(view, str2);
            java.util.Map map2 = this.f92361d;
            map2.put(str2, view);
            xmlSerializer.startTag("", sb8);
            if (view.isClickable()) {
                xmlSerializer.attribute("", dm.i4.COL_ID, java.lang.String.valueOf(view.hashCode()));
                xmlSerializer.attribute("", "event", "tap");
            }
            if (view instanceof android.widget.TextView) {
                xmlSerializer.text(d(((android.widget.TextView) view).getText()));
            } else if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view;
                int childCount = viewGroup2.getChildCount();
                for (int i29 = 0; i29 < childCount; i29++) {
                    android.view.View childAt2 = viewGroup2.getChildAt(i29);
                    kotlin.jvm.internal.o.f(childAt2, "getChildAt(...)");
                    f(xmlSerializer, childAt2, new java.lang.StringBuilder(str2));
                }
            } else if ((view instanceof com.tencent.mm.picker.base.view.WheelView) && (currentItem = (wheelView = (com.tencent.mm.picker.base.view.WheelView) view).getCurrentItem()) >= 0) {
                p51.b adapter = wheelView.getAdapter();
                if (!(adapter instanceof p51.b)) {
                    adapter = null;
                }
                if (adapter != null) {
                    int i37 = currentItem - 2;
                    int i38 = i37 < 0 ? 0 : i37;
                    int i39 = i38 + 5;
                    int itemsCount = adapter.getItemsCount();
                    if (i39 > itemsCount) {
                        i39 = itemsCount;
                    }
                    int i47 = i38;
                    int i48 = 1;
                    while (i47 < i39) {
                        int i49 = i39;
                        java.lang.Object item = adapter.getItem(i47);
                        if (item != null) {
                            bVar = adapter;
                            i19 = i47;
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                            int i57 = i48 + 1;
                            sb9.append(i48 == 1 ? "" : "[" + i48 + ']');
                            java.lang.String sb10 = sb9.toString();
                            java.lang.String str3 = ((java.lang.CharSequence) str2) + '/' + sb10;
                            kotlin.jvm.internal.o.f(str3, "toString(...)");
                            map.put(wheelView, str3);
                            map2.put(str3, wheelView);
                            xmlSerializer.startTag("", sb10);
                            xmlSerializer.attribute("", dm.i4.COL_ID, java.lang.String.valueOf(item.hashCode()));
                            xmlSerializer.attribute("", "event", "tap");
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                            sb11.append(item);
                            java.lang.String label = wheelView.getLabel();
                            if (label == null) {
                                label = "";
                            }
                            sb11.append(label);
                            xmlSerializer.text(d(sb11.toString()));
                            xmlSerializer.endTag("", sb10);
                            i18 = i57;
                        } else {
                            i18 = i48;
                            i19 = i47;
                            bVar = adapter;
                        }
                        i48 = i18;
                        i47 = i19 + 1;
                        i39 = i49;
                        adapter = bVar;
                    }
                    str = sb8;
                    xmlSerializer.endTag("", str);
                }
            }
            str = sb8;
            xmlSerializer.endTag("", str);
        }
    }

    public final void g(android.view.View view, android.view.View view2, java.util.List list) {
        view.getLocationOnScreen(new int[2]);
        view2.getLocationOnScreen(new int[2]);
        float translationX = (r1[0] - r0[0]) + view.getTranslationX();
        boolean z17 = true;
        float translationY = (r1[1] - r0[1]) + view.getTranslationY();
        android.graphics.RectF rectF = new android.graphics.RectF(translationX, translationY, view.getMeasuredWidth() + translationX, view.getMeasuredHeight() + translationY);
        java.lang.String e17 = e(view);
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) this.f92360c).get(view);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        list.add(new com.tencent.mm.plugin.appbrand.wxassistant.y2(rectF, e17, z17 ? "" : java.lang.String.valueOf(str)));
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                g(childAt, view2, list);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public int id() {
        return this.f92358a.hashCode();
    }
}
