package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class r5 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f246986d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f246987e;

    /* renamed from: f, reason: collision with root package name */
    public ab4.r0 f246988f;

    /* renamed from: g, reason: collision with root package name */
    public final int f246989g;

    /* renamed from: h, reason: collision with root package name */
    public final int f246990h;

    /* renamed from: i, reason: collision with root package name */
    public final int f246991i = 600;

    /* renamed from: m, reason: collision with root package name */
    public final int f246992m = 700;

    /* renamed from: n, reason: collision with root package name */
    public final int f246993n = 250;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f246994o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f246995p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f246996q = new java.util.HashSet();

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f246997r;

    public r5(android.content.Context context, android.view.LayoutInflater layoutInflater, ab4.r0 r0Var, int i17, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        this.f246986d = context;
        this.f246987e = layoutInflater;
        this.f246988f = r0Var;
        this.f246989g = i17;
        this.f246990h = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(context)[0];
        this.f246997r = c1190x18d3c3fe;
    }

    public static /* synthetic */ int a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 r5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        int i17 = r5Var.f246992m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return i17;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 r5Var, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        r5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, -5.0f, 0.0f, 0.0f);
        long j17 = r5Var.f246992m;
        translateAnimation.setDuration(j17);
        translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        animationSet.addAnimation(translateAnimation);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.8f, 0.3f);
        alphaAnimation.setDuration(j17);
        alphaAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n5(r5Var, imageView));
        imageView.startAnimation(animationSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap = this.f246995p;
        for (java.lang.Integer num : hashMap.keySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5 q5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5) hashMap.get(num);
            if (q5Var != null) {
                java.util.LinkedList linkedList = q5Var.f246961a;
                if (linkedList.size() != 0) {
                    int intValue = num.intValue();
                    int i18 = 0;
                    java.util.Set set = this.f246996q;
                    if (intValue == i17) {
                        while (i18 < linkedList.size()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) linkedList.get(i18);
                            if (a2Var.A()) {
                                a2Var.K();
                                a2Var.J();
                                ((java.util.HashSet) set).add(a2Var.z());
                            } else {
                                if (((java.util.HashSet) set).contains(a2Var.z())) {
                                    a2Var.M();
                                    ((java.util.HashSet) set).remove(a2Var.z());
                                }
                            }
                            i18++;
                        }
                    } else {
                        while (i18 < linkedList.size()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) linkedList.get(i18);
                            if (((java.util.HashSet) set).contains(a2Var2.z())) {
                                a2Var2.M();
                                ((java.util.HashSet) set).remove(a2Var2.z());
                            }
                            i18++;
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        android.view.View view = (android.view.View) this.f246994o.get(java.lang.Integer.valueOf(i17));
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n4x);
        if (imageView != null && imageView.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            imageView.setAlpha(0.0f);
            imageView.setTag("1");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.8f);
            alphaAnimation.setDuration(this.f246991i);
            alphaAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p5(this, imageView));
            imageView.startAnimation(alphaAnimation);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        viewGroup.removeView((android.view.View) obj);
        this.f246994o.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: finishUpdate */
    public void mo7742xa949b73c(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        m8337xa949b73c((android.view.View) viewGroup);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f246997r;
        int m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6();
        if (m8300xfda78ef6 == 0) {
            m8300xfda78ef6 = mo8338x7444f759() - 2;
        } else if (m8300xfda78ef6 >= mo8338x7444f759() - 1) {
            m8300xfda78ef6 = 1;
        }
        c1190x18d3c3fe.m8317x940d026a(m8300xfda78ef6, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        int size = this.f246988f.F.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap = this.f246994o;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (hashMap.get(java.lang.Integer.valueOf(intValue)) == obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                return intValue;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i18;
        int i19;
        java.lang.String str2 = "instantiateItem";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap2 = this.f246994o;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
            java.lang.Object obj = hashMap2.get(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return obj;
        }
        int i27 = 0;
        android.view.View inflate = this.f246987e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571024cq1, viewGroup, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.n4v);
        int i28 = this.f246989g;
        linearLayout.setBackgroundColor(i28);
        java.util.HashMap hashMap3 = this.f246995p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5 q5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5) hashMap3.get(java.lang.Integer.valueOf(i17));
        java.util.LinkedList linkedList = ((ab4.v) this.f246988f.F.get(i17)).F;
        android.content.Context context = this.f246986d;
        if (q5Var == null || q5Var.f246961a.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5 q5Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5(this);
            if (linkedList == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                str = "instantiateItem";
                hashMap = hashMap2;
            } else {
                while (i27 < linkedList.size()) {
                    ab4.d0 d0Var = (ab4.d0) linkedList.get(i27);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageGroupListComponent", "gen component %s", d0Var.f84350d);
                    q5Var2.f246961a.add(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ta.a(context, d0Var, linearLayout, i28));
                    i27++;
                    linkedList = linkedList;
                    str2 = str2;
                    hashMap2 = hashMap2;
                }
                str = str2;
                hashMap = hashMap2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            }
            if (i17 > 0 && i17 < mo8338x7444f759() - 1) {
                hashMap3.put(java.lang.Integer.valueOf(i17), q5Var2);
            }
            q5Var = q5Var2;
        } else {
            str = "instantiateItem";
            hashMap = hashMap2;
        }
        java.util.Iterator it = q5Var.f246961a.iterator();
        while (it.hasNext()) {
            android.view.View x17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) it.next()).x();
            if (x17.getParent() != null && (x17.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) x17.getParent()).removeView(x17);
            }
            linearLayout.addView(x17);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n4x);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n4w);
        if (i28 - (-16777216) <= (-1) - i28) {
            imageView.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.ccj));
        } else {
            imageView.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.cck));
        }
        ab4.r0 r0Var = this.f246988f;
        if (r0Var.G == 1) {
            imageView.setVisibility(8);
            textView.setVisibility(8);
        } else {
            if (i17 == r0Var.F.size() - 1) {
                imageView.setVisibility(8);
                i18 = 0;
            } else {
                i18 = 0;
                imageView.setVisibility(0);
            }
            int mo8338x7444f759 = mo8338x7444f759() - 2;
            if (i17 == 0) {
                imageView.setVisibility(8);
                i19 = mo8338x7444f759;
            } else if (i17 >= mo8338x7444f759() - 1) {
                imageView.setVisibility(i18);
                i19 = 1;
            } else {
                if (i17 == mo8338x7444f759) {
                    imageView.setVisibility(8);
                }
                i19 = i17;
            }
            textView.setText(i19 + "/" + mo8338x7444f759);
        }
        inflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(this.f246990h, linearLayout.getMeasuredHeight()));
        inflate.setBackgroundColor(i28);
        viewGroup.addView(inflate);
        viewGroup.setBackgroundColor(i28);
        hashMap.put(java.lang.Integer.valueOf(i17), inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return inflate;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        boolean z17 = view == ((android.view.View) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return z17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: setPrimaryItem */
    public void mo7748x3c80e673(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        super.m8345x3c80e673((android.view.View) viewGroup, i17, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }
}
