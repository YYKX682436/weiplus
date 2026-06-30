package k74;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f386322a;

    /* renamed from: b, reason: collision with root package name */
    public final i74.k f386323b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f386324c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f386325d;

    /* renamed from: e, reason: collision with root package name */
    public k74.j f386326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f386327f;

    /* renamed from: g, reason: collision with root package name */
    public final k74.e f386328g;

    /* renamed from: h, reason: collision with root package name */
    public final k74.d f386329h;

    /* renamed from: i, reason: collision with root package name */
    public final k74.f f386330i;

    public h(android.content.Context mContext, i74.k kVar, i74.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f386322a = mContext;
        this.f386323b = kVar;
        this.f386324c = lVar;
        this.f386328g = new k74.e(this);
        this.f386329h = new k74.d(this);
        this.f386330i = new k74.f(this);
    }

    public static final /* synthetic */ k74.j a(k74.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMViewHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        k74.j jVar = hVar.f386326e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMViewHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return jVar;
    }

    public final java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNotInterestReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.k kVar = this.f386323b;
        java.util.Map i17 = kVar != null ? ((i74.a) kVar).i("reason_list") : null;
        java.lang.Object obj = i17 != null ? ((android.util.ArrayMap) i17).get("reason_list") : null;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNotInterestReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return list;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        k74.j jVar = this.f386326e;
        boolean z17 = false;
        if (jVar != null && (b17 = jVar.b()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
            java.util.Iterator it = ((java.util.ArrayList) b17.f244728h).iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    break;
                }
                if (((android.widget.TextView) it.next()).isSelected()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    z17 = true;
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return z17;
    }

    public final void d(boolean z17) {
        android.widget.TextView a17;
        android.widget.TextView a18;
        android.widget.TextView a19;
        android.widget.TextView a27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        android.content.Context context = this.f386322a;
        if (z17) {
            k74.j jVar = this.f386326e;
            if (jVar != null && (a27 = jVar.a()) != null) {
                a27.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
            }
            k74.j jVar2 = this.f386326e;
            if (jVar2 != null && (a19 = jVar2.a()) != null) {
                a19.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563637co4);
            }
            k74.j jVar3 = this.f386326e;
            android.widget.TextView a28 = jVar3 != null ? jVar3.a() : null;
            if (a28 != null) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                a28.setText(string);
            }
        } else {
            k74.j jVar4 = this.f386326e;
            if (jVar4 != null && (a18 = jVar4.a()) != null) {
                a18.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abu));
            }
            k74.j jVar5 = this.f386326e;
            if (jVar5 != null && (a17 = jVar5.a()) != null) {
                a17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563638co5);
            }
            k74.j jVar6 = this.f386326e;
            android.widget.TextView a29 = jVar6 != null ? jVar6.a() : null;
            if (a29 != null) {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574721ls3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                a29.setText(string2);
            }
        }
        if (this.f386327f ^ z17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", "hasSelectItem state changed", null);
            i74.l lVar = this.f386324c;
            if (lVar instanceof k74.i) {
                k74.i iVar = (k74.i) lVar;
                iVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
                try {
                    if (iVar.f386332e != null && iVar.f386333f != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        iVar.f386333f.getWindowVisibleDisplayFrame(rect);
                        int c17 = iVar.c(iVar.f(iVar.f386333f), rect, iVar.f386332e.getContentView());
                        iVar.j(c17);
                        iVar.f386332e.update(iVar.f386333f, 0, c17, -1, -1);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackNewStylePromptManager", "updatePosition, exp=" + e17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
            }
        }
        this.f386327f = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
    }

    public final void e(android.view.View contentView) {
        java.lang.Object obj;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b17;
        android.view.View c17;
        android.widget.TextView a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        i74.l lVar = this.f386324c;
        if (lVar != null) {
            lVar.a();
        }
        this.f386325d = contentView;
        java.lang.Object tag = contentView.getTag(com.p314xaae8f345.mm.R.id.qae);
        k74.j jVar = tag instanceof k74.j ? (k74.j) tag : null;
        this.f386326e = jVar;
        if (jVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            return;
        }
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            android.view.View view = jVar.f386346h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            if (view != null) {
                view.addOnLayoutChangeListener(new k74.g(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.k kVar = this.f386323b;
        java.util.Map i17 = kVar != null ? ((i74.a) kVar).i("complaint_content") : null;
        if (i17 == null || (obj = ((android.util.ArrayMap) i17).get("complaint_content")) == null) {
            obj = "";
        }
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str != null ? str : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        boolean z17 = true;
        boolean z18 = false;
        if (str2.length() == 0) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574716j81);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
        }
        k74.j jVar2 = this.f386326e;
        if (jVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            textView = jVar2.f386345g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str2);
        }
        k74.j jVar3 = this.f386326e;
        if (jVar3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            android.view.View view2 = jVar3.f386344f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            if (view2 != null) {
                view2.setOnClickListener(this.f386329h);
            }
        }
        k74.j jVar4 = this.f386326e;
        if (jVar4 != null && (a17 = jVar4.a()) != null) {
            a17.setOnClickListener(this.f386330i);
        }
        this.f386327f = false;
        d(false);
        java.util.List<j74.c> b18 = b();
        if (b18 != null && b18.isEmpty()) {
            k74.j jVar5 = this.f386326e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b19 = jVar5 != null ? jVar5.b() : null;
            if (b19 != null) {
                b19.setVisibility(8);
            }
            k74.j jVar6 = this.f386326e;
            android.view.ViewGroup.LayoutParams layoutParams = (jVar6 == null || (c17 = jVar6.c()) == null) ? null : c17.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            k74.j jVar7 = this.f386326e;
            android.view.View c18 = jVar7 != null ? jVar7.c() : null;
            if (c18 != null) {
                c18.setLayoutParams(layoutParams);
            }
        } else {
            k74.j jVar8 = this.f386326e;
            if (jVar8 != null && (b17 = jVar8.b()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                k74.e listener = this.f386328g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
                b17.removeAllViews();
                java.util.ArrayList arrayList = (java.util.ArrayList) b17.f244728h;
                arrayList.clear();
                b17.f244730m = listener;
                if (b18 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViews", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    for (j74.c cVar : b18) {
                        java.lang.String str3 = cVar.f379598b;
                        if (!((str3 == null || str3.length() == 0) ? z17 : z18)) {
                            java.lang.String mReason = cVar.f379598b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mReason, "mReason");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createReasonItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                            android.widget.TextView textView2 = new android.widget.TextView(b17.getContext());
                            c44.a.o();
                            if (textView2.getLayoutParams() == null) {
                                c44.a.o();
                                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                                layoutParams2.width = -2;
                                textView2.setLayoutParams(layoutParams2);
                            }
                            c44.a.o();
                            if (textView2.getLayoutParams() == null) {
                                c44.a.o();
                                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                                layoutParams3.height = -2;
                                textView2.setLayoutParams(layoutParams3);
                            }
                            textView2.setPadding(c44.b.a(12), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), c44.b.a(8), textView2.getPaddingRight(), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), c44.b.a(12), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), c44.b.a(8));
                            textView2.setIncludeFontPadding(false);
                            textView2.setSingleLine(true);
                            textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
                            textView2.setTextColor(textView2.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a4v));
                            z18 = false;
                            textView2.setTextSize(0, (int) ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
                            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b0u);
                            textView2.setText(mReason);
                            textView2.setOnClickListener(b17.f244735r);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createReasonItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                            textView2.setTag(com.p314xaae8f345.mm.R.id.n2f, cVar);
                            arrayList.add(textView2);
                            b17.addView(textView2);
                            z17 = true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViews", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
    }
}
