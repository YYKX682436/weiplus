package bd1;

/* loaded from: classes7.dex */
public class a implements uh1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f19233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd1.c f19237e;

    public a(bd1.c cVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f19237e = cVar;
        this.f19234b = str;
        this.f19235c = str2;
        this.f19236d = lVar;
    }

    public void a(int i17, java.lang.String str, int i18) {
        boolean z17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f19234b;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "onUploadResult uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, errno:%d", str2, this.f19235c, str, valueOf, valueOf2);
        bd1.c cVar = this.f19237e;
        cVar.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f427796b;
        uh1.h0 h0Var = uh1.g0.f427794a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f19236d;
        uh1.e0 a17 = h0Var.a(lVar.getAppId());
        if (a17 == null || !a17.f427780h.contains(str2)) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "upload abort %s", str2);
            z17 = true;
        }
        if (z17) {
            return;
        }
        cVar.b(lVar, str2, str, i18);
    }
}
