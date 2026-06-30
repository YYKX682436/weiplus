package x93;

/* loaded from: classes8.dex */
public final class b implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f534255a;

    public b(yz5.a pageIdProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageIdProvider, "pageIdProvider");
        this.f534255a = pageIdProvider;
    }

    @Override // qj5.q
    public java.lang.String a() {
        return null;
    }

    @Override // qj5.q
    public org.json.JSONObject f() {
        long longValue = ((java.lang.Number) this.f534255a.mo152xb9724478()).longValue();
        if (longValue < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppScreenshotShareProvider", "getGameCenterExtraData: invalid pageId=" + longValue);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q a17 = x93.c.a(longValue);
        org.json.JSONObject jSONObject = a17 != null ? a17.f224980d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppScreenshotShareProvider", "getGameCenterExtraData: pageId=" + longValue + ", extraData=" + jSONObject);
        return jSONObject;
    }

    @Override // qj5.q
    public qj5.p h() {
        long longValue = ((java.lang.Number) this.f534255a.mo152xb9724478()).longValue();
        if (longValue < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppScreenshotShareProvider", "bizConfig: invalid pageId=" + longValue);
            return new qj5.p();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q a17 = x93.c.a(longValue);
        qj5.p pVar = new qj5.p();
        pVar.f445528a = a17 != null ? a17.f224977a : false;
        pVar.f445529b = a17 != null ? a17.f224978b : false;
        pVar.f445530c = a17 != null ? a17.f224979c : false;
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return 8;
    }
}
