package p52;

/* loaded from: classes3.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.lang.String liveId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.C;
        java.util.List list = (java.util.List) concurrentHashMap.get(liveId);
        if (list != null) {
            arrayList.addAll(list);
        }
        concurrentHashMap.remove(liveId);
        return arrayList;
    }

    public final java.lang.String b(java.lang.String str) {
        if (str != null) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p52.h.f433573y, str) ? p52.h.f433572x : "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFinderConfig", "getSnsAdData finderUsername is null");
        return "";
    }

    public final boolean c(long j17, java.lang.String eventId, java.util.Map params, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.Object obj = params.get("udf_kv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        java.util.Map map = (java.util.Map) obj;
        if (map.get("live_id") != null) {
            java.lang.Object obj2 = map.get("live_id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) obj2;
        } else {
            str = "";
        }
        if (!p52.h.C.containsKey(str)) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("event_time", java.lang.Long.valueOf(j17));
        linkedHashMap.put("event_id", eventId);
        linkedHashMap.put("event_params", params);
        e(str, linkedHashMap);
        return true;
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, str2, new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }
    }

    public final void e(java.lang.String str, java.util.Map map) {
        if (str == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.C;
        java.util.List list = (java.util.List) concurrentHashMap.get(str);
        if (list == null) {
            list = null;
        } else if (map != null) {
            list.add(map);
        }
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (map != null) {
                arrayList.add(map);
            }
            concurrentHashMap.put(str, arrayList);
        }
    }

    public final void f(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            p52.h.f433572x = "";
            p52.h.f433573y = "";
            d("HABBYGE-MALI.HellFinderConfig", "setSnsAdData fail!");
            return;
        }
        p52.h.f433572x = str;
        p52.h.f433573y = str2;
        d("HABBYGE-MALI.HellFinderConfig", "setSnsAdData, snsAdData=" + p52.h.f433572x + ", snsFinderUsername=" + p52.h.f433573y);
    }

    public final void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (str == null) {
            str = "";
        }
        p52.h.f433564p = str;
        if (str2 == null) {
            str2 = "";
        }
        p52.h.f433565q = str2;
        if (str3 == null) {
            str3 = "";
        }
        p52.h.f433566r = str3;
        if (str4 == null) {
            str4 = "";
        }
        p52.h.f433567s = str4;
        if (str5 == null) {
            str5 = "";
        }
        p52.h.f433568t = str5;
    }

    public final java.util.Map h(java.util.Map map, int i17) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), "udf_kv")) {
                    java.lang.Object value = entry.getValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    linkedHashMap2.putAll((java.util.Map) value);
                    linkedHashMap2.put("live_enter_status", java.lang.Integer.valueOf(i17));
                    linkedHashMap.put(entry.getKey(), linkedHashMap2);
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }
}
