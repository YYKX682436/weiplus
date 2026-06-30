package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsSpringUploadUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsUploadUI;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI */
/* loaded from: classes4.dex */
public final class ActivityC18112x849f7cfa extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd {

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.String f248951y1 = "MicroMsg.SnsSpringUploadUI";

    public ActivityC18112x849f7cfa() {
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pq(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        android.content.Intent m81196xcc238d5d = m81196xcc238d5d();
        if (m81196xcc238d5d == null) {
            m81196xcc238d5d = new android.content.Intent();
        }
        m81196xcc238d5d.putExtra("is_spring", this.G);
        setResult(m81195xcc234ba0(), m81196xcc238d5d);
        super.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd
    public void g7(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.g7(bundle);
        getIntent().putExtra("is_spring", true);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.otq);
        if (relativeLayout != null) {
            relativeLayout.setClipChildren(false);
            relativeLayout.setClipToPadding(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) r6).f() == false) goto L10;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.String r0 = "onActivityResult"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            super.onActivityResult(r6, r7, r8)
            com.tencent.mm.plugin.sns.ui.z4 r6 = r5.f249069u
            boolean r7 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7
            r8 = 0
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView"
            if (r7 != 0) goto L44
            boolean r7 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6
            if (r7 == 0) goto L27
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.NewSightWidget"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r6, r7)
            com.tencent.mm.plugin.sns.ui.i6 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) r6
            boolean r6 = r6.f()
            if (r6 != 0) goto L27
            goto L44
        L27:
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r6 = r5.f249062p
            r6.getClass()
            java.lang.String r7 = "setSyncGone"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r2)
            android.widget.ImageView r3 = r6.f249040d
            r4 = 8
            r3.setVisibility(r4)
            android.widget.ImageView r3 = r6.f249041e
            r3.setVisibility(r4)
            r6.f249045i = r8
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r2)
            goto L5f
        L44:
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r6 = r5.f249062p
            r6.getClass()
            java.lang.String r7 = "showQzone"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r2)
            boolean r3 = r6.f249042f
            if (r3 == 0) goto L5c
            boolean r3 = r6.f249043g
            if (r3 == 0) goto L5c
            android.widget.ImageView r6 = r6.f249040d
            r6.setVisibility(r8)
        L5c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r2)
        L5f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18112x849f7cfa.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.onCreate(bundle);
        this.f249054f.mo81552xeb238c3a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qq(this));
        android.content.Intent intent = getIntent();
        xa4.h[] hVarArr = xa4.h.f534370d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248951y1, "onCreate: springFeedType=" + intent.getIntExtra("spring_feed_type", 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd
    public void q7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        m78501x43e00957(t7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMTitle */
    public void mo56583xbf7c1df6(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        xa4.g gVar = xa4.g.f534363d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        super.mo54450xbf7c1df6(gVar.m(mo55332x76847179));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    public final boolean t7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCurrentEnableSend", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        boolean z17 = true;
        boolean z18 = z4Var != null && z4Var.f();
        java.lang.String obj = this.f249054f.getText().toString();
        boolean o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y6.o(obj);
        obj.length();
        if (!z18 && !o17) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCurrentEnableSend", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMTitle */
    public void mo54450xbf7c1df6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        xa4.g gVar = xa4.g.f534363d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        super.mo54450xbf7c1df6(gVar.m(mo55332x76847179));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }
}
