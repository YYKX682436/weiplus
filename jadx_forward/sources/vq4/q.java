package vq4;

/* loaded from: classes12.dex */
public final class q implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f520909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520910c;

    public q(int i17, org.json.JSONObject jSONObject, rh.c1 c1Var) {
        this.f520908a = i17;
        this.f520909b = jSONObject;
        this.f520910c = c1Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "dump looper tasks:");
        java.util.Set entrySet = ((java.util.Map) obj).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.Object value = ((java.util.Map.Entry) next).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            java.lang.Iterable iterable = (java.lang.Iterable) value;
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it6 = iterable.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m3.d) it6.next()).f404625a, kh.k1.class)) {
                        i17 = 1;
                        break;
                    }
                }
            }
            if (i17 != 0) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            java.lang.Object next2 = it7.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) next2;
            if (i17 < this.f520908a) {
                vq4.x.a(this.f520909b, java.lang.String.valueOf(i17), new vq4.p(entry, this.f520910c, i17));
            }
            i17 = i18;
        }
    }
}
