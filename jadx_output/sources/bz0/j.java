package bz0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f36752c;

    /* renamed from: l, reason: collision with root package name */
    public static bz0.h f36761l;

    /* renamed from: a, reason: collision with root package name */
    public static final bz0.j f36750a = new bz0.j();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct f36751b = new com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f36753d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.TreeMap f36754e = new java.util.TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public static java.util.List f36755f = kz5.p0.f313996d;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f36756g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f36757h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f36758i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f36759j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f36760k = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f36762m = new java.util.ArrayList();

    public static final void e(org.json.JSONObject jSONObject, java.lang.String str, java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        jSONObject.put(str, jSONArray);
    }

    public final void a(java.lang.String templateId, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        java.util.List list = f36758i;
        bz0.i iVar = (bz0.i) kz5.n0.k0(list);
        if (iVar != null) {
            if (!kotlin.jvm.internal.o.b(iVar.f36748a, templateId)) {
                iVar = null;
            }
            if (iVar != null) {
                java.util.List list2 = iVar.f36749b;
                if (list2.contains(musicId)) {
                    return;
                }
                list2.add(musicId);
                return;
            }
        }
        ((java.util.ArrayList) list).add(new bz0.i(templateId, kz5.c0.k(musicId)));
    }

    public final void b(java.lang.String templateId, java.lang.String str) {
        bz0.g gVar;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (str == null) {
            return;
        }
        java.util.List list = f36759j;
        java.util.List list2 = (java.util.List) kz5.n0.k0(list);
        if (list2 != null && (gVar = (bz0.g) kz5.n0.k0(list2)) != null) {
            if (!kotlin.jvm.internal.o.b(gVar.f36739a, templateId)) {
                gVar = null;
            }
            if (gVar != null) {
                java.util.List list3 = (java.util.List) kz5.n0.k0(list);
                if ((list3 != null ? java.lang.Boolean.valueOf(list3.add(new bz0.g(templateId, str, null, null, null, 28, null))) : null) != null) {
                    return;
                }
            }
        }
        ((java.util.ArrayList) list).add(kz5.c0.k(new bz0.g(templateId, str, null, null, null, 28, null)));
    }

    public final void c(int i17) {
        if (!f36752c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "has not started");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "report");
        f36752c = false;
        com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct = f36751b;
        maasRecommendReportStruct.f58990n = maasRecommendReportStruct.b("editres", i17 != 1 ? i17 != 2 ? i17 != 3 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "exit" : "editmore" : "save", true);
        java.util.ArrayList arrayList = (java.util.ArrayList) f36756g;
        boolean z17 = !arrayList.isEmpty();
        java.util.List list = f36757h;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tid", str);
                jSONObject.put("src", 4);
                arrayList2.add(jSONObject);
            }
            arrayList.addAll(arrayList2);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                jSONArray.put((org.json.JSONObject) it6.next());
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            maasRecommendReportStruct.f58985i = maasRecommendReportStruct.b("recids", r26.i0.t(jSONArray2, ",", ";", false), true);
        }
        bz0.j jVar = f36750a;
        java.util.List list2 = f36753d;
        maasRecommendReportStruct.f58986j = maasRecommendReportStruct.b("exposeids", jVar.f(list2), true);
        java.util.TreeMap treeMap = f36754e;
        java.util.Collection values = treeMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        maasRecommendReportStruct.B = maasRecommendReportStruct.b("double_exposeids", jVar.f(values), true);
        maasRecommendReportStruct.A = maasRecommendReportStruct.b("maasSessionKey", bz0.a.f36722a, true);
        maasRecommendReportStruct.k();
        f36755f = kz5.p0.f313996d;
        ((java.util.ArrayList) list2).clear();
        treeMap.clear();
        ((java.util.ArrayList) f36758i).clear();
        arrayList.clear();
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) f36762m).clear();
        ((java.util.ArrayList) f36759j).clear();
        ((java.util.LinkedHashMap) f36760k).clear();
    }

    public final java.lang.String d(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ig.w wVar = (ig.w) obj;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tid", wVar.getPreviewTemplateId());
            java.lang.Object obj2 = (java.lang.String) ((java.util.LinkedHashMap) f36760k).get(wVar.getPreviewTemplateId());
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject.put("mrid", obj2);
            bz0.i iVar = (bz0.i) kz5.n0.a0(f36758i, i17);
            if (iVar != null) {
                bz0.i iVar2 = kotlin.jvm.internal.o.b(iVar.f36748a, wVar.getPreviewTemplateId()) ? iVar : null;
                if (iVar2 != null) {
                    e(jSONObject, "esids", iVar2.f36749b);
                }
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.List list2 = (java.util.List) kz5.n0.a0(f36759j, i17);
            if (list2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list2) {
                    bz0.g gVar = (bz0.g) obj3;
                    if (kotlin.jvm.internal.o.b(gVar.f36739a, wVar.getPreviewTemplateId()) && !com.tencent.mm.sdk.platformtools.t8.K0(gVar.f36740b)) {
                        arrayList.add(obj3);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bz0.g gVar2 = (bz0.g) it.next();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("query", gVar2.f36740b);
                    java.util.List list3 = gVar2.f36743e;
                    java.lang.String str = (java.lang.String) kz5.n0.k0(list3);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject2.put("chsid", str);
                    e(jSONObject2, "sesids", gVar2.f36741c);
                    e(jSONObject2, "sesnames", gVar2.f36742d);
                    e(jSONObject2, "clksids", list3);
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("sacts", jSONArray2);
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            java.util.List<ig.s> musicActionsList = wVar.getMusicActionsList();
            kotlin.jvm.internal.o.f(musicActionsList, "getMusicActionsList(...)");
            for (ig.s sVar : musicActionsList) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, sVar.getPreviewMusicId());
                jSONObject3.put("videolen", sVar.getTimelineDurationMs());
                jSONObject3.put("staytime", sVar.getPreviewDurationMs());
                ig.p previewMusicSourceType = sVar.getPreviewMusicSourceType();
                kotlin.jvm.internal.o.f(previewMusicSourceType, "getPreviewMusicSourceType(...)");
                int ordinal = previewMusicSourceType.ordinal();
                jSONObject3.put("song_source", ordinal != 0 ? (ordinal == 1 || ordinal != 3) ? 2 : 1 : 0);
                jSONObject3.put("song_name", sVar.getPreviewMusicSongName());
                jSONArray3.put(jSONObject3);
            }
            jSONObject.put("musicseq", jSONArray3);
            jSONArray.put(jSONObject);
            i17 = i18;
        }
        java.lang.String jSONArray4 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray4, "toString(...)");
        return r26.i0.t(jSONArray4, ",", ";", false);
    }

    public final java.lang.String f(java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return r26.i0.t(jSONArray2, ",", ";", false);
    }
}
