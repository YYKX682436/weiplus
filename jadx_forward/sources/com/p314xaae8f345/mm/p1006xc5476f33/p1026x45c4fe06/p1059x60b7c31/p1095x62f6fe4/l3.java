package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class l3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3 f163447c;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3 z3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163447c = z3Var;
        this.f163445a = lVar;
        this.f163446b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3.f163699h = false;
        if (c12163xa32fed7c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult result is null");
            this.f163445a.a(this.f163446b, this.f163447c.o("fail"));
            return;
        }
        int i17 = c12163xa32fed7c.f163180d;
        if (i17 != -1) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult");
                this.f163445a.a(this.f163446b, this.f163447c.o("fail"));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
                this.f163445a.a(this.f163446b, this.f163447c.o("fail:cancel"));
                return;
            }
        }
        java.lang.String str = c12163xa32fed7c.f163181e;
        try {
            jSONArray = new org.json.JSONArray(c12163xa32fed7c.f163182f);
        } catch (org.json.JSONException unused) {
            jSONArray = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parse:%s err", null);
        }
        if (jSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult localIds is null");
            this.f163445a.a(this.f163446b, this.f163447c.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", str);
        hashMap.put("tempFiles", jSONArray);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia ok, type:%s, localIds:%s", str, jSONArray);
        this.f163445a.a(this.f163446b, this.f163447c.p("ok", hashMap));
    }
}
