package lr2;

/* loaded from: classes3.dex */
public final class a implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mg0 f402250d;

    public a(r45.mg0 mg0Var) {
        this.f402250d = mg0Var;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m75945x2fec8307 = this.f402250d.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jSONObject.put("orderDetailsJson", m75945x2fec8307);
        return jSONObject.toString();
    }
}
