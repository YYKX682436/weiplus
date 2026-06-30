package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class tj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI f110577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
        super(0);
        this.f110577d = finderRingtoneTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI = this.f110577d;
        finderRingtoneTimelineUI.l7(false);
        com.tencent.mars.xlog.Log.i("Finder.FinderRingtoneTimelineUI", "showRetryTips ifShow:false");
        android.view.View findViewById = finderRingtoneTimelineUI.findViewById(com.tencent.mm.R.id.m2d);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
