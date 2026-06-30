package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC */
/* loaded from: classes2.dex */
public final class C15460x89aca30d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f215120d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f215121e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215122f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f215123g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15461xb8cae578 f215124h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f215125i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f215126m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f215127n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f215128o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f215129p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f215130q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f215131r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1] */
    public C15460x89aca30d(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215122f = true;
        this.f215124h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a>(this) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d f215133e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                this.f215133e = this;
                this.f39173x3fe91575 = -1291074182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a event = c5441x35e2cf6a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f135782g.f88194d) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                    pf5.z zVar = pf5.z.f435481a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a(activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
                    if (a4Var != null && a4Var.f215262y) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: some drawer has been open");
                    } else if (activity2.getResources().getConfiguration().orientation != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: activity is not portrait");
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoFinishListener: isPeek=");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d = this.f215133e;
                        sb6.append(c15460x89aca30d.f215122f);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", sb6.toString());
                        if (c15460x89aca30d.f215122f) {
                            c15460x89aca30d.f215122f = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(c15460x89aca30d.Q6(), false, 1, null);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn.class)).f216713e = 1;
                        }
                    }
                }
                return true;
            }
        };
        this.f215126m = new android.graphics.Rect();
        this.f215127n = new android.graphics.Rect();
        this.f215128o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lm(this));
        this.f215129p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nm(this));
        this.f215130q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qm(this));
        this.f215131r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mm(this));
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d, in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.c79);
        if (p17 != null) {
            android.view.View findViewById = c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.c79);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cm(p17, s0Var, c15460x89aca30d));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.h6b);
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.h6b);
            c22699x3dcdb3522.m82040x7541828(c22699x3dcdb352.m82035xab0057b4());
            c22699x3dcdb3522.setAlpha(c22699x3dcdb352.getAlpha());
            c22699x3dcdb3522.setImageDrawable(c22699x3dcdb352.getDrawable());
            c22699x3dcdb3522.setVisibility(c22699x3dcdb352.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.c6s);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.c6s);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d, in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.msw);
        if (p17 != null) {
            android.view.View findViewById = c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.msw);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.em(p17, s0Var, c15460x89aca30d));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.h6p);
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.h6p);
            c22699x3dcdb3522.m82040x7541828(c22699x3dcdb352.m82035xab0057b4());
            c22699x3dcdb3522.setAlpha(c22699x3dcdb352.getAlpha());
            c22699x3dcdb3522.setImageDrawable(c22699x3dcdb352.getDrawable());
            c22699x3dcdb3522.setVisibility(c22699x3dcdb352.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.msm);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) c15460x89aca30d.R6().findViewById(com.p314xaae8f345.mm.R.id.msm);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final gx2.q Q6() {
        gx2.q qVar = this.f215120d;
        if (qVar != null) {
            return qVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDrawer");
        throw null;
    }

    public final android.view.View R6() {
        return (android.view.View) ((jz5.n) this.f215131r).mo141623x754a37bb();
    }

    public final android.widget.FrameLayout S6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f215130q).mo141623x754a37bb();
    }

    public final boolean T6(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        boolean z17 = true;
        boolean z18 = this.f215122f && motionEvent != null && motionEvent2 != null && Q6().onScroll(motionEvent, motionEvent2, f17, f18);
        if (!this.f215123g && !z18) {
            z17 = false;
        }
        this.f215123g = z17;
        return z18;
    }

    public final void U6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_x);
        if (p17 != null) {
            android.view.View findViewById = R6().findViewById(com.p314xaae8f345.mm.R.id.a_x);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jm(p17));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6i);
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) R6().findViewById(com.p314xaae8f345.mm.R.id.h6i);
            c22699x3dcdb3522.setAlpha(c22699x3dcdb352.getAlpha());
            c22699x3dcdb3522.setImageDrawable(c22699x3dcdb352.getDrawable());
            c22699x3dcdb3522.m82040x7541828(c22699x3dcdb352.m82035xab0057b4());
            c22699x3dcdb3522.setVisibility(c22699x3dcdb352.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) R6().findViewById(com.p314xaae8f345.mm.R.id.i1g);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final void V6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568621ng5);
        if (p17 != null) {
            android.view.View findViewById = R6().findViewById(com.p314xaae8f345.mm.R.id.f568621ng5);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.km(p17));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6s);
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) R6().findViewById(com.p314xaae8f345.mm.R.id.h6s);
            c22699x3dcdb3522.setAlpha(c22699x3dcdb352.getAlpha());
            c22699x3dcdb3522.setImageDrawable(c22699x3dcdb352.getDrawable());
            c22699x3dcdb3522.m82040x7541828(c22699x3dcdb352.m82035xab0057b4());
            c22699x3dcdb3522.setVisibility(c22699x3dcdb352.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f568619ng3);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) R6().findViewById(com.p314xaae8f345.mm.R.id.f568619ng3);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final void W6() {
        android.view.View view = (android.view.View) ((jz5.n) this.f215128o).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6().setVisibility(8);
        this.f215125i = null;
    }
}
