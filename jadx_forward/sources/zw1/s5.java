package zw1;

/* loaded from: classes15.dex */
public class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f558328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558330d;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, int i17, ww1.b3 b3Var) {
        this.f558330d = activityC13149x63b02cb3;
        this.f558327a = a3Var;
        this.f558328b = i17;
        this.f558329c = b3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiF2fShortTermQrcode cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558330d;
        if (activityC13149x63b02cb3.isFinishing() || activityC13149x63b02cb3.isDestroyed() || (fVar = fVar2.f152151d) == null) {
            return null;
        }
        ww1.a3 a3Var = this.f558327a;
        if (a3Var.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "has show error");
            return null;
        }
        a3Var.C = true;
        int i17 = fVar2.f152148a;
        ww1.b3 b3Var = this.f558329c;
        if (i17 == 0 && fVar2.f152149b == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((r45.nw) fVar).f463234f);
            r45.nw nwVar = (r45.nw) fVar2.f152151d;
            java.lang.String str = nwVar.f463232d;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(nwVar.f463235g);
            r45.nw nwVar2 = (r45.nw) fVar2.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "resp qrcode_type:%s，url：%s,fixed_fee :%s，fixed_desc:%s，payer_desc_placeholder：%s", valueOf, str, valueOf2, nwVar2.f463236h, nwVar2.f463238m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb32 = this.f558330d;
            r45.nw nwVar3 = (r45.nw) fVar2.f152151d;
            double d17 = nwVar3.f463235g;
            java.lang.String str2 = nwVar3.f463236h;
            boolean z17 = nwVar3.f463237i;
            java.lang.String str3 = nwVar3.f463238m;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
            boolean w76 = activityC13149x63b02cb32.w7(d17, str2, z17, str3);
            r45.nw nwVar4 = (r45.nw) fVar2.f152151d;
            if (nwVar4.f463234f == 2 || w76) {
                a3Var.f531632i = nwVar4.f463232d;
                a3Var.f531639p = nwVar4.f463233e;
                a3Var.f531634k = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + ((r45.nw) fVar2.f152151d).f463235g, "100", 2, java.math.RoundingMode.HALF_UP);
                r45.nw nwVar5 = (r45.nw) fVar2.f152151d;
                a3Var.f531636m = nwVar5.f463236h;
                a3Var.f531637n = nwVar5.f463238m;
                a3Var.f531638o = nwVar5.f463237i;
                a3Var.E = java.lang.System.currentTimeMillis();
            } else {
                a3Var.f531621a = nwVar4.f463232d;
                a3Var.f531627d = nwVar4.f463233e;
                a3Var.D = java.lang.System.currentTimeMillis();
                activityC13149x63b02cb3.D7(a3Var);
            }
            int i19 = this.f558328b;
            activityC13149x63b02cb3.B7(i19);
            activityC13149x63b02cb3.O7(i19);
            ww1.y2.d(b3Var);
        } else {
            ww1.y2.e(b3Var, a3Var, fVar2.f152150c, activityC13149x63b02cb3.mo55332x76847179());
        }
        return java.lang.Boolean.TRUE;
    }
}
