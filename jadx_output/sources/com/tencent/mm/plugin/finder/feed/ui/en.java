package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class en implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f109990d;

    public en(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f109990d = finderTopicFeedUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI = this.f109990d;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = finderTopicFeedUI.f109575u;
        if (r10Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        long j17 = r10Var.f108871r;
        if (j17 <= 0) {
            j17 = finderTopicFeedUI.E;
        } else if (r10Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        long j18 = j17;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        if (itemId == 10002) {
            if (com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.d7(finderTopicFeedUI)) {
                db5.t7.makeText(finderTopicFeedUI, com.tencent.mm.R.string.f3u, 0).show();
                return;
            }
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI2 = this.f109990d;
            com.tencent.mm.plugin.finder.feed.r10 r10Var2 = finderTopicFeedUI2.f109575u;
            if (r10Var2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            int i18 = r10Var2.f108866m;
            if (i18 != 4) {
                if (r10Var2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                java.lang.String str = r10Var2.f108868o;
                if (r10Var2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                if (r10Var2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                java.lang.String y17 = r10Var2.y();
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.tencent.mm.plugin.finder.feed.r10 r10Var3 = finderTopicFeedUI.f109575u;
                if (r10Var3 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                objArr[0] = com.tencent.mm.plugin.finder.assist.w2.h(r10Var3.f108871r);
                java.lang.String string = finderTopicFeedUI.getString(com.tencent.mm.R.string.f8n, objArr);
                com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = finderTopicFeedUI.f109577w;
                if (finderTopicFeedLoader != null) {
                    com.tencent.mm.plugin.finder.assist.n7.J(n7Var, finderTopicFeedUI2, str, i18, j18, y17, string, finderTopicFeedLoader.f107674m, 9, "", null, null, null, 3584, null);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
            }
            java.lang.String c76 = com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.c7(finderTopicFeedUI2);
            com.tencent.mm.plugin.finder.feed.r10 r10Var4 = finderTopicFeedUI.f109575u;
            if (r10Var4 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            int i19 = r10Var4.f108866m;
            if (r10Var4 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.lang.String y18 = r10Var4.y();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            com.tencent.mm.plugin.finder.feed.r10 r10Var5 = finderTopicFeedUI.f109575u;
            if (r10Var5 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            objArr2[0] = com.tencent.mm.plugin.finder.assist.w2.h(r10Var5.f108871r);
            java.lang.String string2 = finderTopicFeedUI.getString(com.tencent.mm.R.string.f8n, objArr2);
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader2 = finderTopicFeedUI.f109577w;
            if (finderTopicFeedLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            r45.ze2 ze2Var = finderTopicFeedLoader2.f107674m;
            com.tencent.mm.plugin.finder.feed.x10 x10Var = finderTopicFeedUI.f109576v;
            if (x10Var != null) {
                com.tencent.mm.plugin.finder.assist.n7.J(n7Var, finderTopicFeedUI2, c76, i19, j18, y18, string2, ze2Var, 49, x10Var.G, null, null, null, 3584, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
        if (itemId != 10003) {
            return;
        }
        if (com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.d7(finderTopicFeedUI)) {
            db5.t7.makeText(finderTopicFeedUI, com.tencent.mm.R.string.f3v, 0).show();
            return;
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI3 = this.f109990d;
        com.tencent.mm.plugin.finder.feed.r10 r10Var6 = finderTopicFeedUI3.f109575u;
        if (r10Var6 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        int i27 = r10Var6.f108866m;
        if (i27 != 4) {
            if (r10Var6 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.lang.String str2 = r10Var6.f108868o;
            if (r10Var6 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            if (r10Var6 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.lang.String y19 = r10Var6.y();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            com.tencent.mm.plugin.finder.feed.r10 r10Var7 = finderTopicFeedUI.f109575u;
            if (r10Var7 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            objArr3[0] = com.tencent.mm.plugin.finder.assist.w2.h(r10Var7.f108871r);
            java.lang.String string3 = finderTopicFeedUI.getString(com.tencent.mm.R.string.f8n, objArr3);
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader3 = finderTopicFeedUI.f109577w;
            if (finderTopicFeedLoader3 != null) {
                com.tencent.mm.plugin.finder.assist.n7.K(n7Var, finderTopicFeedUI3, str2, i27, j18, y19, string3, finderTopicFeedLoader3.f107674m, 9, "", null, null, null, 3584, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
        }
        java.lang.String c77 = com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.c7(finderTopicFeedUI3);
        com.tencent.mm.plugin.finder.feed.r10 r10Var8 = finderTopicFeedUI.f109575u;
        if (r10Var8 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        int i28 = r10Var8.f108866m;
        if (r10Var8 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        java.lang.String y27 = r10Var8.y();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        com.tencent.mm.plugin.finder.feed.r10 r10Var9 = finderTopicFeedUI.f109575u;
        if (r10Var9 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        objArr4[0] = com.tencent.mm.plugin.finder.assist.w2.h(r10Var9.f108871r);
        java.lang.String string4 = finderTopicFeedUI.getString(com.tencent.mm.R.string.f8n, objArr4);
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader4 = finderTopicFeedUI.f109577w;
        if (finderTopicFeedLoader4 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        r45.ze2 ze2Var2 = finderTopicFeedLoader4.f107674m;
        com.tencent.mm.plugin.finder.feed.x10 x10Var2 = finderTopicFeedUI.f109576v;
        if (x10Var2 != null) {
            com.tencent.mm.plugin.finder.assist.n7.K(n7Var, finderTopicFeedUI3, c77, i28, j18, y27, string4, ze2Var2, 49, x10Var2.G, null, null, null, 3584, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
