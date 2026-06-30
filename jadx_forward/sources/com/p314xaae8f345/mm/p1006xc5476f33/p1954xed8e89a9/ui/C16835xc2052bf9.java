package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference */
/* loaded from: classes4.dex */
public class C16835xc2052bf9 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public static final android.util.DisplayMetrics Z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();

    /* renamed from: p0, reason: collision with root package name */
    public static final int f235181p0 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 15);

    /* renamed from: x0, reason: collision with root package name */
    public static final int f235182x0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561428i8);
    public volatile boolean L;
    public volatile boolean M;
    public java.util.List N;
    public qk.o P;
    public android.view.View Q;
    public android.widget.ImageView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.widget.LinearLayout U;
    public android.view.ViewGroup V;
    public android.view.View W;
    public android.view.View.OnClickListener X;
    public android.view.View.OnClickListener Y;

    public C16835xc2052bf9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.X = new hr3.x(this);
        this.Y = new hr3.y(this);
    }

    public void M(qk.o oVar, java.util.List list) {
        this.M = true;
        this.P = oVar;
        java.util.List list2 = this.N;
        if (list2 == null) {
            this.N = new java.util.LinkedList();
        } else {
            list2.clear();
        }
        if (list != null && !list.isEmpty()) {
            this.N.addAll(list);
        }
        O();
    }

    public final void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d c11826x30fe0b2d, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (c11826x30fe0b2d == null) {
            return;
        }
        java.lang.String str = c11826x30fe0b2d.f158962d;
        if (imageView != null) {
            imageView.setTag(str);
            l01.d0.f396294a.b(imageView, c11826x30fe0b2d.f158965g, l01.a.h(), l01.q0.f396320d);
        }
        if (textView != null) {
            java.lang.String str2 = c11826x30fe0b2d.f158963e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
    }

    public final void O() {
        if (this.L && this.N != null && this.M) {
            this.M = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d c11826x30fe0b2d = !this.N.isEmpty() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) this.N.get(0) : null;
            if (c11826x30fe0b2d != null) {
                N(c11826x30fe0b2d, this.R, this.S);
            }
            this.T.setText(this.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbo, java.lang.Integer.valueOf(this.N.size())));
            android.widget.LinearLayout linearLayout = this.U;
            java.util.List list = this.N;
            linearLayout.removeAllViews();
            if (!list.isEmpty()) {
                int size = list.size();
                int measuredWidth = this.V.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = Z.widthPixels;
                }
                int paddingLeft = (measuredWidth - this.V.getPaddingLeft()) - this.V.getPaddingRight();
                int i17 = f235182x0;
                int i18 = f235181p0;
                int i19 = i17 + i18;
                int i27 = paddingLeft / i19;
                if (i27 > size) {
                    android.view.View view = this.W;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = this.W;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i27 = (paddingLeft - this.W.getMeasuredWidth()) / i19;
                }
                int min = java.lang.Math.min(i27, size);
                if (min > 1) {
                    for (int i28 = 0; i28 < min; i28++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d c11826x30fe0b2d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) list.get(i28);
                        android.widget.ImageView imageView = new android.widget.ImageView(this.f279303d);
                        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i19, i17));
                        imageView.setPadding(0, 0, i18, 0);
                        this.U.addView(imageView);
                        N(c11826x30fe0b2d2, imageView, null);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizBindWxaInfoPreference", "attachItemToContainer(size : %s)", java.lang.Integer.valueOf(list.size()));
            }
            if (this.N.size() == 1) {
                android.view.View view3 = this.Q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.V.setTag(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) this.N.get(0)).f158962d);
                this.V.setOnClickListener(this.X);
                return;
            }
            android.view.View view4 = this.Q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.V.setTag(null);
            this.V.setOnClickListener(this.Y);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.Q = view.findViewById(com.p314xaae8f345.mm.R.id.g6m);
        this.R = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5w);
        this.S = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obg);
        this.T = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cjg);
        this.W = view.findViewById(com.p314xaae8f345.mm.R.id.jqk);
        this.U = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cg9);
        this.V = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f566912hh5);
        this.L = true;
        this.M = this.N != null;
        O();
        super.t(view);
    }

    public C16835xc2052bf9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X = new hr3.x(this);
        this.Y = new hr3.y(this);
    }

    public C16835xc2052bf9(android.content.Context context) {
        super(context);
        this.X = new hr3.x(this);
        this.Y = new hr3.y(this);
    }
}
