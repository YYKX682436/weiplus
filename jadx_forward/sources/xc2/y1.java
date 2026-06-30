package xc2;

/* loaded from: classes2.dex */
public final class y1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f534875e;

    public y1(java.lang.String str, xc2.p0 p0Var) {
        this.f534874d = str;
        this.f534875e = p0Var;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        java.lang.String m75945x2fec8307;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f534874d;
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            str = "";
        }
        jSONObject.put(dm.i4.f66863x30b5ef64, str);
        xc2.p0 p0Var = this.f534875e;
        r45.l34 l34Var = p0Var.f534771c;
        if (l34Var != null && (m75945x2fec8307 = l34Var.m75945x2fec8307(3)) != null) {
            str2 = m75945x2fec8307;
        }
        jSONObject.put("finder_context", str2);
        java.util.Map map = p0Var.f534768a0;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject.toString();
    }
}
