package t00;

/* loaded from: classes.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t00.d1 f495806d = new t00.d1();

    public d1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = it instanceof org.json.JSONObject ? (org.json.JSONObject) it : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        if (!(it instanceof java.lang.Integer)) {
            return null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.f66865x76d1ec5a, ((java.lang.Number) it).intValue());
        return jSONObject2;
    }
}
