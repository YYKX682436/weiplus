package lo1;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final lo1.b f401627d = new lo1.b();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ro1.v vVar = ro1.v.f479547a;
        java.util.List b17 = vVar.b();
        java.util.List a17 = vVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            po1.d dVar = (po1.d) it.next();
            org.json.JSONObject put = new org.json.JSONObject().put("deviceId", dVar.f438828a).put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, dVar.f438832e).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, dVar.f438830c).put("remark", dVar.f438831d);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it6.next()).f438833f, dVar.f438833f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            arrayList.add(put.put("connection", z17));
        }
        jSONObject.put("devices", new org.json.JSONArray((java.util.Collection) arrayList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:portableDict, data:" + jSONObject);
        jSONObject.put("notify_type", "portableDict");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", jSONObject.toString());
    }
}
