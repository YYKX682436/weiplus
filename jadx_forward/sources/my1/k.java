package my1;

@j95.b
/* loaded from: classes9.dex */
public class k extends i95.w implements fy1.e {

    /* renamed from: e, reason: collision with root package name */
    public static volatile my1.k f414227e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f414228d = new java.util.HashMap();

    private k() {
    }

    public static my1.k Ai() {
        if (f414227e == null) {
            synchronized (my1.k.class) {
                if (f414227e == null) {
                    f414227e = new my1.k();
                }
            }
        }
        return f414227e;
    }

    public final java.util.Map Bi(java.util.Map map, java.util.Map map2, ky1.d dVar) {
        int i17;
        if (map2 != null && map != null && map.size() > 0 && dVar.f395032a == 1 && ((i17 = dVar.f395033b) == 5 || i17 == 9 || i17 == 999)) {
            for (java.lang.String str : map.keySet()) {
                if (!map2.containsKey(str)) {
                    map2.put(str, map.get(str));
                }
            }
        }
        return map2;
    }

    public final java.lang.Object Di(java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return obj;
        }
        java.lang.String str = (java.lang.String) obj;
        try {
            if (str.contains("s|")) {
                java.lang.String[] split = str.split("s\\|");
                return split.length > 0 ? split[split.length - 1] : obj;
            }
            if (str.contains("i|")) {
                java.lang.String[] split2 = str.split("i\\|");
                return split2.length > 0 ? java.lang.Long.valueOf(java.lang.Long.parseLong(split2[split2.length - 1])) : obj;
            }
            if (str.contains("d|")) {
                java.lang.String[] split3 = str.split("d\\|");
                return split3.length > 0 ? java.lang.Double.valueOf(java.lang.Double.parseDouble(split3[split3.length - 1])) : obj;
            }
            if (str.contains("b|")) {
                java.lang.String[] split4 = str.split("b\\|");
                return split4.length > 0 ? java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(split4[split4.length - 1])) : obj;
            }
            if (str.contains("jm|")) {
                java.lang.String[] split5 = str.split("jm\\|");
                return split5.length > 0 ? io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138431xcdecea63(new org.json.JSONObject(split5[split5.length - 1])) : obj;
            }
            if (!str.contains("jl|")) {
                return obj;
            }
            java.lang.String[] split6 = str.split("jl\\|");
            return split6.length > 0 ? io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138431xcdecea63(new org.json.JSONArray(split6[split6.length - 1])) : obj;
        } catch (java.lang.Exception unused) {
            return obj;
        }
    }

    public final java.util.Map wi(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.util.Map) {
                try {
                    hashMap.put(str, wi((java.util.Map) obj));
                } catch (java.lang.Exception unused) {
                }
            } else if (obj instanceof java.util.List) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(Di(it.next()));
                }
                hashMap.put(str, arrayList);
            } else {
                hashMap.put(str, Di(obj));
            }
        }
        return hashMap;
    }
}
