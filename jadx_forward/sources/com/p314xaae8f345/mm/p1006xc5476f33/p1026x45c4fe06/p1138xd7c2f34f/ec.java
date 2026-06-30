package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166134a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.dc f166135b;

    public ec(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.dc dcVar) {
        this.f166134a = str;
        this.f166135b = dcVar;
    }

    public static com.p314xaae8f345.mm.p944x882e457a.o a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.h00 h00Var = new r45.h00();
        h00Var.f457233d = str;
        h00Var.f457234e = str2;
        h00Var.f457235f = str3;
        lVar.f152197a = h00Var;
        lVar.f152198b = new r45.i00();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
        lVar.f152200d = 1124;
        return lVar.a();
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.dc dcVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12388x6b16229 c12388x6b16229;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x0 x0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p0 p0Var;
        boolean k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(this.f166134a, i17, str, str2, 0L, 0L);
        if (k17) {
            java.lang.String str3 = this.f166134a;
            ri1.g.a(str3, i17);
            ((gk1.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(gk1.g.class)).y0(str3, i17, gk1.d.f353994a);
        }
        if (!k17 || (dcVar = this.f166135b) == null || (p0Var = (x0Var = (c12388x6b16229 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12388x6b16229) dcVar).f166890a).f166570e) == null) {
            return;
        }
        java.lang.String[] strArr = {null};
        boolean a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1) p0Var).a(strArr);
        boolean[] zArr = c12388x6b16229.f166891b;
        if (!a17) {
            zArr[0] = true;
            return;
        }
        zArr[0] = false;
        java.lang.String str4 = strArr[0];
        iz5.a.d(null, str4);
        if (u46.l.c(x0Var.f166883t, str4)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = x0Var.f166881r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreLaunchProcessWC", "resetInstanceId for username[%s] appId[%s] %s -> %s", c12362x460991bc.f166434d, c12362x460991bc.f166435e, x0Var.f166883t, str4);
        x0Var.f166883t = str4;
    }
}
