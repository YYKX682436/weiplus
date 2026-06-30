package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f250067a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f250068b;

    /* renamed from: c, reason: collision with root package name */
    public int f250069c;

    /* renamed from: d, reason: collision with root package name */
    public int f250070d;

    /* renamed from: e, reason: collision with root package name */
    public int f250071e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f250072f;

    /* renamed from: g, reason: collision with root package name */
    public fl5.i f250073g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba f250074h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf f250075i;

    public hu(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250067a = context;
        this.f250068b = "MicroMsg.SnsUpload.InputScrollHelper";
        this.f250071e = -1;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iu a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar, int i17, android.text.Layout layout, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = huVar.f250075i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iu iuVar = null;
        java.lang.String str = huVar.f250068b;
        if (abstractC18397x5bc42bbf == null || huVar.f250073g == null || huVar.f250074h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "buildScrollCursorTask: view null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else if (layout == null || layout.getLineCount() < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "buildScrollCursorTask: editTextLayout error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else {
            int lineForOffset = layout.getLineForOffset(i17);
            int lineTop = layout.getLineTop(lineForOffset);
            int lineBottom = layout.getLineBottom(lineForOffset);
            if (i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf2 = huVar.f250075i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC18397x5bc42bbf2);
                java.lang.Boolean a17 = abstractC18397x5bc42bbf2.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "isFooterBarLayOnPageBottom(...)");
                if (a17.booleanValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf3 = huVar.f250075i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC18397x5bc42bbf3);
                    i18 -= abstractC18397x5bc42bbf3.m71209x9918f4e4();
                }
            }
            if (huVar.f250069c == 0) {
                fl5.i iVar = huVar.f250073g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                android.view.View j17 = iVar.j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "view(...)");
                huVar.f250069c = pm0.v.r(j17).top;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba c18153xb2f8a3ba = huVar.f250074h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18153xb2f8a3ba);
            int scrollY = c18153xb2f8a3ba.getScrollY();
            int i19 = huVar.f250069c;
            int i27 = (lineTop + i19) - scrollY;
            huVar.f250071e = i27;
            if (i27 > i19) {
                huVar.f250071e = (lineBottom + i19) - scrollY;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iu iuVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iu(huVar.f250071e, i19, huVar.f250070d, huVar.f250074h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            iuVar2.f250976e = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            iuVar = iuVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return iuVar;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iu iuVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        if (iuVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            boolean z17 = iuVar.f250980i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(huVar.f250068b, "do UpdateCursorScrollTask");
                iuVar.run();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
    }

    public static final /* synthetic */ java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        java.lang.String str = huVar.f250068b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return str;
    }
}
