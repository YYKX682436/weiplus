package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

@db5.a(m123858x6ac9171 = 7)
@com.p314xaae8f345.mm.ui.a2
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI */
/* loaded from: classes.dex */
public class ActivityC16239xc81f635b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f225852d = 0;

    public final void T6(final int i17, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("preview_page_save_md5");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "doEmojiPreviewPageSaveError, md5 == null");
            return;
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class))).wi(this, stringExtra, intent.getStringExtra("preview_page_save_emojiInfoBuf"), intent.getIntExtra("preview_page_save_emotionScene", 47), 1, intent.getBooleanExtra("preview_page_save_disableAutoShowSucToast", false))) {
            m78545xde66c1f2(new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$g
                @Override // com.p314xaae8f345.mm.ui.xc
                /* renamed from: mmOnActivityResult */
                public final void mo9729x757c998b(int i18, int i19, android.content.Intent intent2) {
                    int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.f225852d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.this;
                    activityC16239xc81f635b.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    java.util.HashMap hashMap = m93.j.R;
                    int i28 = i17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i28));
                    if (pVar != null) {
                        pVar.l(i18, i19, intent2);
                        hashMap.remove(java.lang.Integer.valueOf(i28));
                    }
                    activityC16239xc81f635b.finish();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U6(final int i17, java.util.HashMap hashMap) {
        gd5.a aVar;
        com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$a
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public final void mo9729x757c998b(int i18, int i19, android.content.Intent intent) {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.f225852d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.this;
                activityC16239xc81f635b.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startAppActivityForResult %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                m93.j.d(i17, i18, i19, intent);
                activityC16239xc81f635b.finish();
            }
        };
        boolean containsKey = hashMap.containsKey("is_game_card");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "start SelectConversationUI");
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f415651b = 1;
        rVar.f415652c = daVar;
        if (getIntent().getIntExtra("Select_Conv_Type", 0) == 259) {
            rVar.f415659j = false;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(mo55332x76847179(), rVar);
            return;
        }
        rVar.f415650a = true;
        n13.v vVar = n13.v.f415673a;
        if (containsKey) {
            java.lang.String str = hashMap.get("nickname") == null ? "" : (java.lang.String) hashMap.get("nickname");
            java.lang.String str2 = hashMap.get("card_desc") == null ? "" : (java.lang.String) hashMap.get("card_desc");
            java.lang.String str3 = hashMap.get("url") == null ? "" : (java.lang.String) hashMap.get("url");
            java.lang.String str4 = hashMap.get("card_image_url") == null ? "" : (java.lang.String) hashMap.get("card_image_url");
            java.lang.String str5 = hashMap.get("card_tail") == null ? "" : (java.lang.String) hashMap.get("card_tail");
            qc5.a aVar2 = new qc5.a();
            aVar2.k(vVar.c(str4, str2, str, str5, str3, hashMap));
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(mo55332x76847179(), aVar2, rVar);
            return;
        }
        java.lang.String str6 = hashMap.get("isWeb") == null ? "" : (java.lang.String) hashMap.get("isWeb");
        boolean equals = "true".equals(hashMap.getOrDefault("isText", ""));
        if (str6.equals("true")) {
            se5.a aVar3 = new se5.a();
            hashMap.put("appId", hashMap.get("srcId") != null ? (java.lang.String) hashMap.get("srcId") : "");
            aVar3.l(vVar.e(hashMap));
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(mo55332x76847179(), aVar3, rVar);
            return;
        }
        if (equals) {
            ne5.a aVar4 = new ne5.a();
            aVar4.n((java.lang.String) hashMap.getOrDefault(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, ""));
            aVar = aVar4;
        } else {
            gd5.a aVar5 = new gd5.a();
            aVar5.k(vVar.d(hashMap));
            aVar = aVar5;
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(mo55332x76847179(), aVar, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6(final int i17, java.lang.String str, java.util.HashMap hashMap) {
        gd5.a aVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$e
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
            public final void a(boolean z17, java.lang.String str2, int i18) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.f225852d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.this;
                activityC16239xc81f635b.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", activityC16239xc81f635b.getIntent().getStringExtra("Select_Conv_User"));
                intent.putExtra("custom_send_text", str2);
                m93.j.d(i17, 1, z17 ? -1 : 0, intent);
                activityC16239xc81f635b.finish();
            }
        };
        android.content.DialogInterface.OnDismissListener onDismissListener = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.f225852d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.this;
                activityC16239xc81f635b.getClass();
                m93.j.d(i17, 1, 0, new android.content.Intent());
                activityC16239xc81f635b.finish();
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        if ("true".equals(hashMap.getOrDefault("isText", ""))) {
            ne5.a aVar2 = new ne5.a();
            aVar2.n((java.lang.String) hashMap.getOrDefault(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, ""));
            aVar = aVar2;
        } else {
            gd5.a aVar3 = new gd5.a();
            aVar3.k(n13.v.f415673a.d(hashMap));
            aVar = aVar3;
        }
        n13.t tVar = new n13.t();
        tVar.f415666a = jVar;
        tVar.f415669d = onDismissListener;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(mo55332x76847179(), aVar, str, tVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 3224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
    }
}
