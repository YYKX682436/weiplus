package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f168232d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f168232d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f168232d;
        java.lang.String str2 = bVar.mo32091x9a3f0ba2().u0().f128811x;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        android.content.Intent putExtra = new android.content.Intent(bVar.getF229340d(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.class).putExtra("key_username", str2);
        try {
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(bVar.mo48798x74292566()).u0().f128809v;
            if (str3 != null) {
                str = str3;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMenuHeaderDataHelper", "openSetting, get runtime by %s, e = %s", bVar.mo48798x74292566(), e17);
        }
        putExtra.putExtra("key_app_session_id", str);
        putExtra.putExtra("key_app_authorize_profile", true);
        j45.l.j(bVar.getF229340d(), "appbrand", ".ui.AppBrandAuthorizeUI", putExtra, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(bVar.mo48798x74292566(), bVar.X1(), 34, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
