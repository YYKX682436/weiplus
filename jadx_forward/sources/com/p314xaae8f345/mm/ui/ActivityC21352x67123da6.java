package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.CheckSmsCanAddCardUI */
/* loaded from: classes5.dex */
public class ActivityC21352x67123da6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278162d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f278163e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmq;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.m78531x8f8cf1fb()
            boolean r6 = c01.d9.h()
            if (r6 == 0) goto Lb5
            boolean r6 = gm0.m.r()
            if (r6 == 0) goto L14
            goto Lb5
        L14:
            android.content.Intent r6 = r5.getIntent()
            android.net.Uri r6 = r6.getData()
            r0 = 1
            java.lang.String r1 = "MicroMsg.CheckSmsCanAddCardUI"
            r2 = 0
            if (r6 == 0) goto L59
            java.lang.String r3 = r6.getHost()
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r4 != 0) goto L50
            java.lang.String r4 = "cardpackage"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L35
            goto L50
        L35:
            java.lang.String r3 = "encrystr"
            java.lang.String r6 = r6.getQueryParameter(r3)
            r5.f278162d = r6
            java.lang.String r3 = "encryptCardInfo = %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r6)
            java.lang.String r6 = r5.f278162d
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r6 != 0) goto L59
            r6 = r0
            goto L5a
        L50:
            java.lang.String r6 = "err host, host = %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6, r3)
        L59:
            r6 = r2
        L5a:
            if (r6 == 0) goto La0
            com.tencent.mm.modelbase.r1 r6 = c01.d9.e()
            r0 = 1038(0x40e, float:1.455E-42)
            r6.a(r0, r5)
            com.tencent.mm.modelbase.l r6 = new com.tencent.mm.modelbase.l
            r6.<init>()
            r45.j20 r3 = new r45.j20
            r3.<init>()
            r6.f152197a = r3
            r45.k20 r3 = new r45.k20
            r3.<init>()
            r6.f152198b = r3
            r6.f152200d = r0
            java.lang.String r0 = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard"
            r6.f152199c = r0
            com.tencent.mm.modelbase.o r6 = r6.a()
            r5.f278163e = r6
            com.tencent.mm.modelbase.m r6 = r6.f152243a
            com.tencent.mm.protobuf.f r6 = r6.f152217a
            r45.j20 r6 = (r45.j20) r6
            java.lang.String r0 = r5.f278162d
            r6.f459041d = r0
            java.lang.String r6 = "encry value is %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6, r0)
            com.tencent.mm.modelbase.o r6 = r5.f278163e
            r0 = 0
            com.p314xaae8f345.mm.p944x882e457a.z2.d(r6, r0, r2)
            r5.f278163e = r6
            goto Lb4
        La0:
            r6 = 2131778564(0x7f105c04, float:1.918866E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r6 = dp.a.m125854x26a183b(r5, r6, r0)
            r6.show()
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.n7(r5)
            r5.finish()
        Lb4:
            return
        Lb5:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class
            r6.<init>(r5, r0)
            android.content.Intent r0 = r5.getIntent()
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(r5, r6, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21352x67123da6.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(1038, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574969k62), 1).show();
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.n7(this);
            finish();
            return;
        }
        r45.k20 k20Var = (r45.k20) this.f278163e.f152244b.f152233a;
        java.lang.String str2 = k20Var.f459856d;
        java.lang.String str3 = k20Var.f459857e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", str2, str3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_card_id", str2);
        intent.putExtra("key_card_ext", str3);
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_is_sms_add_card", true);
        j45.l.k(this, "card", ".ui.CardDetailUI", intent, false);
        finish();
    }
}
