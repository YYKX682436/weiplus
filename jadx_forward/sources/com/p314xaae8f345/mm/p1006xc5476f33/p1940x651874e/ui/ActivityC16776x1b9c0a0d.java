package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI */
/* loaded from: classes9.dex */
public class ActivityC16776x1b9c0a0d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements y60.e {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f234360d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f234362f;

    /* renamed from: g, reason: collision with root package name */
    public fp3.i f234363g;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f234365i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f234366m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f234367n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f234368o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f234369p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f234370q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f234371r;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.CheckedTextView f234377x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.CheckedTextView f234378y;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f234361e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a f234364h = null;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f234372s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public boolean f234373t = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f234374u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f234375v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f234376w = 0;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f234379z = new fp3.a(this);
    public final android.view.View.OnClickListener A = new fp3.g(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d, java.lang.String str) {
        hp3.d.d(java.lang.Boolean.valueOf(activityC16776x1b9c0a0d.f234373t), activityC16776x1b9c0a0d.f234364h.f234358g, activityC16776x1b9c0a0d.f234374u, str, "");
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f234372s.get(str);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void V6() {
        if (this.f234375v || this.f234376w == 0) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new dp3.l(this.f234374u, "", this.f234376w));
        this.f234375v = true;
    }

    public void W6() {
        java.util.List list;
        if (this.f234364h == null) {
            return;
        }
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f234372s.clear();
        dp3.c cVar = this.f234364h.f234353b;
        if (cVar != null) {
            java.lang.String str = cVar.f323735a;
            if (!android.text.TextUtils.isEmpty(cVar.f323739e)) {
                str = str + "：" + cVar.f323739e;
            }
            if (this.f234373t) {
                android.view.View view = this.f234365i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f234366m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f234366m.findViewById(com.p314xaae8f345.mm.R.id.kkx)).setText(str);
                ((android.widget.TextView) this.f234366m.findViewById(com.p314xaae8f345.mm.R.id.kkw)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(this.f234364h.f234359h));
                if (android.text.TextUtils.isEmpty(cVar.f323737c) || !com.p314xaae8f345.mm.p2802xd031a825.ui.r1.Q(cVar.f323737c)) {
                    android.widget.ImageView imageView = (android.widget.ImageView) this.f234366m.findViewById(com.p314xaae8f345.mm.R.id.kl6);
                    android.graphics.Bitmap m10969xb866ec1c = bp.b.m10969xb866ec1c(getResources(), com.p314xaae8f345.mm.R.raw.f80583xf63ba47e, null);
                    if (m10969xb866ec1c != null) {
                        imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(m10969xb866ec1c, false, 96.0f));
                    }
                } else {
                    X6((android.widget.ImageView) this.f234366m.findViewById(com.p314xaae8f345.mm.R.id.kl6), cVar.f323737c);
                }
            } else {
                android.view.View view3 = this.f234366m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f234365i;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f234365i.findViewById(com.p314xaae8f345.mm.R.id.kkx)).setText(str);
                ((android.widget.TextView) this.f234365i.findViewById(com.p314xaae8f345.mm.R.id.kkw)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(this.f234364h.f234359h));
                if (android.text.TextUtils.isEmpty(cVar.f323737c) || !com.p314xaae8f345.mm.p2802xd031a825.ui.r1.Q(cVar.f323737c)) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) this.f234365i.findViewById(com.p314xaae8f345.mm.R.id.kl6);
                    android.graphics.Bitmap m10969xb866ec1c2 = bp.b.m10969xb866ec1c(getResources(), com.p314xaae8f345.mm.R.raw.f80583xf63ba47e, null);
                    if (m10969xb866ec1c2 != null) {
                        imageView2.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(m10969xb866ec1c2, false, 96.0f));
                    }
                } else {
                    X6((android.widget.ImageView) this.f234365i.findViewById(com.p314xaae8f345.mm.R.id.kl6), cVar.f323737c);
                }
            }
        } else {
            android.view.View view5 = this.f234365i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f234366m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList7 = this.f234364h.f234354c;
        if (arrayList7 == null || arrayList7.size() == 0) {
            android.view.View view7 = this.f234369p;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view7, arrayList8.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = this.f234370q;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view8, arrayList9.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f234371r;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view9, arrayList10.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (arrayList7.size() == 1) {
            android.view.View view10 = this.f234371r;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view10, arrayList11.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49 c16775xba5fef49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(0);
            if (android.text.TextUtils.isEmpty(c16775xba5fef49.f234342d)) {
                android.view.View view11 = this.f234370q;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view11, arrayList12.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = this.f234369p;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view12, arrayList13.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.hj6)).setText(c16775xba5fef49.f234343e);
                if (android.text.TextUtils.isEmpty(c16775xba5fef49.f234347i)) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    rect.set(this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).getPaddingLeft(), this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).getPaddingTop(), this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).getPaddingRight(), this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).getPaddingBottom());
                    this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
                    this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.f566925hj5).setPadding(rect.left, rect.top, rect.right, rect.bottom);
                } else {
                    ((android.widget.TextView) this.f234369p.findViewById(com.p314xaae8f345.mm.R.id.hj6)).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560913xw));
                }
            } else {
                android.view.View view13 = this.f234369p;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view13, arrayList14.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view14 = this.f234370q;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(0);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view14, arrayList15.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) this.f234370q.findViewById(com.p314xaae8f345.mm.R.id.hj6)).setText(c16775xba5fef49.f234343e);
                ((android.widget.TextView) this.f234370q.findViewById(com.p314xaae8f345.mm.R.id.hj8)).setText(c16775xba5fef49.f234346h);
                ((android.widget.TextView) this.f234370q.findViewById(com.p314xaae8f345.mm.R.id.f566924hj4)).setText("+" + c16775xba5fef49.f234345g);
                ((android.widget.TextView) this.f234370q.findViewById(com.p314xaae8f345.mm.R.id.f566923hj3)).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus.a(c16775xba5fef49.f234344f));
                if (!android.text.TextUtils.isEmpty(c16775xba5fef49.f234342d)) {
                    X6((android.widget.ImageView) this.f234370q.findViewById(com.p314xaae8f345.mm.R.id.hj7), c16775xba5fef49.f234342d);
                }
            }
        } else {
            android.view.View view15 = this.f234369p;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view15, arrayList16.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = this.f234370q;
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view16, arrayList17.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view16, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view17 = this.f234371r;
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(0);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view17, arrayList18.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view17, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (arrayList7.size() == 2) {
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kla), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(0));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klb), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(1));
                android.view.View findViewById = this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klc);
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(findViewById, arrayList19.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kld);
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(8);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(findViewById2, arrayList20.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (arrayList7.size() == 3) {
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kla), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(0));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klb), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(1));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klc), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(2));
                android.view.View findViewById3 = this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kld);
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(8);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(findViewById3, arrayList21.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (arrayList7.size() >= 4) {
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kla), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(0));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klb), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(1));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.klc), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(2));
                Z6(this.f234371r.findViewById(com.p314xaae8f345.mm.R.id.kld), (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) arrayList7.get(3));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = this.f234364h.f234352a;
        if (c16774xbacd37e9 != null) {
            android.view.View view18 = this.f234367n;
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(0);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view18, arrayList22.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view18.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
            yj0.a.f(view18, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.klq)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234327q, c16774xbacd37e9.B));
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar = this.f234364h;
            if (aVar != null && (list = aVar.f234355d) != null && ((java.util.ArrayList) list).size() >= 1) {
                Y6(this.f234368o, (dp3.b) ((java.util.ArrayList) this.f234364h.f234355d).get(0));
            }
        } else {
            android.view.View view19 = this.f234367n;
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            arrayList23.add(8);
            java.util.Collections.reverse(arrayList23);
            yj0.a.d(view19, arrayList23.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
            yj0.a.f(view19, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list2 = this.f234364h.f234355d;
        if (list2 != null) {
            ((java.util.ArrayList) this.f234361e).addAll(list2);
            this.f234363g.notifyDataSetChanged();
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.j_9);
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(0);
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(findViewById4, arrayList24.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar2 = this.f234364h;
        if (aVar2 != null && android.text.TextUtils.isEmpty(aVar2.f234357f) && android.text.TextUtils.isEmpty(this.f234364h.f234358g)) {
            android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.j_9);
            java.util.ArrayList arrayList25 = new java.util.ArrayList();
            arrayList25.add(8);
            java.util.Collections.reverse(arrayList25);
            yj0.a.d(findViewById5, arrayList25.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar3 = this.f234364h;
            if (aVar3 == null || android.text.TextUtils.isEmpty(aVar3.f234357f) || !android.text.TextUtils.isEmpty(this.f234364h.f234358g)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar4 = this.f234364h;
                if (aVar4 != null && android.text.TextUtils.isEmpty(aVar4.f234357f) && !android.text.TextUtils.isEmpty(this.f234364h.f234358g)) {
                    android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.h1b);
                    java.util.ArrayList arrayList26 = new java.util.ArrayList();
                    arrayList26.add(8);
                    java.util.Collections.reverse(arrayList26);
                    yj0.a.d(findViewById6, arrayList26.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.pr6);
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(findViewById7, arrayList27.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pr7);
                    textView.setVisibility(0);
                    textView.setGravity(3);
                }
            } else {
                android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.pr7);
                java.util.ArrayList arrayList28 = new java.util.ArrayList();
                arrayList28.add(8);
                java.util.Collections.reverse(arrayList28);
                yj0.a.d(findViewById8, arrayList28.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                yj0.a.f(findViewById8, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.pr6);
                java.util.ArrayList arrayList29 = new java.util.ArrayList();
                arrayList29.add(8);
                java.util.Collections.reverse(arrayList29);
                yj0.a.d(findViewById9, arrayList29.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((java.lang.Integer) arrayList29.get(0)).intValue());
                yj0.a.f(findViewById9, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h1b);
                textView2.setVisibility(0);
                textView2.setGravity(3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar5 = this.f234364h;
        if (aVar5 == null || android.text.TextUtils.isEmpty(aVar5.f234356e)) {
            return;
        }
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new fp3.d(this));
    }

    public final void X6(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null || android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.p2802xd031a825.ui.r1.Q(str)) {
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        hp3.c cVar = new hp3.c(str);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(cVar));
        this.f234372s.put(str, imageView);
    }

    public final void Y6(android.view.View view, dp3.b bVar) {
        if (bVar == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        if (bVar.f323733d) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        } else {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void Z6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49 c16775xba5fef49) {
        if (view == null || c16775xba5fef49 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hj6);
        if (textView != null) {
            textView.setText(c16775xba5fef49.f234343e);
        }
        if (android.text.TextUtils.isEmpty(c16775xba5fef49.f234342d)) {
            return;
        }
        X6((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hj7), c16775xba5fef49.f234342d);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        V6();
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bwg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f234373t) {
            dp3.r a17 = bp3.f.wi().Ai().a(this.f234374u);
            int i17 = -1;
            if (a17 != null && !android.text.TextUtils.isEmpty(a17.f323783b) && hp3.d.a(a17.f323783b)) {
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17.f323783b, 0);
            }
            if (i17 == 2) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gre);
            } else if (i17 == 1) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.grf);
            }
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.grg);
        }
        this.f234365i = findViewById(com.p314xaae8f345.mm.R.id.kkv);
        this.f234366m = findViewById(com.p314xaae8f345.mm.R.id.kku);
        this.f234370q = findViewById(com.p314xaae8f345.mm.R.id.kl_);
        this.f234371r = findViewById(com.p314xaae8f345.mm.R.id.kl8);
        this.f234369p = findViewById(com.p314xaae8f345.mm.R.id.kl9);
        this.f234367n = findViewById(com.p314xaae8f345.mm.R.id.klp);
        this.f234368o = findViewById(com.p314xaae8f345.mm.R.id.klo);
        android.view.View view = this.f234365i;
        android.view.View.OnClickListener onClickListener = this.f234379z;
        view.setOnClickListener(onClickListener);
        this.f234371r.setOnClickListener(onClickListener);
        this.f234370q.setOnClickListener(onClickListener);
        this.f234369p.setOnClickListener(onClickListener);
        this.f234367n.setOnClickListener(onClickListener);
        findViewById(com.p314xaae8f345.mm.R.id.kkq).setOnClickListener(onClickListener);
        findViewById(com.p314xaae8f345.mm.R.id.h1b).setOnClickListener(onClickListener);
        findViewById(com.p314xaae8f345.mm.R.id.pr7).setOnClickListener(onClickListener);
        this.f234362f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.kkp);
        fp3.i iVar = new fp3.i(this, null);
        this.f234363g = iVar;
        this.f234362f.setAdapter((android.widget.ListAdapter) iVar);
        this.f234363g.notifyDataSetChanged();
        this.f234362f.setOnItemClickListener(new fp3.f(this));
        W6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        dp3.r a17;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        if (g17 != null && (g17 instanceof bp3.e)) {
            java.lang.String string = m83105x7498fe14().getString("key_trans_id");
            this.f234374u = string;
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar = null;
            if (string != null && !bp3.f.wi().Ai().c(string)) {
                this.f234373t = false;
                m83098x5406100e(new dp3.n(string, null, -1));
            } else if (bp3.f.wi().Ai().c(string)) {
                this.f234373t = true;
                dp3.h Ai = bp3.f.wi().Ai();
                Ai.getClass();
                if (!android.text.TextUtils.isEmpty(string) && (a17 = Ai.a(string)) != null) {
                    aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a();
                    dp3.c cVar = new dp3.c();
                    cVar.f323735a = a17.f323786e;
                    if (android.text.TextUtils.isEmpty(a17.f323784c) || !hp3.d.a(a17.f323784c)) {
                        cVar.f323736b = (int) (java.lang.System.currentTimeMillis() / 1000);
                    } else {
                        cVar.f323736b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17.f323784c, 0);
                    }
                    cVar.f323737c = a17.f323785d;
                    cVar.f323738d = a17.f323788g;
                    cVar.f323739e = a17.f323787f;
                    aVar.f234353b = cVar;
                    java.util.List list = a17.f323791j;
                    if (list != null) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) list;
                        if (arrayList.size() > 0) {
                            aVar.f234355d = new java.util.ArrayList();
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                dp3.p pVar = (dp3.p) arrayList.get(i17);
                                dp3.b bVar = new dp3.b();
                                bVar.f323730a = pVar.f323777a;
                                bVar.f323731b = "";
                                bVar.f323732c = pVar.f323778b;
                                bVar.f323733d = false;
                                ((java.util.ArrayList) aVar.f234355d).add(bVar);
                            }
                        }
                    }
                    java.util.List list2 = a17.f323792k;
                    if (list2 != null) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                        if (arrayList2.size() > 0) {
                            if (aVar.f234355d == null) {
                                aVar.f234355d = new java.util.ArrayList();
                            }
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                dp3.q qVar = (dp3.q) arrayList2.get(i18);
                                dp3.b bVar2 = new dp3.b();
                                bVar2.f323730a = qVar.f323779a;
                                bVar2.f323731b = qVar.f323780b;
                                bVar2.f323732c = qVar.f323781c;
                                bVar2.f323733d = false;
                                if (i18 == 0) {
                                    bVar2.f323733d = true;
                                }
                                ((java.util.ArrayList) aVar.f234355d).add(bVar2);
                            }
                        }
                    }
                    aVar.f234357f = a17.f323790i;
                    aVar.f234358g = a17.f323789h;
                    if (android.text.TextUtils.isEmpty(a17.f323784c) || !hp3.d.a(a17.f323784c)) {
                        aVar.f234359h = (int) (java.lang.System.currentTimeMillis() / 1000);
                    } else {
                        aVar.f234359h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17.f323784c, 0);
                    }
                }
                this.f234364h = aVar;
                if (aVar == null) {
                    db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new fp3.h(this));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
                db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new fp3.h(this));
            }
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        V6();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (!(com.p314xaae8f345.mm.p2802xd031a825.a.g(this) instanceof bp3.e)) {
            return true;
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.a(this);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof dp3.n)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar = ((dp3.n) m1Var).f323756d;
        java.util.Objects.toString(aVar);
        if (aVar == null) {
            return true;
        }
        this.f234364h = aVar;
        W6();
        return true;
    }
}
