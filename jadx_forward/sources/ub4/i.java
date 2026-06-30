package ub4;

/* loaded from: classes4.dex */
public class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f507701e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f507704h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f507705i;

    /* renamed from: s, reason: collision with root package name */
    public final ub4.k f507712s;

    /* renamed from: u, reason: collision with root package name */
    public final ub4.b f507714u;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f507700d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f507702f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f507703g = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f507706m = false;

    /* renamed from: n, reason: collision with root package name */
    public long f507707n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f507708o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f507709p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f507710q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f507711r = "";

    /* renamed from: t, reason: collision with root package name */
    public ub4.l f507713t = null;

    public i(android.content.Context context, java.lang.String str, ub4.b bVar) {
        this.f507701e = null;
        this.f507704h = "";
        this.f507705i = false;
        this.f507712s = null;
        this.f507714u = null;
        this.f507701e = context;
        this.f507714u = bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        } else {
            o17.equals("zh_HK");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        }
        this.f507704h = str;
        gm0.j1.i();
        if (str.equals((java.lang.String) gm0.j1.u().c().l(2, null))) {
            this.f507705i = true;
        }
        this.f507712s = new ub4.k(new ub4.a(this), str, this.f507705i);
        I(0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "limitId=%s", this.f507703g);
        E(false);
    }

    public static /* synthetic */ java.util.List x(ub4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.util.List list = iVar.f507700d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return list;
    }

    public static /* synthetic */ android.content.Context y(ub4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        android.content.Context context = iVar.f507701e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return context;
    }

    public void B(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        E(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public void E(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "limitSeq " + this.f507703g);
        ub4.k kVar = this.f507712s;
        if (kVar != null) {
            java.lang.String str = this.f507703g;
            boolean z18 = this.f507706m;
            kVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapterHelper", "limitSeq " + str);
            kVar.f507717e = str;
            kVar.f507718f = z18;
            kVar.a(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public final void I(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        java.lang.String str = this.f507704h;
        int j18 = Kj.j(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        Fj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long T1 = Fj.T1(Fj.D2(false, str, this.f507705i, false), j17, j18, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String s07 = ca4.z0.s0(T1);
        if (this.f507702f.equals("")) {
            this.f507703g = s07;
        } else {
            this.f507703g = s07.compareTo(this.f507702f) < 0 ? s07 : this.f507702f;
        }
        r45.cp0 t07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(str).t0();
        long j19 = t07.f453293e;
        if (j19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f507702f, this.f507703g, java.lang.Long.valueOf(t07.f453293e), java.lang.Long.valueOf(t07.f453292d));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            return;
        }
        java.lang.String s08 = ca4.z0.s0(j19);
        if (this.f507703g.equals("")) {
            this.f507703g = s08;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimitSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f507702f, this.f507703g, java.lang.Long.valueOf(t07.f453293e), java.lang.Long.valueOf(t07.f453292d));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18), s07, this.f507702f, this.f507703g, java.lang.Long.valueOf(t07.f453293e), java.lang.Long.valueOf(t07.f453292d));
            if (s08.compareTo(this.f507703g) <= 0) {
                s08 = this.f507703g;
            }
            this.f507703g = s08;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        int size = ((java.util.ArrayList) this.f507700d).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        java.util.List list = this.f507700d;
        int i18 = "loading".equals(((ub4.c) ((java.util.ArrayList) list).get(i17)).f507686b) ? 1 : "my_timeline".equals(((ub4.c) ((java.util.ArrayList) list).get(i17)).f507686b) ? 2 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        if (k3Var instanceof ub4.d) {
            ub4.d dVar = (ub4.d) k3Var;
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            ub4.i iVar = dVar.f507688e;
            boolean z17 = iVar.f507709p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6 c17969xa50b38d6 = dVar.f507687d;
            if (z17) {
                c17969xa50b38d6.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                java.lang.String str = iVar.f507710q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                c17969xa50b38d6.b(0, str);
            } else {
                c17969xa50b38d6.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
        } else if (k3Var instanceof ub4.h) {
            ub4.h hVar = (ub4.h) k3Var;
            hVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            ub4.i iVar2 = hVar.f507699i;
            ub4.c cVar = (ub4.c) ((java.util.ArrayList) x(iVar2)).get(i17);
            ub4.c cVar2 = i17 > 1 ? (ub4.c) ((java.util.ArrayList) x(iVar2)).get(i17 - 1) : null;
            int m70359xfb803656 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) cVar.f507685a.get(0)).m70359xfb803656();
            int m70359xfb8036562 = cVar2 == null ? 0 : ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) cVar2.f507685a.get(0)).m70359xfb803656();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            int i18 = m70359xfb803656 / 10000;
            int i19 = m70359xfb8036562 / 10000;
            android.widget.TextView textView = hVar.f507695e;
            if ((m70359xfb8036562 != 0 || i18 == com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f()) && (m70359xfb8036562 == 0 || i18 == i19)) {
                textView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams = hVar.f3639x46306858.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                    hVar.f3639x46306858.setLayoutParams(marginLayoutParams);
                }
            } else {
                textView.setText(java.lang.String.format(y(iVar2).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6), java.lang.Integer.valueOf(i18)));
                textView.setVisibility(0);
                android.view.ViewGroup.LayoutParams layoutParams2 = hVar.f3639x46306858.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    if (m70359xfb8036562 != 0) {
                        marginLayoutParams2.topMargin = i65.a.b(textView.getContext(), 70);
                    } else {
                        marginLayoutParams2.topMargin = i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                    }
                    hVar.f3639x46306858.setLayoutParams(marginLayoutParams2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            java.lang.String str2 = cVar.f507686b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            boolean contains = str2.contains("/");
            android.widget.TextView textView2 = hVar.f507696f;
            if (contains) {
                java.lang.String[] split = str2.split("/");
                if (split.length > 1) {
                    textView2.setText(split[1]);
                }
            } else {
                textView2.setText(str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = hVar.f507698h;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = hVar.f507697g;
            c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
            ub4.p pVar = hVar.f507694d;
            c1163xf1deaba4.mo7960x6cab2c8d(pVar);
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226> list = cVar.f507685a;
            pVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            java.util.ArrayList arrayList = (java.util.ArrayList) pVar.f507727d;
            arrayList.clear();
            for (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 : list) {
                java.util.Iterator it = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.iterator();
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    ub4.e eVar = new ub4.e();
                    eVar.f507689a = c17933xe8d1b226.f38324x142bbdc6;
                    eVar.f507690b = jj4Var;
                    arrayList.add(eVar);
                }
            }
            pVar.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
        } else if (k3Var instanceof ub4.g) {
            ((ub4.g) k3Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 dVar = i17 == 1 ? new ub4.d(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cql, viewGroup, false)) : i17 == 2 ? new ub4.g(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqn, viewGroup, false)) : new ub4.h(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqk, viewGroup, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return dVar;
    }

    public void z() {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "i addSize ");
        java.util.List list = this.f507700d;
        if (((java.util.ArrayList) list).size() > 1) {
            java.util.List list2 = ((ub4.c) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 2)).f507685a;
            if (!list2.isEmpty()) {
                j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) list2.get(list2.size() - 1)).f68891x29d1292e;
                I(j17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        j17 = 0;
        I(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }
}
