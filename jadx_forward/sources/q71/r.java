package q71;

/* loaded from: classes15.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441896d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441897e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pu5 f441898f;

    public r(i83.b bVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ou5();
        lVar.f152198b = new r45.pu5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
        lVar.f152200d = bb1.d.f4183x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441897e = a17;
        r45.ou5 ou5Var = (r45.ou5) a17.f152243a.f152217a;
        ou5Var.f464064f = 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("{\"user_uin\":" + c01.d9.b().C() + " ,\"user_data_list\": [");
        if (bVar.f371168e.equals("0")) {
            sb6.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f371167d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f371168e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f371169f + "\"},{\"key\": \"tax_number\",\"value\": \"" + bVar.f371171h + "\"},{\"key\": \"bank_number\",\"value\": \"" + bVar.f371172i + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f371175o + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + bVar.f371178r + "\"},{\"key\": \"bank_name\",\"value\": \"" + bVar.f371173m + "\"}]}}");
        } else {
            sb6.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f371167d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f371168e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f371170g + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f371176p + "\"},{\"key\": \"email\",\"value\": \"" + bVar.f371177q + "\"}]}}");
        }
        sb6.append("]}");
        ou5Var.f464063e = sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441896d = u0Var;
        return mo9409x10f9447a(sVar, this.f441897e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return bb1.d.f4183x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        if (i18 == 0 && i19 == 0) {
            r45.pu5 pu5Var = (r45.pu5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            this.f441898f = pu5Var;
            if (pu5Var != null && (linkedList = pu5Var.f464944d) != null && linkedList.size() > 0 && this.f441898f.f464944d.get(0) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + ((r45.bu3) this.f441898f.f464944d.get(0)).f452598e);
            }
        }
        this.f441896d.mo815x76e0bfae(i18, i19, str, this);
    }
}
