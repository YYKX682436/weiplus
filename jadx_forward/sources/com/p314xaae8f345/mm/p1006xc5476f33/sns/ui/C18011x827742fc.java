package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseImgBottomBar;", "Landroid/view/View$OnClickListener;", "clickCallback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "setDetailBtnClickCallback", "", "visible", "setDetailBtnVisible", "setVideoSeekBarVisible", "disallow", "setDisallowParentIntercept", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar */
/* loaded from: classes4.dex */
public final class C18011x827742fc extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f248327n = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a f248328e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f248329f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewStub f248330g;

    /* renamed from: h, reason: collision with root package name */
    public xd4.e f248331h;

    /* renamed from: i, reason: collision with root package name */
    public int f248332i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f248333m;

    public C18011x827742fc(android.content.Context context) {
        super(context);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248328e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f248329f = findViewById2;
        this.f248330g = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565027sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    public void b(r45.jj4 mediaObj, long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        r45.jj4 jj4Var = mediaObj.X;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = this.f248328e;
        if (jj4Var != null) {
            c18075x5540950a.setVisibility(0);
        } else {
            c18075x5540950a.setVisibility(8);
        }
        android.view.View view = this.f248329f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setVisibility((c18075x5540950a.getVisibility() == 0 || this.f248329f.getVisibility() == 0) ? 0 : 8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        if (!this.f248333m) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                this.f248332i = layoutParams2.bottomMargin;
                this.f248333m = true;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
            return;
        }
        boolean z17 = getContext().getResources().getConfiguration().orientation == 2;
        boolean f17 = com.p314xaae8f345.mm.ui.bl.f(getContext());
        if (z17) {
            int c17 = f17 ? com.p314xaae8f345.mm.ui.bl.c(getContext()) : 0;
            int h17 = com.p314xaae8f345.mm.ui.bl.h(getContext());
            int l17 = com.p314xaae8f345.mm.ui.bl.l(getContext());
            if (l17 == 1) {
                layoutParams4.rightMargin = c17;
                layoutParams4.leftMargin = h17;
            } else if (l17 != 3) {
                layoutParams4.leftMargin = 0;
                layoutParams4.rightMargin = 0;
            } else {
                layoutParams4.leftMargin = c17;
                layoutParams4.rightMargin = h17;
            }
            layoutParams4.bottomMargin = this.f248332i;
        } else {
            layoutParams4.leftMargin = 0;
            layoutParams4.rightMargin = 0;
            if (f17) {
                layoutParams4.bottomMargin = this.f248332i + com.p314xaae8f345.mm.ui.bl.c(getContext());
            } else {
                layoutParams4.bottomMargin = this.f248332i;
            }
        }
        setLayoutParams(layoutParams4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    /* renamed from: setDetailBtnClickCallback */
    public void mo70695xbf00d664(android.view.View.OnClickListener clickCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCallback, "clickCallback");
        android.view.View view = this.f248329f;
        if (view.getVisibility() == 0) {
            view.setOnClickListener(clickCallback);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    /* renamed from: setDetailBtnVisible */
    public final void m70696xd89aea29(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDetailBtnVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        android.view.View view = this.f248329f;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setDetailBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setDetailBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDetailBtnVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    /* renamed from: setDisallowParentIntercept */
    public final void m70697x2b504f7b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        xd4.e eVar = this.f248331h;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = ((xd4.z) eVar).f535254b;
            if (c19716x17d12db2 != null) {
                c19716x17d12db2.m75637xdbf5f1c8(z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e
    /* renamed from: setLivePhotoTagClickCallback */
    public void mo70698xdc00daf7(android.view.View.OnClickListener clickCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCallback, "clickCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = this.f248328e;
        if (c18075x5540950a.getVisibility() == 0) {
            c18075x5540950a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ee(this, clickCallback));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    /* renamed from: setVideoSeekBarVisible */
    public final void m70699xd525f10(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoSeekBarVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        xd4.e eVar = this.f248331h;
        if (eVar != null) {
            ((xd4.z) eVar).c(z17 ? 0 : 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoSeekBarVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public C18011x827742fc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248328e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f248329f = findViewById2;
        this.f248330g = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565027sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
    }

    public C18011x827742fc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.skj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a c18075x5540950a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a) findViewById;
        this.f248328e = c18075x5540950a;
        c18075x5540950a.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(c18075x5540950a);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f248329f = findViewById2;
        this.f248330g = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565027sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
    }
}
