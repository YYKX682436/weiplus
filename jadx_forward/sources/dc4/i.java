package dc4;

/* loaded from: classes4.dex */
public final class i extends dc4.v implements i64.k0 {
    public android.view.ViewStub A;
    public a44.k B;
    public n74.j1 C;
    public android.view.ViewStub D;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 E;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v F;
    public int G;
    public int H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l I;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f310285p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f310286q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f310287r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f310288s;

    /* renamed from: t, reason: collision with root package name */
    public final int f310289t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f310290u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f310291v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f310292w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 f310293x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f310294y;

    /* renamed from: z, reason: collision with root package name */
    public r74.a0 f310295z;

    public i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mActivity, "mActivity");
        this.f310285p = c19807x593d1720;
        this.f310286q = c17933xe8d1b226;
        this.f310287r = b1Var;
        this.f310288s = mActivity;
        this.f310289t = i17;
        this.f310290u = k4Var;
        this.f310292w = jz5.h.b(new dc4.d(this));
    }

    public static final void l(dc4.i iVar, android.view.View view, r45.jj4 jj4Var, int i17, int i18) {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = iVar.f310286q;
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            } else if (i17 <= 0 || i18 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdCombineGridDetailItem", "fillAdLivingView materialWidth or materialHeight less than 0");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            } else {
                n74.j1 j1Var = iVar.C;
                i64.b1 b1Var2 = iVar.f310287r;
                if (j1Var != null) {
                    android.app.Activity activity = iVar.f310288s;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    int i19 = b1Var2 != null ? b1Var2.f370628j : 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    b1Var = b1Var2;
                    j1Var.b(activity, c17933xe8d1b226, view, i19, true);
                } else {
                    b1Var = b1Var2;
                }
                if (ca4.m0.X(iVar.q()) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(c17933xe8d1b226)) {
                    android.view.ViewStub viewStub = iVar.D;
                    if (viewStub != null && iVar.E == null) {
                        iVar.E = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75) a84.y0.h(viewStub);
                    }
                    if (iVar.E == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdCombineGridDetailItem", "fillAdLivingView but adLivingContainer is null");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCombineGridDetailItem", "showAdLivingStream fillAdLivingView");
                        r74.a0 a0Var = iVar.f310295z;
                        if (a0Var != null) {
                            a0Var.m(r74.l.f474752d);
                        }
                        a84.y0.o(iVar.E, i17, i18);
                        if (iVar.F == null) {
                            iVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v(iVar.E);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = iVar.F;
                        if (vVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = iVar.f310286q;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                            int i27 = b1Var != null ? b1Var.f370628j : 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                            vVar.d(c17933xe8d1b2262, i27, jj4Var, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        }
                        if (c17933xe8d1b226.m70378x4c74e984()) {
                            r74.a0 a0Var2 = iVar.f310295z;
                            if (a0Var2 != null) {
                                a0Var2.m(r74.l.f474755g);
                            }
                        } else {
                            l44.b3.f397574a.h(iVar.f310365e);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar2 = iVar.F;
                            if (vVar2 != null) {
                                vVar2.i();
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$fillAdLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public static final /* synthetic */ int m(dc4.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int i17 = iVar.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return i17;
    }

    public static final /* synthetic */ void n(dc4.i iVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.H = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public static final /* synthetic */ void o(dc4.i iVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        iVar.G = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setAdLivingContainerWidth$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        this.f310291v = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        this.f310367g = view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310286q;
        this.f310365e = c17933xe8d1b226;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310285p;
        this.f310364d = c19807x593d1720;
        if ((c19807x593d1720 != null ? c19807x593d1720.Id : null) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d1720 != null ? c19807x593d1720.Id : null);
        }
        r();
        boolean X = ca4.m0.X(q());
        i64.b1 b1Var = this.f310287r;
        if (X) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807((android.content.Context) this.f310288s, true);
            this.f310293x = c18390xafce807;
            c18390xafce807.x(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = this.f310293x;
            if (c18390xafce8072 != null) {
                c18390xafce8072.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = this.f310293x;
            if (c18390xafce8073 != null) {
                c18390xafce8073.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            a84.y0.o(this.f310293x, -1, -1);
            a84.y0.p(this.f310293x, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f310292w).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            a84.y0.b(viewGroup, this.f310293x, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8074 = this.f310293x;
            if (c18390xafce8074 != null) {
                c18390xafce8074.m71201x30fe4db(new dc4.a(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8075 = this.f310293x;
            if (c18390xafce8075 != null) {
                c18390xafce8075.m70655x360a109e(new z74.e(this.f310365e, c18390xafce8075, b1Var, 4));
            }
        }
        this.A = (android.view.ViewStub) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.g6y);
        this.D = (android.view.ViewStub) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.n4i);
        this.f310295z = new r74.a0(this.f310291v, this.f310288s, this.f310286q, this.f310287r, this.f310289t, dc4.b.f310250d, dc4.c.f310254d, this.f310290u, this.f310372o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnAdRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(c17933xe8d1b226);
            if (!android.text.TextUtils.isEmpty(T) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", T)) {
                b1Var.a(T, this);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnAdRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(this.f310286q) && (vVar = this.F) != null) {
            vVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310286q;
        if (uVar.a(c17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.F;
            if (vVar != null) {
                vVar.g();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        if (this.f310294y) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f310293x;
            if (c18390xafce807 != null) {
                c18390xafce807.F();
            }
            i64.b1 b1Var = this.f310287r;
            if (b1Var != null) {
                b1Var.q(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310286q;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = c17933xe8d1b226.m70354x74235b3e().f38162xfb2a357c;
        if (m0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310285p;
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        r45.jj4 r17 = r();
        java.lang.Integer valueOf = r17 != null ? java.lang.Integer.valueOf(r17.f459389e) : null;
        this.f310294y = false;
        android.app.Activity activity = this.f310288s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jw jwVar = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) activity).K2 : null;
        if (this.C == null) {
            this.C = new n74.j1();
        }
        r74.a0 a0Var = this.f310295z;
        if (a0Var != null) {
            a0Var.l(m0Var, valueOf, c17933xe8d1b226, r(), this.f310285p, c17933xe8d1b226.m70363x51f8f990(), jwVar, this.C);
        }
        if (this.B == null) {
            this.B = new a44.k(this.A, this.f310367g);
        }
        m0Var.b();
        r74.a0 a0Var2 = this.f310295z;
        if (a0Var2 != null) {
            a0Var2.k(m0Var, new dc4.e(this));
        }
        if (this.I == null) {
            this.I = new dc4.h(c17933xe8d1b226, this, activity, this.f310291v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar = this.I;
        if (lVar != null) {
            lVar.f(c17933xe8d1b226);
        }
        if (ca4.m0.X(q())) {
            this.f310294y = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f310293x;
            if (c18390xafce807 != null) {
                c18390xafce807.m70644x764d819b(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = this.f310293x;
            if (c18390xafce8072 != null) {
                c18390xafce8072.P(r(), c17933xe8d1b226.m70363x51f8f990(), c19807x593d1720.f39015xc86e6609);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = this.f310293x;
            if (c18390xafce8073 != null) {
                c18390xafce8073.a();
            }
            if (c17933xe8d1b226.m70378x4c74e984()) {
                r74.a0 a0Var3 = this.f310295z;
                if (a0Var3 != null) {
                    a0Var3.m(r74.l.f474755g);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(this.f310365e)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCombineGridDetailItem", "startPlay");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8074 = this.f310293x;
                    if (c18390xafce8074 != null) {
                        if (c18390xafce8074.w() || c18390xafce8074.f0()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCombineGridDetailItem", "onlineVideo, resumePlay, hash=" + hashCode());
                            c18390xafce8074.K();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCombineGridDetailItem", "onlineVideo, onResume, hash=" + hashCode());
                            l44.b3.f397574a.h(this.f310365e);
                            c18390xafce8074.C();
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    public final android.app.Activity p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMActivity", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMActivity", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return this.f310288s;
    }

    public final int q() {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310285p;
        int i17 = (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) ? 0 : a90Var.f451370e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return i17;
    }

    public final r45.jj4 r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        r45.jj4 jj4Var = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310285p;
        if ((c19807x593d1720 != null ? c19807x593d1720.f39014x86965dde : null) != null && c19807x593d1720.f39014x86965dde.f451373h.size() >= 1) {
            jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return jj4Var;
    }
}
