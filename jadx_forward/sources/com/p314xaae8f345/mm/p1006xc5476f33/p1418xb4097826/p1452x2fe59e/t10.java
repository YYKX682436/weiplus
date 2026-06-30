package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class t10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 f190559d;

    public t10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var) {
        this.f190559d = x10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f190559d;
        if (x10Var.E == 9) {
            android.view.View view2 = x10Var.f192560x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14494xb6fdc062) view2).b();
        } else {
            android.view.KeyEvent.Callback callback = x10Var.f192560x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.IFinderFollowTopicHeaderView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca) ((uo2.k0) callback)).D();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.D(x10Var.f187707d, false, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
