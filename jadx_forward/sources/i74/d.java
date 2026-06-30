package i74;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {
    public final i74.k A;
    public int B;
    public int C;
    public int D;
    public android.view.ViewGroup E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 F;
    public boolean G = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f370994d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f370995e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f370996f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f370997g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f370998h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f370999i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f371000m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f371001n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f371002o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f371003p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f371004q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f371005r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f371006s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f371007t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f371008u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f371009v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f371010w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f371011x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f371012y;

    /* renamed from: z, reason: collision with root package name */
    public final i74.l f371013z;

    public d(android.content.Context context, i74.k kVar, i74.l lVar) {
        this.f370994d = context;
        this.A = kVar;
        this.f371013z = lVar;
    }

    public final void a(int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackDisplayer", "adjustTitleView() called with: visibility = [" + i17 + "]");
        try {
            if (i17 == 0) {
                android.widget.TextView textView = this.f371010w;
                int width = textView != null ? textView.getWidth() : 0;
                if (this.C == width) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackDisplayer", "adjustTitleView() just return");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                if (width != 0) {
                    this.C = width;
                }
                int i18 = this.C;
                if (i18 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackDisplayer", "adjustTitleView() not get width");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                layoutParams = new android.widget.RelativeLayout.LayoutParams((this.B - i18) - (this.D * 2), -2);
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                new android.widget.RelativeLayout.LayoutParams(-1, -2);
            }
            int i19 = this.D;
            layoutParams.topMargin = i19;
            layoutParams.setMarginStart(i19);
            layoutParams.setMarginEnd(this.D);
            this.f371011x.setLayoutParams(layoutParams);
            android.widget.TextView textView2 = this.f371012y;
            if (textView2 != null && (textView2.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f371012y.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.setMarginStart(this.D);
                layoutParams2.setMarginEnd(this.D);
                this.f371012y.setLayoutParams(layoutParams2);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    public final ca4.j b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        java.lang.Object obj = ((android.util.ArrayMap) ((i74.a) this.A).i("unlike_tag")).get("unlike_tag");
        if (!(obj instanceof ca4.j)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            return null;
        }
        ca4.j jVar = (ca4.j) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        return jVar;
    }

    public void c(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        android.view.ViewGroup viewGroup = this.f371009v;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            this.f371009v.setVisibility(0);
            android.view.View view2 = this.f371008u;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f371011x;
            if (textView != null) {
                textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a5a));
                this.f371011x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j88);
            }
            android.widget.TextView textView2 = this.f371012y;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a59));
                android.widget.TextView textView3 = this.f371012y;
                textView3.setText(textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j89));
            }
        }
        i74.l lVar = this.f371013z;
        if (lVar != null) {
            ca4.j b17 = b();
            if (b17 != null) {
                view.setTag(b17);
            }
            lVar.b(view, 1, null);
        }
        d();
        a(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        android.view.View view3 = this.f371005r;
        if (view3 != null && this.f370999i != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f370999i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    public final void d() {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        this.G = false;
        android.widget.TextView textView = this.f371010w;
        if (textView != null && (context = this.f370994d) != null) {
            textView.setVisibility(0);
            this.f371010w.setText(context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.j7z));
            this.f371010w.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561044a55));
            this.f371010w.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b0v));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.view.View r33) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.d.e(android.view.View):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.n2t) {
            c(view);
        } else {
            i74.l lVar = this.f371013z;
            if (id6 == com.p314xaae8f345.mm.R.id.n2i) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    lVar.b(view, 2, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.p314xaae8f345.mm.R.id.n2k) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    lVar.b(view, 3, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.p314xaae8f345.mm.R.id.n2m) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    ca4.j b17 = b();
                    if (b17 != null) {
                        view.setTag(b17);
                    }
                    lVar.b(view, 4, java.lang.Boolean.valueOf(this.G));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.p314xaae8f345.mm.R.id.n2v) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                i74.k kVar = this.A;
                if (kVar != null) {
                    java.lang.String str = ((i74.a) kVar).o().f371035b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                    if (str == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                    } else {
                        android.content.Context context = this.f370994d;
                        if (context == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                        } else {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                str = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(str, "lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context));
                            }
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("showShare", false);
                            intent.putExtra("rawUrl", str);
                            intent.putExtra("show_feedback", false);
                            intent.putExtra("show_bottom", false);
                            intent.putExtra("needRedirect", false);
                            intent.putExtra("neverGetA8Key", false);
                            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1962, 2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                        }
                    }
                }
                if (lVar != null) {
                    lVar.mo134889x63a3b28a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }
}
