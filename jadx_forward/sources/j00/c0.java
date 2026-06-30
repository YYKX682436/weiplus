package j00;

/* loaded from: classes.dex */
public final class c0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f378260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378261e;

    public c0(j00.d0 d0Var, yz5.l lVar) {
        this.f378260d = d0Var;
        this.f378261e = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374 c23633x64df374;
        if (i17 == this.f378260d.f378274e && i18 == -1) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            org.json.JSONObject wi6 = ((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).wi(intent);
            if (wi6 == null) {
                c23633x64df374 = null;
            } else {
                java.lang.String optString = wi6.optString("nationalCode");
                java.lang.String optString2 = wi6.optString("userName");
                java.lang.String optString3 = wi6.optString("telNumber");
                java.lang.String optString4 = wi6.optString("addressPostalCode");
                java.lang.String optString5 = wi6.optString("proviceFirstStageName");
                java.lang.String optString6 = wi6.optString("addressCitySecondStageName");
                java.lang.String optString7 = wi6.optString("addressCountiesThirdStageName");
                java.lang.String optString8 = wi6.optString("addressDetailInfo");
                java.lang.String optString9 = wi6.optString("addressID");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
                c23633x64df374 = new com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374(optString2, optString4, optString, optString3, optString5, optString6, optString7, null, optString8, null, java.lang.Long.valueOf(java.lang.Long.parseLong(optString9)), null, 2688, null);
            }
            this.f378261e.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c23633x64df374)));
        }
    }
}
