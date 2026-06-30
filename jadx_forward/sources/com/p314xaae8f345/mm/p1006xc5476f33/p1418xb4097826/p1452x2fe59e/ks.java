package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes9.dex */
public final class ks implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188783d;

    public ks(java.lang.String str) {
        this.f188783d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ed0.v0 v0Var = (ed0.v0) i95.n0.c(ed0.v0.class);
        java.lang.String feedId = this.f188783d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(feedId, "$feedId");
        ((dd0.o0) v0Var).getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7167x859d4d38 c7167x859d4d38 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7167x859d4d38();
        c7167x859d4d38.f144685d = c7167x859d4d38.b("feedid", feedId, true);
        c7167x859d4d38.f144686e = 1L;
        c7167x859d4d38.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
