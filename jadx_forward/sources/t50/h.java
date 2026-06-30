package t50;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final t50.h f497239a = new t50.h();

    public final void a(java.util.Map extParams, org.json.JSONObject extObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extObj, "extObj");
        try {
            java.util.Iterator<java.lang.String> keys = extObj.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = extObj.get(next);
                if (obj instanceof java.lang.String) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, obj);
                } else if (obj instanceof java.lang.Number) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (obj instanceof java.lang.Boolean) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (obj instanceof org.json.JSONObject) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, obj)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, "null");
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    extParams.put(next, obj.toString());
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.AISearchUtils", e17, "", new java.lang.Object[0]);
        }
    }
}
