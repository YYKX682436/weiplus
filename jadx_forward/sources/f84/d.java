package f84;

/* loaded from: classes4.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f341710d;

    /* renamed from: e, reason: collision with root package name */
    public final f84.v f341711e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f341712f;

    /* renamed from: g, reason: collision with root package name */
    public final int f341713g;

    /* renamed from: h, reason: collision with root package name */
    public f84.b f341714h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f341715i;

    public d(android.content.Context mContext, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mSnsInfo, f84.v mAdBrandTopicInfo, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSnsInfo, "mSnsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdBrandTopicInfo, "mAdBrandTopicInfo");
        this.f341710d = mContext;
        this.f341711e = mAdBrandTopicInfo;
        this.f341712f = c1163xf1deaba4;
        this.f341713g = i17;
        this.f341715i = new f84.c(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        java.util.List b17 = this.f341711e.b();
        int size = b17 != null ? b17.size() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return j17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        f84.v vVar;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        f84.a holder = (f84.a) k3Var;
        f84.v vVar2 = this.f341711e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBrandTopicAdapter", "onBindHolder, view.hash is " + holder.f3639x46306858.hashCode() + ", pos=" + i17);
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "onBindViewHolder";
        }
        if (holder.m8185xcdaf1228() == 0) {
            f84.b0 x17 = x(i17);
            if (x17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdBrandTopicAdapter", "onBindViewHolder, itemInfo is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                str5 = "onBindViewHolder";
                str4 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
            }
            boolean C = com.p314xaae8f345.mm.ui.bk.C();
            java.lang.String e17 = C ? x17.e() : x17.d();
            java.lang.String b17 = C ? x17.b() : x17.a();
            if (holder.m8185xcdaf1228() == 0) {
                try {
                    boolean N0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(e17, b17);
                    android.widget.ImageView imageView = holder.f341703f;
                    if (N0) {
                        android.widget.ImageView i19 = holder.i();
                        if (i19 != null) {
                            i19.setImageDrawable(null);
                        }
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            if (imageView != null) {
                                imageView.setImageDrawable(null);
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            str = "onBindViewHolder";
                            str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                            str6 = "AdBrandTopicAdapter";
                            str3 = str6;
                            ca4.q.c(str3, th);
                            str5 = str;
                            str4 = str2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                        }
                    } else {
                        a84.m.b(e17, holder.i());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                        a84.m.b(b17, imageView);
                    }
                    vVar2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    int i27 = vVar2.f341750a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopicWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    int i28 = x17.f341705a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopicWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomImageWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    int i29 = x17.f341707c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomImageWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    if (i27 > 0 && i28 > 0 && i29 > 0) {
                        android.widget.ImageView i37 = holder.i();
                        if (i37 != null) {
                            layoutParams = i37.getLayoutParams();
                            str = "onBindViewHolder";
                        } else {
                            str = "onBindViewHolder";
                            layoutParams = null;
                        }
                        try {
                            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                                try {
                                    marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                    str3 = "AdBrandTopicAdapter";
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                }
                            } else {
                                marginLayoutParams = null;
                            }
                            int i38 = this.f341713g;
                            if (marginLayoutParams != null) {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                try {
                                    i18 = (i38 * i28) / i27;
                                    marginLayoutParams.width = i18;
                                    str6 = "AdBrandTopicAdapter";
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    str6 = "AdBrandTopicAdapter";
                                    str3 = str6;
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                }
                                try {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopicHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                    vVar = vVar2;
                                    int i39 = x17.f341706b;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopicHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                    marginLayoutParams.height = (i18 * i39) / i28;
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    str3 = str6;
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                                }
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                vVar = vVar2;
                                str6 = "AdBrandTopicAdapter";
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                int i47 = (i38 * i29) / i27;
                                marginLayoutParams2.width = i47;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomImageHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                int i48 = x17.f341708d;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomImageHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                marginLayoutParams2.height = (i47 * i48) / i29;
                            }
                            android.widget.ImageView i49 = holder.i();
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = i49 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) i49 : null;
                            if (c22628xfde5d61d != null) {
                                android.content.Context context = this.f341710d;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                                int i57 = vVar.f341752c;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                                c22628xfde5d61d.m81387x205ac394(i65.a.b(context, i57));
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainer", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainer", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            android.widget.FrameLayout frameLayout = holder.f341701d;
                            if (frameLayout != null) {
                                frameLayout.requestLayout();
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                            str6 = "AdBrandTopicAdapter";
                            str3 = str6;
                            ca4.q.c(str3, th);
                            str5 = str;
                            str4 = str2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                        }
                    }
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    str = "onBindViewHolder";
                }
            } else {
                str = "onBindViewHolder";
                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                str3 = "AdBrandTopicAdapter";
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "onBindViewHolder, wrong view type");
                } catch (java.lang.Throwable th13) {
                    th = th13;
                    ca4.q.c(str3, th);
                    str5 = str;
                    str4 = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                }
            }
            str5 = str;
            str4 = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
        }
        str5 = "onBindViewHolder";
        str4 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        f84.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        android.content.Context context = this.f341710d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        try {
            android.view.View inflate = i17 == 0 ? android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571123eq5, parent, false) : new android.view.View(context);
            inflate.setOnClickListener(this.f341715i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBrandTopicAdapter", "onCreateHolder, view.hash is " + inflate.hashCode());
            aVar = new f84.a(inflate, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdBrandTopicAdapter", th6);
            aVar = new f84.a(new android.view.View(context), i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return aVar;
    }

    public final f84.b0 x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        java.util.List b17 = this.f341711e.b();
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
            return null;
        }
        if (i17 < 0 || i17 >= b17.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
            return null;
        }
        f84.b0 b0Var = (f84.b0) b17.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return b0Var;
    }
}
