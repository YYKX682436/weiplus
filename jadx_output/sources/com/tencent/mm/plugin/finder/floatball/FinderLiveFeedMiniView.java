package com.tencent.mm.plugin.finder.floatball;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0001R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setLiveFloatUpperView", "", "coverUrl", "setBgCoverUrl", "Landroid/graphics/Bitmap;", "bitmap", "setFloatBitmapCover", "newState", "setState", "getCurrentState", "Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniPlayerProxy;", "getPlayerView", "getMiniLayoutVideoContainer", "value", "o", "Ljava/lang/String;", "setCoverUrl", "(Ljava/lang/String;)V", "p", "setAnchorUsername", "anchorUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFeedMiniView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f111317d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy f111318e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f111319f;

    /* renamed from: g, reason: collision with root package name */
    public int f111320g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f111321h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f111322i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f111323m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f111324n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String coverUrl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String anchorUsername;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tml);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f111317d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fbc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111321h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.fb_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111322i = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fbb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f111323m = imageView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fba);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111324n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }

    private final void setAnchorUsername(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "set anchorUsername:" + str);
        this.anchorUsername = str;
    }

    private final void setCoverUrl(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "set coverUrl:" + str);
        this.coverUrl = str;
    }

    private final void setLiveFloatUpperView(int i17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tie);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a() {
        c(false);
        this.f111323m.setImageDrawable(null);
        this.f111321h.setText((java.lang.CharSequence) null);
        setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jp_));
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "setupMiniView");
        setAnchorUsername(str);
        setCoverUrl(str2);
        a();
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f111323m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f111322i;
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
        android.widget.ImageView imageView2 = this.f111324n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(imageView2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(imageView2, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final int getF111320g() {
        return this.f111320g;
    }

    /* renamed from: getMiniLayoutVideoContainer, reason: from getter */
    public final android.widget.FrameLayout getF111317d() {
        return this.f111317d;
    }

    /* renamed from: getPlayerView, reason: from getter */
    public final com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy getF111318e() {
        return this.f111318e;
    }

    public final void setBgCoverUrl(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "setCoverUrl:" + str);
        setCoverUrl(str);
    }

    public final void setFloatBitmapCover(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            pm0.v.X(new kd2.h0(this, bitmap));
        }
    }

    public final void setState(int i17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "setState newState:" + i17 + ", state:" + this.f111320g);
        this.f111320g = i17;
        if (!pm0.v.z(i17, 4)) {
            if (pm0.v.z(this.f111320g, 2)) {
                return;
            }
            pm0.v.z(this.f111320g, 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "showFinishView");
        setLiveFloatUpperView(0);
        this.f111321h.setText(getContext().getResources().getString(com.tencent.mm.R.string.gdy));
        c(true);
        java.lang.String str2 = this.coverUrl;
        if (str2 == null || str2.length() == 0) {
            ya2.b2 b17 = ya2.h.f460484a.b(this.anchorUsername);
            str = b17 != null ? b17.field_liveCoverImg : null;
        } else {
            str = this.coverUrl;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage backgroundUrl is empty!");
        } else {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            a17.f447873d = new kd2.g0(this.f111323m, this);
            a17.f();
        }
        this.f111324n.setVisibility(0);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (!(childAt.getId() != com.tencent.mm.R.id.tie)) {
                childAt = null;
            }
            if (childAt != null) {
                childAt.getVisibility();
            }
        }
        setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jpa));
        sendAccessibilityEvent(128);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tml);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f111317d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fbc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111321h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.fb_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111322i = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fbb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f111323m = imageView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fba);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111324n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e_i, this);
        setBackgroundColor(-16777216);
        fo0.p pVar = new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tml);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f111317d = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fbc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111321h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.fb_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111322i = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fbb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f111323m = imageView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fba);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111324n = (android.widget.ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(pVar);
        a();
    }
}
