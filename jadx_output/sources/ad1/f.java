package ad1;

/* loaded from: classes7.dex */
public class f extends yc1.c {
    public static final int CTRL_INDEX = 242;
    public static final java.lang.String NAME = "createRequestTaskAsync";

    /* renamed from: h, reason: collision with root package name */
    public final ad1.a f3115h;

    public f(int i17, uh1.o oVar) {
        this.f3115h = new ad1.a(i17, oVar, this.f460776g);
    }

    @Override // gb1.m
    public java.lang.String a() {
        this.f3115h.getClass();
        return "requestTaskId";
    }

    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f3115h.d(lVar, jSONObject, str);
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return this.f3115h.getTaskId();
    }
}
