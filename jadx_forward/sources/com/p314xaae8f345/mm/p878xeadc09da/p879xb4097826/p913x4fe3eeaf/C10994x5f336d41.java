package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar;", "Landroid/widget/LinearLayout;", "Ldy0/j;", "Ldy0/a;", "onViewClick", "Ljz5/f0;", "setOnClick", "", "enable", "setDoneBtnEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar */
/* loaded from: classes5.dex */
public final class C10994x5f336d41 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f151207d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f151208e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f151209f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f151210g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f151211h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f151212i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f151213m;

    /* renamed from: n, reason: collision with root package name */
    public dy0.j f151214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10994x5f336d41(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        setOrientation(0);
        setBaselineAligned(false);
        setPadding(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e38, (android.view.ViewGroup) this, true);
        d();
    }

    public static final void a(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 c10994x5f336d41, android.view.View view, boolean z17) {
        c10994x5f336d41.getClass();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "updateSideShadow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "updateSideShadow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View b(dy0.a type) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            view = this.f151207d;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textBtn");
                throw null;
            }
        } else if (ordinal == 1) {
            view = this.f151209f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationBtn");
                throw null;
            }
        } else if (ordinal == 2) {
            view = this.f151210g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stickerBtn");
                throw null;
            }
        } else if (ordinal == 3) {
            view = this.f151212i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimBtn");
                throw null;
            }
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            view = this.f151213m;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
                throw null;
            }
        }
        return view;
    }

    public final void c(dy0.a type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        android.view.View b17 = b(type);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "hideBtn", "(Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$Type;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar", "hideBtn", "(Lcom/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$Type;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d() {
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) findViewById(com.p314xaae8f345.mm.R.id.quz);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qw_);
        horizontalScrollView.setOnScrollChangeListener(new dy0.c(this, findViewById, horizontalScrollView));
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.c(horizontalScrollView) || horizontalScrollView.isLayoutRequested()) {
            horizontalScrollView.addOnLayoutChangeListener(new dy0.b(this, findViewById, horizontalScrollView));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            a(this, findViewById, horizontalScrollView.canScrollHorizontally(1));
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q3d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f151210g = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f566936u70);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f151211h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.q3e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f151207d = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f566937u71);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f151208e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.qh_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f151209f = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.q3f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f151212i = findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.q3k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f151213m = findViewById8;
        android.view.View view = this.f151207d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textBtn");
            throw null;
        }
        view.setOnClickListener(new dy0.d(this));
        android.view.View view2 = this.f151209f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationBtn");
            throw null;
        }
        view2.setOnClickListener(new dy0.e(this));
        android.view.View view3 = this.f151212i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimBtn");
            throw null;
        }
        view3.setOnClickListener(new dy0.f(this));
        android.view.View view4 = this.f151210g;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stickerBtn");
            throw null;
        }
        view4.setOnClickListener(new dy0.g(this));
        android.view.View view5 = this.f151213m;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
        view5.setOnClickListener(new dy0.h(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.u6z);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f566938u72);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352[] c22699x3dcdb352Arr = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352[4];
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f151211h;
        if (c22699x3dcdb3523 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stickerIv");
            throw null;
        }
        c22699x3dcdb352Arr[0] = c22699x3dcdb3523;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f151208e;
        if (c22699x3dcdb3524 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textIv");
            throw null;
        }
        c22699x3dcdb352Arr[1] = c22699x3dcdb3524;
        c22699x3dcdb352Arr[2] = c22699x3dcdb352;
        c22699x3dcdb352Arr[3] = c22699x3dcdb3522;
        for (int i17 = 0; i17 < 4; i17++) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = c22699x3dcdb352Arr[i17];
            if (c22699x3dcdb3525 != null) {
                c22699x3dcdb3525.m82037xa10c26f6(false);
            }
        }
    }

    /* renamed from: setDoneBtnEnabled */
    public final void m47414x388b3f69(boolean z17) {
        android.view.View view = this.f151213m;
        if (view != null) {
            view.setEnabled(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
    }

    /* renamed from: setOnClick */
    public final void m47415x60aa2427(dy0.j onViewClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onViewClick, "onViewClick");
        this.f151214n = onViewClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10994x5f336d41(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        setOrientation(0);
        setBaselineAligned(false);
        setPadding(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e38, (android.view.ViewGroup) this, true);
        d();
    }
}
