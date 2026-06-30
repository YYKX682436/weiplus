package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav */
/* loaded from: classes8.dex */
public class C21532x4955f5be extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.i9 f279220d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f279221e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f279222f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f279223g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f279224h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f279225i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f279226m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f279227n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f279228o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f279229p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f279230q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f279231r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f279232s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f279233t;

    /* renamed from: u, reason: collision with root package name */
    public yb5.d f279234u;

    /* renamed from: v, reason: collision with root package name */
    public int f279235v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.animation.Animation f279236w;

    public C21532x4955f5be(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }

    public void a() {
        android.view.View view = this.f279231r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), mo79290xa933cc55(), this);
        this.f279232s = findViewById(com.p314xaae8f345.mm.R.id.aun);
        this.f279221e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567627k54);
        this.f279222f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567628k55);
        this.f279223g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.czs);
        this.f279224h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h9u);
        this.f279225i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h9w);
        this.f279226m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h9v);
        this.f279227n = findViewById(com.p314xaae8f345.mm.R.id.f565015b02);
        this.f279228o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b08);
        this.f279233t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f279229p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.nxz);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f568753ny0);
        this.f279230q = c22699x3dcdb352;
        c22699x3dcdb352.setVisibility(8);
        this.f279221e.setOnClickListener(new db5.d9(this));
        android.view.View view = this.f279231r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i17 = this.f279221e.getLayoutParams().height;
        int i18 = this.f279223g.getLayoutParams().height;
        ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f279235v = (int) java.lang.Math.floor((r0.widthPixels - com.p314xaae8f345.mm.ui.zk.a(getContext(), 56)) / com.p314xaae8f345.mm.ui.zk.a(getContext(), 48));
    }

    public void c(int i17, int i18) {
        if (i17 < 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f279230q;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f279230q;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(i17);
            this.f279230q.m82040x7541828(i18);
            this.f279230q.setVisibility(0);
        }
    }

    public void d(java.util.List list) {
        boolean z17;
        android.widget.LinearLayout linearLayout = this.f279224h;
        boolean z18 = true;
        int i17 = 0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            z17 = false;
        } else {
            this.f279224h.removeAllViews();
            z17 = true;
        }
        android.widget.LinearLayout linearLayout2 = this.f279225i;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
            this.f279225i.removeAllViews();
            z17 = true;
        }
        android.widget.LinearLayout linearLayout3 = this.f279226m;
        if (linearLayout3 == null || linearLayout3.getVisibility() != 0) {
            z18 = z17;
        } else {
            this.f279226m.removeAllViews();
        }
        if (z18) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40));
                layoutParams.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(layoutParams);
                int i18 = this.f279235v;
                if (i17 < i18) {
                    this.f279224h.addView(imageView);
                } else if (i17 >= i18 && i17 < i18 * 2) {
                    this.f279225i.addView(imageView);
                } else if (i17 >= i18 * 2 && i17 < i18 * 3) {
                    this.f279226m.addView(imageView);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
                i17++;
            }
        }
    }

    public final void e(boolean z17) {
        android.view.View view = this.f279231r;
        if (view != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f279232s;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.LinearLayout linearLayout = this.f279221e;
                if (linearLayout != null) {
                    linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7a);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f279233t;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f279232s;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.LinearLayout linearLayout2 = this.f279221e;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f279233t;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(4);
            }
            yb5.d dVar = this.f279234u;
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public void f(long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559387dc);
        loadAnimation.setDuration(j17);
        this.f279223g.startAnimation(loadAnimation);
    }

    public void g(long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559391dg);
        this.f279236w = loadAnimation;
        loadAnimation.setDuration(j17);
        this.f279236w.setAnimationListener(new db5.h9(this));
        this.f279223g.startAnimation(this.f279236w);
    }

    /* renamed from: getArrowImg */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m79288x2f8e8070() {
        return this.f279233t;
    }

    /* renamed from: getBtnEnter */
    public android.widget.Button m79289xf8156f52() {
        return this.f279228o;
    }

    /* renamed from: getInitViewLayout */
    public int mo79290xa933cc55() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cxq;
    }

    public void h() {
        this.f279222f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
    }

    public void i() {
    }

    public void j(java.lang.String str, java.util.List list, long j17) {
        this.f279228o.setOnClickListener(new db5.e9(this, str));
        this.f279227n.setOnClickListener(new db5.f9(this));
        android.view.View view = this.f279231r;
        if (view != null) {
            view.setOnClickListener(new db5.g9(this));
        }
        int i17 = 0;
        if (this.f279223g.getVisibility() != 0) {
            this.f279223g.setVisibility(0);
            e(true);
            f(j17);
            android.view.View view2 = this.f279231r;
            if (view2 != null) {
                view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
            }
        }
        this.f279224h.setVisibility(0);
        this.f279224h.removeAllViews();
        if (list != null) {
            if (list.size() > this.f279235v) {
                this.f279225i.setVisibility(0);
                this.f279225i.removeAllViews();
            }
            if (list.size() > this.f279235v * 2) {
                this.f279226m.setVisibility(0);
                this.f279226m.removeAllViews();
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40));
            layoutParams.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            int i18 = this.f279235v;
            if (i17 < i18) {
                this.f279224h.addView(imageView);
            } else if (i17 >= i18 && i17 < i18 * 2) {
                this.f279225i.addView(imageView);
            } else if (i17 >= i18 * 2 && i17 < i18 * 3) {
                this.f279226m.addView(imageView);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            i17++;
        }
    }

    public void k(long j17) {
        e(false);
        if (this.f279223g.getVisibility() == 0) {
            g(j17);
        } else {
            h();
        }
        this.f279221e.setClickable(true);
    }

    /* renamed from: setBgViewResource */
    public void m79291x7f743ba(int i17) {
        android.widget.LinearLayout linearLayout = this.f279221e;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i17);
        }
    }

    /* renamed from: setChattingContext */
    public void m79292x4001c3c7(yb5.d dVar) {
        this.f279234u = dVar;
    }

    /* renamed from: setDialogContent */
    public void m79293xce19f0cf(java.lang.String str) {
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.omc)).setText(str);
    }

    /* renamed from: setNavContent */
    public void m79294xbf9c2bd8(java.lang.String str) {
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oob)).setText(str);
    }

    /* renamed from: setOnClickListener */
    public void m79295xa0ca35fb(db5.i9 i9Var) {
        this.f279220d = i9Var;
    }

    /* renamed from: setRootTipsBarBackground */
    public void m79296xc68cad45(android.view.View view) {
        this.f279231r = view;
    }

    public C21532x4955f5be(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
