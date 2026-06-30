package gb1;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f351529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351530b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f351531c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f351529a = lVar;
        this.f351530b = i17;
    }

    public void a(java.lang.String str) {
        android.view.View view = this.f351531c;
        if (view != null && (view instanceof gb1.l)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                ((gb1.l) this.f351531c).d(jSONObject);
                str = jSONObject.toString();
            } catch (org.json.JSONException unused) {
            }
        }
        this.f351529a.a(this.f351530b, str);
    }
}
