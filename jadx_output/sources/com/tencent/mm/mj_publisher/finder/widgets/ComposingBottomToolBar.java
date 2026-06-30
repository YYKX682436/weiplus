package com.tencent.mm.mj_publisher.finder.widgets;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar;", "Landroid/widget/LinearLayout;", "Ldy0/j;", "Ldy0/a;", "onViewClick", "Ljz5/f0;", "setOnClick", "", "enable", "setDoneBtnEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ComposingBottomToolBar extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f69674d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f69675e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f69676f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f69677g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f69678h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f69679i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f69680m;

    /* renamed from: n, reason: collision with root package name */
    public dy0.j f69681n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposingBottomToolBar(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setOrientation(0);
        setBaselineAligned(false);
        setPadding(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, 0);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e38, (android.view.ViewGroup) this, true);
        d();
    }

    public static final void a(com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar, android.view.View view, boolean z17) {
        composingBottomToolBar.getClass();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "updateSideShadow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "updateSideShadow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View b(dy0.a type) {
        android.view.View view;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            view = this.f69674d;
            if (view == null) {
                kotlin.jvm.internal.o.o("textBtn");
                throw null;
            }
        } else if (ordinal == 1) {
            view = this.f69676f;
            if (view == null) {
                kotlin.jvm.internal.o.o("narrationBtn");
                throw null;
            }
        } else if (ordinal == 2) {
            view = this.f69677g;
            if (view == null) {
                kotlin.jvm.internal.o.o("stickerBtn");
                throw null;
            }
        } else if (ordinal == 3) {
            view = this.f69679i;
            if (view == null) {
                kotlin.jvm.internal.o.o("trimBtn");
                throw null;
            }
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            view = this.f69680m;
            if (view == null) {
                kotlin.jvm.internal.o.o("doneBtn");
                throw null;
            }
        }
        return view;
    }

    public final void c(dy0.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        android.view.View b17 = b(type);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "hideBtn", "(Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$Type;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "hideBtn", "(Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$Type;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d() {
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) findViewById(com.tencent.mm.R.id.quz);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qw_);
        horizontalScrollView.setOnScrollChangeListener(new dy0.c(this, findViewById, horizontalScrollView));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(horizontalScrollView) || horizontalScrollView.isLayoutRequested()) {
            horizontalScrollView.addOnLayoutChangeListener(new dy0.b(this, findViewById, horizontalScrollView));
        } else {
            kotlin.jvm.internal.o.d(findViewById);
            a(this, findViewById, horizontalScrollView.canScrollHorizontally(1));
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q3d);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f69677g = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485403u70);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f69678h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q3e);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f69674d = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f485404u71);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f69675e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qh_);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f69676f = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.q3f);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f69679i = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.q3k);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f69680m = findViewById8;
        android.view.View view = this.f69674d;
        if (view == null) {
            kotlin.jvm.internal.o.o("textBtn");
            throw null;
        }
        view.setOnClickListener(new dy0.d(this));
        android.view.View view2 = this.f69676f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("narrationBtn");
            throw null;
        }
        view2.setOnClickListener(new dy0.e(this));
        android.view.View view3 = this.f69679i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("trimBtn");
            throw null;
        }
        view3.setOnClickListener(new dy0.f(this));
        android.view.View view4 = this.f69677g;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("stickerBtn");
            throw null;
        }
        view4.setOnClickListener(new dy0.g(this));
        android.view.View view5 = this.f69680m;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
        view5.setOnClickListener(new dy0.h(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.u6z);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f485405u72);
        com.tencent.mm.ui.widget.imageview.WeImageView[] weImageViewArr = new com.tencent.mm.ui.widget.imageview.WeImageView[4];
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f69678h;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("stickerIv");
            throw null;
        }
        weImageViewArr[0] = weImageView3;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f69675e;
        if (weImageView4 == null) {
            kotlin.jvm.internal.o.o("textIv");
            throw null;
        }
        weImageViewArr[1] = weImageView4;
        weImageViewArr[2] = weImageView;
        weImageViewArr[3] = weImageView2;
        for (int i17 = 0; i17 < 4; i17++) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = weImageViewArr[i17];
            if (weImageView5 != null) {
                weImageView5.setEnableColorFilter(false);
            }
        }
    }

    public final void setDoneBtnEnabled(boolean z17) {
        android.view.View view = this.f69680m;
        if (view != null) {
            view.setEnabled(z17);
        } else {
            kotlin.jvm.internal.o.o("doneBtn");
            throw null;
        }
    }

    public final void setOnClick(dy0.j onViewClick) {
        kotlin.jvm.internal.o.g(onViewClick, "onViewClick");
        this.f69681n = onViewClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposingBottomToolBar(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setOrientation(0);
        setBaselineAligned(false);
        setPadding(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, 0);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e38, (android.view.ViewGroup) this, true);
        d();
    }
}
