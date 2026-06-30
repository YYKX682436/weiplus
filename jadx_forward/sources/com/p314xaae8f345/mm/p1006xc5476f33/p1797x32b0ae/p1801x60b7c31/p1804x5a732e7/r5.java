package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final e40.a0 f225297a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225298b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f225299c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f225300d;

    public r5(e40.a0 state, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        num = (i17 & 4) != 0 ? null : num;
        str2 = (i17 & 8) != 0 ? null : str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f225297a = state;
        this.f225298b = str;
        this.f225299c = num;
        this.f225300d = str2;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", this.f225297a.f329143d);
        java.lang.String str = this.f225298b;
        if (str != null) {
            jSONObject.put("fileId", str);
        }
        java.lang.Integer num = this.f225299c;
        if (num != null) {
            jSONObject.put("progress", num.intValue());
        }
        java.lang.String str2 = this.f225300d;
        if (str2 != null) {
            jSONObject.put("errMsg", str2);
        }
        return jSONObject;
    }
}
