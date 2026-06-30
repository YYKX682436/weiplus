package p02;

/* loaded from: classes8.dex */
public class j implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 f431933a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 activityC13238xdcc40f04) {
        this.f431933a = activityC13238xdcc40f04;
    }

    @Override // vl1.n
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 activityC13238xdcc40f04 = this.f431933a;
        java.util.ArrayList arrayList = activityC13238xdcc40f04.f178878d.f178874g2.f431931f;
        p02.l lVar = (arrayList == null || i17 < 0 || i17 >= arrayList.size()) ? null : (p02.l) arrayList.get(i17);
        if (lVar == null) {
            return;
        }
        int i18 = lVar.f431936a;
        if (i18 != 2) {
            if (i18 == 3) {
                activityC13238xdcc40f04.f178878d.l1(activityC13238xdcc40f04.f178881g.g());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f431944i)) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("rawUrl", lVar.f431944i);
                    ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(activityC13238xdcc40f04.mo55332x76847179(), bundle);
                }
                o02.a.b(13, 1303, lVar.f431945j, 40, lVar.f431939d, "", "");
                return;
            }
            return;
        }
        activityC13238xdcc40f04.f178878d.l1(lVar.f431937b);
        activityC13238xdcc40f04.f178881g.r(lVar.f431937b);
        int i19 = lVar.f431945j;
        java.lang.String str2 = lVar.f431937b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("search_key_word", str2);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = "";
        }
        o02.a.b(13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.v.f34316x366c91de, i19, 2, "", "", str);
    }
}
