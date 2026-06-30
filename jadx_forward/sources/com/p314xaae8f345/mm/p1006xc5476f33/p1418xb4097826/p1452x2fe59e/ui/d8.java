package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class d8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13992x694f97a f191469d;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13992x694f97a activityC13992x694f97a) {
        this.f191469d = activityC13992x694f97a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13992x694f97a activityC13992x694f97a = this.f191469d;
        intent.putExtra("finder_biz_live_article_url", activityC13992x694f97a.f190879v);
        activityC13992x694f97a.setResult(-1, intent);
        activityC13992x694f97a.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
