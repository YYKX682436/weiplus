package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f163788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.p0 f163789b;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.p0 p0Var, km5.b bVar) {
        this.f163789b = p0Var;
        this.f163788a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        km5.b bVar = this.f163788a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.p0 p0Var = this.f163789b;
        if (c11809xbc286be4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniProgramNavigatorWC", "onPreInitTaskResult, from(appId:%s, callbackId:%d) get null initConfig for to(appId:%s)", p0Var.f163790a.mo48798x74292566(), java.lang.Integer.valueOf(p0Var.f163792c.f163737a), p0Var.f163791b.f166435e);
            bVar.c(null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorWC", "onPreInitTaskResult, from(appId:%s, callbackId:%d) to(appId:%s) get initConfig:%s", p0Var.f163790a.mo48798x74292566(), java.lang.Integer.valueOf(p0Var.f163792c.f163737a), p0Var.f163791b.f166435e, c11809xbc286be4);
        java.lang.String optString = p0Var.f163793d.optString("adUxInfo", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (c11809xbc286be4.V == null) {
                c11809xbc286be4.V = new android.os.PersistableBundle();
            }
            c11809xbc286be4.V.putString("adUxInfo", optString);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = p0Var.f163791b;
            c11809xbc286be4.H1 = c12362x460991bc.V;
            c11809xbc286be4.I1 = c12362x460991bc.W;
            c11809xbc286be4.J1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) p0Var.f163790a.t3()).u0().J1;
        }
        bVar.c(c11809xbc286be4);
    }
}
