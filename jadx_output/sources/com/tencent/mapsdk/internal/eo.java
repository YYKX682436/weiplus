package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class eo implements com.tencent.map.tools.json.JsonParser.Deserializer<java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng>> {
    private static java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> a(java.util.List<java.lang.Double> list) {
        if (list.size() < 3) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(list.get(0).doubleValue(), list.get(1).doubleValue()), list.get(2).doubleValue()));
        for (int i17 = 3; i17 < list.size(); i17 += 3) {
            com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng weightedLatLng = (com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng) arrayList.get((i17 / 3) - 1);
            double doubleValue = weightedLatLng.getPoint().latitude + (list.get(i17).doubleValue() / 1000000.0d);
            double doubleValue2 = weightedLatLng.getPoint().longitude + (list.get(i17 + 1).doubleValue() / 1000000.0d);
            arrayList.add(new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(doubleValue, doubleValue2), weightedLatLng.getIntensity() + (list.get(i17 + 2).doubleValue() / 100.0d)));
        }
        return arrayList;
    }

    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public final /* synthetic */ java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> deserialize(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
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

    private static java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> a(java.lang.Object obj) {
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
