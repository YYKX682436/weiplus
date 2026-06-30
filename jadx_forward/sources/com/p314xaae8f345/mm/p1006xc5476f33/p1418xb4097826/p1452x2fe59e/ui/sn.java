package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class sn extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe f192077d;

    public sn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe activityC14104x32508bfe) {
        this.f192077d = activityC14104x32508bfe;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i19 = this.f192077d.H;
        ml2.x1 x1Var = ml2.x1.f409735f;
        p52.c cVar = p52.h.f433549a;
        p52.h.f433557i = true;
        if (2 == i19) {
            p52.h.f433557i = true;
        } else if (1 == i19) {
            x1Var = ml2.x1.f409736g;
            p52.h.f433557i = false;
            str = "9";
            nm5.b c17 = nm5.j.c(x1Var, str);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            java.lang.Object a17 = c17.a(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$1(...)");
            java.lang.Object a18 = c17.a(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
            zy2.zb.Kh(zbVar, recyclerView, (ml2.x1) a17, (java.lang.String) a18, ml2.y.f409772d, 0, 0L, 0, 112, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
        str = "27";
        nm5.b c172 = nm5.j.c(x1Var, str);
        i95.m c182 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c182, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c182;
        java.lang.Object a172 = c172.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a172, "$1(...)");
        java.lang.Object a182 = c172.a(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a182, "$2(...)");
        zy2.zb.Kh(zbVar2, recyclerView, (ml2.x1) a172, (java.lang.String) a182, ml2.y.f409772d, 0, 0L, 0, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
