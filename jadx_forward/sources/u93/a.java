package u93;

/* loaded from: classes5.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiChatRoomAtMember", "Invoke chatRoomAtMember");
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatRoomName");
        java.lang.String optString2 = jSONObject.optString("userName");
        java.lang.String optString3 = jSONObject.optString("nickName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            this.f224976f.a("invalid_params");
            return;
        }
        s33.j0 j0Var = (s33.j0) ((t33.f) i95.n0.c(t33.f.class));
        j0Var.getClass();
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(optString2, new s33.i0(j0Var, optString2, optString));
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
