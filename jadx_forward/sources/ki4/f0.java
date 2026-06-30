package ki4;

/* loaded from: classes.dex */
public final class f0 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f389663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389664e;

    public f0(java.util.List list, java.lang.String str) {
        this.f389663d = list;
        this.f389664e = str;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = true;
        java.util.List list = this.f389663d;
        if (list != null && (!list.isEmpty())) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
            jSONObject.put("enc_usernames", jSONArray);
        }
        jSONObject.put("isprerender", true);
        java.lang.String str = this.f389664e;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
