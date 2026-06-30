package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class l implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public int f262714a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f262715b = "";

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 f262716c;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02) {
        this.f262716c = activityC19168xd4c44a02;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public int a() {
        return 1563;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public com.p314xaae8f345.mm.p944x882e457a.m1 b() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = this.f262716c.f262619h;
        this.f262714a = c19761xc2874b62.C;
        ot4.a aVar = new ot4.a(c19761xc2874b62.f273662d, c19761xc2874b62.f273665g, c19761xc2874b62.f273666h, c19761xc2874b62.f273667i, c19761xc2874b62.f273671p, c19761xc2874b62.f273664f, c19761xc2874b62.f273673r, c19761xc2874b62.f273674s, c19761xc2874b62.f273677v, null);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(aVar);
        return aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public java.lang.String c() {
        return this.f262715b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    /* renamed from: onSceneEnd */
    public void mo73991x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262716c;
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ot4.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: gen prepay failed! errType: %d, errCode: %d, errmsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            db5.e1.u(activityC19168xd4c44a02, str, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.m(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.n(this));
            return;
        }
        ot4.a aVar = (ot4.a) m1Var;
        java.lang.String str2 = aVar.f430399f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: gen prepay success! url is: %s", str2);
        this.f262715b = str2;
        r45.x57 Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(str2);
        if (Di != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Di.f471336d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "start hk native cashier");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("attach", Di.f471336d);
            bundle.putInt("cashierType", Di.f471339g);
            ((h45.q) i95.n0.c(h45.q.class)).mo24769x9a395b41(activityC19168xd4c44a02.mo55332x76847179(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.wallet_index.ui.l$$a
                @Override // h45.k
                public final void a(int i19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.l.this;
                    lVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i19));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("is_from_native", "1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a022 = lVar.f262716c;
                    if (i19 == 1) {
                        activityC19168xd4c44a022.setResult(-1, intent);
                    } else if (i19 == -1 || i19 == -2) {
                        activityC19168xd4c44a022.setResult(0, intent);
                    }
                    activityC19168xd4c44a022.finish();
                }
            });
            return;
        }
        java.lang.String str3 = aVar.f430400g;
        if (this.f262714a == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("url", str2);
            intent.putExtra("jsInjectCode", str3);
            activityC19168xd4c44a02.setResult(-1, intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str2);
            intent2.putExtra("showShare", true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                intent2.putExtra("shouldForceViewPort", true);
                intent2.putExtra("view_port_code", str3);
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19168xd4c44a02.mo55332x76847179(), intent2);
            activityC19168xd4c44a02.setResult(-1);
        }
        activityC19168xd4c44a02.finish();
    }
}
