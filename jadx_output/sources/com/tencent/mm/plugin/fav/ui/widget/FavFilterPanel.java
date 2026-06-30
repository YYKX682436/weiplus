package com.tencent.mm.plugin.fav.ui.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0006R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/widget/FavFilterPanel;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ljz5/f0;", "setupRecyclerView", "Lkotlin/Function1;", "Lo72/j2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTypeSelectedListener", "", "setOnSortSelectedListener", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "I", "getSelectedTypeIndex", "()I", "setSelectedTypeIndex", "(I)V", "selectedTypeIndex", "B", "getSelectedSortIndex", "setSelectedSortIndex", "selectedSortIndex", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w82/l", "w82/m", "w82/n", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FavFilterPanel extends android.widget.FrameLayout {
    public static final /* synthetic */ int C = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public int selectedTypeIndex;

    /* renamed from: B, reason: from kotlin metadata */
    public int selectedSortIndex;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f101528d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f101529e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f101530f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f101531g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f101532h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f101533i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f101534m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundCornerFrameLayout f101535n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundCornerFrameLayout f101536o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f101537p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f101538q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f101539r;

    /* renamed from: s, reason: collision with root package name */
    public w82.d f101540s;

    /* renamed from: t, reason: collision with root package name */
    public w82.d f101541t;

    /* renamed from: u, reason: collision with root package name */
    public int f101542u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f101543v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f101544w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f101545x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f101546y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f101547z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FavFilterPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ void b(com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        favFilterPanel.a(z17, aVar);
    }

    private final void setupRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        }
        if (recyclerView == null) {
            return;
        }
        recyclerView.setOverScrollMode(2);
    }

    public final void a(boolean z17, yz5.a aVar) {
        int i17 = this.f101542u;
        if (i17 == -1) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        boolean z18 = this.f101543v;
        if (z18 && !z17) {
            c();
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (!z17) {
            c();
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (z18) {
            return;
        }
        this.f101543v = true;
        android.widget.ImageView imageView = null;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = i17 != 0 ? i17 != 1 ? null : this.f101536o : this.f101535n;
        if (i17 == 0) {
            imageView = this.f101533i;
        } else if (i17 == 1) {
            imageView = this.f101534m;
        }
        if (roundCornerFrameLayout != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(roundCornerFrameLayout.getHeight(), 0);
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new w82.o(roundCornerFrameLayout));
            ofInt.addListener(new w82.p(roundCornerFrameLayout, this, imageView, aVar));
            ofInt.start();
            android.view.View view = this.f101539r;
            if (view != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
                ofFloat.setDuration(250L);
                ofFloat.addListener(new w82.q(view));
                ofFloat.start();
            }
        }
        this.f101542u = -1;
    }

    public final void c() {
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f101535n;
        if (roundCornerFrameLayout != null) {
            roundCornerFrameLayout.setVisibility(8);
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = this.f101536o;
        if (roundCornerFrameLayout2 != null) {
            roundCornerFrameLayout2.setVisibility(8);
        }
        android.view.View view = this.f101539r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doCollapseList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doCollapseList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f101539r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doCollapseList", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doCollapseList", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout3 = this.f101535n;
        android.view.ViewGroup.LayoutParams layoutParams = roundCornerFrameLayout3 != null ? roundCornerFrameLayout3.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout4 = this.f101536o;
        android.view.ViewGroup.LayoutParams layoutParams2 = roundCornerFrameLayout4 != null ? roundCornerFrameLayout4.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        e(this.f101533i, false);
        e(this.f101534m, false);
        this.f101542u = -1;
        this.f101543v = false;
    }

    public final void d(int i17) {
        this.f101543v = true;
        this.f101542u = i17;
        android.widget.ImageView imageView = null;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = i17 != 0 ? i17 != 1 ? null : this.f101536o : this.f101535n;
        if (i17 == 0) {
            imageView = this.f101533i;
        } else if (i17 == 1) {
            imageView = this.f101534m;
        }
        if (roundCornerFrameLayout != null) {
            roundCornerFrameLayout.setVisibility(0);
            android.view.View view = this.f101539r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doExpandList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doExpandList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f101539r;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doExpandList", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "doExpandList", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            roundCornerFrameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = roundCornerFrameLayout.getMeasuredHeight();
            roundCornerFrameLayout.getLayoutParams().height = 0;
            roundCornerFrameLayout.requestLayout();
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, measuredHeight);
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new w82.r(roundCornerFrameLayout));
            ofInt.addListener(new w82.s(this));
            ofInt.start();
            android.view.View view3 = this.f101539r;
            if (view3 != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.start();
            }
            e(imageView, true);
            e(i17 == 0 ? this.f101534m : this.f101533i, false);
        }
    }

    public final void e(android.widget.ImageView imageView, boolean z17) {
        if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            if (z17) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setRotation(180.0f);
            } else {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setRotation(0.0f);
            }
        }
    }

    public final int getSelectedSortIndex() {
        return this.selectedSortIndex;
    }

    public final int getSelectedTypeIndex() {
        return this.selectedTypeIndex;
    }

    public final void setOnSortSelectedListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f101545x = listener;
    }

    public final void setOnTypeSelectedListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f101544w = listener;
    }

    public final void setSelectedSortIndex(int i17) {
        this.selectedSortIndex = i17;
    }

    public final void setSelectedTypeIndex(int i17) {
        this.selectedTypeIndex = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavFilterPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.TextView textView;
        android.widget.TextView textView2;
        w82.d dVar;
        w82.d dVar2;
        kotlin.jvm.internal.o.g(context, "context");
        this.f101542u = -1;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491791nv0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        w82.m mVar = new w82.m(string, new o72.j2(kz5.p0.f313996d));
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.nvb);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        w82.m mVar2 = new w82.m(string2, new o72.j2(kz5.c0.i(2, 4)));
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f491792nv1);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        w82.m mVar3 = new w82.m(string3, new o72.j2(kz5.b0.c(8)));
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.f491793nv2);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        w82.m mVar4 = new w82.m(string4, new o72.j2(kz5.b0.c(18)));
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.nvj);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        w82.m mVar5 = new w82.m(string5, new o72.j2(kz5.b0.c(14)));
        java.lang.String string6 = context.getString(com.tencent.mm.R.string.nvl);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        java.util.List i18 = kz5.c0.i(mVar, mVar2, mVar3, mVar4, mVar5, new w82.m(string6, new o72.j2(kz5.b0.c(3))));
        this.f101546y = i18;
        java.lang.String string7 = context.getString(com.tencent.mm.R.string.nww);
        kotlin.jvm.internal.o.f(string7, "getString(...)");
        java.lang.String string8 = context.getString(com.tencent.mm.R.string.nvt);
        kotlin.jvm.internal.o.f(string8, "getString(...)");
        w82.n nVar = new w82.n(string7, string8, 0);
        java.lang.String string9 = context.getString(com.tencent.mm.R.string.nwy);
        kotlin.jvm.internal.o.f(string9, "getString(...)");
        java.lang.String string10 = context.getString(com.tencent.mm.R.string.nwx);
        kotlin.jvm.internal.o.f(string10, "getString(...)");
        java.util.List i19 = kz5.c0.i(nVar, new w82.n(string9, string10, 1));
        this.f101547z = i19;
        setClipChildren(false);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488755e52, (android.view.ViewGroup) this, true);
        this.f101528d = inflate;
        this.f101529e = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.snc) : null;
        android.view.View view = this.f101528d;
        this.f101530f = view != null ? view.findViewById(com.tencent.mm.R.id.f483506sn1) : null;
        android.view.View view2 = this.f101528d;
        if (view2 == null || (textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.vji)) == null) {
            textView = null;
        } else {
            com.tencent.mm.ui.fk.a(textView);
        }
        this.f101531g = textView;
        android.view.View view3 = this.f101528d;
        if (view3 == null || (textView2 = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.vj_)) == null) {
            textView2 = null;
        } else {
            com.tencent.mm.ui.fk.a(textView2);
        }
        this.f101532h = textView2;
        android.view.View view4 = this.f101528d;
        this.f101533i = view4 != null ? (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.u7s) : null;
        android.view.View view5 = this.f101528d;
        this.f101534m = view5 != null ? (android.widget.ImageView) view5.findViewById(com.tencent.mm.R.id.u7o) : null;
        android.view.View view6 = this.f101528d;
        this.f101535n = view6 != null ? (com.tencent.mm.ui.widget.RoundCornerFrameLayout) view6.findViewById(com.tencent.mm.R.id.szn) : null;
        android.view.View view7 = this.f101528d;
        this.f101536o = view7 != null ? (com.tencent.mm.ui.widget.RoundCornerFrameLayout) view7.findViewById(com.tencent.mm.R.id.szl) : null;
        android.view.View view8 = this.f101528d;
        this.f101539r = view8 != null ? view8.findViewById(com.tencent.mm.R.id.f486225uo4) : null;
        android.view.View view9 = this.f101528d;
        this.f101537p = view9 != null ? (androidx.recyclerview.widget.RecyclerView) view9.findViewById(com.tencent.mm.R.id.f486727v04) : null;
        android.view.View view10 = this.f101528d;
        this.f101538q = view10 != null ? (androidx.recyclerview.widget.RecyclerView) view10.findViewById(com.tencent.mm.R.id.f486726v03) : null;
        float a17 = ym5.x.a(getContext(), 12.0f);
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f101535n;
        if (roundCornerFrameLayout != null) {
            roundCornerFrameLayout.c(0.0f, 0.0f, a17, a17);
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = this.f101536o;
        if (roundCornerFrameLayout2 != null) {
            roundCornerFrameLayout2.c(0.0f, 0.0f, a17, a17);
        }
        setupRecyclerView(this.f101537p);
        setupRecyclerView(this.f101538q);
        w82.d dVar3 = new w82.d(i18, new w82.u(this));
        this.f101540s = dVar3;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f101537p;
        if (recyclerView != null) {
            recyclerView.setAdapter(dVar3);
        }
        if ((!i18.isEmpty()) && (dVar2 = this.f101540s) != null) {
            dVar2.x(0);
        }
        w82.d dVar4 = new w82.d(i19, new w82.v(this));
        this.f101541t = dVar4;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f101538q;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(dVar4);
        }
        if ((!i19.isEmpty()) && (dVar = this.f101541t) != null) {
            dVar.x(0);
        }
        android.view.View view11 = this.f101529e;
        if (view11 != null) {
            view11.setOnClickListener(new w82.w(this));
        }
        android.view.View view12 = this.f101530f;
        if (view12 != null) {
            view12.setOnClickListener(new w82.x(this));
        }
        android.view.View view13 = this.f101539r;
        if (view13 != null) {
            view13.setOnClickListener(new w82.y(this));
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout3 = this.f101535n;
        if (roundCornerFrameLayout3 != null) {
            roundCornerFrameLayout3.setVisibility(8);
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout4 = this.f101536o;
        if (roundCornerFrameLayout4 != null) {
            roundCornerFrameLayout4.setVisibility(8);
        }
        android.view.View view14 = this.f101539r;
        if (view14 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view14, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view15 = this.f101539r;
        if (view15 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view15, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view15.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view15, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
