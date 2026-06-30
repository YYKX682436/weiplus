package jx2;

/* loaded from: classes3.dex */
public final class j extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f383965b;

    /* renamed from: c, reason: collision with root package name */
    public final jx2.h f383966c;

    /* renamed from: d, reason: collision with root package name */
    public int f383967d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, jx2.k delegate) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f383965b = context;
        jx2.h hVar = new jx2.h();
        this.f383966c = hVar;
        java.lang.String str = null;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570312ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setFocusable(true);
        setOutsideTouchable(true);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.feedback.FinderAdFeedbackPopupWindow$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62686xac79a11b() {
                    jx2.j jVar = jx2.j.this;
                    jVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) jVar.f383965b).mo273xed6858b4().c(this);
                }
            });
        }
        android.view.View contentView = getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView, "getContentView(...)");
        hVar.f383953a = contentView;
        hVar.f383954b = delegate;
        hVar.f383955c = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.e0w);
        hVar.f383956d = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.e0x);
        hVar.f383957e = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.e0y);
        hVar.f383958f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) contentView.findViewById(com.p314xaae8f345.mm.R.id.lko);
        hVar.f383959g = contentView.findViewById(com.p314xaae8f345.mm.R.id.gdv);
        hVar.f383960h = contentView.findViewById(com.p314xaae8f345.mm.R.id.gdw);
        hVar.f383961i = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.e0j);
        android.view.View view = hVar.f383959g;
        if (view != null) {
            view.setOnClickListener(new jx2.b(delegate, hVar));
        }
        jx2.k kVar = hVar.f383954b;
        if (kVar != null) {
            android.view.View view2 = hVar.f383953a;
            android.content.Context context2 = view2 != null ? view2.getContext() : null;
            if (context2 != null) {
                android.widget.TextView textView = hVar.f383955c;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = hVar.f383956d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = hVar.f383957e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.widget.TextView textView4 = hVar.f383961i;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                android.widget.TextView textView5 = hVar.f383955c;
                if (textView5 != null) {
                    jx2.l lVar = (jx2.l) kVar;
                    java.lang.String m75945x2fec8307 = lVar.f383970b.m75945x2fec8307(9);
                    if (m75945x2fec8307 != null && (!r26.n0.N(m75945x2fec8307))) {
                        str = m75945x2fec8307;
                    }
                    if (str == null) {
                        str = lVar.f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckb);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                    }
                    textView5.setText(str);
                }
                android.widget.TextView textView6 = hVar.f383956d;
                if (textView6 != null) {
                    java.lang.String string = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    textView6.setText(string);
                }
                if (hVar.f383955c != null) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = hVar.f383958f;
                    if (c21475x81dbaa18 != null) {
                        c21475x81dbaa18.removeAllViews();
                    }
                    java.lang.String string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572833cp2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    android.view.View b17 = hVar.b(context2, string2, 1);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182 = hVar.f383958f;
                    if (c21475x81dbaa182 != null) {
                        c21475x81dbaa182.addView(b17);
                    }
                    b17.setOnClickListener(new jx2.d(hVar, b17, context2, kVar));
                    java.lang.String string3 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572831cp0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    android.view.View b18 = hVar.b(context2, string3, 0);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa183 = hVar.f383958f;
                    if (c21475x81dbaa183 != null) {
                        c21475x81dbaa183.addView(b18);
                    }
                    b18.setOnClickListener(new jx2.e(hVar, b18, context2));
                    android.view.View view3 = hVar.f383959g;
                    if (view3 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view4 = hVar.f383960h;
                    if (view4 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        hVar.f383963k = new jx2.i(this);
    }

    public final void a(android.view.View view, java.lang.Integer num) {
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4x);
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4q);
        int measuredWidth = (view.getMeasuredWidth() - (findViewById != null ? findViewById.getMeasuredWidth() : 0)) / 2;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth - this.f383967d;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById.setLayoutParams(marginLayoutParams2);
        }
        if (findViewById2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.rightMargin = measuredWidth - this.f383967d;
                marginLayoutParams = marginLayoutParams3;
            }
            findViewById2.setLayoutParams(marginLayoutParams);
        }
        if (num != null) {
            if (num.intValue() < 0) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackPopupWindow", "updateArrowMargin", "(Landroid/view/View;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f383965b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
        jx2.h hVar = this.f383966c;
        hVar.getClass();
        hVar.f383953a = null;
        hVar.f383954b = null;
        hVar.f383963k = null;
        ((java.util.ArrayList) hVar.f383962j).clear();
    }
}
