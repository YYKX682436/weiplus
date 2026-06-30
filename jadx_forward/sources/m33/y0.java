package m33;

/* loaded from: classes5.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f404878a = new java.util.HashMap();

    public y0(m33.v0 v0Var) {
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        m33.w0 w0Var = (m33.w0) this.f404878a.get(str);
        if (w0Var != null) {
            w0Var.a(jSONObject);
        }
    }
}
