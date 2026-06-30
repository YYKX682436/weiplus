package fy;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.g f348701d = new fy.g();

    public g() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        try {
            str = param.getString("pinyin");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt("contact_type");
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "search_contacts_by_pinyin invoke pinyin " + str + " type " + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", "pinyin is required");
            onComplete.mo146xb9724478(jSONObject);
        } else {
            o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
            p13.u uVar = new p13.u();
            uVar.f432674c = str;
            uVar.f432673b = 16;
            uVar.f432678g = new int[]{131072};
            uVar.f432686o = 1;
            uVar.f432684m = new fy.f(onComplete);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) zVar).sj(2, uVar);
        }
        return jz5.f0.f384359a;
    }
}
