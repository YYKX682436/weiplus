package hg2;

/* loaded from: classes3.dex */
public final class q implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f362919d;

    public q(dk2.vf vfVar) {
        this.f362919d = vfVar;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.lq1 lq1Var = this.f362919d.f315783a;
        jSONObject.put("product_info", android.util.Base64.encodeToString((lq1Var == null || (m75934xbce7f2f = lq1Var.m75934xbce7f2f(2)) == null) ? null : m75934xbce7f2f.g(), 0));
        return jSONObject.toString();
    }
}
