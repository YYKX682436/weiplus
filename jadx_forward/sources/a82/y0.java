package a82;

/* loaded from: classes12.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a82.y0 f83768a = new a82.y0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f83769b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final int f83770c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f83771d = 4;

    /* JADX WARN: Multi-variable type inference failed */
    public final a82.x0 a(o72.r2 itemInfo, r45.gp0 dataItem) {
        r45.jq0 jq0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        a82.x0 x0Var = new a82.x0(dataItem.T);
        x0Var.f83749b = dataItem.I;
        r45.bq0 bq0Var = dataItem.f456984y2;
        if (bq0Var == null || (jq0Var = bq0Var.f452495d) == null) {
            r45.bq0 bq0Var2 = itemInfo.f67640x5ab01132;
            jq0Var = bq0Var2 != null ? bq0Var2.f452495d : null;
        }
        long j17 = jq0Var != null ? jq0Var.f459577q : 0L;
        x0Var.f83762o = j17;
        if (j17 > 0) {
            x0Var.f83763p = c01.id.c() - x0Var.f83762o;
        }
        boolean z17 = true;
        x0Var.f83750c = !dataItem.B1 ? 1 : 0;
        x0Var.f83756i = !dataItem.D1 ? 1 : 0;
        java.lang.String str = dataItem.f456967s;
        x0Var.f83752e = (str == null || str.length() == 0) == false ? dataItem.f456967s : dataItem.f456944g2;
        java.lang.String str2 = dataItem.f456945h;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        x0Var.f83758k = !z17 ? dataItem.f456945h : dataItem.f456938d2;
        return x0Var;
    }

    public final void b(o72.r2 itemInfo, java.util.List errDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errDataList, "errDataList");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af c6441x2a3819af = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af();
        c6441x2a3819af.f137804d = itemInfo.f67657x2262335f;
        c6441x2a3819af.f137805e = f83769b.contains(java.lang.Long.valueOf(itemInfo.f67645x88be67a1)) ? 1 : 0;
        c6441x2a3819af.f137806f = itemInfo.f67651x76e81a5a;
        c6441x2a3819af.f137807g = itemInfo.f67645x88be67a1;
        c6441x2a3819af.f137808h = c01.id.c();
        c6441x2a3819af.f137809i = f83770c;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = errDataList.iterator();
        while (it.hasNext()) {
            jSONArray.put(f83768a.c((a82.x0) it.next()));
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        c6441x2a3819af.f137810j = c6441x2a3819af.b("errDataList", r26.i0.t(jSONArray2, ",", ";", false), true);
    }

    public final org.json.JSONObject c(a82.x0 x0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x0Var, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = x0Var.f83748a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("dataId", str);
        jSONObject.put("dataType", x0Var.f83749b);
        jSONObject.put("needCheckData", x0Var.f83750c);
        jSONObject.put("checkCdnDataStatus", x0Var.f83751d);
        java.lang.String str2 = x0Var.f83752e;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("dataUrl", str2);
        jSONObject.put("dataUrlDownloadErrorCode", x0Var.f83753f);
        jSONObject.put("dataPathExist", x0Var.f83754g);
        java.lang.String str3 = x0Var.f83755h;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("dataPath", str3);
        jSONObject.put("needCheckThumb", x0Var.f83756i);
        jSONObject.put("checkCdnThumbStatus", x0Var.f83757j);
        java.lang.String str4 = x0Var.f83758k;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("thumbUrl", str4);
        jSONObject.put("thumbUrlDownloadErrorCode", x0Var.f83759l);
        jSONObject.put("thumbPathExist", x0Var.f83760m);
        java.lang.String str5 = x0Var.f83761n;
        jSONObject.put("thumbPath", str5 != null ? str5 : "");
        jSONObject.put("createTime", x0Var.f83762o);
        jSONObject.put("delayTime", x0Var.f83763p);
        return jSONObject;
    }
}
