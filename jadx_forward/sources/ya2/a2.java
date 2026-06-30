package ya2;

/* loaded from: classes.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ContentValues f541960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.ContentValues contentValues) {
        super(0);
        this.f541960d = contentValues;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = "";
        int i17 = 0;
        int i18 = 0;
        for (java.util.Map.Entry entry : ya2.b2.L3.entrySet()) {
            byte[] asByteArray = this.f541960d.getAsByteArray((java.lang.String) entry.getKey());
            if (asByteArray != null) {
                if (!(asByteArray.length == 0)) {
                    java.lang.Object newInstance = ((java.lang.Class) entry.getValue()).newInstance();
                    i17++;
                    try {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(asByteArray);
                    } catch (java.lang.Exception unused) {
                        i18++;
                        str = str + newInstance.getClass().getSimpleName() + '#';
                    }
                }
            }
        }
        if (i17 > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("parse_count", i17);
                jSONObject.put("error_count", i18);
                jSONObject.put("error", str);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocalFinderContact", t17);
                gz2.e.a(gz2.e.f359265a, 0, "KeyContactParseError", t17, 1, null);
            } catch (org.json.JSONException unused2) {
            }
        }
        return jz5.f0.f384359a;
    }
}
