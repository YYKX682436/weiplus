package z43;

/* loaded from: classes8.dex */
public class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String appId = jSONObject.optString("appId");
        java.lang.String optString = jSONObject.optString("actId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appId) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("appId or actId is null");
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        android.content.Context context = c();
        z43.m0 m0Var = new z43.m0(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.l lVar2 = new c02.l();
        lVar2.f119138d = appId;
        lVar.f152197a = lVar2;
        lVar.f152198b = new c02.m();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f152200d = 4786;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), new k02.q(m0Var, context, optString, appId, 1));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
