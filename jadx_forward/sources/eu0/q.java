package eu0;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: g, reason: collision with root package name */
    public static final eu0.p f338262g = new eu0.p(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f338263a = "reedit";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f338264b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f338265c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338266d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f338267e;

    /* renamed from: f, reason: collision with root package name */
    public eu0.o f338268f;

    public final boolean a() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338263a, "reedit")) {
            return false;
        }
        java.lang.String str = this.f338264b;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = this.f338265c;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String str3 = this.f338266d;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        java.util.List list = this.f338267e;
        return !(list == null || list.isEmpty());
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f338263a);
        java.lang.String str = this.f338264b;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("template_id", str);
            }
        }
        java.lang.String str2 = this.f338265c;
        if (str2 != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                jSONObject.put("aigc_task_id", str2);
            }
        }
        java.lang.String str3 = this.f338266d;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                jSONObject.put("aigc_service_id", str3);
            }
        }
        java.util.List list = this.f338267e;
        if (list != null) {
            java.util.List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 != null) {
                jSONObject.put("refer_url", new org.json.JSONArray((java.util.Collection) list2));
            }
        }
        eu0.o oVar = this.f338268f;
        if (oVar != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("finder_tab_context_id", oVar.f338260a);
            jSONObject2.put("finder_context_id", oVar.f338261b);
            jSONObject.put("rawInfos", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m128200x9616526c() {
        return "ReeditQueryParams: scene=" + this.f338263a + ", templateID=" + this.f338264b + ", aigcTaskID=" + this.f338265c + ", aigcServiceID=" + this.f338266d + ", referUrl=" + this.f338267e + ", rawInfos=" + this.f338268f;
    }
}
