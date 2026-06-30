package id;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final id.c f371977c = new id.c(null);

    /* renamed from: d, reason: collision with root package name */
    public static volatile id.d f371978d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f371979a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f371980b;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.os.Bundle a(org.json.JSONObject jsonObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jsonObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jsonObject.get(next);
            if (obj instanceof java.lang.String) {
                bundle.putString(next, (java.lang.String) obj);
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(next, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(next, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(next, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(next, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof org.json.JSONObject) {
                bundle.putBundle(next, a((org.json.JSONObject) obj));
            }
        }
        return bundle;
    }

    public final synchronized int b(java.lang.String event, h45.m callback) {
        int i17;
        java.util.List arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.ModuleEventManager", "registerEventCallback, event: %s", event);
        i17 = this.f371980b + 1;
        this.f371980b = i17;
        if (this.f371979a.containsKey(event)) {
            java.lang.Object obj = ((java.util.LinkedHashMap) this.f371979a).get(event);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            arrayList = (java.util.List) obj;
        } else {
            arrayList = new java.util.ArrayList();
        }
        arrayList.add(new id.b(i17, callback));
        this.f371979a.put(event, arrayList);
        return i17;
    }
}
