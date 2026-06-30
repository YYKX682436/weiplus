package xe3;

/* loaded from: classes15.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f535482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f535483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f535484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.json.JSONObject jSONObject, ve3.o oVar, android.view.Surface surface) {
        super(1);
        this.f535482d = jSONObject;
        this.f535483e = oVar;
        this.f535484f = surface;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = this.f535482d;
        boolean optBoolean = jSONObject.optBoolean("autoPlay", false);
        boolean optBoolean2 = jSONObject.optBoolean("loop");
        ve3.o oVar = this.f535483e;
        it.d(optBoolean2, oVar);
        android.view.Surface surface = this.f535484f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "register surface " + surface);
        it.f535477d.mo162430x42c875eb(surface);
        if (optBoolean) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_service", "autoPlay trigger startPlay");
            it.e(oVar);
        }
        return jz5.f0.f384359a;
    }
}
