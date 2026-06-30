package q71;

/* loaded from: classes15.dex */
public class m extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441883d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441884e;

    public m() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fq3();
        lVar.f152198b = new r45.gq3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441884e = a17;
        r45.fq3 fq3Var = (r45.fq3) a17.f152243a.f152217a;
        fq3Var.f456081g = 2;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("invoice_info.title");
        linkedList.add("invoice_info.tax_number");
        linkedList.add("invoice_info.bank_number");
        linkedList.add("invoice_info.bank_name");
        linkedList.add("invoice_info.type");
        linkedList.add("invoice_info.email");
        linkedList.add("invoice_info.company_address");
        linkedList.add("invoice_info.company_address_detail");
        linkedList.add("invoice_info.company_address_postcode");
        linkedList.add("invoice_info.phone");
        fq3Var.f456080f = linkedList;
        fq3Var.f456079e = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441883d = u0Var;
        return mo9409x10f9447a(sVar, this.f441884e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        char c17;
        if (i18 == 0 && i19 == 0) {
            p71.a Ai = o71.l.Ai();
            Ai.getClass();
            Ai.f434006a = new i83.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we resetList and parse the json ..");
            r45.gq3 gq3Var = (r45.gq3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "resp json is.." + gq3Var.f457012d);
            if (gq3Var.f457012d != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(gq3Var.f457012d).getJSONArray("user_data_list").getJSONObject(0).getJSONArray("group_info_list");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                            try {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                                i83.b bVar = new i83.b();
                                bVar.f371167d = jSONObject.getInt(ya.b.f77478x4cd4defb);
                                bVar.f371179s = jSONObject.getString("invoice_url");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUserAutoFillInfo", "get groupid:" + jSONObject.getInt(ya.b.f77478x4cd4defb) + "get invoiceUrl:" + jSONObject.getString("invoice_url"));
                                org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("field_list");
                                if (jSONArray2 != null && jSONArray2.length() > 0) {
                                    for (int i28 = 0; i28 < jSONArray2.length(); i28++) {
                                        org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i28);
                                        java.lang.String string = jSONObject2.getString("key");
                                        switch (string.hashCode()) {
                                            case -1787383122:
                                                if (string.equals("bank_name")) {
                                                    c17 = 2;
                                                    break;
                                                }
                                                break;
                                            case -192204195:
                                                if (string.equals("tax_number")) {
                                                    c17 = 1;
                                                    break;
                                                }
                                                break;
                                            case 3575610:
                                                if (string.equals("type")) {
                                                    c17 = 4;
                                                    break;
                                                }
                                                break;
                                            case 96619420:
                                                if (string.equals(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c)) {
                                                    c17 = 5;
                                                    break;
                                                }
                                                break;
                                            case 106642798:
                                                if (string.equals("phone")) {
                                                    c17 = 6;
                                                    break;
                                                }
                                                break;
                                            case 110371416:
                                                if (string.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                                                    c17 = 0;
                                                    break;
                                                }
                                                break;
                                            case 330208940:
                                                if (string.equals("bank_number")) {
                                                    c17 = 3;
                                                    break;
                                                }
                                                break;
                                            case 944498430:
                                                if (string.equals("company_address_detail")) {
                                                    c17 = 7;
                                                    break;
                                                }
                                                break;
                                        }
                                        c17 = 65535;
                                        switch (c17) {
                                            case 0:
                                                bVar.f371169f = jSONObject2.getString("value");
                                                break;
                                            case 1:
                                                bVar.f371171h = jSONObject2.getString("value");
                                                break;
                                            case 2:
                                                bVar.f371173m = jSONObject2.getString("value");
                                                break;
                                            case 3:
                                                bVar.f371172i = jSONObject2.getString("value");
                                                break;
                                            case 4:
                                                bVar.f371168e = jSONObject2.getString("value");
                                                break;
                                            case 5:
                                                bVar.f371177q = jSONObject2.getString("value");
                                                break;
                                            case 6:
                                                bVar.f371175o = jSONObject2.getString("value");
                                                bVar.f371176p = jSONObject2.getString("value");
                                                break;
                                            case 7:
                                                bVar.f371178r = jSONObject2.getString("value");
                                                break;
                                        }
                                    }
                                }
                                o71.l.Ai().a(bVar);
                            } catch (org.json.JSONException unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no." + i27);
                            }
                        }
                    }
                } catch (org.json.JSONException unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
                }
            }
        }
        this.f441883d.mo815x76e0bfae(i18, i19, str, this);
    }
}
