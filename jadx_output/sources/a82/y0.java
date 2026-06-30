package a82;

/* loaded from: classes12.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a82.y0 f2235a = new a82.y0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f2236b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final int f2237c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2238d = 4;

    /* JADX WARN: Multi-variable type inference failed */
    public final a82.x0 a(o72.r2 itemInfo, r45.gp0 dataItem) {
        r45.jq0 jq0Var;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        a82.x0 x0Var = new a82.x0(dataItem.T);
        x0Var.f2216b = dataItem.I;
        r45.bq0 bq0Var = dataItem.f375451y2;
        if (bq0Var == null || (jq0Var = bq0Var.f370962d) == null) {
            r45.bq0 bq0Var2 = itemInfo.field_favProto;
            jq0Var = bq0Var2 != null ? bq0Var2.f370962d : null;
        }
        long j17 = jq0Var != null ? jq0Var.f378044q : 0L;
        x0Var.f2229o = j17;
        if (j17 > 0) {
            x0Var.f2230p = c01.id.c() - x0Var.f2229o;
        }
        boolean z17 = true;
        x0Var.f2217c = !dataItem.B1 ? 1 : 0;
        x0Var.f2223i = !dataItem.D1 ? 1 : 0;
        java.lang.String str = dataItem.f375434s;
        x0Var.f2219e = (str == null || str.length() == 0) == false ? dataItem.f375434s : dataItem.f375411g2;
        java.lang.String str2 = dataItem.f375412h;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        x0Var.f2225k = !z17 ? dataItem.f375412h : dataItem.f375405d2;
        return x0Var;
    }

    public final void b(o72.r2 itemInfo, java.util.List errDataList) {
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(errDataList, "errDataList");
        com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct favFlowFailedReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct();
        favFlowFailedReportStruct.f56271d = itemInfo.field_type;
        favFlowFailedReportStruct.f56272e = f2236b.contains(java.lang.Long.valueOf(itemInfo.field_localId)) ? 1 : 0;
        favFlowFailedReportStruct.f56273f = itemInfo.field_sourceType;
        favFlowFailedReportStruct.f56274g = itemInfo.field_localId;
        favFlowFailedReportStruct.f56275h = c01.id.c();
        favFlowFailedReportStruct.f56276i = f2237c;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = errDataList.iterator();
        while (it.hasNext()) {
            jSONArray.put(f2235a.c((a82.x0) it.next()));
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        favFlowFailedReportStruct.f56277j = favFlowFailedReportStruct.b("errDataList", r26.i0.t(jSONArray2, ",", ";", false), true);
    }

    public final org.json.JSONObject c(a82.x0 x0Var) {
        kotlin.jvm.internal.o.g(x0Var, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = x0Var.f2215a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("dataId", str);
        jSONObject.put("dataType", x0Var.f2216b);
        jSONObject.put("needCheckData", x0Var.f2217c);
        jSONObject.put("checkCdnDataStatus", x0Var.f2218d);
        java.lang.String str2 = x0Var.f2219e;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("dataUrl", str2);
        jSONObject.put("dataUrlDownloadErrorCode", x0Var.f2220f);
        jSONObject.put("dataPathExist", x0Var.f2221g);
        java.lang.String str3 = x0Var.f2222h;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("dataPath", str3);
        jSONObject.put("needCheckThumb", x0Var.f2223i);
        jSONObject.put("checkCdnThumbStatus", x0Var.f2224j);
        java.lang.String str4 = x0Var.f2225k;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("thumbUrl", str4);
        jSONObject.put("thumbUrlDownloadErrorCode", x0Var.f2226l);
        jSONObject.put("thumbPathExist", x0Var.f2227m);
        java.lang.String str5 = x0Var.f2228n;
        jSONObject.put("thumbPath", str5 != null ? str5 : "");
        jSONObject.put("createTime", x0Var.f2229o);
        jSONObject.put("delayTime", x0Var.f2230p);
        return jSONObject;
    }
}
