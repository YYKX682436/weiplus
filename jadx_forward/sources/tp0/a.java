package tp0;

/* loaded from: classes7.dex */
public final class a implements jc3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tp0.c f502539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f502540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f502541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.m f502542d;

    public a(tp0.c cVar, java.lang.Object obj, org.json.JSONObject jSONObject, jc3.m mVar) {
        this.f502539a = cVar;
        this.f502540b = obj;
        this.f502541c = jSONObject;
        this.f502542d = mVar;
    }

    @Override // jc3.k
    public void a(lc3.z errInfo, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errInfo, "errInfo");
        tp0.c cVar = this.f502539a;
        cVar.u(errInfo);
        cVar.y(this.f502540b, this.f502541c, this.f502542d);
    }
}
