package bg2;

/* loaded from: classes2.dex */
public final class j0 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f20180e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView f20181f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f20182g;

    /* renamed from: h, reason: collision with root package name */
    public bm2.o1 f20183h;

    /* renamed from: i, reason: collision with root package name */
    public long f20184i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20185m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20186n;

    /* renamed from: o, reason: collision with root package name */
    public int f20187o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20186n = true;
    }

    public static final void Y6(bg2.j0 j0Var) {
        android.view.View view;
        uc2.i iVar;
        j0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        in5.s0 s0Var = j0Var.f417141d.f417149i;
        if (s0Var == null || (view = s0Var.itemView) == null || (iVar = (uc2.i) j0Var.O6(uc2.i.class)) == null) {
            return;
        }
        ((sb2.o) iVar).Y6(view, intent);
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.djv) : null;
        this.f20180e = viewGroup;
        this.f20181f = viewGroup != null ? (com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView) viewGroup.findViewById(com.tencent.mm.R.id.dju) : null;
        android.view.ViewGroup viewGroup2 = this.f20180e;
        this.f20182g = viewGroup2 != null ? (android.view.ViewGroup) viewGroup2.findViewById(com.tencent.mm.R.id.djx) : null;
    }

    @Override // tc2.c
    public void Q6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.kr0 styleInfo;
        r45.qg6 qg6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        r45.kr0 styleInfo2;
        r45.qg6 qg6Var2;
        android.content.Context context;
        this.f20186n = true;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        int i17 = 0;
        boolean z17 = d2Var != null ? d2Var.f20013i : false;
        this.f20185m = z17;
        if (!z17) {
            android.view.ViewGroup viewGroup = this.f20180e;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f20180e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        bg2.u uVar = (bg2.u) N6(bg2.u.class);
        bm2.o1 o1Var = new bm2.o1(uVar != null ? uVar.f20541o : null);
        o1Var.f22181n = new bg2.e0(this);
        this.f20183h = o1Var;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView finderLiveFeedExptCommentRecyclerView = this.f20181f;
        tc2.g gVar = this.f417141d;
        if (finderLiveFeedExptCommentRecyclerView != null) {
            finderLiveFeedExptCommentRecyclerView.setAdapter(o1Var);
            in5.s0 s0Var = gVar.f417149i;
            finderLiveFeedExptCommentRecyclerView.setLayoutManager((s0Var == null || (context = s0Var.f293121e) == null) ? null : new com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager(context));
            finderLiveFeedExptCommentRecyclerView.setMaxHeight(i65.a.b(finderLiveFeedExptCommentRecyclerView.getContext(), 112));
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView finderLiveFeedExptCommentRecyclerView2 = this.f20181f;
        if (finderLiveFeedExptCommentRecyclerView2 != null) {
            ym5.a1.h(finderLiveFeedExptCommentRecyclerView2, new bg2.f0(this));
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        int integer = ((baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (styleInfo2 = feedObject2.getStyleInfo()) == null || (qg6Var2 = (r45.qg6) styleInfo2.getCustom(3)) == null) ? 0 : qg6Var2.getInteger(2)) * 1000;
        com.tencent.mars.xlog.Log.i("LiveConvertCommentUIController", "delayShowMs:" + integer);
        if (integer > 0) {
            android.view.ViewGroup viewGroup3 = this.f20180e;
            if (viewGroup3 != null) {
                viewGroup3.setAlpha(0.0f);
            }
            bg2.u uVar2 = (bg2.u) N6(bg2.u.class);
            if (uVar2 != null) {
                com.tencent.mars.xlog.Log.i(uVar2.f20534e, "setBarrier true");
                uVar2.f20540n = true;
            }
            kotlinx.coroutines.y0 y0Var = gVar.f417147g;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new bg2.g0(integer, this, null), 3, null);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f20180e;
        if (viewGroup4 != null) {
            viewGroup4.setAlpha(1.0f);
        }
        if (this.f20186n) {
            this.f20186n = false;
            bg2.y0 y0Var2 = (bg2.y0) N6(bg2.y0.class);
            if (y0Var2 != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
                if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null && (styleInfo = feedObject.getStyleInfo()) != null && (qg6Var = (r45.qg6) styleInfo.getCustom(3)) != null) {
                    i17 = qg6Var.getInteger(2);
                }
                y0Var2.Y6(3L, i17 * 1000, "{comment_msg_cnt:" + this.f20187o + '}');
            }
        }
    }

    @Override // tc2.c
    public void U6() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewGroup viewGroup = this.f20182g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.f20185m = false;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView finderLiveFeedExptCommentRecyclerView = this.f20181f;
        if (finderLiveFeedExptCommentRecyclerView == null || (animate = finderLiveFeedExptCommentRecyclerView.animate()) == null) {
            return;
        }
        animate.cancel();
    }

    public final void Z6() {
        android.content.Context context;
        android.content.res.Resources resources;
        java.lang.String string;
        bg2.u uVar;
        boolean z17 = this.f20185m;
        if (z17) {
            java.lang.String str = null;
            if (z17 && (uVar = (bg2.u) N6(bg2.u.class)) != null) {
                int i17 = uVar.f20536g;
                bm2.o1 o1Var = this.f20183h;
                java.util.ArrayList arrayList = o1Var != null ? o1Var.f22180m : null;
                java.util.List list = uVar.f20537h;
                this.f20187o = list.size();
                if ((arrayList != null ? arrayList.size() : 0) < i17) {
                    int min = java.lang.Math.min(list.size(), i17);
                    int size = arrayList != null ? arrayList.size() : 0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    java.util.List K0 = kz5.n0.K0(list, min);
                    if (arrayList != null) {
                        arrayList.addAll(K0);
                    }
                    bm2.o1 o1Var2 = this.f20183h;
                    if (o1Var2 != null) {
                        o1Var2.notifyItemRangeInserted(size, java.lang.Math.max(min - size, 0));
                    }
                    com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView finderLiveFeedExptCommentRecyclerView = this.f20181f;
                    if (finderLiveFeedExptCommentRecyclerView != null) {
                        finderLiveFeedExptCommentRecyclerView.post(new bg2.h0(this));
                    }
                }
            }
            if (this.f20185m) {
                bg2.u uVar2 = (bg2.u) N6(bg2.u.class);
                java.util.List list2 = uVar2 != null ? uVar2.f20537h : null;
                int size2 = (list2 != null ? list2.size() : 0) - (uVar2 != null ? uVar2.f20536g : 5);
                if (size2 <= 0) {
                    return;
                }
                android.view.ViewGroup viewGroup = this.f20182g;
                android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.djw) : null;
                if (textView != null) {
                    com.tencent.mm.ui.fk.a(textView);
                }
                java.lang.String valueOf = size2 <= 99 ? java.lang.String.valueOf(size2) : "99+";
                if (textView != null) {
                    in5.s0 s0Var = this.f417141d.f417149i;
                    if (s0Var != null && (context = s0Var.f293121e) != null && (resources = context.getResources()) != null && (string = resources.getString(com.tencent.mm.R.string.dzs)) != null) {
                        str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf}, 1));
                        kotlin.jvm.internal.o.f(str, "format(...)");
                    }
                    textView.setText(str);
                }
                android.view.ViewGroup viewGroup2 = this.f20182g;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                android.view.ViewGroup viewGroup3 = this.f20182g;
                if (viewGroup3 != null) {
                    viewGroup3.setOnClickListener(new bg2.i0(this));
                }
            }
        }
    }

    @Override // tc2.h
    public void onLiveMsg(r45.r71 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        Z6();
    }

    @Override // tc2.h
    public void onLiveStart(r45.hc1 hc1Var) {
        Z6();
    }
}
