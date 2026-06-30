package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer */
/* loaded from: classes13.dex */
public class C26044xa6acf1d7 implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> {
    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer
    /* renamed from: deserialize, reason: avoid collision after fix types in other method */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo35869x6820db7f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(obj2 instanceof org.json.JSONArray)) {
            return null;
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
        if (jSONArray.length() == 0) {
            return null;
        }
        if (!(jSONArray.get(0) instanceof java.lang.Double) && !(jSONArray.get(0) instanceof java.lang.Integer)) {
            if (jSONArray.get(0) instanceof org.json.JSONArray) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONArray jSONArray2 = (org.json.JSONArray) jSONArray.get(i17);
                    if (jSONArray2.length() < 2) {
                        return null;
                    }
                    if (jSONArray2.length() > 2) {
                        arrayList.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray2.getDouble(0), jSONArray2.getDouble(1), jSONArray2.getDouble(2)));
                    } else {
                        arrayList.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray2.getDouble(0), jSONArray2.getDouble(1)));
                    }
                }
            }
        } else {
            if (jSONArray.length() < 2) {
                return null;
            }
            if (jSONArray.length() % 2 == 0) {
                for (int i18 = 0; i18 < jSONArray.length() - 1; i18 += 2) {
                    arrayList.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray.getDouble(i18), jSONArray.getDouble(i18 + 1)));
                }
            } else {
                arrayList.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2)));
            }
        }
        return arrayList;
    }
}
