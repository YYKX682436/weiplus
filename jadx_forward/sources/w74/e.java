package w74;

/* loaded from: classes4.dex */
public class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f525067d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f525068e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f525069f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f525070g;

    /* renamed from: h, reason: collision with root package name */
    public z84.i f525071h;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        if (c1163xf1deaba4 != null) {
            this.f525067d = c1163xf1deaba4;
            this.f525070g = c1163xf1deaba4.getContext();
        } else {
            this.f525070g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (c17933xe8d1b226 != null) {
            if (c17933xe8d1b226.m70354x74235b3e() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                s34.h0 h0Var = m70354x74235b3e.f38179x76826a54;
                if (h0Var != null && !a84.b0.b(h0Var.f484189f)) {
                    this.f525069f = c17933xe8d1b226;
                    this.f525068e = m70354x74235b3e.f38179x76826a54.f484189f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.RecyclerViewAdapter", "the adFinderTopicInfo or resource info list is null, initialize adapter failed!!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.RecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public void B(w74.f fVar, s34.i0 i0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        a84.z.d(i0Var.f484192a, fVar.f525074f, 1);
        java.lang.String str = i0Var.f484193b;
        android.widget.TextView textView = fVar.f525075g;
        a84.y0.l(textView, str);
        a84.y0.k(textView, (int) (((i17 - i65.a.b(this.f525070g, 80)) - a84.y0.a(textView, i0Var.f484198g)) + 0.5f));
        boolean isEmpty = android.text.TextUtils.isEmpty(i0Var.f484198g);
        android.widget.TextView textView2 = fVar.f525076h;
        if (isEmpty) {
            a84.y0.p(textView2, false);
        } else {
            a84.y0.p(textView2, true);
            a84.y0.l(textView2, i0Var.f484198g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        java.util.List list = this.f525068e;
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            return 0;
        }
        int size = ((java.util.ArrayList) list).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return j17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        s34.i0 x17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        w74.f fVar = (w74.f) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            x17 = x(i17);
            c1163xf1deaba4 = this.f525067d;
        } catch (java.lang.Throwable unused) {
        }
        if (x17 != null && c1163xf1deaba4 != null && fVar != null) {
            int width = c1163xf1deaba4.getWidth();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
            a84.y0.n(fVar.f525076h);
            a84.y0.n(fVar.f525073e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
            B(fVar, x17, width);
            y(fVar, x17, width);
            z(fVar, x17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.RecyclerViewAdapter", "the res info or recyclerView is null!!!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        z84.i iVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            iVar = this.f525071h;
            c1163xf1deaba4 = this.f525067d;
        } catch (java.lang.Throwable unused) {
        }
        if (view == null || c1163xf1deaba4 == null || iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.RecyclerViewAdapter", "the recycler view or click listener is null!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } else {
            if (view.getParent() != c1163xf1deaba4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(view);
            if (w07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RecyclerViewAdapter", "I think the statement can't be reached, why?");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            } else {
                iVar.b(c1163xf1deaba4, view, w07.m8183xf806b362());
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        w74.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        android.content.Context context = this.f525070g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            viewGroup.getWidth();
            android.view.View g17 = a84.y0.g(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cov, viewGroup, false);
            int b17 = i65.a.b(context, 8);
            if (g17 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) {
                float f17 = b17;
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) g17).b(f17, f17, 0.0f, 0.0f);
            }
            if (g17 != null) {
                g17.setOnClickListener(this);
                fVar = new w74.f(g17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RecyclerViewAdapter", "the inflated view is null????");
                w74.f fVar2 = new w74.f(new android.view.View(viewGroup.getContext()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                fVar = fVar2;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RecyclerViewAdapter", "onCreateViewHolder failed????");
            fVar = new w74.f(new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return fVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        w74.f fVar = (w74.f) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        super.mo8161x38c82990(fVar);
        try {
            fVar.m8183xf806b362();
            a84.y0.c(fVar.f525073e);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public s34.i0 x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            java.util.List list = this.f525068e;
            if (list != null && i17 >= 0 && i17 < ((java.util.ArrayList) list).size()) {
                s34.i0 i0Var = (s34.i0) ((java.util.ArrayList) this.f525068e).get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return i0Var;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.RecyclerViewAdapter", "the getResInfo has something wrong " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return null;
    }

    public void y(w74.f fVar, s34.i0 i0Var, int i17) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        float a17 = a84.y0.a(fVar.f525078m, i0Var.f484194c);
        android.content.Context context = this.f525070g;
        a84.y0.l(fVar.f525078m, i0Var.f484194c);
        android.widget.TextView textView = fVar.f525079n;
        a84.y0.k(textView, (int) (((i17 - i65.a.b(context, 76)) - a17) + 0.5f));
        a84.y0.l(textView, i0Var.f484195d);
        float b17 = i65.a.b(context, 100);
        float f17 = i0Var.f484197f;
        if (f17 <= 0.0f) {
            f17 = 0.8f;
        }
        int a18 = a84.c0.a(i0Var.f484196e, -352965);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        android.view.ViewGroup viewGroup = fVar.f525077i;
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        } else {
            try {
                android.graphics.drawable.Drawable background = viewGroup.getBackground();
                if (background instanceof android.graphics.drawable.GradientDrawable) {
                    gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
                    gradientDrawable.mutate();
                } else {
                    gradientDrawable = new android.graphics.drawable.GradientDrawable();
                }
                gradientDrawable.setShape(0);
                gradientDrawable.setAlpha((int) ((f17 * 255.0f) + 0.5f));
                gradientDrawable.setColor(a18);
                gradientDrawable.setCornerRadius(b17);
                viewGroup.setBackground(gradientDrawable);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewUtils", "setRoundBackground error.");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public void z(w74.f fVar, s34.i0 i0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (i0Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.RecyclerViewAdapter", "the resInfo is sight");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            r45.jj4 jj4Var = i0Var.f484200i;
            android.widget.ImageView imageView = fVar.f525072d;
            int hashCode = this.f525070g.hashCode();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
            s7Var.f276846b = this.f525069f.m70371x485d7().f39015xc86e6609;
            hj6.l0(jj4Var, imageView, -1, hashCode, s7Var);
            a84.y0.p(fVar.f525073e, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } else {
            a84.z.d(i0Var.f484200i.f459393i, fVar.f525072d, 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }
}
