package k91;

/* loaded from: classes7.dex */
public class c6 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11833x97996a40 f387093d;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11833x97996a40 c11833x97996a40) {
        this.f387093d = c11833x97996a40;
        put("originalRedirectUrl", c11833x97996a40.f159044t);
        put("appServiceType", java.lang.Integer.valueOf(c11833x97996a40.f159037m));
        put("originalFlag", java.lang.Integer.valueOf(c11833x97996a40.f159043s));
        try {
            put("gameIconFlagList", new org.json.JSONArray(c11833x97996a40.f159045u));
            put("tagsInfo", new org.json.JSONObject(c11833x97996a40.f159046v));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaProfileAttributes", "gameIconFlagList Failed to parse JSON: ${e.message}");
        }
        put("relievedBuyFlag", java.lang.Integer.valueOf(this.f387093d.f159039o));
        put("flagshipFlag", java.lang.Integer.valueOf(this.f387093d.f159040p));
        put("brandOfficialFlag", java.lang.Integer.valueOf(this.f387093d.f159041q));
        put("showFinancialLicenseFlag", java.lang.Integer.valueOf(this.f387093d.f159042r));
        put("certificationImageType", java.lang.Integer.valueOf(this.f387093d.A));
    }
}
