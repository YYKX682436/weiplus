package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class z7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15038x7294f699 f211615d;

    public z7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15038x7294f699 activityC15038x7294f699) {
        this.f211615d = activityC15038x7294f699;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean w07 = com.p314xaae8f345.mm.ui.bk.w0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15038x7294f699 activityC15038x7294f699 = this.f211615d;
        if (w07) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter = activityC15038x7294f699.f210130y;
            if (likedTimelinePresenter == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = likedTimelinePresenter.f204179g;
            android.content.Intent intent = activityC15038x7294f699.getIntent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter2 = activityC15038x7294f699.f210130y;
            if (likedTimelinePresenter2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(abstractC13834x56f46d28, intent, likedTimelinePresenter2.f204179g.m56356xb1ee36ee(), null, 4, null);
            com.p314xaae8f345.mm.ui.fj.g(activityC15038x7294f699, true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x7(activityC15038x7294f699));
        } else {
            com.p314xaae8f345.mm.ui.ee.f(activityC15038x7294f699.getTaskId(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y7(activityC15038x7294f699));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
