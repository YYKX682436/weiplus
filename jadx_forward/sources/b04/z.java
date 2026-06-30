package b04;

/* loaded from: classes4.dex */
public final class z extends wm3.a {
    public final jz5.g A;
    public final b04.q B;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f98480d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f98481e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f98482f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98483g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f98484h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f98485i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f98486m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f98487n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f98488o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f98489p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f98490q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f98491r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f98492s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f98493t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f98494u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f98495v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ValueAnimator f98496w;

    /* renamed from: x, reason: collision with root package name */
    public int f98497x;

    /* renamed from: y, reason: collision with root package name */
    public int f98498y;

    /* renamed from: z, reason: collision with root package name */
    public int f98499z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f98480d = jz5.h.b(new b04.m(this));
        this.f98481e = jz5.h.b(new b04.n(this));
        this.f98482f = jz5.h.b(new b04.o(this));
        this.f98492s = new java.util.LinkedHashSet();
        this.A = jz5.h.b(b04.p.f98460d);
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
        android.widget.ImageView imageView4 = this.f98487n;
        android.widget.ImageView imageView5 = this.f98488o;
        android.widget.ImageView imageView6 = this.f98489p;
        java.util.List subList = list.size() <= 3 ? list : list.subList(list.size() - 3, list.size());
        int size = subList.size();
        android.widget.FrameLayout frameLayout = this.f98486m;
        if (frameLayout != null) {
            if (size == 0) {
                i19 = 0;
            } else if (size != 1) {
                if (size != 2) {
                    i27 = this.f98498y * 3;
                    i28 = this.f98499z * 2;
                } else {
                    i27 = this.f98498y * 2;
                    i28 = this.f98499z;
                }
                i19 = i27 + i28;
            } else {
                i19 = this.f98498y;
            }
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams.width != i19) {
                layoutParams.width = i19;
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        if (z17 && i17 >= 3 && i18 > i17 && subList.size() == 3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(2);
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(1);
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "applyNewFriendList rotation newest=%s oldFirst=%s oldMid=%s", m7Var.f66376x114ef53e, m7Var2.f66376x114ef53e, m7Var3.f66376x114ef53e);
            if (this.f98498y == 0) {
                return;
            }
            kv.z zVar2 = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView7 = this.f98490q;
            if (imageView7 == null || (imageView = this.f98487n) == null || (imageView2 = this.f98488o) == null || (imageView3 = this.f98489p) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar2).Ai(imageView7, m7Var.f66376x114ef53e, null);
            java.util.Set set = this.f98492s;
            java.lang.String field_talker = m7Var.f66376x114ef53e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
            set.add(field_talker);
            imageView7.setVisibility(0);
            imageView7.setTranslationX(-(this.f98498y + this.f98499z));
            imageView7.setScaleX(0.0f);
            imageView7.setScaleY(0.0f);
            imageView7.setAlpha(0.0f);
            android.view.View view = this.f98491r;
            float Y6 = Y6(1) + this.f98498y;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
            float f17 = this.f98498y + this.f98499z;
            android.animation.ValueAnimator valueAnimator = this.f98495v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new b04.g(imageView7, f17, imageView, this, imageView2, view, Y6));
            ofFloat.addListener(new b04.h(zVar2, imageView, m7Var, imageView2, m7Var2, imageView3, m7Var3, this, imageView7, view));
            ofFloat.start();
            this.f98495v = ofFloat;
            if (view != null) {
                android.animation.ValueAnimator valueAnimator2 = this.f98496w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(80L);
                ofFloat2.addUpdateListener(new b04.i(view));
                ofFloat2.addListener(new b04.j(this));
                ofFloat2.start();
                this.f98496w = ofFloat2;
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
                imageView8.setPivotX(this.f98498y / 2.0f);
            }
            if (imageView8 != null) {
                imageView8.setPivotY(this.f98498y / 2.0f);
            }
        }
        android.widget.ImageView imageView9 = this.f98490q;
        if (imageView9 != null) {
            imageView9.setVisibility(8);
        }
        android.view.View view2 = this.f98491r;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "applyNewFriendList", "(Ljava/util/List;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "applyNewFriendList", "(Ljava/util/List;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int size2 = subList.size();
        if (size2 == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var4 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
            U6(imageView4, m7Var4, zVar);
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
        } else if (size2 == 2) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var5 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
            U6(imageView4, m7Var5, zVar);
            U6(imageView5, (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(0), zVar);
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
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var6 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
            U6(imageView4, m7Var6, zVar);
            U6(imageView5, (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(1), zVar);
            U6(imageView6, (com.p314xaae8f345.mm.p2621x8fb0427b.m7) subList.get(0), zVar);
        }
        if (z17 && i18 > i17 && (!subList.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "applyNewFriendList scaleIn prev=%d new=%d visibleSize=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(subList.size()));
            android.widget.ImageView imageView10 = this.f98487n;
            if (imageView10 == null || this.f98498y == 0) {
                return;
            }
            imageView10.setScaleX(0.0f);
            imageView10.setScaleY(0.0f);
            imageView10.setAlpha(0.0f);
            android.animation.ValueAnimator valueAnimator3 = this.f98495v;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.setDuration(150L);
            ofFloat3.addUpdateListener(new b04.k(imageView10));
            ofFloat3.addListener(new b04.l(imageView10, this));
            ofFloat3.start();
            this.f98495v = ofFloat3;
        }
    }

    public final void U6(android.widget.ImageView imageView, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var, kv.z zVar) {
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, m7Var.f66376x114ef53e, null);
        java.util.Set set = this.f98492s;
        java.lang.String field_talker = m7Var.f66376x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
        set.add(field_talker);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.o7 V6() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.o7) ((jz5.n) this.A).mo141623x754a37bb();
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "hideBarWithAnimation prev=%d", java.lang.Integer.valueOf(this.f98497x));
        android.widget.LinearLayout linearLayout = this.f98484h;
        java.lang.Object parent = linearLayout != null ? linearLayout.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (linearLayout == null || view == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f98483g;
            if (c22675xc8629185 != null) {
                c22675xc8629185.m81865xb81c4172(null);
            }
            this.f98493t = false;
            return;
        }
        int height = view.getHeight();
        if (height <= 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc86291852 = this.f98483g;
            if (c22675xc86291852 != null) {
                c22675xc86291852.m81865xb81c4172(null);
            }
            this.f98493t = false;
            return;
        }
        linearLayout.getLayoutParams().height = height;
        linearLayout.setAlpha(1.0f);
        view.getLayoutParams().height = height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "hideBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "hideBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator valueAnimator = this.f98494u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b04.r(height, view, linearLayout));
        ofFloat.addListener(new b04.s(linearLayout, view, this));
        ofFloat.start();
        this.f98494u = ofFloat;
        this.f98493t = false;
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "showBarWithAnimation prev=%d", java.lang.Integer.valueOf(this.f98497x));
        android.widget.LinearLayout linearLayout = this.f98484h;
        if (linearLayout == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f98483g;
        if (c22675xc8629185 != null) {
            c22675xc8629185.m81865xb81c4172(linearLayout);
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
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "showBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "showBarWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.getLayoutParams().height = 0;
        android.animation.ValueAnimator valueAnimator = this.f98494u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b04.x(measuredHeight, view, linearLayout));
        ofFloat.addListener(new b04.y(view, linearLayout, this));
        ofFloat.start();
        this.f98494u = ofFloat;
        this.f98493t = true;
    }

    public final float Y6(int i17) {
        return i17 * (this.f98498y + this.f98499z);
    }

    public final void Z6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.o7 V6 = V6();
        if (V6 == null) {
            return;
        }
        try {
            int b17 = V6.b1();
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData newCount = %d", java.lang.Integer.valueOf(b17));
            if (b17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData count=0 isBarVisible=%b", java.lang.Boolean.valueOf(this.f98493t));
                if (this.f98493t) {
                    W6();
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f98483g;
                    if (c22675xc8629185 != null) {
                        c22675xc8629185.m81865xb81c4172(null);
                    }
                }
                this.f98497x = 0;
                return;
            }
            boolean z18 = this.f98493t;
            if (!z18) {
                X6();
            }
            android.widget.TextView textView = this.f98485i;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(b17));
                textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(m158354x19263085(), b17));
                textView.setVisibility(0);
            }
            java.util.List x07 = kz5.n0.x0(V6.d1(3));
            java.lang.Object[] objArr = new java.lang.Object[3];
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(x07, 10));
            java.util.Iterator it = x07.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.m7) it.next()).f66376x114ef53e);
            }
            objArr[0] = arrayList;
            objArr[1] = java.lang.Integer.valueOf(this.f98497x);
            objArr[2] = java.lang.Integer.valueOf(b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData after reverse talkers=%s prev=%d new=%d", objArr);
            if (!z18 || b17 <= this.f98497x) {
                z17 = false;
            }
            T6(x07, this.f98497x, b17, z17);
            this.f98497x = b17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "updateNewFriendData e = %s", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.el7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.nmj);
        abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new b04.v(abstractActivityC21394xb3d2c0cf));
        if (((java.lang.Number) ((jz5.n) this.f98482f).mo141623x754a37bb()).intValue() != 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240459g = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240455c = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = (java.util.List) ((jz5.n) this.f98481e).mo141623x754a37bb();
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Object a17 = pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a((java.lang.Class) obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.ui.widget.code.ICodeItemUIC");
                android.view.View i27 = ((ll5.h) a17).i2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i27, "null cannot be cast to non-null type com.tencent.mm.ui.widget.code.CodeItemView");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185) i27;
                arrayList.add(c22675xc8629185);
                c22675xc8629185.m81866x9bb105c7(new b04.w(arrayList, c22675xc8629185, this));
                ((android.widget.LinearLayout) ((jz5.n) this.f98480d).mo141623x754a37bb()).addView(c22675xc8629185);
                if (i17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = c22675xc8629185.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i65.a.h(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.aih);
                    c22675xc8629185.setLayoutParams(marginLayoutParams);
                }
                i17 = i18;
            }
        }
        this.f98483g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185) kz5.n0.Z(arrayList);
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20307xb162d7bf()) == 1) {
            this.f98498y = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.alw);
            this.f98499z = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ei_, (android.view.ViewGroup) null);
            this.f98484h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.ukw);
            this.f98485i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ukx);
            this.f98486m = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9w);
            this.f98487n = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sgc);
            this.f98488o = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sgd);
            this.f98489p = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sge);
            this.f98490q = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sg_);
            this.f98491r = inflate.findViewById(com.p314xaae8f345.mm.R.id.sg9);
            android.widget.LinearLayout linearLayout = this.f98484h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new b04.t(this));
            }
            int dimensionPixelSize = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.alu);
            for (android.widget.ImageView imageView : kz5.c0.i(this.f98487n, this.f98488o, this.f98489p, this.f98490q)) {
                if (imageView != null) {
                    imageView.setClipToOutline(true);
                }
                if (imageView != null) {
                    imageView.setOutlineProvider(new b04.u(dimensionPixelSize));
                }
            }
            android.widget.ImageView imageView2 = this.f98487n;
            if (imageView2 != null) {
                imageView2.setTranslationX(Y6(0));
            }
            android.widget.ImageView imageView3 = this.f98488o;
            if (imageView3 != null) {
                imageView3.setTranslationX(Y6(1));
            }
            android.widget.ImageView imageView4 = this.f98489p;
            if (imageView4 != null) {
                imageView4.setTranslationX(Y6(2));
            }
            android.widget.ImageView imageView5 = this.f98490q;
            if (imageView5 != null) {
                imageView5.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView6 = this.f98490q;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            android.view.View view = this.f98491r;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "initNewFriendViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC", "initNewFriendViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(V6() != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "onCreate fMsgStorage=%b", objArr);
            com.p314xaae8f345.mm.p2621x8fb0427b.o7 V6 = V6();
            if (V6 != null) {
                V6.add(this.B);
            }
            Z6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.o7 V6;
        java.util.Set<java.lang.String> set = this.f98492s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "onDestroy markShownAsSeen size=%d", java.lang.Integer.valueOf(set.size()));
        android.animation.ValueAnimator valueAnimator = this.f98494u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f98495v;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.f98496w;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20307xb162d7bf()) == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.o7 V62 = V6();
            if (V62 != null) {
                for (java.lang.String str : set) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        V62.f1(str);
                    }
                }
            }
            set.clear();
            if (!gm0.j1.a() || (V6 = V6()) == null) {
                return;
            }
            V6.mo49775xc84af884(this.B);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            x24.a.c(-1.0f, P6);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.setRequestedOrientation(1);
            x24.a.c(0.85f, P6);
        }
    }
}
