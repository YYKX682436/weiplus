package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverImageEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout */
/* loaded from: classes10.dex */
public final class C17854xcf9566e3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17008x93d612ef {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f245524n = 0;

    /* renamed from: i, reason: collision with root package name */
    public final y94.a0 f245525i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f245526m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17854xcf9566e3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(pc4.d.f434943a.y() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570232e43 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570231a36, (android.view.ViewGroup) this, true);
        yt3.e eVar = new yt3.e(this, "back-plugin");
        ju3.c0 c0Var = ju3.c0.C;
        eVar.z(com.p314xaae8f345.mm.R.id.ckq, c0Var);
        new yt3.e(this, "back-plugin").z(com.p314xaae8f345.mm.R.id.n7h, c0Var);
        new yt3.e(this, "finish-plugin").z(com.p314xaae8f345.mm.R.id.f565499cl0, ju3.c0.B1);
        new yt3.e(this, "reset-plugin").z(com.p314xaae8f345.mm.R.id.v8n, ju3.c0.U1);
        this.f245525i = new y94.a0(this);
        this.f245526m = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLogic", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.f245526m = configProvider.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLogic", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r11 != 165) goto L19;
     */
    @Override // ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r12 = "statusChange"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r12, r0)
            java.lang.String r1 = "status"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r1)
            int r11 = r11.ordinal()
            r1 = 32
            if (r11 == r1) goto L68
            r1 = 65
            r2 = 0
            java.lang.String r3 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin"
            y94.a0 r4 = r10.f245525i
            if (r11 == r1) goto L4e
            r1 = 88
            if (r11 == r1) goto L28
            r1 = 165(0xa5, float:2.31E-43)
            if (r11 == r1) goto L68
            goto L7f
        L28:
            r4.getClass()
            java.lang.String r11 = "resetToInitial"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r3)
            bn5.f r1 = r4.f541885w
            boolean r5 = r1 instanceof bn5.l
            if (r5 == 0) goto L3a
            r2 = r1
            bn5.l r2 = (bn5.l) r2
        L3a:
            if (r2 == 0) goto L46
            android.graphics.Matrix r1 = r2.f104474e
            android.graphics.Matrix r5 = r2.f104475f
            r1.set(r5)
            r2.invalidate()
        L46:
            r1 = 0
            r4.L(r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r3)
            goto L7f
        L4e:
            r4.getClass()
            java.lang.String r11 = "isExportIng"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r3)
            r5 = 0
            r6 = 0
            x94.c r7 = new x94.c
            r7.<init>(r10, r2)
            r8 = 3
            r9 = 0
            r4 = r10
            p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
            goto L7f
        L68:
            java.lang.String r11 = "finishPageWithCancel"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r0)
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            com.tencent.mm.plugin.recordvideo.activity.MMRecordUI r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) r1
            r1.Z6()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r0)
        L7f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.C17854xcf9566e3.w(ju3.c0, android.os.Bundle):void");
    }
}
