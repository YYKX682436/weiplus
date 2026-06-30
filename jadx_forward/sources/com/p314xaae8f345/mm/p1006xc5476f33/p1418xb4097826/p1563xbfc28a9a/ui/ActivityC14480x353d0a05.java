package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/widget/AbsListView$OnScrollListener;", "<init>", "()V", "lo2/g", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI */
/* loaded from: classes2.dex */
public final class ActivityC14480x353d0a05 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements android.widget.AbsListView.OnScrollListener {
    public static final /* synthetic */ int B = 0;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g A;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ListView f202925v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f202926w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f202929z;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f202923t = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: u, reason: collision with root package name */
    public final bu2.a0 f202924u = new bu2.a0("MemberFansList.fp");

    /* renamed from: x, reason: collision with root package name */
    public final lo2.g f202927x = new lo2.g(this);

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f202928y = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afn;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.o1.c(eo2.b.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new lo2.m(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ceg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f202925v = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f202926w = textView;
        textView.setTextSize(0, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9x));
        new rl5.r(this);
        android.widget.ListView listView = this.f202925v;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        lo2.g gVar = this.f202927x;
        listView.setAdapter((android.widget.ListAdapter) gVar);
        android.widget.ListView listView2 = this.f202925v;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setSelector(new android.graphics.drawable.ColorDrawable(0));
        android.widget.ListView listView3 = this.f202925v;
        if (listView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView3.setOnScrollListener(this);
        gVar.f401657f = new lo2.n(this);
        pm0.v.T(pm0.v.J(km5.u.d(), new lo2.o(this)), new lo2.p(this));
        p3325xe03a0797.p3326xc267989b.l.d(getLifecycleAsyncScope(), null, null, new lo2.l(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f202923t, null, 1, null);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (absListView == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (!absListView.canScrollVertically(1)) {
            if (this.f202929z) {
                p3325xe03a0797.p3326xc267989b.l.d(getLifecycleAsyncScope(), null, null, new lo2.l(this, null), 3, null);
            } else {
                android.widget.ListView listView = this.f202925v;
                if (listView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                    throw null;
                }
                if (listView.getFooterViewsCount() == 0) {
                    android.widget.ListView listView2 = this.f202925v;
                    if (listView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                        throw null;
                    }
                    listView2.addFooterView(android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.agu, null));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
