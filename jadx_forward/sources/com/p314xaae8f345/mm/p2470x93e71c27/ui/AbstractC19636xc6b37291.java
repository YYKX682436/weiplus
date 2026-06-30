package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel */
/* loaded from: classes5.dex */
public abstract class AbstractC19636xc6b37291 extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f271298e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.l0 f271299d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.ChatFooterPanel$RecommendView */
    /* loaded from: classes5.dex */
    public static abstract class RecommendView extends android.widget.LinearLayout {
        public RecommendView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: setProductID */
        public abstract void mo54836x1d0f8808(java.lang.String str);

        public RecommendView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }
    }

    public AbstractC19636xc6b37291(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
    }

    public abstract void b();

    public abstract void c();

    public abstract void d(boolean z17);

    public abstract void e(boolean z17, boolean z18);

    public void f(boolean z17) {
    }

    public void g(int i17, boolean z17) {
    }

    /* renamed from: getPanelSlideIndicator */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 mo75327x3779534c() {
        return null;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public void k() {
    }

    public abstract void l();

    public void m() {
    }

    public abstract void n();

    public abstract void o(boolean z17, boolean z18);

    public abstract void p(boolean z17, boolean z18);

    public abstract void q(android.content.Context context, int i17, java.lang.Runnable runnable);

    /* renamed from: setCallback */
    public void mo75328x6c4ebec7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j6 j6Var) {
    }

    /* renamed from: setDefaultEmojiByDetail */
    public abstract void mo75329x5b0da8af(java.lang.String str);

    /* renamed from: setEmojiPanelBackground */
    public abstract void mo75330x69d254ae(int i17);

    /* renamed from: setEntranceScene */
    public abstract void mo75331xef640234(int i17);

    /* renamed from: setExpandedForReport */
    public abstract void mo75332x1639a62(boolean z17);

    /* renamed from: setFinishButtonTitle */
    public abstract void mo75333x567edf71(java.lang.String str);

    /* renamed from: setFooterType */
    public void m75334x71117977(int i17) {
    }

    /* renamed from: setHBScene */
    public abstract void mo75335xa4269d10(int i17);

    /* renamed from: setHideSearchJumpMoreEntrance */
    public abstract void mo75336x2f0ae025(boolean z17);

    /* renamed from: setInitSelectTab */
    public abstract void mo75337x4687b087(java.lang.String str);

    /* renamed from: setOnEmojiSelectTabChangeListener */
    public void mo75338xb079d938(com.p314xaae8f345.mm.p2470x93e71c27.ui.j0 j0Var) {
    }

    /* renamed from: setOnTextOperationListener */
    public void mo75339x5e04422d(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var) {
    }

    /* renamed from: setPanelBackgroundColor */
    public void mo75340xf103c7b3(int i17) {
    }

    /* renamed from: setPanelForeground */
    public void mo75341x433905a5(android.graphics.drawable.Drawable drawable) {
    }

    @java.lang.Deprecated
    /* renamed from: setPortHeightPx */
    public abstract void mo75342x4b0766b2(int i17);

    /* renamed from: setSearchDialogForceDarkMode */
    public abstract void mo75343xf6f3b4d2(boolean z17);

    /* renamed from: setSearchIncludeCustom */
    public abstract void mo75344xc0fe85af(boolean z17);

    /* renamed from: setSearchSource */
    public abstract void mo75345x9e226965(int i17);

    /* renamed from: setSendButtonEnable */
    public abstract void mo75346x768d9f7f(boolean z17);

    /* renamed from: setShowClose */
    public abstract void mo75347xe8c09ab9(boolean z17);

    /* renamed from: setShowGame */
    public void mo75348x625a7311(boolean z17) {
    }

    /* renamed from: setShowSearch */
    public abstract void mo75349x4a374107(boolean z17);

    /* renamed from: setShowSend */
    public abstract void mo75350x625ff6a7(boolean z17);

    /* renamed from: setShowSmiley */
    public abstract void mo75351x4aab89d0(boolean z17);

    /* renamed from: setShowStore */
    public abstract void mo75352xe9a5b5a2(boolean z17);

    /* renamed from: setSmileyPanelExpandable */
    public void mo75353x743d8625(boolean z17) {
    }

    /* renamed from: setSmileyPanelExpandableOnSimpleMode */
    public void mo75354x8aa5e079(boolean z17) {
    }

    /* renamed from: setTabBackgroundColor */
    public void mo75355xb8211682(int i17) {
    }

    /* renamed from: setTabBackgroundResource */
    public abstract void mo75356x63a2948f(int i17);

    /* renamed from: setTalkerName */
    public abstract void mo75357x9d98e686(java.lang.String str);

    /* renamed from: setToSendText */
    public abstract void mo75358x658d5272(java.lang.String str);

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.l0 l0Var;
        int visibility = getVisibility();
        super.setVisibility(i17);
        if (visibility == i17 || (l0Var = this.f271299d) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s7) l0Var).f272179a;
        if (c8Var.n()) {
            c8Var.u();
        }
    }

    /* renamed from: setVisibleChangeListener */
    public void m75359x30a01e54(com.p314xaae8f345.mm.p2470x93e71c27.ui.l0 l0Var) {
        this.f271299d = l0Var;
    }
}
