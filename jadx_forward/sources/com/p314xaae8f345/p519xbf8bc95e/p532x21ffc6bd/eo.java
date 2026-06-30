package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class eo implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer<java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d>> {
    private static java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> a(java.util.List<java.lang.Double> list) {
        if (list.size() < 3) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(list.get(0).doubleValue(), list.get(1).doubleValue()), list.get(2).doubleValue()));
        for (int i17 = 3; i17 < list.size(); i17 += 3) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d c4292x85cd0d1d = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d) arrayList.get((i17 / 3) - 1);
            double doubleValue = c4292x85cd0d1d.m35663x74fbfbda().f49501xaa2bac6c + (list.get(i17).doubleValue() / 1000000.0d);
            double doubleValue2 = c4292x85cd0d1d.m35663x74fbfbda().f49502x83009af + (list.get(i17 + 1).doubleValue() / 1000000.0d);
            arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(doubleValue, doubleValue2), c4292x85cd0d1d.m35662x1d30897d() + (list.get(i17 + 2).doubleValue() / 100.0d)));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer
    /* renamed from: deserialize */
    public final /* synthetic */ java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> mo35869x6820db7f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null || !(obj2 instanceof org.json.JSONArray)) {
            return null;
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
        if (jSONArray.length() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            arrayList.add(java.lang.Double.valueOf(jSONArray.optDouble(i17)));
        }
        return a((java.util.List<java.lang.Double>) arrayList);
    }

    private static java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> a(java.lang.Object obj) {
        if (obj != null && (obj instanceof org.json.JSONArray)) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
            if (jSONArray.length() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(java.lang.Double.valueOf(jSONArray.optDouble(i17)));
                }
                return a((java.util.List<java.lang.Double>) arrayList);
            }
        }
        return null;
    }
}
