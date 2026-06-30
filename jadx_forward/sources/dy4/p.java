package dy4;

/* loaded from: classes8.dex */
public final class p implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326227a;

    public p(dy4.w wVar) {
        this.f326227a = wVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0
    public void a(android.os.Bundle data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        dy4.w wVar = this.f326227a;
        org.json.JSONObject c17 = wVar.c();
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
        c17.put("localFeedId", data.getString("localFeedId", ""));
        c17.put("isFav", data.getBoolean("isFav"));
        c17.put("isLike", data.getBoolean("isLike"));
        c17.put("favCount", data.getInt("favCount"));
        c17.put("likeCount", data.getInt("likeCount"));
        wVar.a("onFinderFeedInfoUpdated", c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "onFinderFeedInfoUpdated data: " + c17);
    }
}
