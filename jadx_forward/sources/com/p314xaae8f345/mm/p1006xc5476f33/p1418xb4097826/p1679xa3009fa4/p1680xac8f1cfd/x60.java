package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class x60 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f217937a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f217938b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f217939c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 f217940d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j60 f217941e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f217942f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f217943g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f217944h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f217945i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f217946j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f217947k;

    public x60(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f217937a = activity;
        this.f217938b = context;
        this.f217940d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216457d;
        this.f217942f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w60(this));
        this.f217943g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m60(this));
        this.f217944h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t60(this));
        this.f217945i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s60(this));
        this.f217946j = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r60(this));
        this.f217947k = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q60(this));
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60 x60Var, boolean z17, boolean z18, float f17, int i17, java.lang.Object obj) {
        yz5.a aVar;
        int height;
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        x60Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SpeedSelectorPanelVM", "hidePanel needAnim: " + z17 + ", reShowHideView: " + z18 + ", selectedSpeed: " + f17);
        java.util.List list = x60Var.f217939c;
        if (list == null) {
            return;
        }
        x60Var.a(list, false, z18, z17);
        android.view.View findViewById = x60Var.b().findViewById(com.p314xaae8f345.mm.R.id.f567863kx2);
        if (findViewById != null) {
            if (z17) {
                int ordinal = x60Var.f217940d.ordinal();
                if (ordinal == 0) {
                    height = findViewById.getHeight();
                } else {
                    if (ordinal != 1) {
                        throw new jz5.j();
                    }
                    height = 0;
                }
                findViewById.animate().translationY(height).translationX(x60Var.f217940d == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216458e ? findViewById.getWidth() : 0).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p60(x60Var, findViewById)).start();
            } else {
                android.view.View decorView = x60Var.f217937a.getWindow().getDecorView();
                android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.removeView(x60Var.b());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j60 j60Var = x60Var.f217941e;
        if (j60Var != null && (aVar = j60Var.f216354e) != null) {
            aVar.mo152xb9724478();
        }
        x60Var.f217939c = null;
        x60Var.f217940d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216457d;
        x60Var.f217941e = null;
    }

    public final void a(java.util.List list, boolean z17, boolean z18, boolean z19) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (z17) {
                view.animate().alpha(0.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n60(view)).start();
            } else {
                if (z18) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (z19) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel", "animateHiddenViews", "(Ljava/util/List;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().alpha(1.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o60(view)).start();
                }
            }
        }
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f217942f).mo141623x754a37bb();
    }
}
