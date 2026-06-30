package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC */
/* loaded from: classes4.dex */
public final class C18209x4de00ecd extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f250192d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f250193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18209x4de00ecd(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f250192d = arrayList;
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737>(m70931x95c7fa5f) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1
            {
                this.f39173x3fe91575 = -545742041;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 c6070x7cbfe737) {
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 event = c6070x7cbfe737;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd c18209x4de00ecd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this;
                if (c18209x4de00ecd.m70938xd35c70d0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    java.lang.String str = event.f136353g.f87939a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "jump to profile page username:" + str);
                    android.content.Intent intent = new android.content.Intent();
                    yc4.b0.f542372a.e(intent, event);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
                    intent.putExtra("Contact_User", str);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, c18209x4de00ecd.m80379x76847179());
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c01.z1.r()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                return z17;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f2 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf>(m70931x95c7fa5f2) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1
            {
                this.f39173x3fe91575 = -1390092593;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf c6069xab724edf) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf event = c6069xab724edf;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd c18209x4de00ecd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this;
                boolean z17 = false;
                if (c18209x4de00ecd.m70938xd35c70d0()) {
                    am.bw bwVar = event.f136352g;
                    long j17 = bwVar.f87825b;
                    java.lang.String str = bwVar.f87824a;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("sns_permission_snsinfo_svr_id", j17);
                    intent.putExtra("sns_permission_userName", str);
                    intent.putExtra("sns_permission_anim", true);
                    intent.putExtra("sns_permission_block_scene", 5);
                    j45.l.n(c18209x4de00ecd.m80379x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                return z17;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f3 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040> abstractC20980x9b9ad01d3 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040>(m70931x95c7fa5f3) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1
            {
                this.f39173x3fe91575 = -1850845616;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 c6071x2b665040) {
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 event = c6071x2b665040;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd c18209x4de00ecd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this;
                boolean z18 = false;
                if (c18209x4de00ecd.m70938xd35c70d0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    am.dw dwVar = event.f136354g;
                    long j17 = dwVar.f88037b;
                    java.lang.String str = dwVar.f88036a;
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String t07 = ca4.z0.t0(j17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
                    ((zy1.f) sVar).Di(12076, "ExposeFeedCount", t07);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "expose id " + j17 + ' ' + str);
                    if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                        bundle.putString("query", "{\"scene\":33}");
                        bundle2.putString("k_username", str);
                        bundle2.putLong("k_expose_msg_id", j17);
                        bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(c18209x4de00ecd.m158354x19263085(), bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w(j17, str, c18209x4de00ecd));
                        z17 = true;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("k_expose_msg_id", j17);
                        intent.putExtra("k_username", str);
                        intent.putExtra("showShare", false);
                        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
                        z17 = true;
                        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                        intent.putExtra("rawUrl", format);
                        j45.l.j(c18209x4de00ecd.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                    z18 = z17;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                return z18;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f4 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8> abstractC20980x9b9ad01d4 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8>(m70931x95c7fa5f4) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1
            {
                this.f39173x3fe91575 = 323618552;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8 c6081xbb9388e8) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8 event = c6081xbb9388e8;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = false;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    am.iw iwVar = event.f136359g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = iwVar.f88511b;
                    android.view.View view = iwVar.f88512c;
                    android.content.Context context = view.getContext();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B;
                    if (k4Var == null) {
                        k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7(1);
                    }
                    int i17 = iwVar.f88510a;
                    if (i17 == 3 || i17 == 4 || i17 == 5) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                    } else if (i17 == 9) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.H(i2Var, context, k4Var);
                    } else if (i17 == 10) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.m(i2Var, context, k4Var);
                    } else if (i17 == 17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.j(i2Var, context, k4Var);
                    } else if (i17 != 26) {
                        if (i17 != 34) {
                            if (i17 == 41) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B(context, i2Var);
                            } else if (i17 != 101) {
                                if (i17 != 22) {
                                    if (i17 == 23) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.l(i2Var, context, k4Var);
                                    } else if (i17 == 55) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.F(context, i2Var);
                                    } else if (i17 == 56) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.i(context, i2Var);
                                    } else if (i17 != 58) {
                                        if (i17 != 59) {
                                            switch (i17) {
                                                case 12:
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.C(context, i2Var, k4Var);
                                                    break;
                                                case 13:
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.d(context, i2Var, k4Var);
                                                    break;
                                                case 14:
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.z(i2Var, context, k4Var);
                                                    break;
                                                default:
                                                    switch (i17) {
                                                        case 28:
                                                            break;
                                                        case 29:
                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.v(context, i2Var);
                                                            break;
                                                        case 30:
                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.L(context, i2Var, k4Var);
                                                            break;
                                                        default:
                                                            switch (i17) {
                                                                case 36:
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.t(context, i2Var);
                                                                    break;
                                                                case 37:
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.q(context, i2Var);
                                                                    break;
                                                                case 38:
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.p(context, i2Var);
                                                                    break;
                                                                case 39:
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.o(context, i2Var);
                                                                    break;
                                                                default:
                                                                    switch (i17) {
                                                                        case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                                                                        case 45:
                                                                            break;
                                                                        case 44:
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.G(context, i2Var);
                                                                            break;
                                                                        case 46:
                                                                        case 51:
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.D(context, i2Var);
                                                                            break;
                                                                        case 47:
                                                                        case 48:
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                                                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                            je4.g.c(context, c19807x593d1720, true);
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                            break;
                                                                        case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 52:
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.M(context, i2Var);
                                                                            break;
                                                                        case 53:
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.s(context, i2Var);
                                                                            break;
                                                                        default:
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.u(context, i2Var);
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.k(i2Var, context, k4Var);
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.n(i2Var, context, k4Var);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.w(context, i2Var);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.r(context, i2Var, null);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.E(context, i2Var);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                return z17;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f5 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc> abstractC20980x9b9ad01d5 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc>(m70931x95c7fa5f5) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1
            {
                this.f39173x3fe91575 = 1192680940;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc c6059xe0ced7dc) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc event = c6059xe0ced7dc;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = false;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "PhotoTimeLineItem click to post finder");
                    am.qv qvVar = event.f136341g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = qvVar.f89281c;
                    int i17 = qvVar.f89279a;
                    android.content.Context context = qvVar.f89280b;
                    wa4.d0 d0Var = wa4.d0.f525748d;
                    boolean z18 = true;
                    if (i17 == 0) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                        java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", c17933xe8d1b226.f38324x142bbdc6);
                        n34.h3 h3Var = n34.h3.f416143d;
                        java.util.ArrayList g17 = h3Var.g(j17);
                        if (g17 == null || !((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).uj()) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                            java.lang.String ContentDesc = m70371x485d7.f39013x4c306a8a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentDesc, "ContentDesc");
                            z17 = h3Var.j(context, ContentDesc, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, j17, true, false);
                        } else {
                            uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("key_maas_entrance", 9);
                            java.lang.String ContentDesc2 = m70371x485d7.f39013x4c306a8a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentDesc2, "ContentDesc");
                            ((ez0.i) hVar).wi(context, intent, new com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb(g17, true, true, true, h3Var.f(ContentDesc2, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, j17)));
                            z17 = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                    } else {
                        if (i17 != 2 && i17 != 1) {
                            z18 = false;
                        }
                        if (z18) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = c17933xe8d1b226.m70371x485d7();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d72, "getTimeLine(...)");
                            java.lang.String str = m70371x485d72.f39013x4c306a8a;
                            java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", c17933xe8d1b226.f38324x142bbdc6);
                            n34.h3 h3Var2 = n34.h3.f416143d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                            h3Var2.i(context, j18, str, c17933xe8d1b226.f68891x29d1292e, c17933xe8d1b226.f38324x142bbdc6, m70371x485d72.f39043xa1529a15, false, false);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                return z17;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f6 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f> abstractC20980x9b9ad01d6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f>(m70931x95c7fa5f6) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1
            {
                this.f39173x3fe91575 = -15715681;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f c6091xb432a48f) {
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f event = c6091xb432a48f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    java.lang.String str = event.f136370g.f89571a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "localId " + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activity;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.class)).m70918xfbcfdfed();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                return z17;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f7 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6107xc5f33a7f> abstractC20980x9b9ad01d7 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6107xc5f33a7f>(m70931x95c7fa5f7) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1
            {
                this.f39173x3fe91575 = 497662095;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6107xc5f33a7f c6107xc5f33a7f) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6107xc5f33a7f event = c6107xc5f33a7f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Bi(12076, "PostFeedCount", 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f8 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6055xc02518e2> abstractC20980x9b9ad01d8 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6055xc02518e2>(m70931x95c7fa5f8) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1
            {
                this.f39173x3fe91575 = 70537970;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6055xc02518e2 c6055xc02518e2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6055xc02518e2 event = c6055xc02518e2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f9 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74> abstractC20980x9b9ad01d9 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74>(m70931x95c7fa5f9) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1
            {
                this.f39173x3fe91575 = -1614598524;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74 c6056xc8ff7c74) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74 event = c6056xc8ff7c74;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f136339g.f89112a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "FavFeedCount", snsId);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f10 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a> abstractC20980x9b9ad01d10 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a>(m70931x95c7fa5f10) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1
            {
                this.f39173x3fe91575 = 26482458;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a event = c6082xbd84dd0a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    am.jw jwVar = event.f136360g;
                    java.lang.String str = jwVar.f88636b;
                    if (jwVar.f88635a) {
                        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        ((zy1.f) sVar).Di(12076, "BlackListFriendCount", str);
                    } else {
                        dy1.s sVar2 = (dy1.s) i95.n0.c(dy1.s.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        ((zy1.f) sVar2).Di(12076, "OutsiderFriendCount", str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f11 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf> abstractC20980x9b9ad01d11 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf>(m70931x95c7fa5f11) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1
            {
                this.f39173x3fe91575 = -1755589409;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf c5744xa2fd12cf) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5744xa2fd12cf event = c5744xa2fd12cf;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "HasNewChatMsgWhenExit", java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f12 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6064x7fcfbd85> abstractC20980x9b9ad01d12 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6064x7fcfbd85>(m70931x95c7fa5f12) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1
            {
                this.f39173x3fe91575 = -374645387;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6064x7fcfbd85 c6064x7fcfbd85) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6064x7fcfbd85 event = c6064x7fcfbd85;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f136346g.f89756a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardFeedIdCount", snsId);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f13 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19> abstractC20980x9b9ad01d13 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19>(m70931x95c7fa5f13) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1
            {
                this.f39173x3fe91575 = 1100082729;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19 c6063x29d45c19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19 event = c6063x29d45c19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f136345g.f89672a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardToSingleChatFeedIdCount", snsId);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f14 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c> abstractC20980x9b9ad01d14 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c>(m70931x95c7fa5f14) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1
            {
                this.f39173x3fe91575 = 1078309244;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c c6062xcd2adb6c) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c event = c6062xcd2adb6c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f136344g.f89570a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardToChatRoomFeedIdCount", snsId);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f15 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627> abstractC20980x9b9ad01d15 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627>(m70931x95c7fa5f15) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1
            {
                this.f39173x3fe91575 = -1833188841;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627 c6039x7f6ec627) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6039x7f6ec627 event = c6039x7f6ec627;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BrowseAdLongVideoTime");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                return false;
            }
        };
        final p012xc85e97e9.p093xedfae76a.y m70931x95c7fa5f16 = m70931x95c7fa5f();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf> abstractC20980x9b9ad01d16 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf>(m70931x95c7fa5f16) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1
            {
                this.f39173x3fe91575 = 1179123103;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf c5149xdc6c5daf) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf activeStatusEvent = c5149xdc6c5daf;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activeStatusEvent, "activeStatusEvent");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd.this.m70938xd35c70d0()) {
                    am.e eVar = activeStatusEvent.f135498g;
                    boolean z17 = eVar.f88043a;
                    java.lang.String str = eVar.f88044b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.util.Locale locale = java.util.Locale.getDefault();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                    java.lang.String lowerCase = str.toLowerCase(locale);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                    if (r26.n0.L(lowerCase, "sns", 0, false, 6, null) >= 0) {
                        if (z17) {
                            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BackGroundTime");
                        } else {
                            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BackGroundTime");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                return false;
            }
        };
        arrayList.add(abstractC20980x9b9ad01d);
        arrayList.add(abstractC20980x9b9ad01d2);
        arrayList.add(abstractC20980x9b9ad01d3);
        arrayList.add(abstractC20980x9b9ad01d4);
        arrayList.add(abstractC20980x9b9ad01d5);
        arrayList.add(abstractC20980x9b9ad01d6);
        arrayList.add(abstractC20980x9b9ad01d7);
        arrayList.add(abstractC20980x9b9ad01d8);
        arrayList.add(abstractC20980x9b9ad01d9);
        arrayList.add(abstractC20980x9b9ad01d10);
        arrayList.add(abstractC20980x9b9ad01d11);
        arrayList.add(abstractC20980x9b9ad01d12);
        arrayList.add(abstractC20980x9b9ad01d13);
        arrayList.add(abstractC20980x9b9ad01d14);
        arrayList.add(abstractC20980x9b9ad01d15);
        arrayList.add(abstractC20980x9b9ad01d16);
        this.f250193e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c) ((jz5.n) this.f250193e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        java.util.Iterator it = this.f250192d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48813x58998cd();
        }
        O6().b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        java.util.Iterator it = this.f250192d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48814x2efc64();
        }
        O6().r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }
}
