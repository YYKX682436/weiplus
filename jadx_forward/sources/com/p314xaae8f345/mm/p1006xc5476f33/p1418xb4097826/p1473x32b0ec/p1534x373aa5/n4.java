package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class n4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f198031h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f198032i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f198033m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f198034n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f198035o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f198036p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f198037q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f198038r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f198039s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f198040t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f198041u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve f198042v;

    /* renamed from: w, reason: collision with root package name */
    public int f198043w;

    /* renamed from: x, reason: collision with root package name */
    public int f198044x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f198045y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f198046z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(android.content.Context context) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f198043w = 1;
        this.f198044x = 1;
    }

    public final void A(boolean z17) {
        if (!z17) {
            android.view.View view = this.f198039s;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansOnlyTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f198043w = 2;
        android.view.View view2 = this.f198039s;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansOnlyTick");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z(false);
        y(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dir;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.content.Context context = this.f199914d;
        int a17 = i65.a.a(context, 16.0f);
        rootView.setPadding(a17, a17, a17, i65.a.a(context, 64.0f));
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fcu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198031h = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fcv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f198032i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qpq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f198033m = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qps);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f198034n = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qpp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f198035o = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568353qp5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f198036p = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qp7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f198037q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568716qq4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f198038r = findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568717qq5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f198039s = findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.p314xaae8f345.mm.R.id.aa8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f198040t = findViewById10;
        android.view.View findViewById11 = rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f198041u = (android.widget.TextView) findViewById11;
        android.view.View view = this.f198031h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFansGroup");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g4(this));
        android.view.View view2 = this.f198033m;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansAndLevelGroup");
            throw null;
        }
        view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.h4(this));
        android.view.View view3 = this.f198038r;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansOnlyGroup");
            throw null;
        }
        view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.i4(this));
        android.widget.TextView textView = this.f198041u;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.j4(this));
        android.view.View view4 = this.f198040t;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        view4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k4(this));
        android.view.View view5 = this.f198036p;
        if (view5 != null) {
            view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l4(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectLevelGroup");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        yz5.a aVar = this.f198046z;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        super.t();
    }

    public final void y(boolean z17) {
        if (!z17) {
            android.view.View view = this.f198032i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFansTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f198043w = 1;
        android.view.View view2 = this.f198032i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFansTick");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z(false);
        A(false);
    }

    public final void z(boolean z17) {
        if (!z17) {
            android.view.View view = this.f198034n;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansAndLevelTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f198035o;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansAndLevelArrow");
                throw null;
            }
            view2.setRotation(-90.0f);
            android.view.View view3 = this.f198036p;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectLevelGroup");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f198043w = 0;
        android.view.View view4 = this.f198034n;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansAndLevelTick");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f198035o;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("superFansAndLevelArrow");
            throw null;
        }
        view5.setRotation(90.0f);
        android.view.View view6 = this.f198036p;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectLevelGroup");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f198037q;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedLevelDesc");
            throw null;
        }
        textView.setText(this.f198044x + "级及以上");
        y(false);
        A(false);
    }
}
