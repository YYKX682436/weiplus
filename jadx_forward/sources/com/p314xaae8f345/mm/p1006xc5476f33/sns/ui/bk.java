package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class bk extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f249450g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f249451h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f249454n;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 f249458r;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f249452i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f249453m = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f249455o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final dd4.e0 f249456p = new dd4.e0();

    /* renamed from: q, reason: collision with root package name */
    public boolean f249457q = false;

    public bk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3, android.content.Context context) {
        this.f249458r = c18064xe6e1a3b3;
        this.f249450g = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3).size();
        this.f249451h = ((iv.a) ((jv.e) i95.n0.c(jv.e.class))).Ai();
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk) e17.getTag();
        if (jkVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        if (z17 && jkVar.f251050d.getVisibility() == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = jkVar.f251050d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return c21524xecd57b9a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.FrameLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.widget.FrameLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.widget.FrameLayout, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.tencent.mm.plugin.sns.ui.bk] */
    /* JADX WARN: Type inference failed for: r6v15, types: [y51.c, y51.g] */
    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        android.view.View view2;
        ?? frameLayout;
        p012xc85e97e9.p093xedfae76a.c1 a18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        android.content.res.Resources resources;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15;
        java.lang.Object tag;
        int abs;
        android.view.View view3;
        android.view.View view4 = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.jj4 jj4Var = m(i17).f461642d;
        if (jj4Var.f459389e != 6) {
            int i18 = 5;
            if (jj4Var.X == null) {
                android.view.View l17 = l(i17, view4, viewGroup, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return l17;
            }
            android.os.Vibrator vibrator = ca4.z0.f121601a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            boolean startsWith = jj4Var.f459388d.startsWith("pre_temp_sns_live_photo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (startsWith) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Boolean.valueOf(view4 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "fill fillView LivePhotoView %d convert view is null %b.", objArr);
                if (m(i17) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhoto view, but flip item is null.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                } else {
                    r45.jj4 jj4Var2 = m(i17).f461642d;
                    if (jj4Var2 != null) {
                        android.content.Context context = this.f249450g;
                        java.lang.String tips = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f574765ok4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tips, "tips");
                        a61.d dVar = new a61.d(true, null, true, false, true, tips, false, null, true, null);
                        long parseLong = java.lang.Long.parseLong(jj4Var2.f459388d.substring(23));
                        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(jj4Var2.X.f459391g);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "fillViewMMLivePhotoView >> isParsed: %b, mediaId: %d，videoPath: %s", java.lang.Boolean.valueOf(j17), java.lang.Long.valueOf(parseLong), jj4Var2.X.f459391g);
                        ?? Ai = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(dVar, new a61.c(1, jj4Var2.f459393i, java.lang.Boolean.valueOf(j17).booleanValue(), jj4Var2.X.f459391g, java.lang.Long.valueOf(parseLong), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ck(this), null)), context);
                        Ai.mo176508x4c403202(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dk(this, jj4Var2));
                        Ai.mo176507x6332291b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ek(this, jj4Var2));
                        android.view.View view5 = (android.view.View) Ai;
                        view5.setTag(com.p314xaae8f345.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                        ((y51.b) Ai).d();
                        if (view5.getParent() != null) {
                            ((android.view.ViewGroup) view5.getParent()).removeAllViews();
                        }
                        frameLayout = new android.widget.FrameLayout(context);
                        frameLayout.addView(view5, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        return frameLayout;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but media is null.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewMMLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                }
                frameLayout = view4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return frameLayout;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Integer.valueOf(i17);
            objArr2[1] = java.lang.Boolean.valueOf(view4 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "fill fillView LivePhotoView %d convert view is null %b.", objArr2);
            r45.m33 m17 = m(i17);
            if (m17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhoto view, but flip item is null.");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                view2 = view4;
            } else {
                java.lang.String str = m17.f461643e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but sns local id is null.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    view2 = view4;
                } else {
                    r45.jj4 jj4Var3 = m(i17).f461642d;
                    if (jj4Var3 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill livePhotoView sight view, but media is null.");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        view2 = view4;
                    } else {
                        synchronized (jm0.k.f381803i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                        }
                        xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(str);
                        java.lang.String a19 = a76 != null ? a76.a1() : "";
                        android.content.Context context2 = this.f249450g;
                        boolean D = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.D(this.f249458r);
                        int hashCode = this.f249450g.hashCode();
                        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.f249458r.C;
                        int i19 = m(i17).f461644f;
                        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(s7Var.f276845a);
                        s7Var2.f276846b = i19;
                        boolean H = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.H(this.f249458r);
                        boolean z17 = !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.Q(this.f249458r);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoReportScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.Q(c18064xe6e1a3b3)) {
                            i18 = 4;
                        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.H(c18064xe6e1a3b3)) {
                            i18 = 3;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoReportScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40(context2, jj4Var3, i17, D, hashCode, s7Var2, H, a76, z17, i18, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18156x5962ef8(this, i17, a19), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fk(this, i17));
                        c18280x2556ea40.setTag(com.p314xaae8f345.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                        c18280x2556ea40.p();
                        if (c18280x2556ea40.getParent() != null) {
                            ((android.view.ViewGroup) c18280x2556ea40.getParent()).removeAllViews();
                        }
                        c18280x2556ea40.m71041x6332291b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gk(this, a76, jj4Var3));
                        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.f249450g);
                        frameLayout2.addView(c18280x2556ea40, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.Q(this.f249458r) || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(this.f249458r)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e k17 = k(jj4Var3, frameLayout2);
                            k17.mo70698xdc00daf7(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.bk$$b
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view6) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$fillViewLivePhotoView$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                    java.lang.Object obj = new java.lang.Object();
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea402 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.this;
                                    arrayList.add(c18280x2556ea402);
                                    arrayList.add(view6);
                                    java.lang.Object[] array = arrayList.toArray();
                                    arrayList.clear();
                                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsInfoFlip$SnsGalleryAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                                    c18280x2556ea402.n();
                                    yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip$SnsGalleryAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$fillViewLivePhotoView$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                }
                            });
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s4 s4Var = this.f249458r.f247812g;
                            if (s4Var != null && s4Var.mo71156x4471fbd5() != null) {
                                k17.mo70695xbf00d664(this.f249458r.f247812g.mo71156x4471fbd5());
                            }
                        }
                        r(i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        view2 = frameLayout2;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return view2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.m33 m18 = m(i17);
        if (m18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but flip item is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        } else {
            java.lang.String str2 = m18.f461643e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f249455o).get(str2);
                synchronized (jm0.k.f381803i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                }
                xc4.p a77 = ((zc4.g) ((zc4.h) a18).P6(zc4.g.class)).a7(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee152 = null;
                if (a77 == null || !pc4.d.f434943a.d(a77.h1())) {
                    if (weakReference == null || weakReference.get() == null) {
                        c17983xb14a9c8d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d(this.f249450g, (android.util.AttributeSet) null);
                        ((java.util.HashMap) this.f249455o).put(str2, new java.lang.ref.WeakReference(c17983xb14a9c8d));
                    } else {
                        c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) weakReference.get();
                    }
                    c17983xb14a9c8d.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    c17983xb14a9c8d.S1 = null;
                    c17983xb14a9c8d.T1 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, this.f249454n)) {
                        o(i17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "return online sight view %d parent id %s.", java.lang.Integer.valueOf(c17983xb14a9c8d.hashCode()), m18.f461643e);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str2);
                    if (k18 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f249458r;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        int i27 = c18064xe6e1a3b32.V1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        c17983xb14a9c8d.m70645x53aed94a(i27);
                        c17983xb14a9c8d.m70647x7ffb700f(new kk.v(gm0.j1.b().h()).m143587x9616526c() + "_" + java.lang.System.currentTimeMillis());
                        c17983xb14a9c8d.m70649xd8ba4ba2(java.lang.System.currentTimeMillis());
                        c17983xb14a9c8d.m70651x53b40971(ca4.z0.t0(k18.f68891x29d1292e));
                        c17983xb14a9c8d.m70642x4ab94e43(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(m18.f461642d));
                        c17983xb14a9c8d.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
                        int i28 = this.f249458r.D;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                        int i29 = i28 != 2 ? i28 != 3 ? (i28 == 4 || i28 == 5) ? 2 : i28 : 5 : 3;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                        c17983xb14a9c8d.m70652xa4a4b476(i29);
                        c17983xb14a9c8d.m70648x6d16a6e9(ca4.z0.f121604d);
                        if (iq.b.y()) {
                            c17983xb14a9c8d.m70644x764d819b(true);
                        }
                    }
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.Q(this.f249458r) || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(this.f249458r)) {
                        if (c17983xb14a9c8d.getParent() != null) {
                            ((android.view.ViewGroup) c17983xb14a9c8d.getParent()).removeAllViews();
                        }
                        ?? frameLayout3 = new android.widget.FrameLayout(this.f249450g);
                        frameLayout3.addView(c17983xb14a9c8d, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e k19 = k(m18.f461642d, frameLayout3);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s4 s4Var2 = this.f249458r.f247812g;
                        if (s4Var2 != null && s4Var2.mo71156x4471fbd5() != null) {
                            k19.mo70695xbf00d664(this.f249458r.f247812g.mo71156x4471fbd5());
                        }
                        c17983xb14a9c8d2 = frameLayout3;
                        if (k19 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc) {
                            android.content.Context context3 = this.f249450g;
                            c17983xb14a9c8d2 = frameLayout3;
                            if (context3 instanceof android.app.Activity) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc c18011x827742fc = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc) k19;
                                android.app.Activity activity = (android.app.Activity) context3;
                                r45.jj4 jj4Var4 = m18.f461642d;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                                if (c18011x827742fc.f248331h != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unbindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                    xd4.e eVar = c18011x827742fc.f248331h;
                                    if (eVar != null) {
                                        ((xd4.z) eVar).mo175368x5cd39ffa();
                                    }
                                    c18011x827742fc.f248331h = null;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unbindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                }
                                android.view.ViewStub viewStub = c18011x827742fc.f248330g;
                                if (viewStub == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                } else {
                                    xd4.z zVar = new xd4.z();
                                    c18011x827742fc.f248331h = zVar;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    zVar.f535260h = jj4Var4;
                                    zVar.f535258f = c17983xb14a9c8d;
                                    zVar.f535256d = activity;
                                    android.view.KeyEvent.Callback m70640x4ee17f0a = c17983xb14a9c8d.m70640x4ee17f0a();
                                    zVar.f535259g = m70640x4ee17f0a instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4) m70640x4ee17f0a : null;
                                    viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.eoq);
                                    android.view.View inflate = viewStub.inflate();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    android.app.Activity activity2 = zVar.f535256d;
                                    if (activity2 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    } else {
                                        zVar.f535253a = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
                                        zVar.f535257e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7) activity2.findViewById(com.p314xaae8f345.mm.R.id.u4v);
                                        android.app.Activity activity3 = zVar.f535256d;
                                        zVar.mo175369x50e1c15d((activity3 == null || (resources = activity3.getResources()) == null) ? null : resources.getConfiguration());
                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 c22610x2e037bd7 = zVar.f535257e;
                                        if (c22610x2e037bd7 != null) {
                                            c22610x2e037bd7.m81280xaada124f(new xd4.p(zVar));
                                        }
                                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2) inflate.findViewById(com.p314xaae8f345.mm.R.id.ncv);
                                        zVar.f535254b = c19716x17d12db2;
                                        if (c19716x17d12db2 == null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        } else {
                                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.u2b);
                                            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.u2c);
                                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db22 = zVar.f535254b;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19716x17d12db22);
                                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 m75623x9dd15644 = c19716x17d12db22.m75623x9dd15644();
                                            m75623x9dd15644.m75679x5e005feb(textView);
                                            m75623x9dd15644.m75680x10e11636(textView2);
                                            m75623x9dd15644.m75694x30a01e54(new xd4.q(zVar));
                                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db23 = zVar.f535254b;
                                            if (c19716x17d12db23 != null) {
                                                c19716x17d12db23.m75634xe2a3dcd2(new xd4.r(zVar));
                                            }
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d3 = zVar.f535258f;
                                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46.i(m75623x9dd15644, c17983xb14a9c8d3 != null ? c17983xb14a9c8d3.m70639x52ad18a9() : 1.0f, false, 2, null);
                                            m75623x9dd15644.m75693x7805eb2(new xd4.s(zVar));
                                            m75623x9dd15644.m75677xaa87fdc3(new xd4.t(m75623x9dd15644, zVar));
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d4 = zVar.f535258f;
                                            if (c17983xb14a9c8d4 != null) {
                                                c17983xb14a9c8d4.m70646xe061e62c(new xd4.u(m75623x9dd15644, zVar));
                                            }
                                            m75623x9dd15644.m75689x457bdbf5((zVar.f535260h != null ? a06.d.b(r3.R) : 0) * 1000);
                                            m75623x9dd15644.m75692x95acfdd2(new xd4.v(zVar));
                                            m75623x9dd15644.f();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar.f535259g);
                                            m75623x9dd15644.mo75675x8d365359(!android.text.TextUtils.isEmpty(r3.getF256131m()));
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initControlBarWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        }
                                    }
                                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db24 = zVar.f535254b;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19716x17d12db24);
                                    zVar.j(c19716x17d12db24, c17983xb14a9c8d);
                                    zVar.i();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWithRootView", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindOnlineVideoView", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
                                }
                                c17983xb14a9c8d2 = frameLayout3;
                                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(this.f249458r)) {
                                    c18011x827742fc.m70697x2b504f7b(true);
                                    c17983xb14a9c8d2 = frameLayout3;
                                }
                            }
                        }
                    } else {
                        c17983xb14a9c8d2 = c17983xb14a9c8d;
                    }
                } else {
                    if (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15)) {
                        if (((java.util.HashMap) this.f249455o).size() >= 3) {
                            java.util.Map.Entry entry = null;
                            int i37 = 0;
                            for (java.util.Map.Entry entry2 : ((java.util.HashMap) this.f249455o).entrySet()) {
                                android.view.View view6 = (android.view.View) ((java.lang.ref.WeakReference) entry2.getValue()).get();
                                if (view6 != null && (tag = view6.getTag(com.p314xaae8f345.mm.R.id.s6v)) != null && (abs = java.lang.Math.abs(((java.lang.Integer) tag).intValue() - i17)) > i37) {
                                    entry = entry2;
                                    i37 = abs;
                                }
                            }
                            if (entry != null && (((java.lang.ref.WeakReference) entry.getValue()).get() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15)) {
                                ((java.util.HashMap) this.f249455o).remove(entry.getKey());
                                viewOnLongClickListenerC18284x499dee152 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) ((java.lang.ref.WeakReference) entry.getValue()).get();
                            }
                        }
                        if (viewOnLongClickListenerC18284x499dee152 == null) {
                            viewOnLongClickListenerC18284x499dee15 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15(this.f249450g);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "new video view pos:%d", java.lang.Integer.valueOf(i17));
                        } else {
                            viewOnLongClickListenerC18284x499dee15 = viewOnLongClickListenerC18284x499dee152;
                        }
                        ((java.util.HashMap) this.f249455o).put(str2, new java.lang.ref.WeakReference(viewOnLongClickListenerC18284x499dee15));
                    } else {
                        viewOnLongClickListenerC18284x499dee15 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) weakReference.get();
                    }
                    viewOnLongClickListenerC18284x499dee15.q(false, true, true);
                    viewOnLongClickListenerC18284x499dee15.setTag(com.p314xaae8f345.mm.R.id.s6v, java.lang.Integer.valueOf(i17));
                    boolean y17 = iq.b.y();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b33 = this.f249458r;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    int i38 = c18064xe6e1a3b33.V1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    viewOnLongClickListenerC18284x499dee15.o(a77, false, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN, y17, true, true, com.p314xaae8f345.mm.R.C30859x5a72f63.a9e, new fc4.k(i38, new kk.v(gm0.j1.b().h()) + "_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis()));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, this.f249454n)) {
                        o(i17);
                    }
                    if (viewOnLongClickListenerC18284x499dee15.getParent() != null) {
                        ((android.view.ViewGroup) viewOnLongClickListenerC18284x499dee15.getParent()).removeAllViews();
                    }
                    ?? frameLayout4 = new android.widget.FrameLayout(this.f249450g);
                    frameLayout4.addView(viewOnLongClickListenerC18284x499dee15, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.Q(this.f249458r) || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(this.f249458r)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e k27 = k(m18.f461642d, frameLayout4);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s4 s4Var3 = this.f249458r.f247812g;
                        if (s4Var3 != null && s4Var3.mo71156x4471fbd5() != null) {
                            k27.mo70695xbf00d664(this.f249458r.f247812g.mo71156x4471fbd5());
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "return online sight view %d parent id %s.", java.lang.Integer.valueOf(frameLayout4.hashCode()), m18.f461643e);
                    c17983xb14a9c8d2 = frameLayout4;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                view3 = c17983xb14a9c8d2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return view3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but sns local id is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
        view3 = view4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return view3;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        s(view);
        super.mo7741x89d2022d(viewGroup, i17, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk) e17.getTag();
        if (jkVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        if (z17 && jkVar.f251051e.getVisibility() == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = jkVar.f251051e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return c21537x5f41189f;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        int size = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3) == null ? 0 : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return size;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (this.f249457q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return -2;
        }
        int mo8339xb2fa47d2 = super.mo8339xb2fa47d2(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return mo8339xb2fa47d2;
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "adapter clear.");
        java.util.Map map = this.f249455o;
        java.util.Iterator it = ((java.util.HashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) view).q(false, false, true);
            }
        }
        ((java.util.HashMap) map).clear();
        this.f249456p.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.jj4 jj4Var = m(i17).f461642d;
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.f249458r.C;
        int i18 = m(i17).f461644f;
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(s7Var.f276845a);
        s7Var2.f276846b = i18;
        if (jj4Var.f459389e != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.e(m(i17).f461643e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().n0(jj4Var, n(jj4Var), s7Var2, e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e k(r45.jj4 jj4Var, android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(c18064xe6e1a3b3);
        android.content.Context context = this.f249450g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e c18011x827742fc = z17 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc(context) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be(context);
        c18011x827742fc.b(jj4Var, c18064xe6e1a3b3.mo70581x7525eefd(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e.f248358d.a(c18064xe6e1a3b3.D));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(c18064xe6e1a3b3)) {
            layoutParams.bottomMargin = i65.a.b(context, 0);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.A(c18064xe6e1a3b3).getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            int i17 = c18064xe6e1a3b3.f248720a2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            layoutParams.bottomMargin = i17 + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ais);
        } else {
            layoutParams.bottomMargin = i65.a.b(context, 16) + com.p314xaae8f345.mm.ui.bl.c(c18064xe6e1a3b3.getContext());
        }
        frameLayout.addView(c18011x827742fc, layoutParams);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.z(c18064xe6e1a3b3) && (c18011x827742fc instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc) c18011x827742fc).c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z18 = c18064xe6e1a3b3.f248730k2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (z18) {
            c18011x827742fc.setVisibility(0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2002", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            c18064xe6e1a3b3.f248730k2 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2002", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            c18011x827742fc.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return c18011x827742fc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x045f, code lost:
    
        if (r0 == 2) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d5  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View l(final int r35, android.view.View r36, android.view.ViewGroup r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk.l(int, android.view.View, android.view.ViewGroup, boolean):android.view.View");
    }

    public r45.m33 m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        if (i17 >= com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3).size() || i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return null;
        }
        r45.m33 m33Var = (r45.m33) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return m33Var;
    }

    public final int n(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (android.text.TextUtils.isEmpty(jj4Var.f459388d) || jj4Var.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType big1 id:%s", jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        java.util.HashMap hashMap = this.f249452i;
        if (hashMap.containsKey(jj4Var.f459388d)) {
            int intValue = ((java.lang.Integer) hashMap.get(jj4Var.f459388d)).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return intValue;
        }
        if (android.text.TextUtils.isEmpty(jj4Var.f459412y0)) {
            hashMap.put(jj4Var.f459388d, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType big2 id:%s", jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.u(jj4Var))) {
            hashMap.put(jj4Var.f459388d, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 2;
        }
        int r17 = pc4.d.f434943a.r();
        if ((r17 == 4 || r17 == 1) && android.text.TextUtils.isEmpty(jj4Var.A1)) {
            hashMap.put(jj4Var.f459388d, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "hd url is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "getMediaDownloadType type:%d id:%s", java.lang.Integer.valueOf(r17), jj4Var.f459388d);
        hashMap.put(jj4Var.f459388d, java.lang.Integer.valueOf(r17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaDownloadType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return r17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        this.f249457q = true;
        super.mo8343xced61ae5();
        this.f249457q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.E(c18064xe6e1a3b3).size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            java.lang.Runnable runnable = c18064xe6e1a3b3.N1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (runnable != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                java.lang.Runnable runnable2 = c18064xe6e1a3b3.N1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                runnable2.run();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void o(int i17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        r45.m33 m17 = m(i17);
        if (m17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but flip item is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        java.lang.String str = m17.f461643e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but sns local id is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "notify online sight play pos %s sns local id %s.", java.lang.Integer.valueOf(i17), str);
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f249455o).get(str);
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but view cache is null.");
            this.f249454n = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        android.view.View view = (android.view.View) weakReference.get();
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) view;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "%d notify online sight play video %s.", java.lang.Integer.valueOf(c17983xb14a9c8d.hashCode()), str);
            this.f249454n = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            c17983xb14a9c8d.hashCode();
            c17983xb14a9c8d.Z1.mo48813x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            c17983xb14a9c8d.P(m17.f461642d, m17.f461643e, m17.f461644f);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6061x45232ae1 c6061x45232ae1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6061x45232ae1();
            am.sv svVar = c6061x45232ae1.f136343g;
            svVar.f89472b = 1;
            svVar.f89473c = str;
            c6061x45232ae1.e();
        } else if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) view;
            viewOnLongClickListenerC18284x499dee15.l(false, false, true);
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(str);
            if (a76 != null) {
                this.f249456p.d(this.f249450g, viewOnLongClickListenerC18284x499dee15, a76);
            }
        } else if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "online sight view is null, do nothing. snsLocalId %s.", str);
            this.f249454n = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "notify online sight stop %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6061x45232ae1 c6061x45232ae1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6061x45232ae1();
        am.sv svVar = c6061x45232ae1.f136343g;
        svVar.f89471a = this.f249450g;
        svVar.f89473c = this.f249454n;
        svVar.f89472b = 2;
        c6061x45232ae1.e();
        this.f249454n = null;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i18 = this.f249458r.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        q(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (pc4.e.f434959a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "pauseOtherVideoView curPos: %d", java.lang.Integer.valueOf(i17));
            android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.K(this.f249458r).f310004f;
            for (int i18 = 0; i18 < sparseArray.size(); i18++) {
                java.lang.Object valueAt = sparseArray.valueAt(i18);
                if (valueAt instanceof android.view.View) {
                    android.view.View childAt = ((android.view.ViewGroup) valueAt).getChildAt(0);
                    if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) {
                        if (((java.lang.Integer) childAt.getTag(com.p314xaae8f345.mm.R.id.s6v)).intValue() != i17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) childAt;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                            boolean l17 = c18280x2556ea40.l();
                            c18280x2556ea40.B = false;
                            c18280x2556ea40.m("pausePlay isPlaying: " + l17);
                            if (l17) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = c18280x2556ea40.f250725g;
                                viewOnLongClickListenerC18284x499dee15.k(false);
                                android.widget.RelativeLayout m71055xe8faff3c = viewOnLongClickListenerC18284x499dee15.m71055xe8faff3c();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                                viewOnLongClickListenerC18284x499dee15.post(new dd4.i(m71055xe8faff3c, c18280x2556ea40));
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aniToThumb", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        }
                    } else if ((childAt instanceof y51.c) && ((java.lang.Integer) childAt.getTag(com.p314xaae8f345.mm.R.id.s6v)).intValue() != i17) {
                        ((y51.b) ((y51.c) childAt)).b();
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void r(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (!this.f249451h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.K(c18064xe6e1a3b3) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        if (!com.p314xaae8f345.mm.p971x6de15a2e.y2.a(this.f249450g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return;
        }
        int i18 = i17 - 1;
        if (i18 >= 0) {
            j(i18);
        }
        int i19 = i17 + 1;
        if (i19 < com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.K(c18064xe6e1a3b3).mo8338x7444f759()) {
            j(i19);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public final void s(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        if (view instanceof android.view.ViewGroup) {
            android.view.KeyEvent.Callback childAt = ((android.view.ViewGroup) view).getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) childAt;
                c18280x2556ea40.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                c18280x2556ea40.m("release " + c18280x2556ea40.f250739x);
                if (!c18280x2556ea40.f250739x) {
                    c18280x2556ea40.f250739x = true;
                    c18280x2556ea40.f250725g.q(false, false, true);
                    ke4.c cVar = c18280x2556ea40.f250737v;
                    if (cVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareHelper");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoShareHelper", "release");
                    cVar.f388571i.mo48814x2efc64();
                    cVar.f388564b.e();
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = cVar.f388568f;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    p3325xe03a0797.p3326xc267989b.z0.e(cVar.f388566d, null, 1, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            } else if (childAt instanceof y51.c) {
                ((y51.b) ((y51.c) childAt)).e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
    }

    public boolean t(int i17, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.view.View e17 = e(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.D(c18064xe6e1a3b3) && (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.J(c18064xe6e1a3b3).containsKey(str) || !((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.J(c18064xe6e1a3b3).get(str)).booleanValue())) {
            l(i17, e17, null, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        if (e17 != null && c(i17, true) == null && f(i17, true) == null) {
            l(i17, e17, null, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        if (!this.f249453m.contains(str) || i18 != 10 || !z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "image spec 0 to uhd id:%s", str);
        if (e17 != null) {
            l(i17, e17, null, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "view has been released");
        this.f249452i.remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        return false;
    }

    public final void u(final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar, final int i17, final r45.jj4 jj4Var, final boolean z17, boolean z18, final boolean z19) {
        int i18;
        int i19;
        java.lang.String str;
        java.lang.String str2;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.f249458r.C;
        int i28 = m(i17).f461644f;
        final com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(s7Var.f276845a);
        s7Var2.f276846b = i28;
        java.lang.Object tag = jkVar.f251050d.getTag(com.p314xaae8f345.mm.R.id.f568566qx1);
        if (tag == null || !((java.lang.String) tag).equals(jj4Var.f459388d)) {
            jkVar.f251050d.setVisibility(8);
            jkVar.f251050d.f279196y = false;
        }
        jkVar.f251050d.setTag(com.p314xaae8f345.mm.R.id.f568566qx1, jj4Var.f459388d);
        jkVar.f251051e.setVisibility(8);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.L(this.f249458r) != null && i17 == com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.L(this.f249458r).m80830xfda78ef6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.C(this.f249458r, jkVar.f251050d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.B(this.f249458r).e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.D(this.f249458r));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249458r;
            db5.f0 B = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.B(c18064xe6e1a3b3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f249458r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            int i29 = c18064xe6e1a3b32.R1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (c18064xe6e1a3b3.m0(B, i29)) {
                jkVar.f251050d.setVisibility(0);
            }
        }
        if (z18) {
            java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(jj4Var);
            final java.lang.String str3 = m(i17).f461647i;
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "useMultiTouchImageView isTranslate result is success, go to show trans img path: %s, position: %d", l17, java.lang.Integer.valueOf(i17));
                ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.bk$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk.this;
                        java.lang.String str4 = str3;
                        final int i37 = i17;
                        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar2 = jkVar;
                        bkVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$useMultiTouchImageView$5", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        final android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str4, null);
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.bk$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk.this;
                                bkVar2.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$useMultiTouchImageView$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                                android.graphics.Bitmap bitmap = J2;
                                int i38 = i37;
                                if (bitmap != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "set translate photo success %d", java.lang.Integer.valueOf(i38));
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar3 = jkVar2;
                                    jkVar3.f251050d.setVisibility(0);
                                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = jkVar3.f251050d;
                                    int i39 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                                    boolean z27 = bkVar2.f249458r.E1;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                                    c21524xecd57b9a.m79195x464b3146(z27);
                                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = jkVar3.f251050d;
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    c21524xecd57b9a2.f279184o = width;
                                    c21524xecd57b9a2.f279185p = height;
                                    jkVar3.f251050d.setImageBitmap(bitmap);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "set translate photo error %d", java.lang.Integer.valueOf(i38));
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$useMultiTouchImageView$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                            }
                        });
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$useMultiTouchImageView$5", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    }
                });
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryAdapter", "useMultiTouchImageView isTranslate but result is error, go to show origin img position: %d", java.lang.Integer.valueOf(i17));
        }
        int n17 = n(jj4Var);
        int i37 = z19 ? 2 : n17 == 3 ? 0 : n17 == 4 ? 1 : n17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "real load type:%d", java.lang.Integer.valueOf(i37));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
        if (i37 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
            i18 = 2;
        } else {
            if (i37 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i19 = 11;
            } else if (i37 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i19 = 10;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageType2DownLoadType", "com.tencent.mm.plugin.sns.data.DownLoadType");
                i18 = 0;
            }
            i18 = i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = jkVar.f251050d;
        int hashCode = this.f249450g.hashCode();
        boolean z27 = !z17;
        boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.e(m(i17).f461643e);
        java.lang.String t07 = ca4.z0.t0(this.f249458r.mo70581x7525eefd());
        int i38 = i37;
        final int i39 = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2() { // from class: com.tencent.mm.plugin.sns.ui.bk$$f
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2
            public final void a(android.graphics.Bitmap bitmap) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b33;
                java.lang.String str4;
                int i47;
                java.lang.String str5;
                java.lang.String str6;
                r45.jj4 jj4Var2;
                java.lang.String str7;
                r45.jj4 jj4Var3 = jj4Var;
                int i48 = i39;
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var3 = s7Var2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk.this;
                bkVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$useMultiTouchImageView$6", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                boolean f17 = ca4.z0.f(bitmap);
                int i49 = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b34 = bkVar.f249458r;
                if (f17 || !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.H(c18064xe6e1a3b34) || c18064xe6e1a3b34.m70762x8b87fe25() == null) {
                    c18064xe6e1a3b33 = c18064xe6e1a3b34;
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    i47 = 0;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(bkVar.m(i49).f461643e);
                    java.lang.String t08 = k17 != null ? ca4.z0.t0(k17.f68891x29d1292e) : "";
                    int i57 = c18064xe6e1a3b34.m70762x8b87fe25().f461645g == i49 ? 0 : 1;
                    int i58 = c18064xe6e1a3b34.m70762x8b87fe25().f461645g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    i47 = 0;
                    c18064xe6e1a3b33 = c18064xe6e1a3b34;
                    c18064xe6e1a3b34.g0(t08, jj4Var3, i58, i48, 1, i57);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                boolean f18 = ca4.z0.f(bitmap);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar2 = jkVar;
                if (f18 || (str7 = (jj4Var2 = jj4Var).f459388d) == null || str7.startsWith("pre_temp_extend_pic") || jj4Var2.f459388d.startsWith("sns_cmt_local_")) {
                    str5 = "lambda$useMultiTouchImageView$6";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b35 = c18064xe6e1a3b33;
                    str6 = str4;
                    if (ca4.z0.f(bitmap)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.J(c18064xe6e1a3b35).put(jj4Var3.f459388d, java.lang.Boolean.TRUE);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "pennqin, use multiTouchImageView, %s.", jkVar2.f251050d);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = jkVar2.f251050d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        boolean z28 = c18064xe6e1a3b35.E1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        c21524xecd57b9a2.m79195x464b3146(z28);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = jkVar2.f251050d;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        c21524xecd57b9a3.f279184o = width;
                        c21524xecd57b9a3.f279185p = height;
                        if (z19) {
                            jkVar2.f251050d.m79206x9f01167b(bitmap);
                        } else {
                            jkVar2.f251050d.setImageBitmap(bitmap);
                        }
                        jkVar2.f251050d.setVisibility(i47);
                        jkVar2.f251050d.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ik(bkVar, jkVar2));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryAdapter", "big image not ready, set loading img. position: %d, media id: %s.", java.lang.Integer.valueOf(i49), jj4Var2.f459388d);
                    jkVar2.f251048b.setVisibility(i47);
                    jkVar2.f251049c.setVisibility(i47);
                    jkVar2.f251049c.setAlpha(0.1f);
                    jkVar2.f251049c.animate().alpha(1.0f).setDuration(2000L).setListener(null);
                    jkVar2.f251051e.setVisibility(8);
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.D(c18064xe6e1a3b33)) {
                        str5 = "lambda$useMultiTouchImageView$6";
                        str6 = str4;
                        c18064xe6e1a3b33.m0(jkVar2.f251050d, i49);
                    } else {
                        jkVar2.f251050d.setVisibility(8);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(jkVar2.f251048b);
                        str6 = str4;
                        str5 = "lambda$useMultiTouchImageView$6";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().l0(jj4Var2, jkVar2.f251048b, com.p314xaae8f345.mm.R.C30861xcebc809e.bgn, bkVar.f249450g.hashCode(), s7Var3);
                    }
                    if (z17) {
                        jkVar2.f251049c.setVisibility(8);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str6);
            }
        };
        hj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String str4 = jj4Var.f459388d;
        if (str4 == null || str4.equals("")) {
            str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
            str2 = "useMultiTouchImageView";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            java.lang.String r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.r(jj4Var);
            if (i38 == 2) {
                r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.u(jj4Var);
                i27 = 8;
            } else if ((i38 == 1 || i38 == 4) && !android.text.TextUtils.isEmpty(jj4Var.A1)) {
                r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.q(jj4Var);
                i27 = 9;
            } else {
                i27 = 3;
            }
            java.lang.String x17 = ca4.z0.x(i27, jj4Var.f459388d);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().l(jj4Var.f459388d)) {
                hj6.t0(c21524xecd57b9a, x17, false, -1, hashCode, -1, -1);
                c2Var.a(null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                str2 = "useMultiTouchImageView";
            } else {
                android.graphics.Bitmap m17 = hj6.m(hj6.f245788d, x17);
                if (ca4.z0.f(m17)) {
                    hj6.t0(c21524xecd57b9a, x17, false, -1, hashCode, m17.getWidth(), m17.getHeight());
                    c2Var.a(m17);
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    str2 = "useMultiTouchImageView";
                } else {
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    java.lang.String str5 = r17;
                    str2 = "useMultiTouchImageView";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.bj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o1(hj6, str5, c21524xecd57b9a, x17, hashCode, z27, i38, jj4Var, s7Var2, t07, e17, c2Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
    }
}
