package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class rm extends ed2.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f214498d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.om f214499e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214500f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f214501g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f214502h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f214503i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f214504j;

    /* renamed from: k, reason: collision with root package name */
    public int f214505k;

    /* renamed from: l, reason: collision with root package name */
    public int f214506l;

    /* renamed from: m, reason: collision with root package name */
    public long f214507m;

    /* renamed from: n, reason: collision with root package name */
    public int f214508n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f214509o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f214510p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.om omVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214498d = context;
        this.f214499e = omVar;
        this.f214506l = i65.a.b(context, 16);
        this.f214507m = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_k, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.oqc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f214501g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.ovk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f214502h = findViewById2;
        android.view.View findViewById3 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.jge);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f214503i = findViewById3;
        setOutsideTouchable(true);
        getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nm(this));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderTipsBubbleWindow$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62428xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm.this;
                    rmVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) rmVar.f214498d).mo273xed6858b4().c(this);
                }
            });
        }
        this.f214509o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pm(this);
        this.f214510p = new java.util.ArrayList();
    }

    public final void a(int i17, float f17) {
        this.f214501g.setTextSize(i17, f17);
    }

    public final void b() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.view.View anchor) {
        jz5.l lVar;
        android.view.View contentView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!this.f214504j) {
            getContentView().measure(0, 0);
            this.f214504j = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        setWidth(measuredWidth);
        setHeight(measuredHeight);
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        android.content.Context context = this.f214498d;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        boolean z17 = this.f214500f;
        android.view.View view = this.f214502h;
        int i17 = a17.f278668a;
        if (z17) {
            int i18 = (iArr[1] - measuredHeight) - this.f214505k;
            int width = (iArr[0] + (anchor.getWidth() / 2)) - (measuredWidth / 2);
            int i19 = this.f214508n;
            if (width < i19) {
                width = i19;
            }
            int i27 = i17 - measuredWidth;
            if (width > i27) {
                width = i27;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (view.getMeasuredWidth() / 2));
            if (layoutParams2.getMarginStart() < 0) {
                layoutParams2.getMarginStart();
                anchor.getWidth();
                view.getMeasuredWidth();
                dismiss();
                return;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i18));
        } else {
            int i28 = (iArr[1] - measuredHeight) - this.f214505k;
            int i29 = i17 - measuredWidth;
            int i37 = i29 - this.f214506l;
            if (i37 < 0) {
                i37 = 0;
            }
            if (i37 <= i29) {
                i29 = i37;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - i29) - (view.getMeasuredWidth() / 2));
            if (layoutParams4.getMarginStart() < 0) {
                layoutParams4.getMarginStart();
                anchor.getWidth();
                view.getMeasuredWidth();
                dismiss();
                return;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28));
        }
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576143rl);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if ((activity == null || activity.isFinishing()) ? false : true) {
            showAtLocation(anchor, 0, intValue, intValue2);
        }
        if (this.f214507m > 0 && (contentView = getContentView()) != null) {
            contentView.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qm(this.f214509o), this.f214507m);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17.f278669b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }

    public final void d(android.view.View anchor) {
        jz5.l lVar;
        android.view.View contentView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!this.f214504j) {
            getContentView().measure(0, 0);
            this.f214504j = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int height = anchor.getHeight();
        int width = anchor.getWidth();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(this.f214498d);
        boolean z17 = this.f214500f;
        int i17 = a17.f278668a;
        if (z17) {
            int i18 = iArr[1] - this.f214505k;
            int width2 = (iArr[0] + (anchor.getWidth() / 2)) - (measuredWidth / 2);
            int i19 = this.f214508n;
            if (width2 < i19) {
                width2 = i19;
            }
            int i27 = i17 - measuredWidth;
            if (width2 > i27) {
                width2 = i27;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(i18));
        } else {
            lVar = new jz5.l(java.lang.Integer.valueOf(((i17 - measuredWidth) - this.f214506l) - width), java.lang.Integer.valueOf(iArr[1] - this.f214505k));
        }
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576143rl);
        showAtLocation(anchor, 0, intValue, height + intValue2);
        if (this.f214507m > 0 && (contentView = getContentView()) != null) {
            contentView.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qm(this.f214509o), this.f214507m);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17.f278669b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }

    @Override // ed2.o, db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qm(this.f214509o));
        }
        java.util.ArrayList arrayList = this.f214510p;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.widget.PopupWindow.OnDismissListener) it.next()).onDismiss();
        }
        arrayList.clear();
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.f214510p.add(onDismissListener);
        }
    }

    public /* synthetic */ rm(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.om omVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : omVar);
    }
}
