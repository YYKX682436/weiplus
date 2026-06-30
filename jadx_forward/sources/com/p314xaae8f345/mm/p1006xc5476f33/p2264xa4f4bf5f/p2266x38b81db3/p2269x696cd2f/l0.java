package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class l0 extends in5.r {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.g0 f254839g = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.g0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final float f254840h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);

    /* renamed from: i, reason: collision with root package name */
    public static final float f254841i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f254842m;

    /* renamed from: n, reason: collision with root package name */
    public static final float f254843n;

    /* renamed from: o, reason: collision with root package name */
    public static final float f254844o;

    /* renamed from: p, reason: collision with root package name */
    public static final float f254845p;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.f0 f254846e;

    /* renamed from: f, reason: collision with root package name */
    public int f254847f;

    static {
        float dimension = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        f254841i = dimension;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float dimension2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        f254842m = dimension2;
        float dimension3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        f254843n = dimension3;
        if (bk4.i.a().K()) {
            dimension3 = dimension;
        }
        f254844o = dimension3;
        if (!bk4.i.a().K()) {
            dimension = dimension2;
        }
        f254845p = dimension;
    }

    public l0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.f0 arrowCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrowCallback, "arrowCallback");
        this.f254846e = arrowCallback;
        this.f254847f = -1;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.epx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l0 l0Var = this;
        nj4.c item = (nj4.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc) holder.p(com.p314xaae8f345.mm.R.id.iib);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        boolean K = bk4.i.a().K();
        float f17 = f254841i;
        float f18 = K ? f17 : f254843n;
        if (!bk4.i.a().K()) {
            f17 = f254842m;
        }
        java.lang.String str = null;
        if (bk4.i.a().K()) {
            android.view.ViewGroup.LayoutParams layoutParams = c1625xd76db8dc.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) f18);
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd((int) f17);
            }
            c1625xd76db8dc.setLayoutParams(layoutParams2);
        }
        int childCount = c1625xd76db8dc.getChildCount();
        int i19 = l0Var.f254847f;
        int i27 = 0;
        if (childCount < i19) {
            c1625xd76db8dc.removeAllViews();
            for (int i28 = 0; i28 < i19; i28++) {
                android.view.LayoutInflater.from(c1625xd76db8dc.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571103d06, c1625xd76db8dc);
            }
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.k0(l0Var, holder, item));
        int i29 = l0Var.f254847f;
        int i37 = 0;
        while (i37 < i29) {
            mj4.h hVar = (mj4.h) kz5.n0.a0(item.f419469d.f86668b, i37);
            android.view.View childAt = c1625xd76db8dc.getChildAt(i37);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
            if (hVar == null) {
                viewGroup.setVisibility(4);
            } else {
                viewGroup.setVisibility(i27);
                mj4.k kVar = (mj4.k) hVar;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.o(), "arrow@name")) {
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ii7)).setVisibility(8);
                    android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hk9);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(i27)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.h0(item, l0Var, findViewById, hVar));
                } else {
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ii7)).setVisibility(i27);
                    android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hk9);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i27)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String o17 = kVar.o();
                    ((sg3.a) v0Var).getClass();
                    java.lang.String e17 = c01.a2.e(o17);
                    java.lang.String o18 = kVar.o();
                    java.lang.String h17 = kVar.h();
                    android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ooa);
                    if (textView != null) {
                        textView.setText(e17);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ooa);
                    if (textView2 != null) {
                        if (kVar.z()) {
                            textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                        } else {
                            textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
                        }
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hke);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, o18, str);
                    imageView.setTag("status_avatar_".concat(o18));
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ii7)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.i0(item, viewGroup, o18, imageView, hVar, h17));
                    if (1 == bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20708x7a1a2a36()) && ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && (linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ii7)) != null)) {
                        linearLayout.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.j0(hVar, viewGroup));
                    }
                }
            }
            i37++;
            l0Var = this;
            str = null;
            i27 = 0;
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f254847f <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.g0 g0Var = f254839g;
            android.content.Context context = recyclerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f254847f = g0Var.a(context);
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc) holder.p(com.p314xaae8f345.mm.R.id.iib);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1625xd76db8dc);
        int i18 = this.f254847f;
        c1625xd76db8dc.removeAllViews();
        for (int i19 = 0; i19 < i18; i19++) {
            android.view.LayoutInflater.from(c1625xd76db8dc.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571103d06, c1625xd76db8dc);
        }
    }
}
