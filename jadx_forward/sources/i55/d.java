package i55;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f370373a;

    /* renamed from: c, reason: collision with root package name */
    public long f370375c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f370374b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f370376d = new java.util.LinkedHashSet();

    public d(int i17) {
        this.f370373a = i17;
    }

    public void a(java.lang.ref.WeakReference weakView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakView, "weakView");
    }

    public abstract boolean b(java.lang.String str);

    public abstract java.lang.String c(java.lang.String str);

    public java.util.Map d() {
        return null;
    }

    public void e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", this.f370373a + " onPagePause");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.Map map = this.f370374b;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            g55.e eVar = (g55.e) entry.getValue();
            if (eVar.f350507m || eVar.f350497c != this.f370375c) {
                arrayList.add(str);
            }
        }
        for (java.lang.String str2 : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", str2 + " is disappear remove");
            map.remove(str2);
        }
    }

    public void f(long j17, java.lang.String prefKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f370373a;
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(prefKey);
        sb6.append("  on click");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
        i55.s sVar = i55.s.f370411a;
        boolean contains = this.f370376d.contains(prefKey);
        i55.s.f370415e.put(java.lang.Integer.valueOf(i17), new jz5.l(prefKey, java.lang.Boolean.valueOf(contains)));
    }

    public void g(long j17, java.lang.String redDotKey, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotKey, "redDotKey");
        g55.e eVar = (g55.e) ((java.util.LinkedHashMap) this.f370374b).get(redDotKey);
        if (eVar != null && eVar.f350506l) {
            eVar.f(j17, map);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append(' ');
            sb6.append(redDotKey);
            sb6.append(" on unexp  uuid ");
            java.lang.Object obj = eVar.d().get("tips_uuid");
            if (obj == null) {
                obj = "";
            }
            sb6.append(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
            h(c("red_dot_unexp"), eVar);
        }
        java.lang.String a17 = e55.e.f331200a.a(redDotKey);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", this.f370373a + " onRedDotUnExposure cur entry key = " + a17 + " remove");
            this.f370376d.remove(a17);
        }
    }

    public abstract void h(java.lang.String str, g55.e eVar);
}
