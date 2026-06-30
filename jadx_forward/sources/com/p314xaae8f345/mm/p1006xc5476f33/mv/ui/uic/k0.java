package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes5.dex */
public final class k0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232766d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232767e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232768f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f232769g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f232770h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f232771i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f232772m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 f232773n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f232774o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232766d = "MicroMsg.MusicMvCommentUIC";
        this.f232767e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h0(activity));
        this.f232768f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i0(activity));
        this.f232769g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j0(activity));
        this.f232773n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8();
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0 k0Var) {
        android.view.ViewGroup viewGroup;
        k0Var.f232774o = false;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 m8Var = k0Var.f232773n;
        java.util.HashMap hashMap = m8Var.f232836b;
        java.util.Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j8 j8Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j8) it.next();
            if (j8Var.f232763e) {
                android.view.View view = m8Var.f232835a;
                android.view.View findViewById = view != null ? view.findViewById(j8Var.f232759a) : null;
                if (findViewById != null) {
                    findViewById.animate().cancel();
                    float f17 = j8Var.f232761c;
                    int i17 = j8Var.f232760b;
                    if (i17 == 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList);
                        android.view.View view2 = findViewById;
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "restore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "restore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.animate().alpha(f17).setDuration(150L).start();
                    } else {
                        findViewById.animate().alpha(f17).setDuration(150L).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l8(findViewById, j8Var)).start();
                    }
                }
            }
        }
        hashMap.clear();
        k0Var.Q6().setVisibility(8);
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec) ((jz5.n) k0Var.f232768f).mo141623x754a37bb()).setVisibility(8);
        android.view.View view3 = k0Var.f232772m;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (view3 != null ? view3.getParent() : null);
        if (viewGroup2 != null) {
            viewGroup2.removeView(k0Var.f232772m);
        }
        android.view.View view4 = k0Var.f232770h;
        if (view4 == null || (viewGroup = (android.view.ViewGroup) view4.findViewById(com.p314xaae8f345.mm.R.id.jk8)) == null) {
            return;
        }
        viewGroup.addView(k0Var.f232772m);
    }

    public final void P6(android.view.View view, lm3.e item) {
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232766d, "bindView: ");
        android.view.View view2 = this.f232771i;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        if (this.f232774o) {
            android.view.View view3 = this.f232770h;
            if (view3 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view3, view)) {
                android.view.View view4 = this.f232772m;
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (view4 != null ? view4.getParent() : null);
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f232772m);
                }
                android.view.View view5 = this.f232770h;
                if (view5 != null && (viewGroup = (android.view.ViewGroup) view5.findViewById(com.p314xaae8f345.mm.R.id.jk8)) != null) {
                    viewGroup.addView(this.f232772m);
                }
                android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.c6o) : null;
                this.f232772m = findViewById;
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) (findViewById != null ? findViewById.getParent() : null);
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f232772m);
                }
                ((android.view.ViewGroup) ((jz5.n) this.f232769g).mo141623x754a37bb()).addView(this.f232772m);
            }
        } else {
            this.f232772m = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.c6o) : null;
        }
        this.f232770h = view;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c7a) : null;
        this.f232771i = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e0(this));
        }
        Q6().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f0(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec) ((jz5.n) this.f232768f).mo141623x754a37bb()).m67309xebdff806(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g0(this, item));
    }

    public final android.view.ViewGroup Q6() {
        return (android.view.ViewGroup) ((jz5.n) this.f232767e).mo141623x754a37bb();
    }
}
