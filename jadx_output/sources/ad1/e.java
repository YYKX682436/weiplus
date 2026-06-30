package ad1;

/* loaded from: classes7.dex */
public class e extends yc1.b {
    public static final int CTRL_INDEX = 242;
    public static final java.lang.String NAME = "createRequestTask";

    /* renamed from: h, reason: collision with root package name */
    public final ad1.a f3114h;

    public e(int i17, uh1.o oVar) {
        this.f3114h = new ad1.a(i17, oVar, this.f460761g);
    }

    @Override // gb1.m
    public java.lang.String a() {
        this.f3114h.getClass();
        return "requestTaskId";
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f3114h.d(lVar, jSONObject, str);
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return this.f3114h.getTaskId();
    }
}
