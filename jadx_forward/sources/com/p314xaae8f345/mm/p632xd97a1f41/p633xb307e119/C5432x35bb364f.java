package com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119;

/* renamed from: com.tencent.mm.autogen.events.FavoriteOperationEvent */
/* loaded from: classes12.dex */
public final class C5432x35bb364f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 {

    /* renamed from: g, reason: collision with root package name */
    public final am.z9 f135776g = new am.z9();

    /* renamed from: h, reason: collision with root package name */
    public final am.aa f135777h = new am.aa();

    public C5432x35bb364f() {
        this.f273898e = false;
        this.f273897d = null;
    }

    public org.json.JSONObject f() {
        am.aa aaVar = this.f135777h;
        am.z9 z9Var = this.f135776g;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(z9Var.f90061a));
            n51.f.b(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, z9Var.f90062b);
            n51.f.b(jSONObject, "desc", z9Var.f90063c);
            n51.f.b(jSONObject, "favProtoItem", z9Var.f90064d);
            n51.f.b(jSONObject, "favLocalId", java.lang.Long.valueOf(z9Var.f90065e));
            z9Var.getClass();
            n51.f.b(jSONObject, "tags", null);
            n51.f.b(jSONObject, "favDataItem", z9Var.f90066f);
            n51.f.b(jSONObject, "dataIntent", z9Var.f90067g);
            z9Var.getClass();
            n51.f.b(jSONObject, "favInfoListener", null);
            n51.f.b(jSONObject, "context", z9Var.f90068h);
            n51.f.b(jSONObject, "handler", z9Var.f90069i);
            n51.f.b(jSONObject, "uiCallback", z9Var.f90070j);
            n51.f.b(jSONObject, "toUser", z9Var.f90071k);
            n51.f.b(jSONObject, "editText", z9Var.f90072l);
            n51.f.b(jSONObject, "voiceType", java.lang.Integer.valueOf(z9Var.f90073m));
            n51.f.b(jSONObject, "voiceDuration", java.lang.Integer.valueOf(z9Var.f90074n));
            n51.f.b(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, z9Var.f90075o);
            n51.f.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, z9Var.f90076p);
            n51.f.b(jSONObject, "favIdList", z9Var.f90077q);
            n51.f.b(jSONObject, "dataIdList", z9Var.f90078r);
            n51.f.b(jSONObject, "favReportInfo", z9Var.f90079s);
            n51.f.b(jSONObject, "delType", java.lang.Integer.valueOf(z9Var.f90080t));
            n51.f.b(jSONObject, "favScene", java.lang.Integer.valueOf(z9Var.f90081u));
        } catch (java.lang.Exception unused) {
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject2, "ret", java.lang.Integer.valueOf(aaVar.f87667a));
            aaVar.getClass();
            n51.f.b(jSONObject2, "record", null);
            n51.f.b(jSONObject2, "tags", aaVar.f87668b);
            n51.f.b(jSONObject2, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, aaVar.f87669c);
            n51.f.b(jSONObject2, "thumbPath", aaVar.f87670d);
            n51.f.b(jSONObject2, "thumbUrl", aaVar.f87671e);
            n51.f.b(jSONObject2, "exportInfo", aaVar.f87672f);
            n51.f.b(jSONObject2, "favDB", aaVar.f87673g);
            n51.f.b(jSONObject2, "wrapperList", aaVar.f87674h);
            aaVar.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            n51.f.b(jSONObject2, "isPlay", bool);
            aaVar.getClass();
            n51.f.b(jSONObject2, "resumePlay", bool);
            n51.f.b(jSONObject2, "isPause", java.lang.Boolean.valueOf(aaVar.f87675i));
            aaVar.getClass();
            n51.f.b(jSONObject2, "getProgress", java.lang.Double.valueOf(0.0d));
            n51.f.b(jSONObject2, "dataList", aaVar.f87676j);
        } catch (java.lang.Exception unused2) {
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
            jSONObject3.put("result", jSONObject2);
        } catch (java.lang.Exception unused3) {
        }
        return jSONObject3;
    }
}
