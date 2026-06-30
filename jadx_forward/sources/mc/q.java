package mc;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2918x552bfd03 f407068d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f407069e;

    /* renamed from: f, reason: collision with root package name */
    public volatile mc.n f407070f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.text.SimpleDateFormat f407071g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.Date f407072h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f407065a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f407067c = "";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f407066b = new java.lang.Object();

    public static void c(mc.q qVar) {
        java.util.HashMap hashMap = qVar.f407065a;
        java.lang.String str = "";
        if (hashMap != null && hashMap.size() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(qVar.f407065a.entrySet());
            java.util.Collections.sort(arrayList, new mc.o());
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("platform", "Android");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("tips", jSONObject2);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                mc.p.f407064a.e("LoggerManager", "create json error: " + e17.getLocalizedMessage());
            }
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            qVar.a("tips_counts: " + android.util.Base64.encodeToString(pc.h.a(str), 2));
        } catch (java.lang.Exception e18) {
            e18.getLocalizedMessage();
        }
    }

    public static void d(mc.q qVar, java.lang.String str) {
        qVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            mc.p.f407064a.e("LoggerManager", "add tips event with empty!");
            return;
        }
        java.util.HashMap hashMap = qVar.f407065a;
        if (hashMap == null) {
            mc.p.f407064a.e("LoggerManager", "tips save map is null!");
            return;
        }
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, 1);
            return;
        }
        java.lang.Object obj = hashMap.get(str);
        if (obj instanceof java.lang.Integer) {
            hashMap.put(str, java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + 1));
        }
    }

    public final void a(java.lang.String str) {
        java.lang.String str2;
        if (this.f407068d == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2918x552bfd03 interfaceC2918x552bfd03 = this.f407068d;
        java.lang.String str3 = this.f407067c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this.f407071g == null) {
                this.f407071g = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            }
            if (this.f407072h == null) {
                this.f407072h = new java.util.Date();
            }
            this.f407072h.setTime(currentTimeMillis);
            str2 = this.f407071g.format(this.f407072h);
        } catch (java.lang.Exception unused) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
        sb6.append(this.f407067c);
        sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
        sb6.append(str);
        interfaceC2918x552bfd03.m21775x64f5ce5(str3, sb6.toString());
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2903x3c4dddc.m21634x5b09653(str, str2);
        if (this.f407068d == null || this.f407070f == null) {
            return;
        }
        android.os.Message obtainMessage = this.f407070f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str2;
        this.f407070f.sendMessage(obtainMessage);
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2903x3c4dddc.m21637x5c4d208(str, str2);
        if (this.f407068d == null || this.f407070f == null) {
            return;
        }
        android.os.Message obtainMessage = this.f407070f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str2;
        this.f407070f.sendMessage(obtainMessage);
    }
}
