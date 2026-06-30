package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class j8 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f162861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m8 f162863f;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m8 m8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17) {
        this.f162863f = m8Var;
        this.f162861d = yVar;
        this.f162862e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m8 m8Var = this.f162863f;
        int i17 = this.f162862e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f162861d;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，data == null");
            yVar.a(i17, m8Var.o("fail"));
        } else {
            java.lang.String string = bundle.getString("errMsg", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，result ：%s", string);
            yVar.a(i17, m8Var.o(string));
        }
    }
}
