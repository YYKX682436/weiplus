package com.tencent.mm.autogen.events;

/* loaded from: classes12.dex */
public final class FavoriteOperationEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final am.z9 f54243g = new am.z9();

    /* renamed from: h, reason: collision with root package name */
    public final am.aa f54244h = new am.aa();

    public FavoriteOperationEvent() {
        this.f192365e = false;
        this.f192364d = null;
    }

    public org.json.JSONObject f() {
        am.aa aaVar = this.f54244h;
        am.z9 z9Var = this.f54243g;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(z9Var.f8528a));
            n51.f.b(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, z9Var.f8529b);
            n51.f.b(jSONObject, "desc", z9Var.f8530c);
            n51.f.b(jSONObject, "favProtoItem", z9Var.f8531d);
            n51.f.b(jSONObject, "favLocalId", java.lang.Long.valueOf(z9Var.f8532e));
            z9Var.getClass();
            n51.f.b(jSONObject, "tags", null);
            n51.f.b(jSONObject, "favDataItem", z9Var.f8533f);
            n51.f.b(jSONObject, "dataIntent", z9Var.f8534g);
            z9Var.getClass();
            n51.f.b(jSONObject, "favInfoListener", null);
            n51.f.b(jSONObject, "context", z9Var.f8535h);
            n51.f.b(jSONObject, "handler", z9Var.f8536i);
            n51.f.b(jSONObject, "uiCallback", z9Var.f8537j);
            n51.f.b(jSONObject, "toUser", z9Var.f8538k);
            n51.f.b(jSONObject, "editText", z9Var.f8539l);
            n51.f.b(jSONObject, "voiceType", java.lang.Integer.valueOf(z9Var.f8540m));
            n51.f.b(jSONObject, "voiceDuration", java.lang.Integer.valueOf(z9Var.f8541n));
            n51.f.b(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, z9Var.f8542o);
            n51.f.b(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, z9Var.f8543p);
            n51.f.b(jSONObject, "favIdList", z9Var.f8544q);
            n51.f.b(jSONObject, "dataIdList", z9Var.f8545r);
            n51.f.b(jSONObject, "favReportInfo", z9Var.f8546s);
            n51.f.b(jSONObject, "delType", java.lang.Integer.valueOf(z9Var.f8547t));
            n51.f.b(jSONObject, "favScene", java.lang.Integer.valueOf(z9Var.f8548u));
        } catch (java.lang.Exception unused) {
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject2, "ret", java.lang.Integer.valueOf(aaVar.f6134a));
            aaVar.getClass();
            n51.f.b(jSONObject2, "record", null);
            n51.f.b(jSONObject2, "tags", aaVar.f6135b);
            n51.f.b(jSONObject2, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, aaVar.f6136c);
            n51.f.b(jSONObject2, "thumbPath", aaVar.f6137d);
            n51.f.b(jSONObject2, "thumbUrl", aaVar.f6138e);
            n51.f.b(jSONObject2, "exportInfo", aaVar.f6139f);
            n51.f.b(jSONObject2, "favDB", aaVar.f6140g);
            n51.f.b(jSONObject2, "wrapperList", aaVar.f6141h);
            aaVar.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            n51.f.b(jSONObject2, "isPlay", bool);
            aaVar.getClass();
            n51.f.b(jSONObject2, "resumePlay", bool);
            n51.f.b(jSONObject2, "isPause", java.lang.Boolean.valueOf(aaVar.f6142i));
            aaVar.getClass();
            n51.f.b(jSONObject2, "getProgress", java.lang.Double.valueOf(0.0d));
            n51.f.b(jSONObject2, "dataList", aaVar.f6143j);
        } catch (java.lang.Exception unused2) {
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
            jSONObject3.put("result", jSONObject2);
        } catch (java.lang.Exception unused3) {
        }
        return jSONObject3;
    }
}
