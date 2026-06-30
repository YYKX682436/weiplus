package ss4;

/* loaded from: classes8.dex */
public class r extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public r() {
        m83032xb4c13117(new java.util.HashMap());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return ss4.p0.f493657a.a(ss4.n0.f493640f, 1631);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1631;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return ss4.p0.f493657a.b(ss4.n0.f493640f, "/cgi-bin/mmpay-bin/tenpay/queryuserwallet");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueryUserWallet", "errCode is : " + i17);
        if (i17 == 0) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().f324774d.A("WalletKindInfo", "delete from WalletKindInfo");
            if (jSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueryUserWallet", "resp json " + jSONObject.toString());
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("UserWalletInfoList");
            if (optJSONArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
                return;
            }
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                at4.j1 j1Var = null;
                if (optJSONObject == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletKindInfo", "json is null");
                } else {
                    at4.j1 j1Var2 = new at4.j1();
                    j1Var2.f66182x601e0edb = optJSONObject.optString("wallet_tpa_country");
                    j1Var2.f66180x3bf5cb4c = optJSONObject.optString("wallet_name");
                    j1Var2.f66181x43bffadc = optJSONObject.optInt("wallet_selected");
                    j1Var2.f66184x3bf8dffb = optJSONObject.optInt("wallet_type");
                    j1Var2.f66179x257bda7b = optJSONObject.optInt("wallet_balance");
                    j1Var2.f66183x619dc1d0 = optJSONObject.optInt("wallet_tpa_country_mask");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j1Var2.f66182x601e0edb)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
                    } else {
                        j1Var = j1Var2;
                    }
                }
                if (j1Var != null) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().mo880xb970c2b9(j1Var);
                }
            }
        }
    }
}
