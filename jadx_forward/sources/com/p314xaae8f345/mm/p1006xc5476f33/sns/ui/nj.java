package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class nj {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f251547a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f251548b;

    public nj(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f251547a = context;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f251548b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                r45.jj4 jj4Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event = c5234x14788364;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj.this;
                r45.m33 b17 = njVar.b();
                if (((b17 == null || (jj4Var = b17.f461642d) == null) ? null : jj4Var.f459388d) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageTransSheetManager", "changeTransLangListener current item is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsImageTrans_");
                    r45.jj4 jj4Var2 = b17.f461642d;
                    sb6.append(jj4Var2 != null ? jj4Var2.f459388d : null);
                    java.lang.String sb7 = sb6.toString();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("changeTransLangListener, eventSessionId: ");
                    am.z1 z1Var = event.f135568g;
                    sb8.append(z1Var.f90035a);
                    sb8.append(", currentId: ");
                    sb8.append(sb7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", sb8.toString());
                    if (!android.text.TextUtils.equals(sb7, z1Var.f90035a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsImageTransSheetManager", "changeTransLangListener sessionId is no match");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(njVar.a(), null)) {
                        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(b17.f461642d);
                        if (l17 != null) {
                            android.content.Context a17 = njVar.a();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d) a17 : null;
                            if (abstractActivityC18013x6b7f831d != null) {
                                abstractActivityC18013x6b7f831d.Z6(l17);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                return false;
            }
        };
    }

    public final android.content.Context a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        return this.f251547a;
    }

    public final r45.m33 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        android.content.Context context = this.f251547a;
        r45.m33 m33Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d) context : null;
        if (abstractActivityC18013x6b7f831d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = abstractActivityC18013x6b7f831d.f248343o;
            if (c18064xe6e1a3b3 != null) {
                r45.m33 m70754xd9065b83 = c18064xe6e1a3b3.m70754xd9065b83();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                m33Var = m70754xd9065b83;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        return m33Var;
    }
}
