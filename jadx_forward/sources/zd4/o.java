package zd4;

/* loaded from: classes11.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f553173a = jz5.h.b(new zd4.n(this));

    public final boolean a(int i17, int i18, int i19) {
        zd4.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r h17 = h(i17);
        java.lang.Integer num = null;
        if (h17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            qVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            qVar = (zd4.q) kz5.n0.a0(h17.f553181d, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        }
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            num = java.lang.Integer.valueOf(qVar.f553175b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = num != null && i19 == num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public final boolean b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = n(i17) == i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public abstract java.util.List c();

    public final int d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.q g17 = g(i17, i18);
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return g17.f553177d;
    }

    public final int e(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.q g17 = g(i17, i18);
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return g17.f553176c;
    }

    public int f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findHeaderTitleTextColor", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int d17 = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findHeaderTitleTextColor", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return d17;
    }

    public final zd4.q g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r h17 = h(i17);
        if (h17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        for (zd4.q qVar : h17.f553181d) {
            qVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            if (qVar.f553175b == i18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return qVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    public final zd4.r h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        for (zd4.r rVar : l()) {
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            if (rVar.f553178a == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return rVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    public final int i(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int i18 = 0;
        for (java.lang.Object obj : l()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            zd4.r rVar = (zd4.r) obj;
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            if (rVar.f553178a == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return i18;
            }
            i18 = i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public int j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderCheckBoxVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderCheckBoxVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public int k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderPaddingLeft", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderPaddingLeft", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return h17;
    }

    public final java.util.List l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        java.util.List list = (java.util.List) ((jz5.n) this.f553173a).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return list;
    }

    public int m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public final int n(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r rVar = (zd4.r) kz5.n0.a0(l(), i17);
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            i18 = rVar.f553178a;
        } else {
            i18 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return i18;
    }

    public final boolean o(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = i17 == i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public boolean p(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preCheckOnSelectVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preCheckOnSelectVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return true;
    }
}
