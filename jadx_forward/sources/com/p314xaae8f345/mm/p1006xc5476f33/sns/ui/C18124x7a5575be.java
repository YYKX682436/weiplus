package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseImgBottomBar;", "Landroid/view/View$OnClickListener;", "clickCallback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "setCircleToSearchTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar */
/* loaded from: classes4.dex */
public final class C18124x7a5575be extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f248998h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a f248999e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f249000f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f249001g;

    public C18124x7a5575be(android.content.Context context) {
        super(context);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248999e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f249000f = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f569312vq1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f249001g = (android.widget.TextView) findViewById3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        boolean z17 = this.f249000f.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    public void b(r45.jj4 mediaObj, long j17, int i17) {
        int i18;
        java.util.Collection collection;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        r45.jj4 jj4Var = mediaObj.X;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = this.f248999e;
        if (jj4Var != null) {
            c18075x5540950a.setVisibility(0);
        } else {
            c18075x5540950a.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        java.lang.Boolean valueOf = (W0 == null || (m70371x485d7 = W0.m70371x485d7()) == null) ? null : java.lang.Boolean.valueOf(m70371x485d7.f39026x8eaeecf7);
        android.view.View view = this.f249000f;
        int i19 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 1)) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_show_ai_follow_tail, false);
        boolean isEmpty = android.text.TextUtils.isEmpty(mediaObj.I1);
        android.widget.TextView textView = this.f249001g;
        if (isEmpty || !fj6) {
            i18 = 8;
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateAiTailBuilder", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            java.lang.String r17 = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.pay);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            java.util.List g17 = new r26.t("@").g(r17, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strArr[0]);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strArr[1]);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi)), length, spannableStringBuilder.length(), 33);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateAiTailBuilder", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            textView.setText(spannableStringBuilder);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rs(this, mediaObj));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(textView, "sns_yb_create_same");
            aVar.fk(textView, "sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            aVar.fk(textView, "sns_scene", java.lang.Integer.valueOf(i17));
            aVar.fk(textView, "sns_feed_id", ca4.z0.t0(j17));
            aVar.fk(textView, "yb_return_type", java.lang.Integer.valueOf(mediaObj.X != null ? 1 : 0));
            aVar.fk(textView, "yb_template_id", mediaObj.I1);
            aVar.ik(textView, 40, 36244);
            i18 = 8;
        }
        setVisibility((c18075x5540950a.getVisibility() == 0 || this.f249000f.getVisibility() == 0 || textView.getVisibility() == 0) ? 0 : i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    /* renamed from: setCircleToSearchTagClickCallback */
    public void mo70702xdec3f488(android.view.View.OnClickListener clickCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCallback, "clickCallback");
        android.view.View view = this.f249000f;
        if (view.getVisibility() == 0) {
            view.setOnClickListener(clickCallback);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    /* renamed from: setLivePhotoTagClickCallback */
    public void mo70698xdc00daf7(android.view.View.OnClickListener clickCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCallback, "clickCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = this.f248999e;
        if (c18075x5540950a.getVisibility() == 0) {
            c18075x5540950a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ss(this, clickCallback));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    public C18124x7a5575be(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248999e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f249000f = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f569312vq1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f249001g = (android.widget.TextView) findViewById3;
    }

    public C18124x7a5575be(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248999e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f249000f = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f569312vq1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f249001g = (android.widget.TextView) findViewById3;
    }
}
