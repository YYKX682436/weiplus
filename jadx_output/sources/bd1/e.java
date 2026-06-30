package bd1;

/* loaded from: classes7.dex */
public class e extends yc1.c {
    public static final int CTRL_INDEX = 272;
    public static final java.lang.String NAME = "createUploadTaskAsync";

    /* renamed from: h, reason: collision with root package name */
    public final bd1.c f19243h;

    public e(uh1.d0 d0Var) {
        this.f19243h = new bd1.c(d0Var, this.f460776g);
    }

    @Override // gb1.m
    public java.lang.String a() {
        this.f19243h.getClass();
        return "uploadTaskId";
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f19243h.d(lVar, jSONObject, str);
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return this.f19243h.getTaskId();
    }
}
