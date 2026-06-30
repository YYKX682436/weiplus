package b04;

/* loaded from: classes4.dex */
public final class z extends wm3.a {
    public final jz5.g A;
    public final b04.q B;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f16947d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f16948e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f16949f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.code.CodeItemView f16950g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f16951h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f16952i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f16953m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f16954n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f16955o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f16956p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f16957q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f16958r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f16959s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16960t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f16961u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f16962v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ValueAnimator f16963w;

    /* renamed from: x, reason: collision with root package name */
    public int f16964x;

    /* renamed from: y, reason: collision with root package name */
    public int f16965y;

    /* renamed from: z, reason: collision with root package name */
    public int f16966z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f16947d = jz5.h.b(new b04.m(this));
        this.f16948e = jz5.h.b(new b04.n(this));
        this.f16949f = jz5.h.b(new b04.o(this));
        this.f16959s = new java.util.LinkedHashSet();
        this.A = jz5.h.b(b04.p.f16927d);
        this.B = new b04.q(this);
    }

    public final void T6(java.util.List list, int i17, int i18, boolean z17) {
        char c17;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        int i19;
        int i27;
        int i28;
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView4 = this.f16954n;
        android.widget.ImageView imageView5 = this.f16955o;
        android.widget.ImageView imageView6 = this.f16956p;
        java.util.List subList = list.size() <= 3 ? list : list.subList(list.size() - 3, list.size());
        int size = subList.size();
        android.widget.FrameLayout frameLayout = this.f16953m;
        if (frameLayout != null) {
            if (size == 0) {
                i19 = 0;
            } else if (size != 1) {
                if (size != 2) {
                    i27 = this.f16965y * 3;
                    i28 = this.f16966z * 2;
                } else {
                    i27 = this.f16965y * 2;
                    i28 = this.f16966z;
                }
                i19 = i27 + i28;
            } else {
                i19 = this.f16965y;
            }
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams.width != i19) {
                layoutParams.width = i19;
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        if (z17 && i17 >= 3 && i18 > i17 && subList.size() == 3) {
            com.tencent.mm.storage.m7 m7Var = (com.tencent.mm.storage.m7) subList.get(2);
            com.tencent.mm.storage.m7 m7Var2 = (com.tencent.mm.storage.m7) subList.get(1);
            com.tencent.mm.storage.m7 m7Var3 = (com.tencent.mm.storage.m7) subList.get(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "applyNewFriendList rotation newest=%s oldFirst=%s oldMid=%s", m7Var.field_talker, m7Var2.field_talker, m7Var3.field_talker);
            if (this.f16965y == 0) {
                return;
            }
            kv.z zVar2 = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView7 = this.f16957q;
            if (imageView7 == null || (imageView = this.f16954n) == null || (imageView2 = this.f16955o) == null || (imageView3 = this.f16956p) == null) {
                return;
            }
            ((com.tencent.mm.feature.avatar.w) zVar2).Ai(imageView7, m7Var.field_talker, null);
            java.util.Set set = this.f16959s;
            java.lang.String field_talker = m7Var.field_talker;
            kotlin.jvm.internal.o.f(field_talker, "field_talker");
            set.add(field_talker);
            imageView7.setVisibility(0);
            imageView7.setTranslationX(-(this.f16965y + this.f16966z));
            imageView7.setScaleX(0.0f);
            imageView7.setScaleY(0.0f);
            imageView7.setAlpha(0.0f);
            android.view.View view = this.f16958r;
            float Y6 = Y6(1) + this.f16965y;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "animateRotation", "(Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "animateRotation", "(Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTranslationX(Y6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "animateRotation", "(Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "animateRotation", "(Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;Lcom/tencent/mm/storage/FMessageConversation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            imageView2.bringToFront();
            imageView7.bringToFront();
            if (view != null) {
                view.bringToFront();
            }
            imageView.setTranslationX(Y6(0));
            imageView2.setTranslationX(Y6(1));
            imageView3.setTranslationX(Y6(2));
            float f17 = this.f16965y + this.f16966z;
            android.animation.ValueAnimator valueAnimator = this.f16962v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new b04.g(imageView7, f17, imageView, this, imageView2, view, Y6));
            ofFloat.addListener(new b04.h(zVar2, imageView, m7Var, imageView2, m7Var2, imageView3, m7Var3, this, imageView7, view));
            ofFloat.start();
            this.f16962v = ofFloat;
            if (view != null) {
                android.animation.ValueAnimator valueAnimator2 = this.f16963w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(80L);
                ofFloat2.addUpdateListener(new b04.i(view));
                ofFloat2.addListener(new b04.j(this));
                ofFloat2.start();
                this.f16963w = ofFloat2;
                return;
            }
            return;
        }
        if (imageView4 != null) {
            imageView4.setTranslationX(Y6(0));
        }
        if (imageView5 != null) {
            imageView5.setTranslationX(Y6(1));
        }
        if (imageView6 == null) {
            c17 = 2;
        } else {
            c17 = 2;
            imageView6.setTranslationX(Y6(2));
        }
        android.widget.ImageView[] imageViewArr = new android.widget.ImageView[3];
        imageViewArr[0] = imageView4;
        imageViewArr[1] = imageView5;
        imageViewArr[c17] = imageView6;
        for (android.widget.ImageView imageView8 : kz5.c0.i(imageViewArr)) {
            if (imageView8 != null) {
                imageView8.setScaleX(1.0f);
            }
            if (imageView8 != null) {
                imageView8.setScaleY(1.0f);
            }
            if (imageView8 != null) {
                imageView8.setAlpha(1.0f);
            }
            if (imageView8 != null) {
                imageView8.setPivotX(this.f16965y / 2.0f);
            }
            if (imageView8 != null) {
                imageView8.setPivotY(this.f16965y / 2.0f);
            }
        }
        android.widget.ImageView imageView9 = this.f16957q;
        if (imageView9 != null) {
            imageView9.setVisibility(8);
        }
        android.view.View view2 = this.f16958r;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "applyNewFriendList", "(Ljava/util/List;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "applyNewFriendList", "(Ljava/util/List;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int size2 = subList.size();
        if (size2 == 1) {
            com.tencent.mm.storage.m7 m7Var4 = (com.tencent.mm.storage.m7) subList.get(0);
            kotlin.jvm.internal.o.d(zVar);
            U6(imageView4, m7Var4, zVar);
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
        } else if (size2 == 2) {
            com.tencent.mm.storage.m7 m7Var5 = (com.tencent.mm.storage.m7) subList.get(1);
            kotlin.jvm.internal.o.d(zVar);
            U6(imageView4, m7Var5, zVar);
            U6(imageView5, (com.tencent.mm.storage.m7) subList.get(0), zVar);
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
        } else if (size2 != 3) {
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
        } else {
            com.tencent.mm.storage.m7 m7Var6 = (com.tencent.mm.storage.m7) subList.get(2);
            kotlin.jvm.internal.o.d(zVar);
            U6(imageView4, m7Var6, zVar);
            U6(imageView5, (com.tencent.mm.storage.m7) subList.get(1), zVar);
            U6(imageView6, (com.tencent.mm.storage.m7) subList.get(0), zVar);
        }
        if (z17 && i18 > i17 && (!subList.isEmpty())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "applyNewFriendList scaleIn prev=%d new=%d visibleSize=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(subList.size()));
            android.widget.ImageView imageView10 = this.f16954n;
            if (imageView10 == null || this.f16965y == 0) {
                return;
            }
            imageView10.setScaleX(0.0f);
            imageView10.setScaleY(0.0f);
            imageView10.setAlpha(0.0f);
            android.animation.ValueAnimator valueAnimator3 = this.f16962v;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.setDuration(150L);
            ofFloat3.addUpdateListener(new b04.k(imageView10));
            ofFloat3.addListener(new b04.l(imageView10, this));
            ofFloat3.start();
            this.f16962v = ofFloat3;
        }
    }

    public final void U6(android.widget.ImageView imageView, com.tencent.mm.storage.m7 m7Var, kv.z zVar) {
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, m7Var.field_talker, null);
        java.util.Set set = this.f16959s;
        java.lang.String field_talker = m7Var.field_talker;
        kotlin.jvm.internal.o.f(field_talker, "field_talker");
        set.add(field_talker);
    }

    public final com.tencent.mm.storage.o7 V6() {
        return (com.tencent.mm.storage.o7) ((jz5.n) this.A).getValue();
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "hideBarWithAnimation prev=%d", java.lang.Integer.valueOf(this.f16964x));
        android.widget.LinearLayout linearLayout = this.f16951h;
        java.lang.Object parent = linearLayout != null ? linearLayout.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (linearLayout == null || view == null) {
            com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f16950g;
            if (codeItemView != null) {
                codeItemView.setBottomView(null);
            }
            this.f16960t = false;
            return;
        }
        int height = view.getHeight();
        if (height <= 0) {
            com.tencent.mm.ui.widget.code.CodeItemView codeItemView2 = this.f16950g;
            if (codeItemView2 != null) {
                codeItemView2.setBottomView(null);
            }
            this.f16960t = false;
            return;
        }
        linearLayout.getLayoutParams().height = height;
        linearLayout.setAlpha(1.0f);
        view.getLayoutParams().height = height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "hideBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "hideBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator valueAnimator = this.f16961u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b04.r(height, view, linearLayout));
        ofFloat.addListener(new b04.s(linearLayout, view, this));
        ofFloat.start();
        this.f16961u = ofFloat;
        this.f16960t = false;
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "showBarWithAnimation prev=%d", java.lang.Integer.valueOf(this.f16964x));
        android.widget.LinearLayout linearLayout = this.f16951h;
        if (linearLayout == null) {
            return;
        }
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f16950g;
        if (codeItemView != null) {
            codeItemView.setBottomView(linearLayout);
        }
        java.lang.Object parent = linearLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return;
        }
        java.lang.Object parent2 = view.getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2 != null ? view2.getWidth() : 0, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            return;
        }
        linearLayout.getLayoutParams().height = measuredHeight;
        linearLayout.setAlpha(0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "showBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "showBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.getLayoutParams().height = 0;
        android.animation.ValueAnimator valueAnimator = this.f16961u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b04.x(measuredHeight, view, linearLayout));
        ofFloat.addListener(new b04.y(view, linearLayout, this));
        ofFloat.start();
        this.f16961u = ofFloat;
        this.f16960t = true;
    }

    public final float Y6(int i17) {
        return i17 * (this.f16965y + this.f16966z);
    }

    public final void Z6() {
        com.tencent.mm.storage.o7 V6 = V6();
        if (V6 == null) {
            return;
        }
        try {
            int b17 = V6.b1();
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData newCount = %d", java.lang.Integer.valueOf(b17));
            if (b17 <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData count=0 isBarVisible=%b", java.lang.Boolean.valueOf(this.f16960t));
                if (this.f16960t) {
                    W6();
                } else {
                    com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f16950g;
                    if (codeItemView != null) {
                        codeItemView.setBottomView(null);
                    }
                }
                this.f16964x = 0;
                return;
            }
            boolean z18 = this.f16960t;
            if (!z18) {
                X6();
            }
            android.widget.TextView textView = this.f16952i;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(b17));
                textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getActivity(), b17));
                textView.setVisibility(0);
            }
            java.util.List x07 = kz5.n0.x0(V6.d1(3));
            java.lang.Object[] objArr = new java.lang.Object[3];
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(x07, 10));
            java.util.Iterator it = x07.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.storage.m7) it.next()).field_talker);
            }
            objArr[0] = arrayList;
            objArr[1] = java.lang.Integer.valueOf(this.f16964x);
            objArr[2] = java.lang.Integer.valueOf(b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData after reverse talkers=%s prev=%d new=%d", objArr);
            if (!z18 || b17 <= this.f16964x) {
                z17 = false;
            }
            T6(x07, this.f16964x, b17, z17);
            this.f16964x = b17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData e = %s", e17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.el7;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.setMMTitle(com.tencent.mm.R.string.nmj);
        mMActivity.setBackBtn(new b04.v(mMActivity));
        if (((java.lang.Number) ((jz5.n) this.f16949f).getValue()).intValue() != 7) {
            com.tencent.mm.plugin.scanner.model.h2.f158926g = 0;
            com.tencent.mm.plugin.scanner.model.h2.f158921b = "";
            com.tencent.mm.plugin.scanner.model.h2.f158922c = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = (java.util.List) ((jz5.n) this.f16948e).getValue();
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Object a17 = pf5.z.f353948a.a(mMActivity).a((java.lang.Class) obj);
                kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.ui.widget.code.ICodeItemUIC");
                android.view.View i27 = ((ll5.h) a17).i2();
                kotlin.jvm.internal.o.e(i27, "null cannot be cast to non-null type com.tencent.mm.ui.widget.code.CodeItemView");
                com.tencent.mm.ui.widget.code.CodeItemView codeItemView = (com.tencent.mm.ui.widget.code.CodeItemView) i27;
                arrayList.add(codeItemView);
                codeItemView.setItemClickListener(new b04.w(arrayList, codeItemView, this));
                ((android.widget.LinearLayout) ((jz5.n) this.f16947d).getValue()).addView(codeItemView);
                if (i17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = codeItemView.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i65.a.h(mMActivity, com.tencent.mm.R.dimen.aih);
                    codeItemView.setLayoutParams(marginLayoutParams);
                }
                i17 = i18;
            }
        }
        this.f16950g = (com.tencent.mm.ui.widget.code.CodeItemView) kz5.n0.Z(arrayList);
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigQrCodeNewFriendBar()) == 1) {
            this.f16965y = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.alw);
            this.f16966z = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
            android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.ei_, (android.view.ViewGroup) null);
            this.f16951h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.ukw);
            this.f16952i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ukx);
            this.f16953m = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.a9w);
            this.f16954n = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.sgc);
            this.f16955o = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.sgd);
            this.f16956p = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.sge);
            this.f16957q = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.sg_);
            this.f16958r = inflate.findViewById(com.tencent.mm.R.id.sg9);
            android.widget.LinearLayout linearLayout = this.f16951h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new b04.t(this));
            }
            int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.alu);
            for (android.widget.ImageView imageView : kz5.c0.i(this.f16954n, this.f16955o, this.f16956p, this.f16957q)) {
                if (imageView != null) {
                    imageView.setClipToOutline(true);
                }
                if (imageView != null) {
                    imageView.setOutlineProvider(new b04.u(dimensionPixelSize));
                }
            }
            android.widget.ImageView imageView2 = this.f16954n;
            if (imageView2 != null) {
                imageView2.setTranslationX(Y6(0));
            }
            android.widget.ImageView imageView3 = this.f16955o;
            if (imageView3 != null) {
                imageView3.setTranslationX(Y6(1));
            }
            android.widget.ImageView imageView4 = this.f16956p;
            if (imageView4 != null) {
                imageView4.setTranslationX(Y6(2));
            }
            android.widget.ImageView imageView5 = this.f16957q;
            if (imageView5 != null) {
                imageView5.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView6 = this.f16957q;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            android.view.View view = this.f16958r;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "initNewFriendViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "initNewFriendViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(V6() != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "onCreate fMsgStorage=%b", objArr);
            com.tencent.mm.storage.o7 V6 = V6();
            if (V6 != null) {
                V6.add(this.B);
            }
            Z6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.storage.o7 V6;
        java.util.Set<java.lang.String> set = this.f16959s;
        com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "onDestroy markShownAsSeen size=%d", java.lang.Integer.valueOf(set.size()));
        android.animation.ValueAnimator valueAnimator = this.f16961u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f16962v;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.f16963w;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigQrCodeNewFriendBar()) == 1) {
            com.tencent.mm.storage.o7 V62 = V6();
            if (V62 != null) {
                for (java.lang.String str : set) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        V62.f1(str);
                    }
                }
            }
            set.clear();
            if (!gm0.j1.a() || (V6 = V6()) == null) {
                return;
            }
            V6.remove(this.B);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            x24.a.c(-1.0f, P6);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setRequestedOrientation(1);
            x24.a.c(0.85f, P6);
        }
    }
}
