package ke3;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c f388553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f388554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ke3.l f388555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f388556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c, org.json.JSONObject jSONObject, ke3.l lVar, yz5.l lVar2) {
        super(0);
        this.f388553d = activityC16457xffd292c;
        this.f388554e = jSONObject;
        this.f388555f = lVar;
        this.f388556g = lVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c = this.f388553d;
        if (activityC16457xffd292c.f229662e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bizHandle is null");
        } else {
            org.json.JSONObject jSONObject = this.f388554e;
            java.lang.String optString = jSONObject.optString("frameSetName");
            java.lang.String optString2 = jSONObject.optString("frameSetData");
            java.lang.String optString3 = jSONObject.optString("frameSetRootPath");
            int optInt = jSONObject.optInt("viewId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            iq0.e eVar = new iq0.e(optString3, "", 0, 0, 12, null);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            android.view.ViewGroup viewGroup = activityC16457xffd292c.f229661d;
            if (viewGroup != null) {
                ke3.l lVar = this.f388555f;
                yz5.l lVar2 = this.f388556g;
                iq0.c cVar = activityC16457xffd292c.f229662e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                ((nq0.p) tVar).Bi(cVar, eVar, viewGroup, optString, optString2, optInt, new ke3.j(lVar, optString, optString3, optString2, lVar2));
            }
        }
        return jz5.f0.f384359a;
    }
}
