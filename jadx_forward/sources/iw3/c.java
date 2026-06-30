package iw3;

/* loaded from: classes8.dex */
public final class c extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw3.c f376767d = new iw3.c();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int hashCode = env.f422393a.hashCode();
        java.util.Map map = hw3.a.f367116a;
        java.util.HashMap hashMap = new java.util.HashMap();
        uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) hw3.a.f367116a).get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            int i18 = vVar.f507816c;
            r2 = i18 != 0 ? i18 : 32;
            int i19 = vVar.f507819f;
            if (i19 >= 0) {
                hashMap.put("selectedStartIndex", java.lang.Integer.valueOf(i19));
            }
            int i27 = vVar.f507820g;
            if (i27 >= 0) {
                hashMap.put("selectedEndIndex", java.lang.Integer.valueOf(i27));
            }
            str = vVar.f507814a;
            i17 = vVar.f507815b;
        } else {
            str = "";
            i17 = 0;
        }
        hashMap.put("content", str);
        hashMap.put("currentCharLength", java.lang.Integer.valueOf(i17));
        hashMap.put("maxCharLength", java.lang.Integer.valueOf(r2));
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetTextContent", "JsApi-Call: msg:%s", msg);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getTextContent";
    }
}
