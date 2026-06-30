package yd1;

/* loaded from: classes7.dex */
public class f implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f542530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.g f542531d;

    public f(yd1.g gVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f542531d = gVar;
        this.f542528a = str;
        this.f542529b = str2;
        this.f542530c = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        ta1.k0 k0Var = (ta1.k0) obj;
        yd1.g gVar = this.f542531d;
        try {
            if (i18 != 0) {
                gVar.f542533b.a(i17, i18, str, new org.json.JSONObject());
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f542528a);
                jSONObject.put("thumbPath", this.f542529b);
                jSONObject.put("chosenId", this.f542530c);
                jSONObject.put("duration", k0Var.f498169a);
                jSONObject.put("size", k0Var.f498170b);
                gVar.f542533b.a(0, 0, "ok", jSONObject);
            }
        } catch (org.json.JSONException e17) {
            gVar.f542533b.a(1, -1, e17.getMessage(), new org.json.JSONObject());
        }
    }
}
