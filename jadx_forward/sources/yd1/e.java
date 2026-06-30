package yd1;

/* loaded from: classes7.dex */
public class e implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.j f542526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f542527b;

    public e(yd1.h hVar, yd1.j jVar, ta1.t0 t0Var) {
        this.f542526a = jVar;
        this.f542527b = t0Var;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        yd1.j jVar = this.f542526a;
        if (i18 == 0) {
            try {
                jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, jVar.f542536a);
                jSONObject.put("wxaFilePath", jVar.f542537b);
            } catch (org.json.JSONException e17) {
                str = e17.getMessage();
                i17 = 1;
                i18 = -1;
            }
        }
        this.f542527b.a(i17, i18, str, jSONObject);
    }
}
