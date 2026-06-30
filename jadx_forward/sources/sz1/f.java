package sz1;

/* loaded from: classes5.dex */
public abstract class f {
    public static void a(java.util.Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        java.lang.Object[] objArr = {null};
        d(map, new sz1.b(objArr));
        java.lang.Object obj = objArr[0];
        if (obj == null) {
            return;
        }
        d(map, new sz1.c(obj));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[compressMaxLengthParams] maxLengthParam : " + obj);
    }

    public static java.util.Map b(java.util.Map map) {
        if (map == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.Object obj : map.keySet()) {
            if (obj instanceof java.lang.String) {
                java.lang.Object obj2 = map.get(obj);
                if (obj2 instanceof java.util.Map) {
                    hashMap.put((java.lang.String) obj, b((java.util.Map) obj2));
                } else {
                    hashMap.put((java.lang.String) obj, obj2);
                }
            }
        }
        return hashMap;
    }

    public static java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object c17 = c(it.next());
                    if (c17 != null) {
                        jSONArray.put(c17);
                    }
                }
                return jSONArray;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e17.getMessage());
            }
        } else if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (java.lang.Object obj2 : map.keySet()) {
                    java.lang.Object obj3 = map.get(obj2);
                    if (obj3 != null && (obj2 instanceof java.lang.String) && (!(obj3 instanceof java.lang.String) || !u46.l.e((java.lang.String) obj3))) {
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                        if (!u46.l.c(lowerCase, str)) {
                            if (sz1.a.j()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] key contain upperCase, key : " + obj2);
                            } else {
                                java.util.Objects.toString(obj2);
                            }
                        }
                        java.lang.Object c18 = c(map.get(obj2));
                        if (c18 != null) {
                            jSONObject.put(lowerCase, c18);
                        }
                    }
                }
                return jSONObject;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e18.getMessage());
            }
        } else {
            if (!(obj instanceof java.util.Set)) {
                if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.StringBuilder) && !(obj instanceof java.lang.StringBuffer)) {
                    if ((obj instanceof java.lang.Number) || (obj instanceof org.json.JSONObject) || (obj instanceof org.json.JSONArray)) {
                        return obj;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] type is error, object : " + obj + ", type : " + obj.getClass());
                    return obj.toString();
                }
                java.lang.String obj4 = obj.toString();
                try {
                    if (obj4.contains(",")) {
                        if (obj4.contains("|")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] str contain '|' , str : ".concat(obj4));
                        }
                        return obj4.replace(",", "|");
                    }
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e19.getMessage());
                }
                return obj4;
            }
            java.util.Set set = (java.util.Set) obj;
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Iterator it6 = set.iterator();
                while (it6.hasNext()) {
                    java.lang.Object c19 = c(it6.next());
                    if (c19 != null) {
                        jSONArray2.put(c19);
                    }
                }
                return jSONArray2;
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e27.getMessage());
            }
        }
        return null;
    }

    public static boolean d(java.lang.Object obj, sz1.d dVar) {
        if (obj != null && dVar != null) {
            if (obj instanceof java.util.List) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    if (d(it.next(), dVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj;
                if (dVar.a(map)) {
                    return true;
                }
                java.util.Iterator it6 = map.values().iterator();
                while (it6.hasNext()) {
                    if (d(it6.next(), dVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof java.util.Set) {
                java.util.Iterator it7 = ((java.util.Set) obj).iterator();
                while (it7.hasNext()) {
                    if (d(it7.next(), dVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof java.lang.String) {
            } else if (obj instanceof java.lang.Number) {
            }
        }
        return false;
    }
}
