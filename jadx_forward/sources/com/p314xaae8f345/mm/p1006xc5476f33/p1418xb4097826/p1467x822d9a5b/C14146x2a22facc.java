package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0001R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setLiveFloatUpperView", "", "coverUrl", "setBgCoverUrl", "Landroid/graphics/Bitmap;", "bitmap", "setFloatBitmapCover", "newState", "setState", "getCurrentState", "Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniPlayerProxy;", "getPlayerView", "getMiniLayoutVideoContainer", "value", "o", "Ljava/lang/String;", "setCoverUrl", "(Ljava/lang/String;)V", "p", "setAnchorUsername", "anchorUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView */
/* loaded from: classes3.dex */
public final class C14146x2a22facc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f192850d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.AbstractC14145xbd0afa06 f192851e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f192852f;

    /* renamed from: g, reason: collision with root package name */
    public int f192853g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f192854h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f192855i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f192856m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f192857n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String coverUrl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String anchorUsername;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14146x2a22facc(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tml);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f192850d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.fbc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f192854h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.fb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f192855i = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.fbb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f192856m = imageView;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.fba);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f192857n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }

    /* renamed from: setAnchorUsername */
    private final void m56717x24d55fad(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "set anchorUsername:" + str);
        this.anchorUsername = str;
    }

    /* renamed from: setCoverUrl */
    private final void m56718x619ae8ba(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "set coverUrl:" + str);
        this.coverUrl = str;
    }

    /* renamed from: setLiveFloatUpperView */
    private final void m56719x732d1f79(int i17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tie);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a() {
        c(false);
        this.f192856m.setImageDrawable(null);
        this.f192854h.setText((java.lang.CharSequence) null);
        setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jp_));
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "setupMiniView");
        m56717x24d55fad(str);
        m56718x619ae8ba(str2);
        a();
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f192856m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f192855i;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            return;
        }
        android.widget.ImageView imageView2 = this.f192857n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(imageView2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(imageView2, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final int getF192853g() {
        return this.f192853g;
    }

    /* renamed from: getMiniLayoutVideoContainer, reason: from getter */
    public final android.widget.FrameLayout getF192850d() {
        return this.f192850d;
    }

    /* renamed from: getPlayerView, reason: from getter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.AbstractC14145xbd0afa06 getF192851e() {
        return this.f192851e;
    }

    /* renamed from: setBgCoverUrl */
    public final void m56723x36edab9f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "setCoverUrl:" + str);
        m56718x619ae8ba(str);
    }

    /* renamed from: setFloatBitmapCover */
    public final void m56724xad0a884e(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            pm0.v.X(new kd2.h0(this, bitmap));
        }
    }

    /* renamed from: setState */
    public final void m56725x53b6854f(int i17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "setState newState:" + i17 + ", state:" + this.f192853g);
        this.f192853g = i17;
        if (!pm0.v.z(i17, 4)) {
            if (pm0.v.z(this.f192853g, 2)) {
                return;
            }
            pm0.v.z(this.f192853g, 1);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "showFinishView");
        m56719x732d1f79(0);
        this.f192854h.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gdy));
        c(true);
        java.lang.String str2 = this.coverUrl;
        if (str2 == null || str2.length() == 0) {
            ya2.b2 b17 = ya2.h.f542017a.b(this.anchorUsername);
            str = b17 != null ? b17.f69321x64a734bd : null;
        } else {
            str = this.coverUrl;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage backgroundUrl is empty!");
        } else {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            a17.f529406d = new kd2.g0(this.f192856m, this);
            a17.f();
        }
        this.f192857n.setVisibility(0);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (!(childAt.getId() != com.p314xaae8f345.mm.R.id.tie)) {
                childAt = null;
            }
            if (childAt != null) {
                childAt.getVisibility();
            }
        }
        setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpa));
        sendAccessibilityEvent(128);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14146x2a22facc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tml);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f192850d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.fbc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f192854h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.fb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f192855i = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.fbb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f192856m = imageView;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.fba);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f192857n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14146x2a22facc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tml);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f192850d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.fbc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f192854h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.fb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f192855i = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.fbb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f192856m = imageView;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.fba);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f192857n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }
}
