package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer */
/* loaded from: classes13.dex */
public class C26043x78b27d19 implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer
    /* renamed from: deserialize */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo35869x6820db7f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof org.json.JSONObject) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
        }
        if (obj2 instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
            if (jSONArray.length() < 2) {
                return null;
            }
            if (jSONArray.length() > 2) {
                return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2));
            }
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray.getDouble(0), jSONArray.getDouble(1));
        }
        if (!(obj2 instanceof org.json.JSONStringer) && !(obj2 instanceof java.lang.String)) {
            return null;
        }
        java.lang.String[] split = obj2.toString().split(",");
        if (split.length < 2) {
            return null;
        }
        if (split.length > 2) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(java.lang.Double.parseDouble(split[0]), java.lang.Double.parseDouble(split[1]), java.lang.Double.parseDouble(split[2]));
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(java.lang.Double.parseDouble(split[0]), java.lang.Double.parseDouble(split[1]));
    }
}
