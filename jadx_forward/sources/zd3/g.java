package zd3;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f553142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f553144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f553145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f553146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f553147i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zd3.k kVar, int i17, int i18, int i19, yz5.p pVar, org.json.JSONObject jSONObject) {
        super(1);
        this.f553142d = kVar;
        this.f553143e = i17;
        this.f553144f = i18;
        this.f553145g = i19;
        this.f553146h = pVar;
        this.f553147i = jSONObject;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        int i17 = this.f553143e;
        if (surfaceTexture == null) {
            this.f553142d.w(lc3.x.f399469c, "surfaceTexture is null, id: " + i17);
        } else {
            int i18 = this.f553144f;
            int i19 = this.f553145g;
            surfaceTexture.setDefaultBufferSize(i18, i19);
            rk0.c.c("MB_External_surface", "registerExternalTexture surface created, w=" + i18 + ", h=" + i19 + ", id=" + i17, new java.lang.Object[0]);
            this.f553146h.mo149xb9724478(new android.view.Surface(surfaceTexture), this.f553147i);
        }
        return jz5.f0.f384359a;
    }
}
