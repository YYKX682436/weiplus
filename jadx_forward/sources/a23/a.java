package a23;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f82380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONArray jSONArray) {
        super(1);
        this.f82380d = jSONArray;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONArray jSONArray = this.f82380d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(intValue);
            a23.e eVar = new a23.e("");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
            eVar.a(jSONObject);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(eVar);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        return (a23.e) m143895xf1229813;
    }
}
