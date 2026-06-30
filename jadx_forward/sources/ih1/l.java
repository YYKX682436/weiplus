package ih1;

/* loaded from: classes7.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f373040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.m f373041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f373042g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ih1.u uVar, org.json.JSONObject jSONObject, ih1.m mVar, yz5.l lVar) {
        super(0);
        this.f373039d = uVar;
        this.f373040e = jSONObject;
        this.f373041f = mVar;
        this.f373042g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ih1.u uVar = this.f373039d;
        if (uVar.f373065c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], mbBizHandle  is null");
        } else {
            org.json.JSONObject jSONObject = this.f373040e;
            java.lang.String optString = jSONObject.optString("frameSetName");
            java.lang.String optString2 = jSONObject.optString("frameSetData");
            java.lang.String optString3 = jSONObject.optString("frameSetRootPath");
            int optInt = jSONObject.optInt("viewId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            iq0.e eVar = new iq0.e(optString3, "", 0, 0, 12, null);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            iq0.c cVar = uVar.f373065c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) uVar.f373066d).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            ((nq0.p) tVar).Bi(cVar, eVar, frameLayout, optString, optString2, optInt, new ih1.k(this.f373041f, this.f373039d, optString, optString3, optString2, this.f373042g));
        }
        return jz5.f0.f384359a;
    }
}
