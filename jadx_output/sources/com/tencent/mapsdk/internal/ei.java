package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ei implements com.tencent.map.tools.json.JsonParser.Deserializer<com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a> {
    private static com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a a(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        java.lang.String string = jSONObject.getString("type");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.d.class, new java.lang.Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.e.class, new java.lang.Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.b.class, new java.lang.Object[0]);
        }
        if (androidx.exifinterface.media.ExifInterface.TAG_MODEL.equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.c.class, new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public final /* synthetic */ com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a deserialize(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null || !(obj2 instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
        java.lang.String string = jSONObject.getString("type");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.d.class, new java.lang.Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.e.class, new java.lang.Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.b.class, new java.lang.Object[0]);
        }
        if (androidx.exifinterface.media.ExifInterface.TAG_MODEL.equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.el.a.C0027a.c.class, new java.lang.Object[0]);
        }
        return null;
    }
}
