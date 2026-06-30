package bd;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f19197a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f19198b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19199c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19200d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19201e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19202f;

    public e(long j17, java.lang.String str, long j18, long j19, int i17, boolean z17) {
        this.f19197a = j17;
        this.f19198b = str;
        this.f19199c = j18;
        this.f19200d = j19;
        this.f19201e = i17;
        this.f19202f = z17;
    }

    public final void a(java.lang.Object obj, boolean z17, boolean z18) {
        if (this.f19200d <= 0) {
            return;
        }
        java.lang.Object jSONObject = obj == null ? new org.json.JSONObject() : obj;
        boolean z19 = jSONObject instanceof java.nio.ByteBuffer;
        boolean z27 = this.f19202f;
        long j17 = this.f19197a;
        java.lang.String str = this.f19198b;
        if (z19) {
            com.tencent.mm.plugin.lite.LiteAppCenter.DynamicModuleCallback(this.f19198b, this.f19197a, this.f19199c, this.f19200d, "{\"__id\":" + com.tencent.mm.plugin.lite.LiteAppCenter.setBuffer(str, j17, ((java.nio.ByteBuffer) jSONObject).array(), z27) + "}", z18, z17, this.f19202f);
        } else if (jSONObject instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) jSONObject;
            if (!com.tencent.mm.plugin.lite.LiteAppCenter.isJson(str2)) {
                str2 = "\"" + com.tencent.mm.plugin.lite.LiteAppCenter.escapeString(str2) + "\"";
            }
            com.tencent.mm.plugin.lite.LiteAppCenter.DynamicModuleCallback(this.f19198b, this.f19197a, this.f19199c, this.f19200d, str2, z18, z17, this.f19202f);
        } else if (jSONObject instanceof bd.a) {
            com.tencent.mm.plugin.lite.LiteAppCenter.DynamicModuleCallback(this.f19198b, this.f19197a, this.f19199c, this.f19200d, bd.j.a((bd.a) jSONObject, str, j17, z27), z18, z17, this.f19202f);
        } else {
            com.tencent.mm.plugin.lite.LiteAppCenter.DynamicModuleCallback(this.f19198b, this.f19197a, this.f19199c, this.f19200d, jSONObject.toString(), z18, z17, this.f19202f);
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.executingDynamicModuleMap.remove(java.lang.Integer.valueOf(this.f19201e));
    }
}
