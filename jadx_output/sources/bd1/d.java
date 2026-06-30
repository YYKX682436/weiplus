package bd1;

/* loaded from: classes7.dex */
public class d extends yc1.b {
    public static final int CTRL_INDEX = 272;
    public static final java.lang.String NAME = "createUploadTask";

    /* renamed from: h, reason: collision with root package name */
    public final bd1.c f19242h;

    public d(uh1.d0 d0Var) {
        this.f19242h = new bd1.c(d0Var, this.f460761g);
    }

    @Override // gb1.m
    public java.lang.String a() {
        this.f19242h.getClass();
        return "uploadTaskId";
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f19242h.d(lVar, jSONObject, str);
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return this.f19242h.getTaskId();
    }
}
