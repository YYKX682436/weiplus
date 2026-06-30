package n74;

/* loaded from: classes4.dex */
public class n1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 f416933a;

    /* renamed from: b, reason: collision with root package name */
    public s34.u0 f416934b;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43) {
        this.f416933a = c17806x48d2cd43;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f416934b;
        if (u0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "checkLoadImage, adRollInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f416933a;
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "checkLoadImage, rollingBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        java.lang.String str = u0Var.f76720x61ad9236;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            android.widget.ImageView imageView = c17806x48d2cd43.f245196d;
            if (imageView != null) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78372xa799cd96);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdRollHelper", "checkLoadImage, iconUrl is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (!str.equals((java.lang.String) c17806x48d2cd43.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            } else {
                java.lang.String l17 = za4.t0.l("adId_mm", str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) || !com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                    c17806x48d2cd43.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
                    c17806x48d2cd43.hashCode();
                    a84.m.d(str, new n74.k1(this, new java.lang.ref.WeakReference(c17806x48d2cd43), str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                } else {
                    c(l17, c17806x48d2cd43);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0
    public java.lang.String b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f416934b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (u0Var != null) {
            arrayList.addAll(u0Var.f484318a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (i17 < 0 || i17 >= arrayList.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return "";
        }
        java.lang.String str = (java.lang.String) arrayList.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return str;
    }

    public final void c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setImageBitmapAsync, path is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setImageBitmapAsync, bar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new n74.m1(this, str, c17806x48d2cd43));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f416933a;
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setRollingBarAdapter, rollingBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (!c17806x48d2cd43.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdRollHelper", "setRollingBarAdapter, rollingBar adapter is not empty");
            c17806x48d2cd43.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (mo69674x7444f759() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdRollHelper", "setRollingBarAdapter, adRollInfoTextList size is 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            c17806x48d2cd43.m69672x13daf1e0(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f416933a;
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "setRollingBarStatus, rollingBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (mo69674x7444f759() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdRollHelper", "setRollingBarStatus, adRollInfoTextList size is 0");
            c17806x48d2cd43.setVisibility(4);
            c17806x48d2cd43.c();
        } else {
            c17806x48d2cd43.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0
    /* renamed from: getCount */
    public int mo69674x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f416934b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (u0Var != null) {
            arrayList.addAll(u0Var.f484318a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (a84.b0.b(arrayList)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return 0;
        }
        int size = arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return size;
    }
}
